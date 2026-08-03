package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzfe extends java.lang.RuntimeException {
    public zzfe(com.google.android.gms.internal.play_billing.zzec zzecVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.play_billing.zzdc zza() {
        return new com.google.android.gms.internal.play_billing.zzdc(getMessage());
    }
}
