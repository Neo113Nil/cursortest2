package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* loaded from: classes4.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f5931a;

    public b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f5931a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f5931a.q = this.f5931a.n.getWidth() + r1.n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f5931a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.q *= -1.0f;
        }
        fyberAdIdentifierLocal.n.setTranslationX(fyberAdIdentifierLocal.q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f5931a;
        if (fyberAdIdentifierLocal2.o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
