package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/video/framebasedlogging/FrameBasedLogger;", "", "videoId", "", "<init>", "(Ljava/lang/String;)V", "getVideoId", "()Ljava/lang/String;", "videoFrameBuffer", "Ljava/util/concurrent/BlockingDeque;", "Lcom/facebook/video/framebasedlogging/VideoFrameInfo;", "getVideoFrameBuffer$annotations", "()V", "addVideoFrameToBuffer", "", "frame", "videoFramesAndEmptyBuffer", "", "getVideoFramesAndEmptyBuffer", "()Ljava/util/List;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "fbandroid.java.com.facebook.video.framebasedlogging.framebasedlogging_an"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.iS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1740iS {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"nvoCYT5lXV50ozFrdUrQJCA6z0GvB", "", "jdLKha1Na7nbzs0Nk4YLOHAcdwecuvvy", "x", "dSWVRlyTiHf7svvh2WPzEDVR9b7sv5FM", "fWYFOffN0cZPNc3vcPN7ReiBLy1A48b", "e5JjNsryHusTZGAVeTKu2QwvoQvLupoE", "SBHDzKPIpiPnF71bMjezo2z0"};
    public static final com.facebook.ads.redexgen.core.C1739iR A04;
    public final java.lang.String A00;
    public final java.util.concurrent.BlockingDeque<com.facebook.ads.redexgen.core.C1741iT> A01 = new java.util.concurrent.LinkedBlockingDeque();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{com.google.common.base.Ascii.US, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FS};
    }

    static {
        A02();
        A04 = new com.facebook.ads.redexgen.core.C1739iR(null);
    }

    public C1740iS(java.lang.String str) {
        this.A00 = str;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String A01(java.util.List<com.facebook.ads.redexgen.core.C1741iT> list) {
        return A04.A0A(list);
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C1741iT> A03() {
        java.util.List frames = new java.util.ArrayList();
        this.A01.drainTo(frames);
        return frames;
    }

    public final void A04(com.facebook.ads.redexgen.core.C1741iT c1741iT) {
        com.facebook.ads.redexgen.core.C2210qY.A09(c1741iT, A00(0, 5, 47));
        com.facebook.ads.redexgen.core.C1741iT peekLast = this.A01.peekLast();
        if (peekLast != null) {
            long a03 = peekLast.getA03();
            long a032 = c1741iT.getA03();
            if (A03[4].charAt(10) == 'f') {
                A03[1] = "";
                if (a03 == a032 && peekLast.getA01() == c1741iT.getA01()) {
                    return;
                }
            }
            throw new java.lang.RuntimeException();
        }
        this.A01.add(c1741iT);
        if (A03[4].charAt(10) == 'f') {
            A03[0] = "kleFc3GTYdmSeGzzaJMmIvt997RVj";
            return;
        }
        throw new java.lang.RuntimeException();
    }
}
