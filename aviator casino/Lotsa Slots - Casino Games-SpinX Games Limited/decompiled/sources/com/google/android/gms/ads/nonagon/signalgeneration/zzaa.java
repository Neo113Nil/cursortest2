package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzaa implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzap zzc;

    zzaa(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar, com.google.android.gms.internal.ads.zzbzq zzbzqVar, boolean z) {
        this.zza = zzbzqVar;
        this.zzb = z;
        java.util.Objects.requireNonNull(zzapVar);
        this.zzc = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        try {
            com.google.android.gms.internal.ads.zzbzq zzbzqVar = this.zza;
            java.lang.String message = th.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbzqVar.zzf(sb.toString());
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(@javax.annotation.Nonnull java.lang.Object obj) {
        android.net.Uri zzZ;
        java.util.List<android.net.Uri> list = (java.util.List) obj;
        try {
            com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar = this.zzc;
            zzapVar.zzw(list);
            this.zza.zze(list);
            if (zzapVar.zzD() || this.zzb) {
                for (android.net.Uri uri : list) {
                    if (zzapVar.zzd(uri)) {
                        zzZ = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzZ(uri, zzapVar.zzM(), "1");
                        zzapVar.zzB().zzb(zzZ.toString(), null, null, null);
                    } else {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziw)).booleanValue()) {
                            zzapVar.zzB().zzb(uri.toString(), null, null, null);
                        }
                    }
                }
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
