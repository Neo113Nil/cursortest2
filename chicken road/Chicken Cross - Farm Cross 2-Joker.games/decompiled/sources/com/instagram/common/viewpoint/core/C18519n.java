package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C18519n extends AbstractC3345nv implements DI {
    public long A00;
    public InterfaceC17615t A01;
    public InterfaceC3171ku<InterfaceExecutorC1984Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C3479q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C18519n(C3479q7 c3479q7, C5Y c5y, DC dc, A6 a6, FF ff, int i, InterfaceC3171ku<InterfaceExecutorC1984Fb> interfaceC3171ku) {
        this.A07 = (AnonymousClass32) AbstractC17143y.A01(c3479q7.A03);
        this.A08 = c3479q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC3171ku;
    }

    private void A00() {
        final Timeline c18509m = new C18509m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c18509m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C3457pl A0I(int i, C3457pl c3457pl, boolean z) {
                    super.A0I(i, c3457pl, z);
                    c3457pl.A05 = true;
                    return c3457pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C3455pj A0L(int i, C3455pj c3455pj, long j) {
                    super.A0L(i, c3455pj, j);
                    c3455pj.A0F = true;
                    return c3455pj;
                }
            };
            c18509m = timeline;
        }
        A05(c18509m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3345nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3345nv
    public final void A0A(InterfaceC17615t interfaceC17615t) {
        this.A01 = interfaceC17615t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC17143y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1928Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC3339np A5W(C3338no c3338no, F0 f0, long j) {
        InterfaceExecutorC1984Fb interfaceExecutorC1984Fb;
        InterfaceC3426pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 A01 = A01(c3338no);
        FF ff = this.A0C;
        D8 A02 = A02(c3338no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1984Fb = this.A02.get();
        } else {
            interfaceExecutorC1984Fb = null;
        }
        return new C18539p(uri, A5I, A5X, a6, A01, ff, A02, this, f0, str, i, interfaceExecutorC1984Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1928Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
    public final void AG0(long j, boolean z, boolean z2) {
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1928Cx
    public final void AHk(InterfaceC3339np interfaceC3339np) {
        ((C18539p) interfaceC3339np).A0a();
    }
}
