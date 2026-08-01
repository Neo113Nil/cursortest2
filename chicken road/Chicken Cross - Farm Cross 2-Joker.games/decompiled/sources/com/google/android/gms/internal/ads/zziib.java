package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziib {
    private static final zziib zza = new zziib(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zziib() {
        this(0, new int[8], new Object[8], true);
    }

    private zziib(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zziib zza() {
        return zza;
    }

    static zziib zzb() {
        return new zziib();
    }

    static zziib zzc(zziib zziibVar, zziib zziibVar2) {
        int i = zziibVar.zzb + zziibVar2.zzb;
        int[] copyOf = Arrays.copyOf(zziibVar.zzc, i);
        System.arraycopy(zziibVar2.zzc, 0, copyOf, zziibVar.zzb, zziibVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zziibVar.zzd, i);
        System.arraycopy(zziibVar2.zzd, 0, copyOf2, zziibVar.zzb, zziibVar2.zzb);
        return new zziib(i, copyOf, copyOf2, true);
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zziib)) {
            return false;
        }
        zziib zziibVar = (zziib) obj;
        int i = this.zzb;
        if (i == zziibVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziibVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziibVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zziip zziipVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zziipVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zziip zziipVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zziipVar.zzc(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zziipVar.zzj(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zziipVar.zzn(i3, (zziei) obj);
                } else if (i4 == 3) {
                    zziipVar.zzt(i3);
                    ((zziib) obj).zzg(zziipVar);
                    zziipVar.zzu(i3);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(new zzigd("Protocol message tag had invalid wire type."));
                    }
                    zziipVar.zzk(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zziei zzieiVar = (zziei) this.zzd[i3];
            int zzF = zzier.zzF(8);
            int zzF2 = zzier.zzF(16) + zzier.zzF(i4);
            int zzF3 = zzier.zzF(24);
            int zzb = zzieiVar.zzb();
            i2 += zzF + zzF + zzF2 + zzF3 + zzier.zzF(zzb) + zzb;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzF;
        int zzG;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzier.zzF(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zziei zzieiVar = (zziei) this.zzd[i4];
                    int zzF2 = zzier.zzF(i8);
                    int zzb = zzieiVar.zzb();
                    i = zzF2 + zzier.zzF(zzb) + zzb;
                } else if (i7 == 3) {
                    int zzF3 = zzier.zzF(i6 << 3);
                    zzF = zzF3 + zzF3;
                    zzG = ((zziib) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzigd("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzier.zzF(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzF = zzier.zzF(i9);
                zzG = zzier.zzG(longValue);
            }
            i = zzF + zzG;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzigy.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final boolean zzl(int i, zziem zziemVar) throws IOException {
        int zza2;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, Long.valueOf(zziemVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, Long.valueOf(zziemVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zziemVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zziemVar.zzK();
                return false;
            }
            if (i2 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zziemVar.zzj()));
            return true;
        }
        zziemVar.zzJ();
        zziemVar.zzb++;
        zziib zziibVar = new zziib();
        do {
            zza2 = zziemVar.zza();
            if (zza2 == 0) {
                break;
            }
        } while (zziibVar.zzl(zza2, zziemVar));
        zziemVar.zzb--;
        zziemVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zziibVar);
        return true;
    }

    final zziib zzm(zziib zziibVar) {
        if (zziibVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zziibVar.zzb;
        zzn(i);
        System.arraycopy(zziibVar.zzc, 0, this.zzc, this.zzb, zziibVar.zzb);
        System.arraycopy(zziibVar.zzd, 0, this.zzd, this.zzb, zziibVar.zzb);
        this.zzb = i;
        return this;
    }
}
