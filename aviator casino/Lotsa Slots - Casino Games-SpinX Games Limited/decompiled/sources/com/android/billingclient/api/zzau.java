package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzau implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.android.billingclient.api.PurchasesResponseListener zzb;
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zzc;

    zzau(com.android.billingclient.api.BillingClientImpl billingClientImpl, java.lang.String str, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        this.zza = str;
        this.zzb = purchasesResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.android.billingclient.api.zzcz zzag = com.android.billingclient.api.BillingClientImpl.zzag(this.zzc, this.zza, 9);
        if (zzag.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzag.zza(), zzag.zzb());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzag.zza(), com.google.android.gms.internal.play_billing.zzai.zzk());
        return null;
    }
}
