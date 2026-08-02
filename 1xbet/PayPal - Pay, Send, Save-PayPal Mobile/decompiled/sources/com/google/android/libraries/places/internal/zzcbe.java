package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbe implements com.google.android.libraries.places.internal.zzbod {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcbg zza;

    zzcbe(com.google.android.libraries.places.internal.zzcbg zzcbgVar) {
        java.util.Objects.requireNonNull(zzcbgVar);
        this.zza = zzcbgVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbod
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar, byte[] bArr) {
        com.google.android.libraries.places.internal.zzcbg zzcbgVar = this.zza;
        java.lang.String zzb = zzcbgVar.zzF().zzb();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 1);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(zzb);
        java.lang.String obj = sb.toString();
        synchronized (zzcbgVar.zzJ().zzO()) {
            zzcbgVar.zzJ().zzN(zzbmgVar, obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbod
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.android.libraries.places.internal.zzcbg zzcbgVar = this.zza;
        synchronized (zzcbgVar.zzJ().zzO()) {
            zzcbgVar.zzJ().zzL(zzbnpVar, true, null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbod
    public final void zzb(com.google.android.libraries.places.internal.zzcam zzcamVar, boolean z, boolean z2, int i) {
        com.google.android.libraries.places.internal.zzcff zze;
        com.google.android.libraries.places.internal.zzcal zzo;
        if (zzcamVar == null) {
            zze = com.google.android.libraries.places.internal.zzcbg.zzb;
        } else {
            zze = ((com.google.android.libraries.places.internal.zzcbx) zzcamVar).zze();
            int zzb = (int) zze.zzb();
            if (zzb > 0) {
                this.zza.zzw(zzb);
            }
        }
        com.google.android.libraries.places.internal.zzcbg zzcbgVar = this.zza;
        synchronized (zzcbgVar.zzJ().zzO()) {
            zzcbgVar.zzJ().zzM(zze, z, z2);
            zzo = zzcbgVar.zzo();
            zzo.zzc(i);
        }
    }
}
