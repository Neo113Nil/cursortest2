package com.google.firebase.installations;

/* loaded from: classes3.dex */
class CrossProcessLock {
    private static final java.lang.String TAG = "CrossProcessLock";
    private final java.nio.channels.FileChannel channel;
    private final java.nio.channels.FileLock lock;

    private CrossProcessLock(java.nio.channels.FileChannel fileChannel, java.nio.channels.FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.firebase.installations.CrossProcessLock acquire(android.content.Context context, java.lang.String str) {
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileLock fileLock;
        try {
            fileChannel = new java.io.RandomAccessFile(new java.io.File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new com.google.firebase.installations.CrossProcessLock(fileChannel, fileLock);
                } catch (java.io.IOException e) {
                    e = e;
                    android.util.Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return null;
                } catch (java.lang.Error e2) {
                    e = e2;
                    android.util.Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                } catch (java.nio.channels.OverlappingFileLockException e3) {
                    e = e3;
                    android.util.Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                }
            } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException e4) {
                e = e4;
                fileLock = null;
            }
        } catch (java.io.IOException | java.lang.Error | java.nio.channels.OverlappingFileLockException e5) {
            e = e5;
            fileChannel = null;
            fileLock = null;
        }
    }

    void releaseAndClose() {
        try {
            this.lock.release();
            this.channel.close();
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, "encountered error while releasing, ignoring", e);
        }
    }
}
