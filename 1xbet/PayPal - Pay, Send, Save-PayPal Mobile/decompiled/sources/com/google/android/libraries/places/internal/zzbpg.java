package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpg extends com.google.android.libraries.places.internal.zzbqd {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcac zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpj zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbpg(com.google.android.libraries.places.internal.zzbpj zzbpjVar, com.google.android.libraries.places.internal.zzcev zzcevVar, com.google.android.libraries.places.internal.zzcac zzcacVar) {
        super(zzbpjVar.zza.zzl());
        this.zza = zzcacVar;
        java.util.Objects.requireNonNull(zzbpjVar);
        this.zzb = zzbpjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqd
    public final void zza() {
        com.google.android.libraries.places.internal.zzbpj zzbpjVar = this.zzb;
        com.google.android.libraries.places.internal.zzbpk zzbpkVar = zzbpjVar.zza;
        if (zzbpjVar.zzg() != null) {
            com.google.android.libraries.places.internal.zzbsz.zzg(this.zza);
            return;
        }
        while (true) {
            try {
                java.io.InputStream zza = this.zza.zza();
                if (zza == null) {
                    return;
                }
                try {
                    zzbpjVar.zzf().zzb(zzbpkVar.zzi().zzd(zza));
                    zza.close();
                } catch (java.lang.Throwable th) {
                    com.google.android.libraries.places.internal.zzbsz.zzh(zza);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                com.google.android.libraries.places.internal.zzbsz.zzg(this.zza);
                this.zzb.zze(com.google.android.libraries.places.internal.zzbnp.zzb.zzd(th2).zze("Failed to read message."));
                return;
            }
        }
    }
}
