package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbg extends com.google.android.gms.internal.play_billing.zze {
    final com.android.billingclient.api.ExternalOfferReportingDetailsListener zza;
    final com.android.billingclient.api.zzcc zzb;
    final int zzc;

    /* synthetic */ zzbg(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, com.android.billingclient.api.zzcc zzccVar, int i, com.android.billingclient.api.zzbf zzbfVar) {
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzf
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(95, 24, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(com.android.billingclient.api.zzce.zzj, null);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult zza = com.android.billingclient.api.zzce.zza(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + zzb);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(23, 24, zza), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(zza, null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(zza, new com.android.billingclient.api.ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(104, 24, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(com.android.billingclient.api.zzce.zzj, null);
        }
    }
}
