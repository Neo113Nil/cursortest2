package com.instagram.common.viewpoint.core;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: assets/audience_network/classes2.dex */
public final class A8 implements InterfaceC3394oj {
    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
    public InterfaceC16933b A00;
    public C4X A01;
    public C17194d<AnonymousClass88> A02;
    public boolean A03;
    public final AnonymousClass45 A07;
    public final C3457pl A05 = new C3457pl();
    public final C3455pj A06 = new C3455pj();
    public final C8A A08 = new C8A(this.A05);
    public final SparseArray<AnonymousClass86> A04 = new SparseArray<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.86] */
    @RequiresNonNull({"player"})
    private final AnonymousClass86 A03(final Timeline timeline, final int i, C3338no c3338no) {
        final C3338no c3338no2 = c3338no;
        if (timeline.A0N()) {
            c3338no2 = null;
        }
        final long A6J = this.A07.A6J();
        boolean z = timeline.equals(this.A00.A7g()) && i == this.A00.A7b();
        if (c3338no2 != null && c3338no2.A00()) {
            if (z && this.A00.A7Y() == c3338no2.A00 && this.A00.A7Z() == c3338no2.A01) {
                r9 = this.A00.A7e();
            }
        } else if (z) {
            r9 = this.A00.A7T();
            String[] strArr = A09;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
        } else {
            r9 = timeline.A0N() ? 0L : timeline.A0K(i, this.A06).A04();
            String[] strArr2 = A09;
            if (strArr2[3].length() == strArr2[1].length()) {
                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
            }
        }
        final C3338no A06 = this.A08.A06();
        final Timeline A7g = this.A00.A7g();
        final int A7b = this.A00.A7b();
        final long A7e = this.A00.A7e();
        final long A9J = this.A00.A9J();
        return new Object(A6J, timeline, i, c3338no2, r9, A7g, A7b, A06, A7e, A9J) { // from class: com.facebook.ads.redexgen.X.86
            public final int A00;
            public final int A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final long A05;
            public final Timeline A06;
            public final Timeline A07;
            public final C3338no A08;
            public final C3338no A09;

            {
                this.A04 = A6J;
                this.A07 = timeline;
                this.A01 = i;
                this.A09 = c3338no2;
                this.A03 = r6;
                this.A06 = A7g;
                this.A00 = A7b;
                this.A08 = A06;
                this.A02 = A7e;
                this.A05 = A9J;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AnonymousClass86 anonymousClass86 = (AnonymousClass86) obj;
                if (this.A04 == anonymousClass86.A04 && this.A01 == anonymousClass86.A01 && this.A03 == anonymousClass86.A03 && this.A00 == anonymousClass86.A00 && this.A02 == anonymousClass86.A02 && this.A05 == anonymousClass86.A05 && CB.A01(this.A07, anonymousClass86.A07) && CB.A01(this.A09, anonymousClass86.A09) && CB.A01(this.A06, anonymousClass86.A06) && CB.A01(this.A08, anonymousClass86.A08)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return CB.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
            }
        };
    }

    public A8(AnonymousClass45 anonymousClass45) {
        this.A07 = (AnonymousClass45) AbstractC17143y.A01(anonymousClass45);
        this.A02 = new C17194d<>(C5C.A0d(), anonymousClass45, new InterfaceC17174b() { // from class: com.facebook.ads.redexgen.X.og
        });
    }

    private final AnonymousClass86 A00() {
        return A04(this.A08.A06());
    }

    private AnonymousClass86 A01(int i, C3338no c3338no) {
        AbstractC17143y.A01(this.A00);
        boolean z = true;
        if (c3338no != null) {
            if (this.A08.A05(c3338no) == null) {
                z = false;
            }
            if (z) {
                return A04(c3338no);
            }
            return A03(Timeline.A02, i, c3338no);
        }
        Timeline A7g = this.A00.A7g();
        if (i >= A7g.A07()) {
            z = false;
        }
        if (!z) {
            A7g = Timeline.A02;
        }
        return A03(A7g, i, null);
    }

    private AnonymousClass86 A02(C3471pz c3471pz) {
        if (c3471pz instanceof AD) {
            AD ad = (AD) c3471pz;
            if (ad.A05 != null) {
                return A04(new C3338no(ad.A05));
            }
        }
        return A00();
    }

    private AnonymousClass86 A04(C3338no c3338no) {
        Timeline A05;
        AbstractC17143y.A01(this.A00);
        if (c3338no == null) {
            A05 = null;
        } else {
            A05 = this.A08.A05(c3338no);
        }
        if (c3338no == null || A05 == null) {
            int windowIndex = this.A00.A7b();
            Timeline knownTimeline = this.A00.A7g();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(A05, A05.A0J(c3338no.A04, this.A05).A00, c3338no);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
    private final void A05(AnonymousClass86 anonymousClass86, int i, InterfaceC17164a<AnonymousClass88> interfaceC17164a) {
        this.A04.put(i, anonymousClass86);
        this.A02.A0A(i, interfaceC17164a);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3394oj
    public final void ACe() {
        if (!this.A03) {
            final AnonymousClass86 A00 = A00();
            this.A03 = true;
            A05(A00, -1, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oe
            });
        }
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void ADZ(final C3438pR c3438pR) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 27, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oc
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void ADa(final List<C3440pT> list) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 27, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oR
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void ADk(int i, C3338no c3338no, final C1923Cs c1923Cs) {
        final AnonymousClass86 A01 = A01(i, c3338no);
        A05(A01, 1004, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oh
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void AEb(int i, C3338no c3338no, final Cq cq, final C1923Cs c1923Cs) {
        final AnonymousClass86 A01 = A01(i, c3338no);
        A05(A01, 1002, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.od
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void AEd(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C3338no c3338no, final Cq cq, final C1923Cs c1923Cs, Object obj, Object obj2) {
        final AnonymousClass86 A01 = A01(i, c3338no);
        A05(A01, 1001, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oT
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void AEg(int i, C3338no c3338no, final Cq cq, final C1923Cs c1923Cs, final IOException iOException, final boolean z) {
        final AnonymousClass86 A01 = A01(i, c3338no);
        A05(A01, 1003, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oi
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFI(final C3469px c3469px) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 12, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.ob
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFK(final C3471pz c3471pz) {
        final AnonymousClass86 A02 = A02(c3471pz);
        A05(A02, 10, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.of
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFM(final boolean z, final int i) {
        final AnonymousClass86 A00 = A00();
        A05(A00, -1, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oa
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFt() {
        final AnonymousClass86 A00 = A00();
        A05(A00, -1, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oS
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AGA(Timeline timeline, final int i) {
        this.A08.A07((InterfaceC16933b) AbstractC17143y.A01(this.A00));
        final AnonymousClass86 A00 = A00();
        A05(A00, 0, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oY
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AGE(final C3445pY c3445pY) {
        final AnonymousClass86 A00 = A00();
        A05(A00, 2, new InterfaceC17164a() { // from class: com.facebook.ads.redexgen.X.oW
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3394oj
    public final void AJf(final InterfaceC16933b interfaceC16933b, Looper looper) {
        boolean z;
        BP bp;
        if (this.A00 != null) {
            bp = this.A08.A03;
            if (!bp.isEmpty()) {
                z = false;
                AbstractC17143y.A08(z);
                this.A00 = (InterfaceC16933b) AbstractC17143y.A01(interfaceC16933b);
                this.A01 = this.A07.A5P(looper, null);
                this.A02 = this.A02.A07(looper, new InterfaceC17174b() { // from class: com.facebook.ads.redexgen.X.oZ
                });
            }
        }
        z = true;
        AbstractC17143y.A08(z);
        this.A00 = (InterfaceC16933b) AbstractC17143y.A01(interfaceC16933b);
        this.A01 = this.A07.A5P(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC17174b() { // from class: com.facebook.ads.redexgen.X.oZ
        });
    }
}
