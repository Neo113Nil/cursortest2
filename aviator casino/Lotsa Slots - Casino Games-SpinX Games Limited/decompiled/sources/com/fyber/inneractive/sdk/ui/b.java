package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal f4274a;

    public b(com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f4274a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f4274a.q = this.f4274a.n.getWidth() + r1.n.getWidth();
        com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f4274a;
        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.k;
        if (corner == com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.TOP_LEFT || corner == com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.q *= -1.0f;
        }
        fyberAdIdentifierLocal.n.setTranslationX(fyberAdIdentifierLocal.q);
        com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f4274a;
        if (fyberAdIdentifierLocal2.o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
