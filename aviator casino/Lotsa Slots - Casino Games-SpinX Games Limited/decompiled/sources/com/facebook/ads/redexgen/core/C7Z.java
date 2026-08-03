package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7Z {
    public static final com.facebook.ads.redexgen.core.C2044no A0E = new com.facebook.ads.redexgen.core.C2044no(new java.lang.Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final com.facebook.ads.androidx.media3.common.Timeline A03;
    public final com.facebook.ads.redexgen.core.C2044no A04;
    public final com.facebook.ads.redexgen.core.C2044no A05;
    public final com.facebook.ads.redexgen.core.C2026nW A06;
    public final com.facebook.ads.redexgen.core.C0686Ex A07;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final com.facebook.ads.redexgen.core.EnumC1762ir A08;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C7Z(com.facebook.ads.androidx.media3.common.Timeline timeline, long j, com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C0686Ex c0686Ex) {
        this(timeline, A0E, j, -9223372036854775807L, 1, false, c2026nW, c0686Ex, A0E, j, j, j, com.facebook.ads.redexgen.core.EnumC1762ir.A09, false);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C7Z(com.facebook.ads.androidx.media3.common.Timeline timeline, com.facebook.ads.redexgen.core.C2044no c2044no, long j, long j2, int i, boolean z, com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C0686Ex c0686Ex, com.facebook.ads.redexgen.core.C2044no c2044no2, long j3, long j4, long j5) {
        this(timeline, c2044no, j, j2, i, z, c2026nW, c0686Ex, c2044no2, j3, j4, j5, com.facebook.ads.redexgen.core.EnumC1762ir.A09, false);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C7Z(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) com.facebook.ads.androidx.media3.common.Timeline timeline, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) com.facebook.ads.redexgen.core.C2044no c2044no, long j, long j2, int i, boolean z, com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C0686Ex c0686Ex, com.facebook.ads.redexgen.core.C2044no c2044no2, long j3, long j4, long j5, com.facebook.ads.redexgen.core.EnumC1762ir enumC1762ir, boolean z2) {
        this.A03 = timeline;
        this.A05 = c2044no;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A06 = c2026nW;
        this.A07 = c0686Ex;
        this.A04 = c2044no2;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = enumC1762ir;
        this.A09 = z2;
    }

    public static void A00(com.facebook.ads.redexgen.core.C7Z c7z, com.facebook.ads.redexgen.core.C7Z c7z2) {
        c7z2.A0C = c7z.A0C;
        c7z2.A0B = c7z.A0B;
        c7z2.A0D = c7z.A0D;
    }

    public final com.facebook.ads.redexgen.core.C7Z A01(int i) {
        com.facebook.ads.redexgen.core.C7Z c7z = new com.facebook.ads.redexgen.core.C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final com.facebook.ads.redexgen.core.C7Z A02(int i, com.facebook.ads.redexgen.core.EnumC1762ir enumC1762ir, boolean z) {
        com.facebook.ads.redexgen.core.C7Z c7z = new com.facebook.ads.redexgen.core.C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC1762ir, z);
        A00(this, c7z);
        return c7z;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final com.facebook.ads.redexgen.core.C7Z A03(int i, boolean z) {
        com.facebook.ads.redexgen.core.C7Z c7z = new com.facebook.ads.redexgen.core.C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z);
        A00(this, c7z);
        return c7z;
    }

    public final com.facebook.ads.redexgen.core.C7Z A04(com.facebook.ads.androidx.media3.common.Timeline timeline) {
        com.facebook.ads.redexgen.core.C7Z c7z = new com.facebook.ads.redexgen.core.C7Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final com.facebook.ads.redexgen.core.C7Z A05(com.facebook.ads.redexgen.core.C2044no c2044no) {
        return new com.facebook.ads.redexgen.core.C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2044no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final com.facebook.ads.redexgen.core.C7Z A06(com.facebook.ads.redexgen.core.C2044no c2044no, long j, long j2, long j3) {
        long j4 = j2;
        com.facebook.ads.androidx.media3.common.Timeline timeline = this.A03;
        if (!c2044no.A00()) {
            j4 = -9223372036854775807L;
        }
        return new com.facebook.ads.redexgen.core.C7Z(timeline, c2044no, j, j4, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j3, j);
    }

    public final com.facebook.ads.redexgen.core.C7Z A07(com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C0686Ex c0686Ex) {
        com.facebook.ads.redexgen.core.C7Z c7z = new com.facebook.ads.redexgen.core.C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2026nW, c0686Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final com.facebook.ads.redexgen.core.C7Z A08(boolean z) {
        com.facebook.ads.redexgen.core.C7Z c7z = new com.facebook.ads.redexgen.core.C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, z, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }
}
