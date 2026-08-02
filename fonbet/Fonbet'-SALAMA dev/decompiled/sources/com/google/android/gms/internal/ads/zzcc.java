package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcc {
    public static final zzcc zza = new zzcc(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzcc(int i7, int i8, float f7) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcc) {
            zzcc zzccVar = (zzcc) obj;
            if (this.zzb == zzccVar.zzb && this.zzc == zzccVar.zzc && this.zzd == zzccVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb + 217;
        float f7 = this.zzd;
        return Float.floatToRawIntBits(f7) + (((i7 * 31) + this.zzc) * 31);
    }
}
