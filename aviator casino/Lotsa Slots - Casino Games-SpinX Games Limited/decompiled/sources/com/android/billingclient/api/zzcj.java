package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzcj {
    private boolean zza;
    private com.google.android.datatransport.Transport zzb;

    zzcj(android.content.Context context) {
        try {
            com.google.android.datatransport.runtime.TransportRuntime.initialize(context);
            this.zzb = com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(com.google.android.datatransport.cct.CCTDestination.INSTANCE).getTransport("PLAY_BILLING_LIBRARY", com.google.android.gms.internal.play_billing.zzhe.class, com.google.android.datatransport.Encoding.of("proto"), new com.google.android.datatransport.Transformer() { // from class: com.android.billingclient.api.zzci
                @Override // com.google.android.datatransport.Transformer
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((com.google.android.gms.internal.play_billing.zzhe) obj).zzc();
                }
            });
        } catch (java.lang.Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(com.google.android.gms.internal.play_billing.zzhe zzheVar) {
        if (this.zza) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.zzb.send(com.google.android.datatransport.Event.ofData(zzheVar));
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "logging failed.");
        }
    }
}
