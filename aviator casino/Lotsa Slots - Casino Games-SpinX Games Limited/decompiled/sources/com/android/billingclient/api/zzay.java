package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzay extends android.os.ResultReceiver {
    final /* synthetic */ com.android.billingclient.api.ExternalOfferInformationDialogListener zza;
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(com.android.billingclient.api.BillingClientImpl billingClientImpl, android.os.Handler handler, com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        super(handler);
        this.zza = externalOfferInformationDialogListener;
        this.zzb = billingClientImpl;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        com.android.billingclient.api.BillingResult.Builder newBuilder = com.android.billingclient.api.BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                this.zzb.zzap(com.android.billingclient.api.zzcb.zza(97, 25, com.android.billingclient.api.zzce.zzj));
                this.zza.onExternalOfferInformationDialogResponse(com.android.billingclient.api.zzce.zzj);
                return;
            } else {
                newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
                int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                this.zzb.zzap(com.android.billingclient.api.zzcb.zzb(i2 != 0 ? com.google.android.gms.internal.play_billing.zzgj.zza(i2) : 23, 25, newBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        this.zza.onExternalOfferInformationDialogResponse(newBuilder.build());
    }
}
