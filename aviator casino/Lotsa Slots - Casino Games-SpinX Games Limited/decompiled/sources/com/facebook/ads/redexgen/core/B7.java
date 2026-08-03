package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class B7 {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final com.facebook.ads.redexgen.core.B7 A08;

    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.MediaCodecPoolTracker A01;

    @javax.annotation.Nullable
    public java.lang.Boolean A02;
    public volatile java.util.Map<java.lang.String, java.util.Set<com.facebook.ads.redexgen.core.B0>> A04 = new java.util.HashMap();
    public final com.facebook.ads.redexgen.core.B6 A03 = new com.facebook.ads.redexgen.core.B6(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.String str, com.facebook.ads.redexgen.core.B0 b0) {
        if (A0I(z, c1792jQ) && A0G(str, c1792jQ)) {
            boolean z2 = true;
            synchronized (this) {
                if (this.A00 < c1792jQ.A07) {
                    java.util.Set<com.facebook.ads.redexgen.core.B0> set = this.A04.get(str);
                    if (set == null) {
                        set = A06();
                        this.A04.put(str, set);
                    }
                    if (set.contains(b0)) {
                        z2 = false;
                    } else if (((z && c1792jQ.A0N) || (!z && c1792jQ.A0M)) && set.size() < c1792jQ.A06) {
                        set.add(b0);
                        this.A00++;
                        z2 = false;
                    }
                }
                if (!z2) {
                    try {
                        try {
                            this.A05 = android.os.SystemClock.elapsedRealtime();
                            b0.reset();
                            A03().A09(enumC1789jL, b0.hashCode());
                            return;
                        } catch (java.lang.IllegalStateException unused) {
                            A0B(str, b0);
                        }
                    } finally {
                        this.A05 = -1L;
                    }
                }
            }
        }
        try {
            if (!c1792jQ.A0R || (!z && !c1792jQ.A0Q)) {
                b0.stop();
            }
        } finally {
            A03().A08(enumC1789jL, b0.hashCode());
            b0.AHb();
            A03().A07(enumC1789jL, b0.hashCode());
        }
    }

    static {
        A08();
        A08 = new com.facebook.ads.redexgen.core.B7();
    }

    private com.facebook.ads.redexgen.core.B0 A01(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.String str) throws com.facebook.ads.redexgen.core.MediaCodecInitializationException {
        com.facebook.ads.redexgen.core.B0 A03;
        if (A0I(z, c1792jQ) && A0G(str, c1792jQ)) {
            synchronized (this) {
                java.util.Set<com.facebook.ads.redexgen.core.B0> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    java.util.Iterator<com.facebook.ads.redexgen.core.B0> it = set.iterator();
                    com.facebook.ads.redexgen.core.B0 ret = it.next();
                    it.remove();
                    A03().A0A(z, str, enumC1789jL, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            com.facebook.ads.redexgen.core.C1787jJ A05 = A03().A05(z, str, enumC1789jL);
            A03 = this.A03.A03(z, str);
            A03().A06(A05, A03.hashCode());
            return A03;
        } catch (java.lang.Exception e) {
            throw new com.facebook.ads.redexgen.core.MediaCodecInitializationException(str, e);
        }
    }

    public static com.facebook.ads.redexgen.core.B7 A02() {
        com.facebook.ads.redexgen.core.B7 b7 = A08;
        java.lang.String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return com.facebook.ads.redexgen.core.NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Set<com.facebook.ads.redexgen.core.B0> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new java.util.concurrent.CopyOnWriteArraySet();
        }
        return new java.util.HashSet();
    }

    private void A09(com.facebook.ads.redexgen.core.MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(com.facebook.ads.redexgen.core.C1792jQ c1792jQ) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = java.lang.Boolean.valueOf(c1792jQ.A0S);
                    if (this.A02.booleanValue()) {
                        this.A04 = new java.util.concurrent.ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(java.lang.String str, com.facebook.ads.redexgen.core.B0 b0) {
        java.util.Set<com.facebook.ads.redexgen.core.B0> set = this.A04.get(str);
        if (set != null && set.remove(b0)) {
            int i = this.A00;
            java.lang.String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i - 1;
        }
    }

    public static boolean A0E(java.lang.String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(java.lang.String str, com.facebook.ads.redexgen.core.C1792jQ c1792jQ) {
        if (A0E(str) && c1792jQ.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ) {
        if (c1792jQ.A0E && this.A05 != -1 && android.os.SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z, c1792jQ);
    }

    public static boolean A0J(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ) {
        return (z && c1792jQ.A0N) || (!z && c1792jQ.A0M);
    }

    public final com.facebook.ads.redexgen.core.B0 A0K(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.MediaCodecPoolTracker mediaCodecPoolTracker, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.String str) throws com.facebook.ads.redexgen.core.MediaCodecInitializationException {
        com.facebook.ads.redexgen.core.B0 A02;
        A09(mediaCodecPoolTracker);
        A0A(c1792jQ);
        if (c1792jQ.A0K) {
            A02 = this.A03.A02(z, c1792jQ, enumC1789jL, str);
            java.lang.String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return A02;
        }
        return A01(z, c1792jQ, enumC1789jL, str);
    }

    public final void A0L(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.MediaCodecPoolTracker mediaCodecPoolTracker, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.String str, com.facebook.ads.redexgen.core.B0 b0) {
        A09(mediaCodecPoolTracker);
        if (c1792jQ.A0K) {
            this.A03.A0A(z, c1792jQ, enumC1789jL, str, b0);
        } else {
            A0C(z, c1792jQ, enumC1789jL, str, b0);
        }
    }
}
