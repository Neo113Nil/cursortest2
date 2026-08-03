package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzo {
    private final android.content.Context zza;
    private final com.android.billingclient.api.PurchasesUpdatedListener zzb;
    private final com.android.billingclient.api.zzc zzc;
    private final com.android.billingclient.api.UserChoiceBillingListener zzd;
    private final com.android.billingclient.api.zzcc zze;
    private final com.android.billingclient.api.zzn zzf = new com.android.billingclient.api.zzn(this, true);
    private final com.android.billingclient.api.zzn zzg = new com.android.billingclient.api.zzn(this, false);
    private boolean zzh;

    zzo(android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.zzck zzckVar, com.android.billingclient.api.zzc zzcVar, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzcc zzccVar) {
        this.zza = context;
        this.zzb = purchasesUpdatedListener;
        this.zzc = zzcVar;
        this.zzd = userChoiceBillingListener;
        this.zze = zzccVar;
    }

    final com.android.billingclient.api.PurchasesUpdatedListener zzd() {
        return this.zzb;
    }

    final void zzf() {
        this.zzf.zzc(this.zza);
        this.zzg.zzc(this.zza);
    }

    final void zzg(boolean z) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzh = z;
        this.zzg.zza(this.zza, intentFilter2);
        if (this.zzh) {
            this.zzf.zzb(this.zza, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.zzf.zza(this.zza, intentFilter);
        }
    }
}
