package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbo extends com.google.android.gms.internal.play_billing.zzm {
    final com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener zza;
    final com.android.billingclient.api.zzcc zzb;
    final int zzc;

    /* synthetic */ zzbo(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, com.android.billingclient.api.zzcc zzccVar, int i, com.android.billingclient.api.zzbn zzbnVar) {
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzn
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(67, 14, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(com.android.billingclient.api.zzce.zzj);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult zza = com.android.billingclient.api.zzce.zza(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + zzb);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(23, 14, zza), this.zzc);
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(zza);
    }
}
