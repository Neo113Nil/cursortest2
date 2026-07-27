package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes8.dex */
final class zzbb extends zzbo {
    zzbb() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzbo
    public final long zza() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
