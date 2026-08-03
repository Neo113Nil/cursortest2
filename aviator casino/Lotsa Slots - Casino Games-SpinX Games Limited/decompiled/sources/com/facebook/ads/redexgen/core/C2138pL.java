package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2138pL implements com.facebook.ads.redexgen.core.AnonymousClass45 {
    @Override // com.facebook.ads.redexgen.core.AnonymousClass45
    public final com.facebook.ads.redexgen.core.C2136pJ A5P(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new com.facebook.ads.redexgen.core.C2136pJ(new android.os.Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass45
    public final long A6J() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass45
    public final long AKe() {
        return android.os.SystemClock.uptimeMillis();
    }
}
