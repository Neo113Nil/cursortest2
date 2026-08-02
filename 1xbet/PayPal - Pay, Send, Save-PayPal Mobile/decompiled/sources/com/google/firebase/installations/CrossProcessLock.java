package com.google.firebase.installations;

/* loaded from: classes4.dex */
class CrossProcessLock {
    private static final java.lang.String TAG = "CrossProcessLock";
    private final java.nio.channels.FileChannel channel;
    private final java.nio.channels.FileLock lock;

    private CrossProcessLock(java.nio.channels.FileChannel fileChannel, java.nio.channels.FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    static com.google.firebase.installations.CrossProcessLock acquire(android.content.Context context, java.lang.String str) {
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileLock fileLock;
        try {
            fileChannel = new java.io.RandomAccessFile(new java.io.File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new com.google.firebase.installations.CrossProcessLock(fileChannel, fileLock);
                } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    void releaseAndClose() {
        try {
            this.lock.release();
            this.channel.close();
        } catch (java.io.IOException unused) {
        }
    }
}
