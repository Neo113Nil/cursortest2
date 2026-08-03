package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04254d<T> {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"qNhODmuhOGTzTOdNu4k", "7K2GPWa5EHuyy4", "E4NOCJ5RL4hYeLNooPFdkLqGKDRv", "JwlW7s8WNTa19hdGL1amV", "YNjlntyRTdoFHiJHxz0qVC", "VcHvMaXHchlXNA9aE7EYkOxPZlMykCpc", "sHIyzZJD7qVKB1sd9lWDot", "2KMjU5K0FjJgBGqm2h4w3g2sgyG9pwrH"};
    public boolean A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.AnonymousClass45 A02;
    public final com.facebook.ads.redexgen.core.C4X A03;
    public final com.facebook.ads.redexgen.core.InterfaceC04234b<T> A04;
    public final java.lang.Object A05;
    public final java.util.ArrayDeque<java.lang.Runnable> A06;
    public final java.util.ArrayDeque<java.lang.Runnable> A07;
    public final java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.C04244c<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C04254d(java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.core.C04244c<T>> copyOnWriteArraySet, android.os.Looper looper, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45, com.facebook.ads.redexgen.core.InterfaceC04234b<T> interfaceC04234b) {
        this.A02 = anonymousClass45;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC04234b;
        this.A05 = new java.lang.Object();
        this.A06 = new java.util.ArrayDeque<>();
        this.A07 = new java.util.ArrayDeque<>();
        this.A03 = anonymousClass45.A5P(looper, new android.os.Handler.Callback() { // from class: com.facebook.ads.redexgen.X.4Z
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                boolean A05;
                A05 = com.facebook.ads.redexgen.core.C04254d.this.A05(message);
                return A05;
            }
        });
        this.A01 = true;
        this.A00 = com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A0E);
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{41, 46, 54, 47, 43, 37, 33, 60, 45, 58, 41, 60, 33, 39, 38, com.google.common.base.Ascii.SO, 33, 38, 33, 59, 32, 45, 44};
        if (A0A[0].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        A0A[3] = "KpT";
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public C04254d(android.os.Looper looper, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45, com.facebook.ads.redexgen.core.InterfaceC04234b<T> interfaceC04234b) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, anonymousClass45, interfaceC04234b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private final com.facebook.ads.redexgen.core.C04254d<T> A00(android.os.Looper looper, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45, com.facebook.ads.redexgen.core.InterfaceC04234b<T> interfaceC04234b) {
        return new com.facebook.ads.redexgen.core.C04254d<>(this.A08, looper, anonymousClass45, interfaceC04234b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(java.lang.Thread.currentThread() == this.A03.A8R().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, int i, com.facebook.ads.redexgen.core.InterfaceC04224a interfaceC04224a) {
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A01(0, 6, 102));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public boolean A05(android.os.Message message) {
        java.util.Iterator<com.facebook.ads.redexgen.core.C04244c<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A01(6, 17, 110));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final com.facebook.ads.redexgen.core.C04254d<T> A07(android.os.Looper looper, com.facebook.ads.redexgen.core.InterfaceC04234b<T> interfaceC04234b) {
        return A00(looper, this.A02, interfaceC04234b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    /* JADX WARN: Incorrect condition in loop: B:12:0x003d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A08() {
        A02();
        if (this.A07.isEmpty()) {
            return;
        }
        if (!this.A03.A9n(0)) {
            this.A03.AJD(this.A03.ACg(0));
        }
        boolean z = !this.A06.isEmpty();
        this.A06.addAll(this.A07);
        this.A07.clear();
        if (z) {
            return;
        }
        while (!recursiveFlushInProgress) {
            java.lang.Runnable peekFirst = this.A06.peekFirst();
            java.lang.String[] strArr = A0A;
            if (strArr[4].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[4] = "yEp1Grh3pDykJXHd8ndBtu";
            strArr2[6] = "iM1KUlOTpdsgtS4YknLkQB";
            peekFirst.run();
            this.A06.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A09(final int i, final com.facebook.ads.redexgen.core.InterfaceC04224a<T> interfaceC04224a) {
        A02();
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new java.lang.NullPointerException(A01(0, 6, 102));
            }
            return;
        }
        this.A07.add(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4Y
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C04254d.A04(copyOnWriteArraySet, i, interfaceC04224a);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A0A(int i, com.facebook.ads.redexgen.core.InterfaceC04224a<T> interfaceC04224a) {
        A09(i, interfaceC04224a);
        A08();
    }
}
