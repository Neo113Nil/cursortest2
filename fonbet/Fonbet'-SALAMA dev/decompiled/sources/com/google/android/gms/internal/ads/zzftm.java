package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
final class zzftm extends zzftf {
    private final Object zza;

    public zzftm(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzftm) {
            return this.zza.equals(((zzftm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return AbstractC0486a1.h("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    public final zzftf zza(zzfsw zzfswVar) {
        Object apply = zzfswVar.apply(this.zza);
        zzfth.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzftm(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
