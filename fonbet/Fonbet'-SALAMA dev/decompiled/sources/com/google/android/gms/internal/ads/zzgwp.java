package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgwp {
    private final Object zza;
    private final int zzb;

    public zzgwp(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgwp)) {
            return false;
        }
        zzgwp zzgwpVar = (zzgwp) obj;
        return this.zza == zzgwpVar.zza && this.zzb == zzgwpVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
