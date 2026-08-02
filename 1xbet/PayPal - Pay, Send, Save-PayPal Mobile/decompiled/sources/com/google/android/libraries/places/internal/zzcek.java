package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzcek extends com.google.android.libraries.places.internal.zzblg {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zzf()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final com.google.android.libraries.places.internal.zzblm zza(com.google.android.libraries.places.internal.zzbld zzbldVar) {
        return zzf().zza(zzbldVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final void zzc() {
        zzf().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final com.google.android.libraries.places.internal.zzbnx zzd() {
        return zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final java.util.concurrent.ScheduledExecutorService zze() {
        return zzf().zze();
    }

    protected abstract com.google.android.libraries.places.internal.zzblg zzf();

    @Override // com.google.android.libraries.places.internal.zzblg
    public void zzb(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        throw null;
    }
}
