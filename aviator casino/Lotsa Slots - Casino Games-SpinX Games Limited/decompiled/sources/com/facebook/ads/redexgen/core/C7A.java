package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7A {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public com.facebook.ads.redexgen.core.C7B A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public com.facebook.ads.redexgen.core.C7A A04;
    public com.facebook.ads.redexgen.core.C2026nW A05 = com.facebook.ads.redexgen.core.C2026nW.A06;
    public com.facebook.ads.redexgen.core.C0686Ex A06;
    public final com.facebook.ads.redexgen.core.InterfaceC2045np A07;
    public final java.lang.Object A08;
    public final com.facebook.ads.redexgen.core.DT[] A09;
    public final com.facebook.ads.redexgen.core.AnonymousClass79 A0A;
    public final com.facebook.ads.redexgen.core.AbstractC0685Ew A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC05157p[] A0C;
    public final boolean[] A0D;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, com.google.common.base.Ascii.FS, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, 63, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C7A(com.facebook.ads.redexgen.core.InterfaceC05157p[] interfaceC05157pArr, long j, com.facebook.ads.redexgen.core.AbstractC0685Ew abstractC0685Ew, com.facebook.ads.redexgen.core.F0 f0, com.facebook.ads.redexgen.core.InterfaceC0634Cx interfaceC0634Cx, com.facebook.ads.redexgen.core.C7B c7b, com.facebook.ads.redexgen.core.C0686Ex c0686Ex) {
        this.A0C = interfaceC05157pArr;
        this.A03 = j - c7b.A03;
        this.A0B = abstractC0685Ew;
        this.A08 = com.facebook.ads.redexgen.core.AbstractC04203y.A01(c7b.A04.A04);
        this.A00 = c7b;
        this.A06 = c0686Ex;
        this.A09 = new com.facebook.ads.redexgen.core.DT[interfaceC05157pArr.length];
        this.A0D = new boolean[interfaceC05157pArr.length];
        this.A0A = new com.facebook.ads.redexgen.core.C2106op(this, interfaceC0634Cx);
        this.A07 = A00(c7b.A04, this.A0A, f0, c7b.A03, c7b.A01);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static com.facebook.ads.redexgen.core.InterfaceC2045np A00(com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.redexgen.core.AnonymousClass79 anonymousClass79, com.facebook.ads.redexgen.core.F0 f0, long j, long j2) {
        com.facebook.ads.redexgen.core.InterfaceC2045np A5W = anonymousClass79.A5W(c2044no, f0, j);
        if (j2 != -9223372036854775807L) {
            return new com.facebook.ads.redexgen.core.C9v(A5W, true, 0L, j2);
        }
        return A5W;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            com.facebook.ads.redexgen.core.InterfaceC2008nE interfaceC2008nE = this.A06.A04[i];
            if (rendererEnabled && interfaceC2008nE != null) {
                interfaceC2008nE.A5x();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            com.facebook.ads.redexgen.core.InterfaceC2008nE interfaceC2008nE = this.A06.A04[i];
            if (rendererEnabled && interfaceC2008nE != null) {
                interfaceC2008nE.A6K();
            }
        }
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(com.facebook.ads.redexgen.core.AnonymousClass79 anonymousClass79, com.facebook.ads.redexgen.core.InterfaceC2045np interfaceC2045np) {
        try {
            if (interfaceC2045np instanceof com.facebook.ads.redexgen.core.C9v) {
                anonymousClass79.AHk(((com.facebook.ads.redexgen.core.C9v) interfaceC2045np).A05);
            } else {
                anonymousClass79.AHk(interfaceC2045np);
            }
        } catch (java.lang.RuntimeException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A01(0, 17, 10), A01(17, 22, 90), e);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(com.facebook.ads.redexgen.core.DT[] dtArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9N() == -2 && this.A06.A00(i)) {
                dtArr[i] = new com.facebook.ads.redexgen.core.C2047nr();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(com.facebook.ads.redexgen.core.DT[] dtArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9N() == -2) {
                dtArr[i] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long A78 = this.A01 ? this.A07.A78() : Long.MIN_VALUE;
        return A78 == Long.MIN_VALUE ? this.A00.A00 : A78;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8b();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j) {
        return this.A07.A76(j);
    }

    public final long A0D(long j) {
        return j - A0B();
    }

    public final long A0E(long j) {
        return A0B() + j;
    }

    public final long A0F(com.facebook.ads.redexgen.core.C0686Ex c0686Ex, long j, boolean z) {
        return A0G(c0686Ex, j, z, new boolean[this.A0C.length]);
    }

    public final long A0G(com.facebook.ads.redexgen.core.C0686Ex c0686Ex, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i < c0686Ex.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z) {
                    boolean A01 = c0686Ex.A01(this.A06, i);
                    if (A0F[5].length() != 8) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (A01) {
                        z2 = true;
                    }
                }
                zArr2[i] = z2;
                i++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = c0686Ex;
                A03();
                long AJ9 = this.A07.AJ9(c0686Ex.A04, this.A0D, this.A09, zArr, j);
                A06(this.A09);
                this.A01 = false;
                for (int i2 = 0; i2 < this.A09.length; i2++) {
                    if (this.A09[i2] != null) {
                        com.facebook.ads.redexgen.core.AbstractC04203y.A08(c0686Ex.A00(i2));
                        if (this.A0C[i2].A9N() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        com.facebook.ads.redexgen.core.AbstractC04203y.A08(c0686Ex.A04[i2] == null);
                    }
                }
                return AJ9;
            }
        }
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z) {
        if (!z) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final com.facebook.ads.redexgen.core.C7A A0I() {
        return this.A04;
    }

    public final com.facebook.ads.redexgen.core.C2026nW A0J() {
        return this.A05;
    }

    public final com.facebook.ads.redexgen.core.C0686Ex A0K() {
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.C0686Ex A0L(float f, com.facebook.ads.androidx.media3.common.Timeline timeline) throws com.facebook.ads.redexgen.core.AD {
        com.facebook.ads.redexgen.core.C0686Ex A0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (com.facebook.ads.redexgen.core.InterfaceC2008nE interfaceC2008nE : A0b.A04) {
            if (interfaceC2008nE != null) {
                interfaceC2008nE.AFJ(f);
            }
        }
        return A0b;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f, com.facebook.ads.androidx.media3.common.Timeline timeline) throws com.facebook.ads.redexgen.core.AD {
        this.A02 = true;
        this.A05 = this.A07.A9M();
        long A0F2 = A0F(A0L(f, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - A0F2;
        this.A00 = this.A00.A00(A0F2);
    }

    public final void A0O(long j) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(A08());
        this.A07.A5C(A0D(j));
    }

    public final void A0P(long j) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(A08());
        if (this.A02) {
            this.A07.AHW(A0D(j));
        }
    }

    public final void A0Q(com.facebook.ads.redexgen.core.C7A c7a) {
        if (c7a == this.A04) {
            return;
        }
        A02();
        this.A04 = c7a;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A78() == Long.MIN_VALUE);
    }
}
