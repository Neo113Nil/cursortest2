package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6I, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C6I {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"PO8jPPjsWkSohvoClx2DXSl8S5WX59Vo", "WTC2lbEoOF", "JF48xkVfbyUi8xBtmw", "8DzCN5fkinelgfDbo7bZLAsZpLiI5tji", "0XqHByXaOSOjXRziBAqROkukCru0GxwN", "eULZ8KrR2sSax75EYp3yLx1S0uA0IndI", "SEYTT", "AcNYjN6U0IjRu5cSurFZ1FZkr4vsIKRe"};

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("The average time that it takes to decode frames expressed in milliseconds")
    public int A00;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("The average time that it takes to render frames expressed in milliseconds")
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Total number of samples used to calculate average decode and render times")
    public int A0C;
    public int A0D;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("The number of frames that were in a gap and skipped as a result of it")
    public int A0E;
    public long A0F;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A0G = new byte[]{19, 50, 52, 56, 51, 50, 37, com.google.common.base.Ascii.DC4, 56, 34, 57, 35, 50, 37, 36, 119, 44, 93, 119, 51, 50, 52, 56, 51, 50, 37, com.google.common.base.Ascii.RS, 57, 62, 35, 36, 106, 114, 36, 123, 93, 119, 51, 50, 52, 56, 51, 50, 37, 5, 50, 59, 50, 54, 36, 50, 36, 106, 114, 36, 93, 119, 38, 34, 50, 34, 50, 51, com.google.common.base.Ascii.RS, 57, 39, 34, 35, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 36, 60, 62, 39, 39, 50, 51, com.google.common.base.Ascii.RS, 57, 39, 34, 35, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 37, 50, 57, 51, 50, 37, 50, 51, com.google.common.base.Ascii.CAN, 34, 35, 39, 34, 35, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 36, 60, 62, 39, 39, 50, 51, com.google.common.base.Ascii.CAN, 34, 35, 39, 34, 35, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 51, 37, 56, 39, 39, 50, 51, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 51, 37, 56, 39, 39, 50, 51, com.google.common.base.Ascii.RS, 57, 39, 34, 35, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 58, 54, 47, com.google.common.base.Ascii.DC4, 56, 57, 36, 50, 52, 34, 35, 62, 33, 50, 19, 37, 56, 39, 39, 50, 51, com.google.common.base.Ascii.NAK, 34, 49, 49, 50, 37, 36, 106, 114, 36, 93, 119, 51, 37, 56, 39, 39, 50, 51, 3, 56, com.google.common.base.Ascii.FS, 50, 46, 49, 37, 54, 58, 50, com.google.common.base.Ascii.DC2, 33, 50, 57, 35, 36, 106, 114, 36, 93, 119, 35, 56, 35, 54, 59, 1, 62, 51, 50, 56, 17, 37, 54, 58, 50, 7, 37, 56, 52, 50, 36, 36, 62, 57, 48, com.google.common.base.Ascii.CAN, 49, 49, 36, 50, 35, 2, 36, 106, 114, 36, 93, 119, 33, 62, 51, 50, 56, 17, 37, 54, 58, 50, 7, 37, 56, 52, 50, 36, 36, 62, 57, 48, com.google.common.base.Ascii.CAN, 49, 49, 36, 50, 35, com.google.common.base.Ascii.DC4, 56, 34, 57, 35, 106, 114, 36, 93, 42};
    }

    static {
        A01();
    }

    public final synchronized void A02() {
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    public final void A03(long j) {
        this.A01 = this.A09 == 0 ? -1 : (int) (j / this.A09);
        java.lang.String[] strArr = A0H;
        if (strArr[5].charAt(27) != strArr[4].charAt(27)) {
            throw new java.lang.RuntimeException();
        }
        A0H[1] = "yfB4vc6THQ";
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    public final void A04(android.util.Pair<java.lang.Long, java.lang.Integer> newSamplePerFrameDecodeTimeAndCount) {
        int i;
        this.A0C += ((java.lang.Integer) newSamplePerFrameDecodeTimeAndCount.second).intValue();
        long updatedTotalDecodeTime = ((java.lang.Long) newSamplePerFrameDecodeTimeAndCount.first).longValue() + (this.A0C * this.A00);
        if (this.A0C == 0) {
            i = -1;
        } else {
            long currentTotalDecodeTime = this.A0C;
            i = (int) (updatedTotalDecodeTime / currentTotalDecodeTime);
        }
        this.A00 = i;
    }

    public final java.lang.String toString() {
        return com.facebook.ads.redexgen.core.C5C.A0n(A00(0, 333, 101), java.lang.Integer.valueOf(this.A02), java.lang.Integer.valueOf(this.A03), java.lang.Integer.valueOf(this.A08), java.lang.Integer.valueOf(this.A0A), java.lang.Integer.valueOf(this.A09), java.lang.Integer.valueOf(this.A0B), java.lang.Integer.valueOf(this.A04), java.lang.Integer.valueOf(this.A05), java.lang.Integer.valueOf(this.A07), java.lang.Integer.valueOf(this.A06), java.lang.Long.valueOf(this.A0F), java.lang.Integer.valueOf(this.A0D));
    }
}
