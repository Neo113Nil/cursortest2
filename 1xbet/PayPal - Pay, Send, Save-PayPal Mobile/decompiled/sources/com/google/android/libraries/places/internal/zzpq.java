package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzpq implements com.google.android.libraries.places.internal.zzpt {
    final com.google.android.libraries.places.internal.zzbih zza = com.google.android.libraries.places.internal.zzbil.zza(com.google.android.libraries.places.internal.zzeh.zza());
    final com.google.android.libraries.places.internal.zzbih zzb;
    final com.google.android.libraries.places.internal.zzbih zzc;
    private final android.content.Context zzd;
    private final com.google.android.libraries.places.internal.zzmy zze;

    zzpq(android.content.Context context, com.google.android.libraries.places.internal.zzmy zzmyVar) {
        this.zzd = context;
        this.zze = zzmyVar;
        com.google.android.libraries.places.internal.zzbie zza = com.google.android.libraries.places.internal.zzbif.zza(context);
        this.zzb = zza;
        this.zzc = com.google.android.libraries.places.internal.zzbid.zza(com.google.android.libraries.places.internal.zzmu.zza(zza, com.google.android.libraries.places.internal.zzeq.zza()));
    }

    final com.google.android.libraries.places.internal.zzmz zza() {
        com.google.android.libraries.places.internal.zzmx zzd = com.google.android.libraries.places.internal.zzmz.zzd(com.google.android.libraries.places.internal.zzms.zzd(this.zzd));
        zzd.zzc(this.zze);
        return zzd.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzpt
    public final com.google.android.libraries.places.internal.zzef zzb() {
        return (com.google.android.libraries.places.internal.zzef) this.zza.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzpt
    public final com.google.android.libraries.places.api.net.PlacesClient zzc() {
        return com.google.android.libraries.places.api.Places.zzb(com.google.android.libraries.places.internal.zzms.zzd(this.zzd), zza());
    }

    @Override // com.google.android.libraries.places.internal.zzpt
    public final com.google.android.libraries.places.internal.zzpu zzd() {
        return new com.google.android.libraries.places.internal.zzpv(new com.google.android.libraries.places.internal.zzne(com.google.android.libraries.places.internal.zzmt.zza(this.zzd), (com.google.android.libraries.places.internal.zzex) this.zzc.zzb()), zza());
    }

    @Override // com.google.android.libraries.places.internal.zzpt
    public final com.google.android.libraries.places.internal.zzpm zze() {
        return new com.google.android.libraries.places.internal.zzpm(com.google.android.libraries.places.internal.zzms.zzd(this.zzd));
    }
}
