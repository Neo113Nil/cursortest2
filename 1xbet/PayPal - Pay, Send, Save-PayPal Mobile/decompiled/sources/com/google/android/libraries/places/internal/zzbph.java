package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbph extends com.google.android.libraries.places.internal.zzbqd {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpj zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbph(com.google.android.libraries.places.internal.zzbpj zzbpjVar, com.google.android.libraries.places.internal.zzcev zzcevVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        super(zzbpjVar.zza.zzl());
        this.zza = zzbnpVar;
        this.zzb = zzbmgVar;
        java.util.Objects.requireNonNull(zzbpjVar);
        this.zzc = zzbpjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqd
    public final void zza() {
        com.google.android.libraries.places.internal.zzbpj zzbpjVar = this.zzc;
        zzbpjVar.zza.zzm().zzb();
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zza;
        com.google.android.libraries.places.internal.zzbmg zzbmgVar = this.zzb;
        if (zzbpjVar.zzg() != null) {
            zzbnpVar = zzbpjVar.zzg();
            zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        }
        try {
            com.google.android.libraries.places.internal.zzbpk.zzq(zzbpjVar.zzf(), zzbnpVar, zzbmgVar);
        } finally {
            this.zzc.zza.zzk().zzb(zzbnpVar.zzj());
        }
    }
}
