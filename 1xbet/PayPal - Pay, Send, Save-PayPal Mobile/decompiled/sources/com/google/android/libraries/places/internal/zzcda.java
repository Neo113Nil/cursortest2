package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcda {
    private final com.google.android.libraries.places.internal.zzcfh zzf;
    private final java.util.List zze = new java.util.ArrayList();
    com.google.android.libraries.places.internal.zzccz[] zza = new com.google.android.libraries.places.internal.zzccz[8];
    int zzb = 7;
    int zzc = 0;
    int zzd = 0;
    private int zzg = 4096;
    private int zzh = 4096;

    zzcda(int i, int i2, com.google.android.libraries.places.internal.zzcfv zzcfvVar) {
        this.zzf = com.google.android.libraries.places.internal.zzcfl.zzc(zzcfvVar);
    }

    private final void zzf() {
        int i = this.zzh;
        int i2 = this.zzd;
        if (i < i2) {
            if (i == 0) {
                zzg();
            } else {
                zzh(i2 - i);
            }
        }
    }

    private final void zzg() {
        java.util.Arrays.fill(this.zza, (java.lang.Object) null);
        this.zzb = this.zza.length - 1;
        this.zzc = 0;
        this.zzd = 0;
    }

    private final int zzh(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.zza.length;
            while (true) {
                length--;
                i2 = this.zzb;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.zza[length].zzh;
                i -= i4;
                this.zzd -= i4;
                this.zzc--;
                i3++;
            }
            com.google.android.libraries.places.internal.zzccz[] zzcczVarArr = this.zza;
            int i5 = i2 + 1;
            java.lang.System.arraycopy(zzcczVarArr, i5, zzcczVarArr, i5 + i3, this.zzc);
            this.zzb += i3;
        }
        return i3;
    }

    private final com.google.android.libraries.places.internal.zzcfj zzj(int i) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr2;
        if (zzm(i)) {
            zzcczVarArr2 = com.google.android.libraries.places.internal.zzcdc.zzb;
            return zzcczVarArr2[i].zzf;
        }
        zzcczVarArr = com.google.android.libraries.places.internal.zzcdc.zzb;
        int length = zzcczVarArr.length;
        int zzi = zzi(i - 61);
        if (zzi >= 0) {
            com.google.android.libraries.places.internal.zzccz[] zzcczVarArr3 = this.zza;
            if (zzi < zzcczVarArr3.length) {
                return zzcczVarArr3[zzi].zzf;
            }
        }
        int i2 = i + 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 23);
        sb.append("Header index too large ");
        sb.append(i2);
        throw new java.io.IOException(sb.toString());
    }

    private final void zzk(int i, com.google.android.libraries.places.internal.zzccz zzcczVar) {
        this.zze.add(zzcczVar);
        int i2 = zzcczVar.zzh;
        int i3 = this.zzh;
        if (i2 > i3) {
            zzg();
            return;
        }
        zzh((this.zzd + i2) - i3);
        int i4 = this.zzc;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr = this.zza;
        int length = zzcczVarArr.length;
        if (i4 + 1 > length) {
            com.google.android.libraries.places.internal.zzccz[] zzcczVarArr2 = new com.google.android.libraries.places.internal.zzccz[length + length];
            java.lang.System.arraycopy(zzcczVarArr, 0, zzcczVarArr2, length, length);
            this.zzb = this.zza.length - 1;
            this.zza = zzcczVarArr2;
        }
        int i5 = this.zzb;
        this.zzb = i5 - 1;
        this.zza[i5] = zzcczVar;
        this.zzc++;
        this.zzd += i2;
    }

    private final int zzl() throws java.io.IOException {
        return this.zzf.zzj() & 255;
    }

    private static final boolean zzm(int i) {
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr;
        if (i < 0) {
            return false;
        }
        zzcczVarArr = com.google.android.libraries.places.internal.zzcdc.zzb;
        int length = zzcczVarArr.length;
        return i <= 60;
    }

    final void zza(int i) {
        this.zzg = i;
        this.zzh = i;
        zzf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 34);
        r1.append("Invalid dynamic table size update ");
        r1.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        throw new java.io.IOException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzb() throws java.io.IOException {
        int zzd;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr;
        com.google.android.libraries.places.internal.zzccz[] zzcczVarArr2;
        while (true) {
            com.google.android.libraries.places.internal.zzcfh zzcfhVar = this.zzf;
            if (zzcfhVar.zzf()) {
                return;
            }
            byte zzj = zzcfhVar.zzj();
            int i = zzj & 255;
            if (i == 128) {
                throw new java.io.IOException("index == 0");
            }
            if ((zzj & 128) == 128) {
                zzd = zzd(i, 127);
                int i2 = zzd - 1;
                if (!zzm(i2)) {
                    zzcczVarArr2 = com.google.android.libraries.places.internal.zzcdc.zzb;
                    int length = zzcczVarArr2.length;
                    int zzi = zzi(zzd - 62);
                    if (zzi < 0) {
                        break;
                    }
                    com.google.android.libraries.places.internal.zzccz[] zzcczVarArr3 = this.zza;
                    if (zzi > zzcczVarArr3.length - 1) {
                        break;
                    } else {
                        this.zze.add(zzcczVarArr3[zzi]);
                    }
                } else {
                    zzcczVarArr = com.google.android.libraries.places.internal.zzcdc.zzb;
                    this.zze.add(zzcczVarArr[i2]);
                }
            } else if (i == 64) {
                com.google.android.libraries.places.internal.zzcfj zze = zze();
                com.google.android.libraries.places.internal.zzcdc.zza(zze);
                zzk(-1, new com.google.android.libraries.places.internal.zzccz(zze, zze()));
            } else if ((zzj & 64) == 64) {
                zzk(-1, new com.google.android.libraries.places.internal.zzccz(zzj(zzd(i, 63) - 1), zze()));
            } else if ((zzj & 32) == 32) {
                int zzd2 = zzd(i, 31);
                this.zzh = zzd2;
                if (zzd2 < 0 || zzd2 > this.zzg) {
                    break;
                } else {
                    zzf();
                }
            } else if (i == 16 || i == 0) {
                com.google.android.libraries.places.internal.zzcfj zze2 = zze();
                com.google.android.libraries.places.internal.zzcdc.zza(zze2);
                this.zze.add(new com.google.android.libraries.places.internal.zzccz(zze2, zze()));
            } else {
                this.zze.add(new com.google.android.libraries.places.internal.zzccz(zzj(zzd(i, 15) - 1), zze()));
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 23);
        sb.append("Header index too large ");
        sb.append(zzd);
        throw new java.io.IOException(sb.toString());
    }

    public final java.util.List zzc() {
        java.util.List list = this.zze;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        list.clear();
        return arrayList;
    }

    final int zzd(int i, int i2) throws java.io.IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int zzl = zzl();
            if ((zzl & 128) == 0) {
                return i2 + (zzl << i4);
            }
            i2 += (zzl & 127) << i4;
            i4 += 7;
        }
    }

    final com.google.android.libraries.places.internal.zzcfj zze() throws java.io.IOException {
        int zzl = zzl();
        long zzd = zzd(zzl, 127);
        if ((zzl & 128) != 128) {
            return this.zzf.zzn(zzd);
        }
        return com.google.android.libraries.places.internal.zzcfi.zzb(com.google.android.libraries.places.internal.zzcdj.zza().zzb(this.zzf.zzr(zzd)));
    }

    private final int zzi(int i) {
        return this.zzb + 1 + i;
    }
}
