package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzgky {
    public static final zzgky zza = new zzgkw().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgky) {
            return this.zzb.equals(((zzgky) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
