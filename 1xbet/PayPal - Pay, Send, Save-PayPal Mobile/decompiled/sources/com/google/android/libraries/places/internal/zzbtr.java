package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtr extends com.google.android.libraries.places.internal.zzbsl {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpl zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbts zzb;

    zzbtr(com.google.android.libraries.places.internal.zzbts zzbtsVar, com.google.android.libraries.places.internal.zzbpl zzbplVar) {
        this.zza = zzbplVar;
        java.util.Objects.requireNonNull(zzbtsVar);
        this.zzb = zzbtsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsl, com.google.android.libraries.places.internal.zzbpl
    public final void zzf(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        this.zzb.zzg().zza();
        this.zza.zzf(new com.google.android.libraries.places.internal.zzbtq(this, zzbpnVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbsl
    protected final com.google.android.libraries.places.internal.zzbpl zze() {
        return this.zza;
    }
}
