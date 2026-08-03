package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.n f4241a;

    public j(com.fyber.inneractive.sdk.renderers.n nVar) {
        this.f4241a = nVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (this.f4241a.B == null) {
            return;
        }
        int i9 = i8 - i6;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if ((i7 - i5 == i10 && i9 == i11) || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f4241a.B.setLayoutParams(layoutParams);
    }
}
