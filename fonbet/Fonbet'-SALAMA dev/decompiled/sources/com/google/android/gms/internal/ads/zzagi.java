package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzagi extends zzagf {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzagi(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagi.class == obj.getClass()) {
            zzagi zzagiVar = (zzagi) obj;
            if (this.zza == zzagiVar.zza && this.zzb == zzagiVar.zzb && this.zzc == zzagiVar.zzc && Arrays.equals(this.zzd, zzagiVar.zzd) && Arrays.equals(this.zze, zzagiVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zza + 527;
        int[] iArr = this.zzd;
        int hashCode = Arrays.hashCode(iArr) + (((((i7 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (hashCode * 31);
    }
}
