package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9Z implements InterfaceC1740nM, C7D {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C7G A05;
    public C02327m A06;
    public InterfaceC0351Cr A07;
    public boolean A08;
    public boolean A09;
    public C1830or[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC1406hX A0B = EnumC1406hX.A09;
    public final C6N A0D = new C6N();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j, boolean z) throws C9Y;

    public abstract void A1c(C1830or[] c1830orArr, long j, long j2) throws C9Y;

    public C9Z(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j, boolean z) throws C9Y {
        this.A08 = false;
        this.A02 = j;
        this.A03 = j;
        A1a(j, z);
    }

    public final int A1Q(long j) {
        return ((InterfaceC0351Cr) C3M.A01(this.A07)).AJI(j - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C6N c6n, C1752nY c1752nY, int i) {
        int AGf = ((InterfaceC0351Cr) C3M.A01(this.A07)).AGf(c6n, c1752nY, i);
        if (AGf == -4) {
            if (c1752nY.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c1752nY.A00 = c1752nY.A01;
            c1752nY.A01 += this.A04;
            this.A03 = Math.max(this.A03, c1752nY.A01);
        } else if (AGf == -5) {
            C1830or c1830or = (C1830or) C3M.A01(c6n.A00);
            if (c1830or.A0M != Long.MAX_VALUE) {
                c6n.A00 = c1830or.A07().A0s(c1830or.A0M + this.A04).A14();
            }
        }
        return AGf;
    }

    public final C9Y A1S(Throwable th, C1830or c1830or, int i) {
        return A1T(th, c1830or, false, i);
    }

    public final C9Y A1T(Throwable th, C1830or c1830or, boolean z, int i) {
        int i2 = 4;
        if (c1830or != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AJb(c1830or);
                i2 = AnonymousClass76.A03(formatSupport);
            } catch (C9Y unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return C9Y.A04(th, getName(), A1O(), c1830or, i2, z, i);
    }

    public final C6N A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C7G A1V() {
        return (C7G) C3M.A01(this.A05);
    }

    public final C02327m A1W() {
        return (C02327m) C3M.A01(this.A06);
    }

    public void A1X() throws C9Y {
    }

    public void A1Y() {
    }

    public void A1b(boolean z, boolean z2) throws C9Y {
    }

    public final boolean A1d() {
        return A9h() ? this.A08 : ((InterfaceC0351Cr) C3M.A01(this.A07)).AAV();
    }

    public final C1830or[] A1e() {
        return (C1830or[]) C3M.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void A5p() {
        C3M.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void A6D(C7G c7g, C1830or[] c1830orArr, InterfaceC0351Cr interfaceC0351Cr, long j, boolean z, boolean z2, long j2, long j3) throws C9Y {
        C3M.A08(this.A01 == 0);
        this.A05 = c7g;
        this.A01 = 1;
        A1b(z, z2);
        AHq(c1830orArr, interfaceC0351Cr, j2, j3);
        A1P(j, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final C7D A75() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public C6W A8L() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC1406hX A91() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final int A92() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final InterfaceC0351Cr A95() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM, com.instagram.common.viewpoint.core.C7D
    public final int A9F() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass70
    public void A9a(int i, Object obj) throws C9Y {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final boolean A9h() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void AA1(int i, C02327m c02327m) {
        this.A00 = i;
        this.A06 = c02327m;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final boolean AAE() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void ABv() throws IOException {
        ((InterfaceC0351Cr) C3M.A01(this.A07)).ABs();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void AHq(C1830or[] c1830orArr, InterfaceC0351Cr interfaceC0351Cr, long j, long j2) throws C9Y {
        C3M.A08(!this.A08);
        this.A07 = interfaceC0351Cr;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0A = c1830orArr;
        this.A04 = j2;
        A1c(c1830orArr, j, j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void AI2(long j) throws C9Y {
        A1P(j, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void AId() {
        this.A08 = true;
    }

    public int AJd() throws C9Y {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void start() throws C9Y {
        C3M.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final void stop() {
        C3M.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
