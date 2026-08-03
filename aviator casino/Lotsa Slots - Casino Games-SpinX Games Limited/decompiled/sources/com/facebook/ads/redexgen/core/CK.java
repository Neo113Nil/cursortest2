package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/common/clock/IntervalClock;", "Lcom/facebook/common/time/MonotonicClock;", "<init>", "()V", "nowNanos", "", "now", "fbandroid.java.com.facebook.common.clock.clock"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: assets/audience_network/classes2.dex */
public final class CK implements com.facebook.ads.redexgen.core.InterfaceC1692hc {
    public static final com.facebook.ads.redexgen.core.CK A00 = new com.facebook.ads.redexgen.core.CK();

    @Override // com.facebook.ads.redexgen.core.InterfaceC1692hc
    public final long ACf() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
