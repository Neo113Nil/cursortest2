package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcao extends com.google.android.libraries.places.internal.zzcas {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcat zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcao(com.google.android.libraries.places.internal.zzcat zzcatVar) {
        super(zzcatVar, null);
        java.util.Objects.requireNonNull(zzcatVar);
        this.zza = zzcatVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcas
    public final void zza() throws java.io.IOException {
        int zzm;
        com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
        com.google.android.libraries.places.internal.zzcat zzcatVar = this.zza;
        synchronized (zzcatVar.zzd()) {
            zzcffVar.zzc(zzcatVar.zze(), zzcatVar.zze().zzi());
            zzcatVar.zzg(false);
            zzm = zzcatVar.zzm();
        }
        com.google.android.libraries.places.internal.zzcat zzcatVar2 = this.zza;
        zzcatVar2.zzi().zzc(zzcffVar, zzcffVar.zzb());
        synchronized (zzcatVar2.zzd()) {
            zzcatVar2.zzn(zzcatVar2.zzm() - zzm);
        }
    }
}
