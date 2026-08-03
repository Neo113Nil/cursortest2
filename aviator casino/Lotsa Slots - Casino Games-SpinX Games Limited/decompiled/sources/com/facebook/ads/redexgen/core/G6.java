package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class G6 implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
    public static byte[] A05;
    public static final com.facebook.ads.redexgen.core.G6 A06;
    public int A00;
    public android.view.Choreographer A01;
    public final android.os.Handler A02;
    public volatile long A04 = -9223372036854775807L;
    public final android.os.HandlerThread A03 = new android.os.HandlerThread(A01(0, 35, 125));

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-47, 4, -5, -36, -8, -19, 5, -15, -2, -58, -46, -2, -19, -7, -15, -34, -15, -8, -15, -19, -1, -15, -49, -12, -5, -2, -15, -5, -13, -2, -19, -4, -12, -15, -2, -36, -17, -22, -21, -11, -52, -8, -25, -13, -21, -40, -21, -14, -21, -25, -7, -21, -50, -21, -14, -10, -21, -8, -68, -39, -33, -44, -55, -122, -39, -57, -45, -42, -46, -49, -44, -51, -122, -54, -49, -39, -57, -56, -46, -53, -54, -122, -54, -37, -53, -122, -38, -43, -122, -42, -46, -57, -38, -52, -43, -40, -45, -122, -53, -40, -40, -43, -40};
    }

    static {
        A05();
        A06 = new com.facebook.ads.redexgen.core.G6();
    }

    public G6() {
        this.A03.start();
        this.A02 = com.facebook.ads.redexgen.core.C5C.A0c(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static com.facebook.ads.redexgen.core.G6 A00() {
        return A06;
    }

    private void A02() {
        if (this.A01 != null) {
            this.A00++;
            if (this.A00 == 1) {
                this.A01.postFrameCallback(this);
            }
        }
    }

    private void A03() {
        try {
            this.A01 = android.view.Choreographer.getInstance();
        } catch (java.lang.RuntimeException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A01(35, 23, 119), A01(58, 45, 87), e);
        }
    }

    private void A04() {
        if (this.A01 != null) {
            this.A00--;
            if (this.A00 == 0) {
                this.A01.removeFrameCallback(this);
                this.A04 = -9223372036854775807L;
            }
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        ((android.view.Choreographer) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01)).postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                A03();
                break;
            case 1:
                A02();
                break;
            case 2:
                A04();
                break;
        }
        return true;
    }
}
