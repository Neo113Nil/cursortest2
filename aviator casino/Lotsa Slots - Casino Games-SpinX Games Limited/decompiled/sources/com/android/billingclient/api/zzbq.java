package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbq extends com.google.android.gms.internal.play_billing.zzo {
    final com.android.billingclient.api.ExternalOfferAvailabilityListener zza;
    final com.android.billingclient.api.zzcc zzb;
    final int zzc;

    /* synthetic */ zzbq(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener, com.android.billingclient.api.zzcc zzccVar, int i, com.android.billingclient.api.zzbp zzbpVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        if (bundle == null) {
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(92, 23, com.android.billingclient.api.zzce.zzj), this.zzc);
            this.zza.onExternalOfferAvailabilityResponse(com.android.billingclient.api.zzce.zzj);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        com.android.billingclient.api.BillingResult zza = com.android.billingclient.api.zzce.zza(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + zzb);
            this.zzb.zzb(com.android.billingclient.api.zzcb.zza(23, 23, zza), this.zzc);
        }
        this.zza.onExternalOfferAvailabilityResponse(zza);
    }
}
