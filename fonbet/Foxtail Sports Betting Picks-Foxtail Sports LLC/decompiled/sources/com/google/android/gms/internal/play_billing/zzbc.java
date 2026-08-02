package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes2.dex */
final class zzbc extends zzbo {
    zzbc() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzbo
    public final long zza() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
