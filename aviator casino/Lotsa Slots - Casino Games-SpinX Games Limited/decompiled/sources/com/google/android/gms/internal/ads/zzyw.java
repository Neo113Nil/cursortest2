package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyw {
    private final com.google.android.gms.internal.ads.zzabl zza;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(32);
    private com.google.android.gms.internal.ads.zzyv zzc;
    private com.google.android.gms.internal.ads.zzyv zzd;
    private com.google.android.gms.internal.ads.zzyv zze;
    private long zzf;

    public zzyw(com.google.android.gms.internal.ads.zzabl zzablVar) {
        this.zza = zzablVar;
        com.google.android.gms.internal.ads.zzyv zzyvVar = new com.google.android.gms.internal.ads.zzyv(0L, 65536);
        this.zzc = zzyvVar;
        this.zzd = zzyvVar;
        this.zze = zzyvVar;
    }

    private final int zzi(int i) {
        com.google.android.gms.internal.ads.zzyv zzyvVar = this.zze;
        if (zzyvVar.zzc == null) {
            com.google.android.gms.internal.ads.zzabj zza = this.zza.zza();
            com.google.android.gms.internal.ads.zzyv zzyvVar2 = new com.google.android.gms.internal.ads.zzyv(this.zze.zzb, 65536);
            zzyvVar.zzc = zza;
            zzyvVar.zzd = zzyvVar2;
        }
        return java.lang.Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + i;
        this.zzf = j;
        com.google.android.gms.internal.ads.zzyv zzyvVar = this.zze;
        if (j == zzyvVar.zzb) {
            this.zze = zzyvVar.zzd;
        }
    }

    private static com.google.android.gms.internal.ads.zzyv zzk(com.google.android.gms.internal.ads.zzyv zzyvVar, com.google.android.gms.internal.ads.zziv zzivVar, com.google.android.gms.internal.ads.zzyx zzyxVar, com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzyv zzyvVar2;
        int i;
        if (zzivVar.zzk()) {
            long j = zzyxVar.zzb;
            zzetVar.zza(1);
            com.google.android.gms.internal.ads.zzyv zzm = zzm(zzyvVar, j, zzetVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzetVar.zzi()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            com.google.android.gms.internal.ads.zzis zzisVar = zzivVar.zzb;
            byte[] bArr = zzisVar.zza;
            if (bArr == null) {
                zzisVar.zza = new byte[16];
            } else {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzyvVar2 = zzm(zzm, j2, zzisVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzetVar.zza(2);
                zzyvVar2 = zzm(zzyvVar2, j3, zzetVar.zzi(), 2);
                j3 += 2;
                i = zzetVar.zzt();
            } else {
                i = 1;
            }
            int[] iArr = zzisVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzisVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                zzetVar.zza(i4);
                zzyvVar2 = zzm(zzyvVar2, j3, zzetVar.zzi(), i4);
                j3 += i4;
                zzetVar.zzh(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzetVar.zzt();
                    iArr4[i5] = zzetVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzyxVar.zza - ((int) (j3 - zzyxVar.zzb));
            }
            com.google.android.gms.internal.ads.zzahj zzahjVar = zzyxVar.zzc;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            zzisVar.zza(i, iArr2, iArr4, zzahjVar.zzb, zzisVar.zza, zzahjVar.zza, zzahjVar.zzc, zzahjVar.zzd);
            long j4 = zzyxVar.zzb;
            int i6 = (int) (j3 - j4);
            zzyxVar.zzb = j4 + i6;
            zzyxVar.zza -= i6;
        } else {
            zzyvVar2 = zzyvVar;
        }
        if (!zzivVar.zze()) {
            zzivVar.zzj(zzyxVar.zza);
            return zzl(zzyvVar2, zzyxVar.zzb, zzivVar.zzc, zzyxVar.zza);
        }
        zzetVar.zza(4);
        com.google.android.gms.internal.ads.zzyv zzm2 = zzm(zzyvVar2, zzyxVar.zzb, zzetVar.zzi(), 4);
        int zzH = zzetVar.zzH();
        zzyxVar.zzb += 4;
        zzyxVar.zza -= 4;
        zzivVar.zzj(zzH);
        com.google.android.gms.internal.ads.zzyv zzl = zzl(zzm2, zzyxVar.zzb, zzivVar.zzc, zzH);
        zzyxVar.zzb += zzH;
        int i7 = zzyxVar.zza - zzH;
        zzyxVar.zza = i7;
        java.nio.ByteBuffer byteBuffer = zzivVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzivVar.zzf = java.nio.ByteBuffer.allocate(i7);
        } else {
            zzivVar.zzf.clear();
        }
        return zzl(zzl, zzyxVar.zzb, zzivVar.zzf, zzyxVar.zza);
    }

    private static com.google.android.gms.internal.ads.zzyv zzl(com.google.android.gms.internal.ads.zzyv zzyvVar, long j, java.nio.ByteBuffer byteBuffer, int i) {
        com.google.android.gms.internal.ads.zzyv zzn = zzn(zzyvVar, j);
        while (i > 0) {
            int min = java.lang.Math.min(i, (int) (zzn.zzb - j));
            byteBuffer.put(zzn.zzc.zza, zzn.zzb(j), min);
            i -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static com.google.android.gms.internal.ads.zzyv zzm(com.google.android.gms.internal.ads.zzyv zzyvVar, long j, byte[] bArr, int i) {
        com.google.android.gms.internal.ads.zzyv zzn = zzn(zzyvVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = java.lang.Math.min(i2, (int) (zzn.zzb - j));
            java.lang.System.arraycopy(zzn.zzc.zza, zzn.zzb(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static com.google.android.gms.internal.ads.zzyv zzn(com.google.android.gms.internal.ads.zzyv zzyvVar, long j) {
        while (j >= zzyvVar.zzb) {
            zzyvVar = zzyvVar.zzd;
        }
        return zzyvVar;
    }

    public final void zza() {
        com.google.android.gms.internal.ads.zzyv zzyvVar = this.zzc;
        if (zzyvVar.zzc != null) {
            this.zza.zzc(zzyvVar);
            zzyvVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        com.google.android.gms.internal.ads.zzyv zzyvVar2 = this.zzc;
        this.zzd = zzyvVar2;
        this.zze = zzyvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(com.google.android.gms.internal.ads.zziv zzivVar, com.google.android.gms.internal.ads.zzyx zzyxVar) {
        this.zzd = zzk(this.zzd, zzivVar, zzyxVar, this.zzb);
    }

    public final void zzd(com.google.android.gms.internal.ads.zziv zzivVar, com.google.android.gms.internal.ads.zzyx zzyxVar) {
        zzk(this.zzd, zzivVar, zzyxVar, this.zzb);
    }

    public final void zze(long j) {
        com.google.android.gms.internal.ads.zzyv zzyvVar;
        if (j != -1) {
            while (true) {
                zzyvVar = this.zzc;
                if (j < zzyvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzyvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzyvVar.zza) {
                this.zzd = zzyvVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z) throws java.io.IOException {
        int zzi = zzi(i);
        com.google.android.gms.internal.ads.zzyv zzyvVar = this.zze;
        int zza = zzjVar.zza(zzyvVar.zzc.zza, zzyvVar.zzb(this.zzf), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public final void zzh(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            com.google.android.gms.internal.ads.zzyv zzyvVar = this.zze;
            zzetVar.zzm(zzyvVar.zzc.zza, zzyvVar.zzb(this.zzf), zzi);
            i -= zzi;
            zzj(zzi);
        }
    }
}
