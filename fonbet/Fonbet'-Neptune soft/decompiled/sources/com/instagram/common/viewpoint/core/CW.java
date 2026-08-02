package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public class CW {
    public final int A00;
    public final C1677mL A01;
    public final long A02;
    public final CopyOnWriteArrayList<CV> A03;

    public CW() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public CW(CopyOnWriteArrayList<CV> copyOnWriteArrayList, int i, C1677mL c1677mL, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c1677mL;
        this.A02 = j;
    }

    private long A00(long j) {
        long A0P = AbstractC01424a.A0P(j);
        if (A0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final CE ce, final CG cg, final int i) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX cx = next.A01;
            AbstractC01424a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CS
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final CW A02(int i, C1677mL c1677mL, long j) {
        return new CW(this.A03, i, c1677mL, j);
    }

    public final void A03(int i, C1830or c1830or, int i2, Object obj, long j) {
        A0C(new CG(1, i, c1830or, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(Handler handler, CX cx) {
        C3M.A01(handler);
        C3M.A01(cx);
        this.A03.add(new CV(handler, cx));
    }

    public final void A05(CE ce, int i, int i2, C1830or c1830or, int i3, Object obj, long j, long j2) {
        A09(ce, new CG(i, i2, c1830or, i3, obj, A00(j), A00(j2)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(CE ce, int i, int i2, C1830or c1830or, int i3, Object obj, long j, long j2, int i4) {
        A01(ce, new CG(i, i2, c1830or, i3, obj, A00(j), A00(j2)), i4);
    }

    public final void A07(CE ce, int i, int i2, C1830or c1830or, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        A0A(ce, new CG(i, i2, c1830or, i3, obj, A00(j), A00(j2)), iOException, z);
    }

    public final void A08(@MetaExoPlayerCustomization CE ce, @MetaExoPlayerCustomization int i, int i2, C1830or c1830or, int i3, Object obj, long j, long j2, Object obj2, Object obj3) {
        A0B(ce, new CG(i, i2, c1830or, i3, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final CE ce, final CG cg) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX listener = next.A01;
            AbstractC01424a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CT
                @Override // java.lang.Runnable
                public final void run() {
                    CW.this.A0E(listener, ce, cg);
                }
            });
        }
    }

    public final void A0A(final CE ce, final CG cg, final IOException iOException, final boolean z) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX cx = next.A01;
            AbstractC01424a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CO
                @Override // java.lang.Runnable
                public final void run() {
                    CW.this.A0F(cx, ce, cg, iOException, z);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final CE ce, @MetaExoPlayerCustomization final CG cg, final Object obj, final Object obj2) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX cx = next.A01;
            AbstractC01424a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CP
                @Override // java.lang.Runnable
                public final void run() {
                    CW.this.A0G(cx, ce, cg, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final CG cg) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX listener = next.A01;
            AbstractC01424a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CQ
                @Override // java.lang.Runnable
                public final void run() {
                    CW.this.A0H(listener, cg);
                }
            });
        }
    }

    public final void A0D(CX cx) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == cx) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(CX cx, CE ce, CG cg) {
        cx.ADw(this.A00, this.A01, ce, cg);
    }

    public final /* synthetic */ void A0F(CX cx, CE ce, CG cg, IOException iOException, boolean z) {
        cx.AE1(this.A00, this.A01, ce, cg, iOException, z);
    }

    public final /* synthetic */ void A0G(CX cx, CE ce, CG cg, Object obj, Object obj2) {
        cx.ADy(this.A00, this.A01, ce, cg, obj, obj2);
    }

    public final /* synthetic */ void A0H(CX cx, CG cg) {
        cx.AD6(this.A00, this.A01, cg);
    }
}
