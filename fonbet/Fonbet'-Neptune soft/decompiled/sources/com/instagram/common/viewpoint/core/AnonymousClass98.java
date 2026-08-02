package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC1684mS implements InterfaceC0340Cg {
    public long A00;
    public C5H A01;
    public InterfaceC1506jM<InterfaceExecutorC0411Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C1821oi A08;
    public final InterfaceC01644w A09;
    public final C9U A0A;
    public final InterfaceC0334Ca A0B;
    public final InterfaceC0389Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C1821oi c1821oi, InterfaceC01644w interfaceC01644w, InterfaceC0334Ca interfaceC0334Ca, C9U c9u, InterfaceC0389Ed interfaceC0389Ed, int i, InterfaceC1506jM<InterfaceExecutorC0411Ez> interfaceC1506jM) {
        this.A07 = (C2Q) C3M.A01(c1821oi.A03);
        this.A08 = c1821oi;
        this.A09 = interfaceC01644w;
        this.A0B = interfaceC0334Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC0389Ed;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC1506jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.instagram.common.viewpoint.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C1801oN A0I(int i, C1801oN c1801oN, boolean z) {
                    super.A0I(i, c1801oN, z);
                    c1801oN.A05 = true;
                    return c1801oN;
                }

                @Override // com.instagram.common.viewpoint.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C1799oL A0L(int i, C1799oL c1799oL, long j) {
                    super.A0L(i, c1799oL, j);
                    c1799oL.A0F = true;
                    return c1799oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1684mS
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1684mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC1678mM A5O(C1677mL c1677mL, EO eo, long j) {
        InterfaceExecutorC0411Ez interfaceExecutorC0411Ez;
        InterfaceC1765nl A5A = this.A09.A5A();
        if (this.A01 != null) {
            A5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC0335Cb A5P = this.A0B.A5P(C02327m.A03);
        C9U c9u = this.A0A;
        C9P A01 = A01(c1677mL);
        InterfaceC0389Ed interfaceC0389Ed = this.A0C;
        CW A02 = A02(c1677mL);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0411Ez = this.A02.get();
        } else {
            interfaceExecutorC0411Ez = null;
        }
        return new C9A(uri, A5A, A5P, c9u, A01, interfaceC0389Ed, A02, this, eo, str, i, interfaceExecutorC0411Ez);
    }

    @Override // com.instagram.common.viewpoint.core.CL
    public final void ABu() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0340Cg
    public final void AFH(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.CL
    public final void AH0(InterfaceC1678mM interfaceC1678mM) {
        ((C9A) interfaceC1678mM).A0a();
    }
}
