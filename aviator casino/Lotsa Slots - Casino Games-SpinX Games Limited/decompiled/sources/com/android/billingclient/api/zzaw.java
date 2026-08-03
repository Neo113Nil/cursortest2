package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzaw extends android.os.ResultReceiver {
    final /* synthetic */ com.android.billingclient.api.InAppMessageResponseListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(com.android.billingclient.api.BillingClientImpl billingClientImpl, android.os.Handler handler, com.android.billingclient.api.InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.zza = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        this.zza.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzb.zzf(bundle, "BillingClient"));
    }
}
