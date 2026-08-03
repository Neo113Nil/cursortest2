package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzgn implements com.google.android.gms.internal.play_billing.zzcw {
    static final com.google.android.gms.internal.play_billing.zzcw zza = new com.google.android.gms.internal.play_billing.zzgn();

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i) {
        com.google.android.gms.internal.play_billing.zzgo zzgoVar = com.google.android.gms.internal.play_billing.zzgo.BROADCAST_ACTION_UNSPECIFIED;
        return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : com.google.android.gms.internal.play_billing.zzgo.ALTERNATIVE_BILLING_ACTION : com.google.android.gms.internal.play_billing.zzgo.LOCAL_PURCHASES_UPDATED_ACTION : com.google.android.gms.internal.play_billing.zzgo.PURCHASES_UPDATED_ACTION : com.google.android.gms.internal.play_billing.zzgo.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
