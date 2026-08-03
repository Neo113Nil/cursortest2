package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/NoOpMediaCodecPoolTracker;", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker;", "<init>", "()V", "reportCodecCreated", "", "creatingEvent", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$CreatingEvent;", "codecInstanceId", "", "reportCodecReleasing", "source", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "reportCodecReleased", "reportCodecAcquiredFromPool", "isVideo", "", "codecName", "", "reportCodecReturnedToPool", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.CD, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class NoOpMediaCodecPoolTracker extends com.facebook.ads.redexgen.core.MediaCodecPoolTracker {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.C1800jc A01;
    public static final com.facebook.ads.redexgen.core.NoOpMediaCodecPoolTracker A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{36, 40, 35, 34, 36, 9, 38, 42, 34, 9, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, 3, 4, com.google.common.base.Ascii.CR, 47, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, 4, com.google.common.base.Ascii.RS, 84, 72, 82, 85, 68, 66};
    }

    static {
        A01();
        A01 = new com.facebook.ads.redexgen.core.C1800jc(null);
        A02 = new com.facebook.ads.redexgen.core.NoOpMediaCodecPoolTracker();
    }

    @Override // com.facebook.ads.redexgen.core.MediaCodecPoolTracker
    public final void A06(com.facebook.ads.redexgen.core.C1787jJ c1787jJ, int i) {
        com.facebook.ads.redexgen.core.C2210qY.A09(c1787jJ, A00(9, 13, 123));
    }

    @Override // com.facebook.ads.redexgen.core.MediaCodecPoolTracker
    public final void A07(com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, int i) {
        com.facebook.ads.redexgen.core.C2210qY.A09(enumC1789jL, A00(22, 6, 54));
    }

    @Override // com.facebook.ads.redexgen.core.MediaCodecPoolTracker
    public final void A08(com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, int i) {
        com.facebook.ads.redexgen.core.C2210qY.A09(enumC1789jL, A00(22, 6, 54));
    }

    @Override // com.facebook.ads.redexgen.core.MediaCodecPoolTracker
    public final void A09(com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, int i) {
        com.facebook.ads.redexgen.core.C2210qY.A09(enumC1789jL, A00(22, 6, 54));
    }

    @Override // com.facebook.ads.redexgen.core.MediaCodecPoolTracker
    public final void A0A(boolean z, java.lang.String str, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, int i) {
        com.facebook.ads.redexgen.core.C2210qY.A09(str, A00(0, 9, 86));
        com.facebook.ads.redexgen.core.C2210qY.A09(enumC1789jL, A00(22, 6, 54));
    }
}
