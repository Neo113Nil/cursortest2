package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzbu {
    public final int zza;
    private final zzbo zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbu(zzbo zzboVar, boolean z4, int[] iArr, boolean[] zArr) {
        int i7 = zzboVar.zza;
        this.zza = i7;
        zzcv.zzd(i7 == iArr.length && i7 == zArr.length);
        this.zzb = zzboVar;
        this.zzc = z4 && i7 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbu.class == obj.getClass()) {
            zzbu zzbuVar = (zzbu) obj;
            if (this.zzc == zzbuVar.zzc && this.zzb.equals(zzbuVar.zzb) && Arrays.equals(this.zzd, zzbuVar.zzd) && Arrays.equals(this.zze, zzbuVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int hashCode2 = Arrays.hashCode(iArr) + ((hashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (hashCode2 * 31);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzz zzb(int i7) {
        return this.zzb.zzb(i7);
    }

    public final boolean zzc() {
        for (boolean z4 : this.zze) {
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i7) {
        return this.zze[i7];
    }
}
