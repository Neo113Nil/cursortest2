package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpf extends com.google.android.libraries.places.internal.zzbqd {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpj zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbpf(com.google.android.libraries.places.internal.zzbpj zzbpjVar, com.google.android.libraries.places.internal.zzcev zzcevVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        super(zzbpjVar.zza.zzl());
        this.zza = zzbmgVar;
        java.util.Objects.requireNonNull(zzbpjVar);
        this.zzb = zzbpjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqd
    public final void zza() {
        com.google.android.libraries.places.internal.zzbpj zzbpjVar = this.zzb;
        if (zzbpjVar.zzg() == null) {
            try {
                zzbpjVar.zzf().zza(this.zza);
            } catch (java.lang.Throwable th) {
                this.zzb.zze(com.google.android.libraries.places.internal.zzbnp.zzb.zzd(th).zze("Failed to read headers"));
            }
        }
    }
}
