package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final android.content.Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final com.google.android.play.core.splitinstall.internal.zzam zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    static /* synthetic */ void zzb(com.google.android.play.core.splitinstall.internal.zzak zzakVar, java.util.List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        java.lang.Integer zze = zzakVar.zze(list);
        if (zze == null) {
            return;
        }
        if (zze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(zze.intValue());
        }
    }

    static /* synthetic */ void zzc(com.google.android.play.core.splitinstall.internal.zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (com.google.android.play.core.splitcompat.SplitCompat.zzd(com.google.android.play.core.splitinstall.internal.zzbr.zza(zzakVar.zza))) {
                zzfVar.zza();
            } else {
                zzfVar.zzb(-12);
            }
        } catch (java.lang.Exception unused) {
            zzfVar.zzb(-12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0063, code lost:
    
        if (r6.exists() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Integer zze(java.util.List list) {
        java.nio.channels.FileLock fileLock;
        int i;
        java.io.File[] listFiles;
        try {
            java.nio.channels.FileChannel channel = new java.io.RandomAccessFile(this.zzb.zzd(), "rw").getChannel();
            java.lang.Integer num = null;
            try {
                try {
                    fileLock = channel.tryLock();
                } catch (java.nio.channels.OverlappingFileLockException unused) {
                    fileLock = null;
                }
                if (fileLock != null) {
                    try {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            android.content.Intent intent = (android.content.Intent) it.next();
                            java.lang.String stringExtra = intent.getStringExtra("split_id");
                            android.content.res.AssetFileDescriptor openAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                java.io.File zze = this.zzb.zze(stringExtra);
                                if (zze.exists()) {
                                    if (zze.length() != openAssetFileDescriptor.getLength()) {
                                        if (!this.zzb.zzg(stringExtra).exists()) {
                                            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                            try {
                                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(zze);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    while (true) {
                                                        int read = bufferedInputStream.read(bArr);
                                                        if (read <= 0) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, 0, read);
                                                    }
                                                    fileOutputStream.close();
                                                    bufferedInputStream.close();
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        }
                                        if (openAssetFileDescriptor != null) {
                                            openAssetFileDescriptor.close();
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                if (openAssetFileDescriptor != null) {
                                    try {
                                        openAssetFileDescriptor.close();
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        listFiles = this.zzb.zzb().listFiles();
                    } catch (java.io.IOException | java.lang.Exception unused2) {
                        i = -13;
                    }
                    if (this.zzc.zzc(listFiles)) {
                        if (this.zzc.zza(listFiles)) {
                            java.io.File[] listFiles2 = this.zzb.zzb().listFiles();
                            java.util.Arrays.sort(listFiles2);
                            int length = listFiles2.length;
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                }
                                com.google.android.play.core.splitcompat.zze.zzm(listFiles2[length]);
                                java.io.File file = listFiles2[length];
                                file.renameTo(this.zzb.zzf(file));
                            }
                            num = java.lang.Integer.valueOf(i);
                            fileLock.release();
                        }
                    }
                    i = -11;
                    num = java.lang.Integer.valueOf(i);
                    fileLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return num;
            } finally {
            }
        } catch (java.lang.Exception unused3) {
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(java.util.List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!com.google.android.play.core.splitcompat.SplitCompat.zze()) {
            throw new java.lang.IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new com.google.android.play.core.splitinstall.internal.zzaj(this, list, zzfVar));
    }

    public zzak(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.play.core.splitinstall.internal.zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }
}
