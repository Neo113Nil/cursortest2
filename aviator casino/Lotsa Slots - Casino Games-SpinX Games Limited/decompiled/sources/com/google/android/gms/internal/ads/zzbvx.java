package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbvx implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvi zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbwd zzb;

    zzbvx(com.google.android.gms.internal.ads.zzbwd zzbwdVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) {
        this.zza = zzbviVar;
        java.util.Objects.requireNonNull(zzbwdVar);
        this.zzb = zzbwdVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError adError) {
        try {
            java.lang.String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int code = adError.getCode();
            java.lang.String message = adError.getMessage();
            java.lang.String domain = adError.getDomain();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 43 + java.lang.String.valueOf(code).length() + 17 + java.lang.String.valueOf(message).length() + 16 + java.lang.String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
            com.google.android.gms.internal.ads.zzbvi zzbviVar = this.zza;
            zzbviVar.zzx(adError.zza());
            zzbviVar.zzw(adError.getCode(), adError.getMessage());
            zzbviVar.zzg(adError.getCode());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ java.lang.Object onSuccess(java.lang.Object obj) {
        try {
            this.zzb.zzc(((com.google.android.gms.ads.mediation.MediationBannerAd) obj).getView());
            this.zza.zzj();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        return new com.google.android.gms.internal.ads.zzbvt(this.zza);
    }
}
