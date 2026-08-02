package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class zzbb {
    public static final zzbb zza = new zzbb(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbb(float f7, float f8) {
        zzcv.zzd(f7 > 0.0f);
        zzcv.zzd(f8 > 0.0f);
        this.zzb = f7;
        this.zzc = f8;
        this.zzd = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbb.class == obj.getClass()) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.zzb == zzbbVar.zzb && this.zzc == zzbbVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToRawIntBits = Float.floatToRawIntBits(this.zzb) + 527;
        return Float.floatToRawIntBits(this.zzc) + (floatToRawIntBits * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        int i7 = zzen.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j) {
        return j * this.zzd;
    }
}
