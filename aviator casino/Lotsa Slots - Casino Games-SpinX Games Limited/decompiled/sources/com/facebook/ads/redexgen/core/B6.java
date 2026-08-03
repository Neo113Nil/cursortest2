package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class B6 {
    public static byte[] A03;
    public boolean A00 = false;
    public final java.util.concurrent.ConcurrentLinkedQueue<com.facebook.ads.redexgen.core.B4> A01 = new java.util.concurrent.ConcurrentLinkedQueue<>();
    public final /* synthetic */ com.facebook.ads.redexgen.core.B7 A02;

    static {
        A05();
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, -38, -59, -57, -46, -42, -53, -47, -48, -126, -39, -54, -57, -48, -126, -42, -44, -37, -53, -48, -55, -126, -42, -47, -126, -53, -48, -43, -42, -61, -48, -42, -53, -61, -42, -57, -126, -121, -43, -100, -126, -121, -43, -72, -48, -49, -44, -52, -82, -38, -49, -48, -50, -69, -38, -38, -41, -70, -37, -33, -44, -40, -44, -27, -48, -49, -59, -46, -46, -49, -46, -115, -41, -56, -55, -52, -59, -115, -46, -59, -52, -59, -63, -45, -59, -115, -61, -49, -60, -59, -61, -115, -58, -46, -49, -51, -115, -45, -59, -44, -115, -58, -55, -50, -63, -52, -52, -39, -102, Byte.MIN_VALUE, -123, -45, -40, -27, -27, -30, -27, -96, -22, -37, -36, -33, -40, -96, -27, -40, -33, -40, -44, -26, -40, -96, -42, -30, -41, -40, -42, -96, -39, -27, -30, -32, -96, -26, -40, -25, -83, -109, -104, -26, -34, -15, -24, -23, -27, -38, -14, -34, -21, -85, -89, -38, -17, -86, -89, -20, -21, -36, -89, -67, -38, -17, -86, -35, -58, -34, -35, -30, -38, -68, -24, -35, -34, -36, -70, -35, -38, -23, -19, -34, -21};
    }

    public B6(com.facebook.ads.redexgen.core.B7 b7) {
        this.A02 = b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.B0 A02(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.String str) throws com.facebook.ads.redexgen.core.MediaCodecInitializationException {
        java.util.Set<com.facebook.ads.redexgen.core.B0> set;
        if (this.A02.A0I(z, c1792jQ) && com.facebook.ads.redexgen.core.B7.A0G(str, c1792jQ)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        com.facebook.ads.redexgen.core.B7 b7 = this.A02;
                        b7.A00--;
                        java.util.Iterator<com.facebook.ads.redexgen.core.B0> it = set.iterator();
                        com.facebook.ads.redexgen.core.B0 ret = it.next();
                        it.remove();
                        this.A02.A03().A0A(z, str, enumC1789jL, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            com.facebook.ads.redexgen.core.C1787jJ A05 = this.A02.A03().A05(z, str, enumC1789jL);
            com.facebook.ads.redexgen.core.B0 A032 = A03(z, str);
            this.A02.A03().A06(A05, A032.hashCode());
            return A032;
        } catch (java.lang.Exception e) {
            throw new com.facebook.ads.redexgen.core.MediaCodecInitializationException(str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.B0 A03(boolean z, java.lang.String str) throws java.lang.Exception {
        java.lang.String A04 = A04(androidx.compose.material.TextFieldImplKt.AnimationDuration, 41, 69);
        if (z && com.facebook.ads.redexgen.core.B7.A0E(str)) {
            try {
                return (com.facebook.ads.redexgen.core.B0) java.lang.Class.forName(A04).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.w(A04(43, 23, 55), java.lang.String.format(A04(0, 43, 46), A04, e.getMessage()));
            }
        }
        return new com.facebook.ads.redexgen.core.C2061o6(android.media.MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public void A0B(com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL) {
        java.lang.String A04;
        java.lang.String format;
        com.facebook.ads.redexgen.core.B7 b7;
        java.util.Set<com.facebook.ads.redexgen.core.B0> set;
        java.util.Iterator<com.facebook.ads.redexgen.core.B4> it = this.A01.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.B4 next = it.next();
            try {
                try {
                    if (!next.A05) {
                        A08(next.A01, enumC1789jL, java.lang.Boolean.valueOf(next.A04), next.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = android.os.SystemClock.elapsedRealtime();
                                next.A00.reset();
                                b7 = this.A02;
                            } catch (java.lang.Throwable th) {
                                this.A02.A05 = -1L;
                                throw th;
                            }
                        } catch (java.lang.IllegalStateException unused) {
                            A09(next.A02, next.A00);
                            b7 = this.A02;
                        }
                        b7.A05 = -1L;
                        if (next.A03) {
                            synchronized (this.A02.A04) {
                                set = this.A02.A04.get(next.A02);
                            }
                            if (set != null) {
                                synchronized (set) {
                                    set.add(next.A00);
                                    this.A02.A00++;
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.w(A04(43, 23, 55), java.lang.String.format(A04(112, 38, 63), e.getMessage()));
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(next);
                        }
                    } catch (java.lang.Exception e2) {
                        A04 = A04(43, 23, 55);
                        format = java.lang.String.format(A04(66, 46, 44), e2.getMessage());
                        android.util.Log.w(A04, format);
                    }
                }
                try {
                    synchronized (this.A01) {
                        this.A01.remove(next);
                    }
                } catch (java.lang.Exception e3) {
                    A04 = A04(43, 23, 55);
                    format = java.lang.String.format(A04(66, 46, 44), e3.getMessage());
                    android.util.Log.w(A04, format);
                }
            } catch (java.lang.Throwable th2) {
                try {
                } catch (java.lang.Exception e4) {
                    android.util.Log.w(A04(43, 23, 55), java.lang.String.format(A04(66, 46, 44), e4.getMessage()));
                }
                synchronized (this.A01) {
                    this.A01.remove(next);
                    throw th2;
                }
            }
        }
    }

    private void A08(com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.Boolean bool, com.facebook.ads.redexgen.core.B0 b0) {
        try {
            if (!c1792jQ.A0R || (!bool.booleanValue() && !c1792jQ.A0Q)) {
                b0.stop();
            }
        } finally {
            this.A02.A03().A08(enumC1789jL, b0.hashCode());
            b0.AHb();
            this.A02.A03().A07(enumC1789jL, b0.hashCode());
        }
    }

    private void A09(java.lang.String str, com.facebook.ads.redexgen.core.B0 b0) {
        java.util.Set<com.facebook.ads.redexgen.core.B0> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(b0)) {
                    com.facebook.ads.redexgen.core.B7 b7 = this.A02;
                    b7.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0A(boolean z, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, final com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL, java.lang.String str, com.facebook.ads.redexgen.core.B0 b0) {
        boolean z2 = false;
        if (this.A02.A0I(z, c1792jQ) && com.facebook.ads.redexgen.core.B7.A0G(str, c1792jQ)) {
            if (c1792jQ.A0L && !this.A00) {
                this.A00 = true;
                java.util.concurrent.Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.B5
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.ads.redexgen.core.B6.this.A0B(enumC1789jL);
                    }
                }, 5L, java.lang.Math.max(1000, c1792jQ.A08), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            boolean z3 = true;
            java.util.Set<com.facebook.ads.redexgen.core.B0> set = null;
            if (this.A02.A00 < c1792jQ.A07) {
                synchronized (this.A02.A04) {
                    set = this.A02.A04.get(str);
                    if (set == null) {
                        set = this.A02.A06();
                        this.A02.A04.put(str, set);
                    }
                }
                synchronized (set) {
                    if (set.contains(b0)) {
                        z3 = false;
                    } else if (((z && c1792jQ.A0N) || (!z && c1792jQ.A0M)) && set.size() < c1792jQ.A06) {
                        z2 = true;
                        z3 = false;
                    }
                }
            }
            if (!z3) {
                long j = -1;
                try {
                    try {
                        try {
                            if (!c1792jQ.A0L) {
                                try {
                                    this.A02.A05 = android.os.SystemClock.elapsedRealtime();
                                    b0.reset();
                                    if (z2 && set != null) {
                                        synchronized (set) {
                                            set.add(b0);
                                            this.A02.A00++;
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    if (!c1792jQ.A0L) {
                                        this.A02.A05 = j;
                                    }
                                    throw th;
                                }
                            } else {
                                try {
                                    com.facebook.ads.redexgen.core.B4 b4 = new com.facebook.ads.redexgen.core.B4(b0, c1792jQ, str, z, z2, true);
                                    synchronized (this.A01) {
                                        try {
                                            this.A01.add(b4);
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            while (true) {
                                                try {
                                                    throw th;
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        }
                                    }
                                } catch (java.lang.IllegalStateException unused) {
                                    j = -1;
                                    A09(str, b0);
                                    if (!c1792jQ.A0L) {
                                        this.A02.A05 = j;
                                    }
                                    if (c1792jQ.A0L) {
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    j = -1;
                                    if (!c1792jQ.A0L) {
                                    }
                                    throw th;
                                }
                            }
                            if (c1792jQ.A0L) {
                                return;
                            }
                            this.A02.A05 = -1L;
                            return;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                        }
                    } catch (java.lang.IllegalStateException unused2) {
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            }
        }
        if (c1792jQ.A0L) {
            A08(c1792jQ, enumC1789jL, java.lang.Boolean.valueOf(z), b0);
            return;
        }
        com.facebook.ads.redexgen.core.B4 b42 = new com.facebook.ads.redexgen.core.B4(b0, c1792jQ, str, z, false, false);
        synchronized (this.A01) {
            this.A01.add(b42);
        }
    }
}
