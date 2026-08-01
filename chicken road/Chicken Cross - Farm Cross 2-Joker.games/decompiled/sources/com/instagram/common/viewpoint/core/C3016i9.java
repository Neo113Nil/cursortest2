package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3016i9 implements InterfaceC2234Ou {
    private C2235Ov A00(InterfaceC2233Ot interfaceC2233Ot) {
        return (C2235Ov) interfaceC2233Ot.A7E();
    }

    public final void A01(InterfaceC2233Ot interfaceC2233Ot) {
        if (!interfaceC2233Ot.A9R()) {
            interfaceC2233Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC2233Ot);
        float A8r = A8r(interfaceC2233Ot);
        float elevation = AbstractC2237Ox.A00(A8S, A8r, interfaceC2233Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC2237Ox.A01(A8S, A8r, interfaceC2233Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC2233Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final ColorStateList A71(InterfaceC2233Ot interfaceC2233Ot) {
        return A00(interfaceC2233Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final float A7v(InterfaceC2233Ot interfaceC2233Ot) {
        return interfaceC2233Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final float A8S(InterfaceC2233Ot interfaceC2233Ot) {
        return A00(interfaceC2233Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final float A8X(InterfaceC2233Ot interfaceC2233Ot) {
        return A8r(interfaceC2233Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final float A8Y(InterfaceC2233Ot interfaceC2233Ot) {
        return A8r(interfaceC2233Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final float A8r(InterfaceC2233Ot interfaceC2233Ot) {
        return A00(interfaceC2233Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AAG(InterfaceC2233Ot interfaceC2233Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2235Ov background = new C2235Ov(colorStateList, f);
        interfaceC2233Ot.AJK(background);
        View view = interfaceC2233Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC2233Ot, f3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void ADP(InterfaceC2233Ot interfaceC2233Ot) {
        AJX(interfaceC2233Ot, A8S(interfaceC2233Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AFT(InterfaceC2233Ot interfaceC2233Ot) {
        AJX(interfaceC2233Ot, A8S(interfaceC2233Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AJJ(InterfaceC2233Ot interfaceC2233Ot, ColorStateList colorStateList) {
        A00(interfaceC2233Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AJP(InterfaceC2233Ot interfaceC2233Ot, float f) {
        interfaceC2233Ot.A7F().setElevation(f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AJX(InterfaceC2233Ot interfaceC2233Ot, float f) {
        A00(interfaceC2233Ot).A07(f, interfaceC2233Ot.A9R(), interfaceC2233Ot.A8q());
        A01(interfaceC2233Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2234Ou
    public final void AJj(InterfaceC2233Ot interfaceC2233Ot, float f) {
        A00(interfaceC2233Ot).A06(f);
    }
}
