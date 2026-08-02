package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcdb {
    int zzb;
    private final com.google.android.libraries.places.internal.zzcff zzc;
    private int zze;
    com.google.android.libraries.places.internal.zzccz[] zza = new com.google.android.libraries.places.internal.zzccz[8];
    private int zzd = 7;

    zzcdb(int i, boolean z, com.google.android.libraries.places.internal.zzcff zzcffVar) {
        this.zzc = zzcffVar;
    }

    private final void zzd(com.google.android.libraries.places.internal.zzccz zzcczVar) {
        int i;
        int i2 = zzcczVar.zzh;
        if (i2 > 4096) {
            java.util.Arrays.fill(this.zza, (java.lang.Object) null);
            this.zzd = this.zza.length - 1;
            this.zzb = 0;
            this.zze = 0;
            return;
        }
        int i3 = (this.zze + i2) - 4096;
        if (i3 > 0) {
            int length = this.zza.length - 1;
            int i4 = 0;
            while (true) {
                i = this.zzd;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.zza[length].zzh;
                i3 -= i5;
                this.zze -= i5;
                this.zzb--;
                i4++;
                length--;
            }
            com.google.android.libraries.places.internal.zzccz[] zzcczVarArr = this.zza;
            int i6 = i + 1;
            java.lang.System.arraycopy(zzcczVarArr, i6, zzcczVarArr, i6 + i4, this.zzb);
            this.zzd += i4;
        }
        int i7 = this.zzb;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr2 = this.zza;
        int length2 = zzcczVarArr2.length;
        if (i7 + 1 > length2) {
            com.google.android.libraries.places.internal.zzccz[] zzcczVarArr3 = new com.google.android.libraries.places.internal.zzccz[length2 + length2];
            java.lang.System.arraycopy(zzcczVarArr2, 0, zzcczVarArr3, length2, length2);
            this.zzd = this.zza.length - 1;
            this.zza = zzcczVarArr3;
        }
        int i8 = this.zzd;
        this.zzd = i8 - 1;
        this.zza[i8] = zzcczVar;
        this.zzb++;
        this.zze += i2;
    }

    final void zza(java.util.List list) throws java.io.IOException {
        java.util.Map map;
        int i;
        int i2;
        com.google.android.libraries.places.internal.zzcfj zzcfjVar;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr2;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr3;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr4;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            com.google.android.libraries.places.internal.zzccz zzcczVar = (com.google.android.libraries.places.internal.zzccz) list.get(i3);
            com.google.android.libraries.places.internal.zzcfj zzh = zzcczVar.zzf.zzh();
            com.google.android.libraries.places.internal.zzcfj zzcfjVar2 = zzcczVar.zzg;
            map = com.google.android.libraries.places.internal.zzcdc.zzc;
            java.lang.Integer num = (java.lang.Integer) map.get(zzh);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (i2 >= 2 && i2 <= 7) {
                    zzcczVarArr3 = com.google.android.libraries.places.internal.zzcdc.zzb;
                    if (zzcczVarArr3[intValue].zzg.equals(zzcfjVar2)) {
                        i = i2;
                    } else {
                        zzcczVarArr4 = com.google.android.libraries.places.internal.zzcdc.zzb;
                        if (zzcczVarArr4[i2].zzg.equals(zzcfjVar2)) {
                            i = intValue + 2;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i == -1) {
                int i4 = this.zzd;
                while (true) {
                    i4++;
                    com.google.android.libraries.places.internal.zzccz[] zzcczVarArr5 = this.zza;
                    if (i4 >= zzcczVarArr5.length) {
                        i = -1;
                        break;
                    }
                    if (zzcczVarArr5[i4].zzf.equals(zzh)) {
                        if (this.zza[i4].zzg.equals(zzcfjVar2)) {
                            int i5 = this.zzd;
                            zzcczVarArr = com.google.android.libraries.places.internal.zzcdc.zzb;
                            int length = zzcczVarArr.length;
                            i = (i4 - i5) + 61;
                            break;
                        }
                        if (i2 == -1) {
                            int i6 = this.zzd;
                            zzcczVarArr2 = com.google.android.libraries.places.internal.zzcdc.zzb;
                            int length2 = zzcczVarArr2.length;
                            i2 = (i4 - i6) + 61;
                        }
                    }
                }
            }
            if (i != -1) {
                zzb(i, 127, 128);
            } else if (i2 == -1) {
                this.zzc.zzA(64);
                zzc(zzh);
                zzc(zzcfjVar2);
                zzd(zzcczVar);
            } else {
                zzcfjVar = com.google.android.libraries.places.internal.zzcdc.zza;
                if (!zzh.zzp(zzcfjVar) || com.google.android.libraries.places.internal.zzccz.zze.equals(zzh)) {
                    zzb(i2, 63, 64);
                    zzc(zzcfjVar2);
                    zzd(zzcczVar);
                } else {
                    zzb(i2, 15, 0);
                    zzc(zzcfjVar2);
                }
            }
        }
    }

    final void zzb(int i, int i2, int i3) throws java.io.IOException {
        if (i < i2) {
            this.zzc.zzA(i | i3);
            return;
        }
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzc;
        zzcffVar.zzA(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            zzcffVar.zzA(128 | (i4 & 127));
            i4 >>>= 7;
        }
        zzcffVar.zzA(i4);
    }

    final void zzc(com.google.android.libraries.places.internal.zzcfj zzcfjVar) throws java.io.IOException {
        zzb(zzcfjVar.zzj(), 127, 0);
        this.zzc.zzu(zzcfjVar);
    }
}
