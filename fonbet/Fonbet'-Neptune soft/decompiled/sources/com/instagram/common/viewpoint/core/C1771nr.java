package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1771nr implements C3T {
    @Override // com.instagram.common.viewpoint.core.C3T
    public final C1769np A5H(Looper looper, Handler.Callback callback) {
        return new C1769np(new Handler(looper, callback));
    }

    @Override // com.instagram.common.viewpoint.core.C3T
    public final long A6B() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.instagram.common.viewpoint.core.C3T
    public final long AJt() {
        return SystemClock.uptimeMillis();
    }
}
