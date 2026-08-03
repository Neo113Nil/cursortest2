package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzav implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.android.billingclient.api.PurchaseHistoryResponseListener zzb;
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zzc;

    zzav(com.android.billingclient.api.BillingClientImpl billingClientImpl, java.lang.String str, com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = str;
        this.zzb = purchaseHistoryResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.android.billingclient.api.zzbt zzg = com.android.billingclient.api.BillingClientImpl.zzg(this.zzc, this.zza);
        this.zzb.onPurchaseHistoryResponse(zzg.zza(), zzg.zzb());
        return null;
    }
}
