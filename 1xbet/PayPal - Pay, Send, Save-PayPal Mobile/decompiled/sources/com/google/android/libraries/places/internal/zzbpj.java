package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpj implements com.google.android.libraries.places.internal.zzbpn {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpk zza;
    private final com.google.android.libraries.places.internal.zzbiw zzb;
    private com.google.android.libraries.places.internal.zzbnp zzc;

    public zzbpj(com.google.android.libraries.places.internal.zzbpk zzbpkVar, com.google.android.libraries.places.internal.zzbiw zzbiwVar) {
        java.util.Objects.requireNonNull(zzbpkVar);
        this.zza = zzbpkVar;
        this.zzb = (com.google.android.libraries.places.internal.zzbiw) com.google.common.base.Preconditions.checkNotNull(zzbiwVar, "observer");
    }

    @Override // com.google.android.libraries.places.internal.zzbpn
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza.zzj().execute(new com.google.android.libraries.places.internal.zzbpf(this, com.google.android.libraries.places.internal.zzcew.zzb(), zzbmgVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzb(com.google.android.libraries.places.internal.zzcac zzcacVar) {
        this.zza.zzj().execute(new com.google.android.libraries.places.internal.zzbpg(this, com.google.android.libraries.places.internal.zzcew.zzb(), zzcacVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbpn
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.android.libraries.places.internal.zzbpk zzbpkVar = this.zza;
        com.google.android.libraries.places.internal.zzbjv zzg = zzbpkVar.zzg();
        if (zzbnpVar.zzg() == com.google.android.libraries.places.internal.zzbnm.CANCELLED && zzg != null && zzg.zzb()) {
            zzbnpVar = zzbpkVar.zzm().zzc();
            zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        }
        zzbpkVar.zzj().execute(new com.google.android.libraries.places.internal.zzbph(this, com.google.android.libraries.places.internal.zzcew.zzb(), zzbnpVar, zzbmgVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzd() {
        com.google.android.libraries.places.internal.zzbpk zzbpkVar = this.zza;
        com.google.android.libraries.places.internal.zzbmj zza = zzbpkVar.zzi().zza();
        if (zza == com.google.android.libraries.places.internal.zzbmj.UNARY || zza == com.google.android.libraries.places.internal.zzbmj.SERVER_STREAMING) {
            return;
        }
        zzbpkVar.zzj().execute(new com.google.android.libraries.places.internal.zzbpi(this, com.google.android.libraries.places.internal.zzcew.zzb()));
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zzc = zzbnpVar;
        this.zza.zzo().zzl(zzbnpVar);
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zzg() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbiw zzf() {
        return this.zzb;
    }
}
