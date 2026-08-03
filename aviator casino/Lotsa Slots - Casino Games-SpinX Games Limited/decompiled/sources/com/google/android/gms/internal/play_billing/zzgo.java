package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public enum zzgo implements com.google.android.gms.internal.play_billing.zzcu {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    private static final com.google.android.gms.internal.play_billing.zzcv zze = new com.google.android.gms.internal.play_billing.zzcv() { // from class: com.google.android.gms.internal.play_billing.zzgm
    };
    private final int zzg;

    zzgo(int i) {
        this.zzg = i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzg);
    }
}
