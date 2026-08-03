package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2044no A01;
    public final long A02;
    public final java.util.concurrent.CopyOnWriteArrayList<com.facebook.ads.redexgen.core.D7> A03;

    public D8() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(java.util.concurrent.CopyOnWriteArrayList<com.facebook.ads.redexgen.core.D7> copyOnWriteArrayList, int i, com.facebook.ads.redexgen.core.C2044no c2044no, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c2044no;
        this.A02 = j;
    }

    private long A00(long j) {
        long A0P = com.facebook.ads.redexgen.core.C5C.A0P(j);
        if (A0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final com.facebook.ads.redexgen.core.Cq cq, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs, final int i) {
        java.util.Iterator<com.facebook.ads.redexgen.core.D7> it = this.A03.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.D7 next = it.next();
            final com.facebook.ads.redexgen.core.D9 d9 = next.A01;
            com.facebook.ads.redexgen.core.C5C.A1B(next.A00, new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final com.facebook.ads.redexgen.core.D8 A02(int i, com.facebook.ads.redexgen.core.C2044no c2044no, long j) {
        return new com.facebook.ads.redexgen.core.D8(this.A03, i, c2044no, j);
    }

    public final void A03(int i, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i2, java.lang.Object obj, long j) {
        A0C(new com.facebook.ads.redexgen.core.C0629Cs(1, i, c2196qI, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(android.os.Handler handler, com.facebook.ads.redexgen.core.D9 d9) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(handler);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(d9);
        this.A03.add(new com.facebook.ads.redexgen.core.D7(handler, d9));
    }

    public final void A05(com.facebook.ads.redexgen.core.Cq cq, int i, int i2, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i3, java.lang.Object obj, long j, long j2) {
        A09(cq, new com.facebook.ads.redexgen.core.C0629Cs(i, i2, c2196qI, i3, obj, A00(j), A00(j2)));
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(com.facebook.ads.redexgen.core.Cq cq, int i, int i2, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i3, java.lang.Object obj, long j, long j2, int i4) {
        A01(cq, new com.facebook.ads.redexgen.core.C0629Cs(i, i2, c2196qI, i3, obj, A00(j), A00(j2)), i4);
    }

    public final void A07(com.facebook.ads.redexgen.core.Cq cq, int i, int i2, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i3, java.lang.Object obj, long j, long j2, java.io.IOException iOException, boolean z) {
        A0A(cq, new com.facebook.ads.redexgen.core.C0629Cs(i, i2, c2196qI, i3, obj, A00(j), A00(j2)), iOException, z);
    }

    public final void A08(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization com.facebook.ads.redexgen.core.Cq cq, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization int i, int i2, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i3, java.lang.Object obj, long j, long j2, java.lang.Object obj2, java.lang.Object obj3) {
        A0B(cq, new com.facebook.ads.redexgen.core.C0629Cs(i, i2, c2196qI, i3, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final com.facebook.ads.redexgen.core.Cq cq, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs) {
        java.util.Iterator<com.facebook.ads.redexgen.core.D7> it = this.A03.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.D7 next = it.next();
            final com.facebook.ads.redexgen.core.D9 listener = next.A01;
            com.facebook.ads.redexgen.core.C5C.A1B(next.A00, new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.D8.this.A0E(listener, cq, c0629Cs);
                }
            });
        }
    }

    public final void A0A(final com.facebook.ads.redexgen.core.Cq cq, final com.facebook.ads.redexgen.core.C0629Cs c0629Cs, final java.io.IOException iOException, final boolean z) {
        java.util.Iterator<com.facebook.ads.redexgen.core.D7> it = this.A03.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.D7 next = it.next();
            final com.facebook.ads.redexgen.core.D9 d9 = next.A01;
            com.facebook.ads.redexgen.core.C5C.A1B(next.A00, new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.D8.this.A0F(d9, cq, c0629Cs, iOException, z);
                }
            });
        }
    }

    public final void A0B(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization final com.facebook.ads.redexgen.core.Cq cq, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization final com.facebook.ads.redexgen.core.C0629Cs c0629Cs, final java.lang.Object obj, final java.lang.Object obj2) {
        java.util.Iterator<com.facebook.ads.redexgen.core.D7> it = this.A03.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.D7 next = it.next();
            final com.facebook.ads.redexgen.core.D9 d9 = next.A01;
            com.facebook.ads.redexgen.core.C5C.A1B(next.A00, new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.D8.this.A0G(d9, cq, c0629Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final com.facebook.ads.redexgen.core.C0629Cs c0629Cs) {
        java.util.Iterator<com.facebook.ads.redexgen.core.D7> it = this.A03.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.D7 next = it.next();
            final com.facebook.ads.redexgen.core.D9 listener = next.A01;
            com.facebook.ads.redexgen.core.C5C.A1B(next.A00, new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.D8.this.A0H(listener, c0629Cs);
                }
            });
        }
    }

    public final void A0D(com.facebook.ads.redexgen.core.D9 d9) {
        java.util.Iterator<com.facebook.ads.redexgen.core.D7> it = this.A03.iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.D7 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == d9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(com.facebook.ads.redexgen.core.D9 d9, com.facebook.ads.redexgen.core.Cq cq, com.facebook.ads.redexgen.core.C0629Cs c0629Cs) {
        d9.AEb(this.A00, this.A01, cq, c0629Cs);
    }

    public final /* synthetic */ void A0F(com.facebook.ads.redexgen.core.D9 d9, com.facebook.ads.redexgen.core.Cq cq, com.facebook.ads.redexgen.core.C0629Cs c0629Cs, java.io.IOException iOException, boolean z) {
        d9.AEg(this.A00, this.A01, cq, c0629Cs, iOException, z);
    }

    public final /* synthetic */ void A0G(com.facebook.ads.redexgen.core.D9 d9, com.facebook.ads.redexgen.core.Cq cq, com.facebook.ads.redexgen.core.C0629Cs c0629Cs, java.lang.Object obj, java.lang.Object obj2) {
        d9.AEd(this.A00, this.A01, cq, c0629Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(com.facebook.ads.redexgen.core.D9 d9, com.facebook.ads.redexgen.core.C0629Cs c0629Cs) {
        d9.ADk(this.A00, this.A01, c0629Cs);
    }
}
