package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1722i9 implements com.facebook.ads.redexgen.core.InterfaceC0940Ou {
    private com.facebook.ads.redexgen.core.C0941Ov A00(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return (com.facebook.ads.redexgen.core.C0941Ov) interfaceC0939Ot.A7E();
    }

    public final void A01(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        if (!interfaceC0939Ot.A9R()) {
            interfaceC0939Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC0939Ot);
        float A8r = A8r(interfaceC0939Ot);
        float elevation = com.facebook.ads.redexgen.core.AbstractC0943Ox.A00(A8S, A8r, interfaceC0939Ot.A8q());
        int vPadding = (int) java.lang.Math.ceil(elevation);
        float elevation2 = com.facebook.ads.redexgen.core.AbstractC0943Ox.A01(A8S, A8r, interfaceC0939Ot.A8q());
        int ceil = (int) java.lang.Math.ceil(elevation2);
        interfaceC0939Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final android.content.res.ColorStateList A71(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return A00(interfaceC0939Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final float A7v(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return interfaceC0939Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final float A8S(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return A00(interfaceC0939Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final float A8X(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return A8r(interfaceC0939Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final float A8Y(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return A8r(interfaceC0939Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final float A8r(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        return A00(interfaceC0939Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AAG(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        com.facebook.ads.redexgen.core.C0941Ov background = new com.facebook.ads.redexgen.core.C0941Ov(colorStateList, f);
        interfaceC0939Ot.AJK(background);
        android.view.View view = interfaceC0939Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC0939Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void ADP(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        AJX(interfaceC0939Ot, A8S(interfaceC0939Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AFT(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot) {
        AJX(interfaceC0939Ot, A8S(interfaceC0939Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AJJ(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot, android.content.res.ColorStateList colorStateList) {
        A00(interfaceC0939Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AJP(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot, float f) {
        interfaceC0939Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AJX(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot, float f) {
        A00(interfaceC0939Ot).A07(f, interfaceC0939Ot.A9R(), interfaceC0939Ot.A8q());
        A01(interfaceC0939Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0940Ou
    public final void AJj(com.facebook.ads.redexgen.core.InterfaceC0939Ot interfaceC0939Ot, float f) {
        A00(interfaceC0939Ot).A06(f);
    }
}
