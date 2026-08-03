package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements com.facebook.ads.redexgen.core.InterfaceC2105oo, com.facebook.ads.redexgen.core.InterfaceC05157p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public com.facebook.ads.redexgen.core.C05187s A05;
    public com.facebook.ads.redexgen.core.C8O A06;
    public com.facebook.ads.redexgen.core.DT A07;
    public boolean A08;
    public boolean A09;
    public com.facebook.ads.redexgen.core.C2196qI[] A0A;
    public final int A0C;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public com.facebook.ads.redexgen.core.EnumC1762ir A0B = com.facebook.ads.redexgen.core.EnumC1762ir.A09;
    public final com.facebook.ads.redexgen.core.C04996z A0D = new com.facebook.ads.redexgen.core.C04996z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j, boolean z) throws com.facebook.ads.redexgen.core.AD;

    public abstract void A1c(com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr, long j, long j2) throws com.facebook.ads.redexgen.core.AD;

    public AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j, boolean z) throws com.facebook.ads.redexgen.core.AD {
        this.A08 = false;
        this.A02 = j;
        this.A03 = j;
        A1a(j, z);
    }

    public final int A1Q(long j) {
        return ((com.facebook.ads.redexgen.core.DT) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07)).AK2(j - this.A04);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(com.facebook.ads.redexgen.core.C04996z c04996z, com.facebook.ads.redexgen.core.C2117p0 c2117p0, int i) {
        int AHP = ((com.facebook.ads.redexgen.core.DT) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07)).AHP(c04996z, c2117p0, i);
        if (AHP == -4) {
            if (c2117p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2117p0.A00 = c2117p0.A01;
            c2117p0.A01 += this.A04;
            this.A03 = java.lang.Math.max(this.A03, c2117p0.A01);
        } else if (AHP == -5) {
            com.facebook.ads.redexgen.core.C2196qI c2196qI = (com.facebook.ads.redexgen.core.C2196qI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04996z.A00);
            if (c2196qI.A0M != Long.MAX_VALUE) {
                c04996z.A00 = c2196qI.A07().A0s(c2196qI.A0M + this.A04).A14();
            }
        }
        return AHP;
    }

    public final com.facebook.ads.redexgen.core.AD A1S(java.lang.Throwable th, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i) {
        return A1T(th, c2196qI, false, i);
    }

    public final com.facebook.ads.redexgen.core.AD A1T(java.lang.Throwable th, com.facebook.ads.redexgen.core.C2196qI c2196qI, boolean z, int i) {
        int i2 = 4;
        if (c2196qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2196qI);
                i2 = com.facebook.ads.redexgen.core.AbstractC05087i.A03(formatSupport);
            } catch (com.facebook.ads.redexgen.core.AD unused) {
            } catch (java.lang.Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return com.facebook.ads.redexgen.core.AD.A04(th, getName(), A1O(), c2196qI, i2, z, i);
    }

    public final com.facebook.ads.redexgen.core.C04996z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final com.facebook.ads.redexgen.core.C05187s A1V() {
        return (com.facebook.ads.redexgen.core.C05187s) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A05);
    }

    public final com.facebook.ads.redexgen.core.C8O A1W() {
        return (com.facebook.ads.redexgen.core.C8O) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06);
    }

    public void A1X() throws com.facebook.ads.redexgen.core.AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z, boolean z2) throws com.facebook.ads.redexgen.core.AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((com.facebook.ads.redexgen.core.DT) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07)).AAe();
    }

    public final com.facebook.ads.redexgen.core.C2196qI[] A1e() {
        return (com.facebook.ads.redexgen.core.C2196qI[]) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void A5x() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void A6L(com.facebook.ads.redexgen.core.C05187s c05187s, com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr, com.facebook.ads.redexgen.core.DT dt, long j, boolean z, boolean z2, long j2, long j3) throws com.facebook.ads.redexgen.core.AD {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A01 == 0);
        this.A05 = c05187s;
        this.A01 = 1;
        A1b(z, z2);
        AIa(c2196qIArr, dt, j2, j3);
        A1P(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final com.facebook.ads.redexgen.core.InterfaceC05157p A7D() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public com.facebook.ads.redexgen.core.AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final com.facebook.ads.redexgen.core.EnumC1762ir A99() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final com.facebook.ads.redexgen.core.DT A9D() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo, com.facebook.ads.redexgen.core.InterfaceC05157p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05027c
    public void A9i(int i, java.lang.Object obj) throws com.facebook.ads.redexgen.core.AD {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void AA9(int i, com.facebook.ads.redexgen.core.C8O c8o) {
        this.A00 = i;
        this.A06 = c8o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void ACU() throws java.io.IOException {
        ((com.facebook.ads.redexgen.core.DT) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07)).ACR();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void AIa(com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr, com.facebook.ads.redexgen.core.DT dt, long j, long j2) throws com.facebook.ads.redexgen.core.AD {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0A = c2196qIArr;
        this.A04 = j2;
        A1c(c2196qIArr, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void AIm(long j) throws com.facebook.ads.redexgen.core.AD {
        A1P(j, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws com.facebook.ads.redexgen.core.AD {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void start() throws com.facebook.ads.redexgen.core.AD {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final void stop() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
