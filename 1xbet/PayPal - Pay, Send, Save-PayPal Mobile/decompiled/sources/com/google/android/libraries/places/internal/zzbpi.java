package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpi extends com.google.android.libraries.places.internal.zzbqd {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbpi(com.google.android.libraries.places.internal.zzbpj zzbpjVar, com.google.android.libraries.places.internal.zzcev zzcevVar) {
        super(zzbpjVar.zza.zzl());
        java.util.Objects.requireNonNull(zzbpjVar);
        this.zza = zzbpjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqd
    public final void zza() {
        com.google.android.libraries.places.internal.zzbpj zzbpjVar = this.zza;
        if (zzbpjVar.zzg() == null) {
            try {
                zzbpjVar.zzf().zzd();
            } catch (java.lang.Throwable th) {
                this.zza.zze(com.google.android.libraries.places.internal.zzbnp.zzb.zzd(th).zze("Failed to call onReady."));
            }
        }
    }
}
