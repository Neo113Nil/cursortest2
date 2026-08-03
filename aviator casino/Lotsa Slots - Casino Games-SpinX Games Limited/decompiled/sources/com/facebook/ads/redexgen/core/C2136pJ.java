package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2136pJ implements com.facebook.ads.redexgen.core.C4X {
    public static final java.util.List<com.facebook.ads.redexgen.core.C2137pK> A01 = new java.util.ArrayList(50);
    public final android.os.Handler A00;

    public C2136pJ(android.os.Handler handler) {
        this.A00 = handler;
    }

    public static com.facebook.ads.redexgen.core.C2137pK A00() {
        com.facebook.ads.redexgen.core.C2137pK c2137pK;
        synchronized (A01) {
            c2137pK = A01.isEmpty() ? new com.facebook.ads.redexgen.core.C2137pK() : A01.remove(A01.size() - 1);
        }
        return c2137pK;
    }

    public static void A01(com.facebook.ads.redexgen.core.C2137pK c2137pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2137pK);
            }
        }
    }

    public final boolean A03(java.lang.Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final android.os.Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean A9n(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final com.facebook.ads.redexgen.core.C2137pK ACg(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final com.facebook.ads.redexgen.core.C2137pK ACh(int i, int i2, int i3) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final com.facebook.ads.redexgen.core.C2137pK ACi(int i, int i2, int i3, java.lang.Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final com.facebook.ads.redexgen.core.C2137pK ACj(int i, java.lang.Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final void AIT(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJA(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJB(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJD(com.facebook.ads.redexgen.core.C4W c4w) {
        return ((com.facebook.ads.redexgen.core.C2137pK) c4w).A03(this.A00);
    }
}
