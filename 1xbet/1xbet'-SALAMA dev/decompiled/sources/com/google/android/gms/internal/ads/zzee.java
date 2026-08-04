package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzee {
    public static final zzee zza = new zzee(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzee(0, 0);
    }

    public zzee(int i7, int i8) {
        boolean z4 = false;
        if ((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0)) {
            z4 = true;
        }
        zzcv.zzd(z4);
        this.zzb = i7;
        this.zzc = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzee) {
            zzee zzeeVar = (zzee) obj;
            if (this.zzb == zzeeVar.zzb && this.zzc == zzeeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.zzc;
    }

    public final String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}
