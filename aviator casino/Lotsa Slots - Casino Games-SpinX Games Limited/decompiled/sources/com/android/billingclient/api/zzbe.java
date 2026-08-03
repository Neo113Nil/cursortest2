package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbe extends com.google.android.gms.internal.play_billing.zzc {
    final com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener zza;
    final com.android.billingclient.api.zzcc zzb;
    final int zzc;

    /* synthetic */ zzbe(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, com.android.billingclient.api.zzcc zzccVar, int i, com.android.billingclient.api.zzbd zzbdVar) {
        this.zza = alternativeBillingOnlyReportingDetailsListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(71, 15, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onAlternativeBillingOnlyTokenResponse(com.android.billingclient.api.zzce.zzj, null);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult zza = com.android.billingclient.api.zzce.zza(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + zzb);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(23, 15, zza), this.zzc);
            this.zza.onAlternativeBillingOnlyTokenResponse(zza, null);
            return;
        }
        try {
            this.zza.onAlternativeBillingOnlyTokenResponse(zza, new com.android.billingclient.api.AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(72, 15, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onAlternativeBillingOnlyTokenResponse(com.android.billingclient.api.zzce.zzj, null);
        }
    }
}
