package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2163pl implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public int A00;
    public long A01;
    public long A02;
    public java.lang.Object A03;
    public java.lang.Object A04;
    public boolean A05;
    public com.facebook.ads.redexgen.core.C2204qS A06 = com.facebook.ads.redexgen.core.C2204qS.A08;
    public static java.lang.String[] A07 = {"4zGdQbqEEbqON0fsiZAaEQkKoAoKYmna", "yJpzHCnd9V3wUr5Wrx8duzmTaMKaViaS", "6le5bHbrSJ1W0fbLNXPlurR", "jvR1cNhZ0960aRA7pVRRRMqTg6KbIJja", "KqjZe5mn0dP", "Q", "Z7fKuPhHzVcFnrI", "fPry0FIfciS3iZV36uBdTRShtkwqjgIo"};
    public static final java.lang.String A0D = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A0A = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final java.lang.String A0C = com.facebook.ads.redexgen.core.C5C.A0h(2);
    public static final java.lang.String A0B = com.facebook.ads.redexgen.core.C5C.A0h(3);
    public static final java.lang.String A09 = com.facebook.ads.redexgen.core.C5C.A0h(4);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2163pl> A08 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pp
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.C2163pl A01;
            A01 = com.facebook.ads.redexgen.core.C2163pl.A01(bundle);
            return A01;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C2163pl A01(android.os.Bundle bundle) {
        int i = bundle.getInt(A0D, 0);
        long j = bundle.getLong(A0A, -9223372036854775807L);
        long j2 = bundle.getLong(A0C, 0L);
        boolean z = bundle.getBoolean(A0B, false);
        android.os.Bundle bundle2 = bundle.getBundle(A09);
        com.facebook.ads.redexgen.core.C2204qS A6f = bundle2 != null ? com.facebook.ads.redexgen.core.C2204qS.A09.A6f(bundle2) : com.facebook.ads.redexgen.core.C2204qS.A08;
        com.facebook.ads.redexgen.core.C2163pl c2163pl = new com.facebook.ads.redexgen.core.C2163pl();
        c2163pl.A0G(null, null, i, j, j2, A6f, z);
        return c2163pl;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i) {
        return this.A06.A07(i).A00;
    }

    public final int A05(int i) {
        return this.A06.A07(i).A04();
    }

    public final int A06(int i, int i2) {
        return this.A06.A07(i).A05(i2);
    }

    public final int A07(long j) {
        return this.A06.A05(j, this.A01);
    }

    public final int A08(long j) {
        return this.A06.A06(j, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return com.facebook.ads.redexgen.core.C5C.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i) {
        return this.A06.A07(i).A03;
    }

    public final long A0E(int i, int i2) {
        com.facebook.ads.redexgen.core.C2205qT A072 = this.A06.A07(i);
        if (A072.A00 != -1) {
            return A072.A06[i2];
        }
        return -9223372036854775807L;
    }

    public final com.facebook.ads.redexgen.core.C2163pl A0F(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2) {
        return A0G(obj, obj2, i, j, j2, com.facebook.ads.redexgen.core.C2204qS.A08, false);
    }

    public final com.facebook.ads.redexgen.core.C2163pl A0G(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, com.facebook.ads.redexgen.core.C2204qS c2204qS, boolean z) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = c2204qS;
        this.A05 = z;
        return this;
    }

    public final boolean A0H(int i) {
        return !this.A06.A07(i).A07();
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i, int i2) {
        com.facebook.ads.redexgen.core.C2205qT c2205qT = this.A06.A05[i];
        return (c2205qT.A00 == -1 || c2205qT.A05[i2] == 0) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2163pl c2163pl = (com.facebook.ads.redexgen.core.C2163pl) obj;
        if (com.facebook.ads.redexgen.core.C5C.A1E(this.A03, c2163pl.A03) && com.facebook.ads.redexgen.core.C5C.A1E(this.A04, c2163pl.A04) && this.A00 == c2163pl.A00 && this.A01 == c2163pl.A01 && this.A02 == c2163pl.A02 && this.A05 == c2163pl.A05 && com.facebook.ads.redexgen.core.C5C.A1E(this.A06, c2163pl.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31;
        if (this.A04 != null) {
            java.lang.Object obj = this.A04;
            java.lang.String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[0].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            A07[6] = "a7xjZFv85Fgc1YV";
            i = obj.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}
