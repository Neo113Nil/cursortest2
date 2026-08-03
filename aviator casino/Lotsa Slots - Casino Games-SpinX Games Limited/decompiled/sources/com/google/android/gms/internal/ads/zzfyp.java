package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyp {
    private final com.google.android.gms.internal.ads.zzbeb zza;
    private final java.io.File zzb;
    private final java.io.File zzc;
    private final java.io.File zzd;
    private byte[] zze;

    public zzfyp(com.google.android.gms.internal.ads.zzbeb zzbebVar, java.io.File file, java.io.File file2, java.io.File file3) {
        this.zza = zzbebVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final com.google.android.gms.internal.ads.zzbeb zza() {
        return this.zza;
    }

    public final java.io.File zzb() {
        return this.zzb;
    }

    public final java.io.File zzc() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zzd() {
        byte[] bArr;
        java.io.FileInputStream fileInputStream;
        byte[] bArr2;
        java.io.FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new java.io.FileInputStream(this.zzd);
                try {
                    com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i];
                        int i2 = 0;
                        while (i2 < i) {
                            int read = fileInputStream.read(bArr3, i2, i - i2);
                            if (read == -1) {
                                break;
                            }
                            i2 += read;
                        }
                        com.google.android.gms.internal.ads.zzida zzt = i2 == 0 ? null : com.google.android.gms.internal.ads.zzida.zzt(bArr3, 0, i2);
                        if (zzt == null) {
                            break;
                        }
                        arrayList.add(zzt);
                        i = java.lang.Math.min(i + i, 8192);
                    }
                    bArr2 = com.google.android.gms.internal.ads.zzida.zzy(arrayList).zzA();
                    com.google.android.gms.common.util.IOUtils.closeQuietly(fileInputStream);
                } catch (java.io.IOException unused) {
                    com.google.android.gms.common.util.IOUtils.closeQuietly(fileInputStream);
                    bArr2 = null;
                    this.zze = bArr2;
                    bArr = this.zze;
                    if (bArr != null) {
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    com.google.android.gms.common.util.IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
                fileInputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            this.zze = bArr2;
        }
        bArr = this.zze;
        if (bArr != null) {
            return null;
        }
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean zze(long j) {
        return this.zza.zzc() - (java.lang.System.currentTimeMillis() / 1000) < 3600;
    }
}
