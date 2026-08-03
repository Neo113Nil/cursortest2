package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbk extends com.google.android.gms.internal.play_billing.zzi {
    final com.android.billingclient.api.BillingConfigResponseListener zza;
    final com.android.billingclient.api.zzcc zzb;
    final int zzc;

    /* synthetic */ zzbk(com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener, com.android.billingclient.api.zzcc zzccVar, int i, com.android.billingclient.api.zzbj zzbjVar) {
        this.zza = billingConfigResponseListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzj
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(63, 13, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onBillingConfigResponse(com.android.billingclient.api.zzce.zzj, null);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        java.lang.String zzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult.Builder newBuilder = com.android.billingclient.api.BillingResult.newBuilder();
        newBuilder.setResponseCode(zzb);
        newBuilder.setDebugMessage(zzg);
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() failed. Response code: " + zzb);
            com.android.billingclient.api.BillingResult build = newBuilder.build();
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(23, 13, build), this.zzc);
            this.zza.onBillingConfigResponse(build, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            newBuilder.setResponseCode(6);
            com.android.billingclient.api.BillingResult build2 = newBuilder.build();
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(64, 13, build2), this.zzc);
            this.zza.onBillingConfigResponse(build2, null);
            return;
        }
        try {
            this.zza.onBillingConfigResponse(newBuilder.build(), new com.android.billingclient.api.BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(65, 13, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onBillingConfigResponse(com.android.billingclient.api.zzce.zzj, null);
        }
    }
}
