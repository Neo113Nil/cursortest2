package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class g extends android.view.TextureView {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f4164a;

    public g(com.fyber.inneractive.sdk.player.ui.s sVar) {
        super(sVar.getContext());
        this.f4164a = new java.lang.ref.WeakReference(sVar);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        com.fyber.inneractive.sdk.player.ui.s sVar = (com.fyber.inneractive.sdk.player.ui.s) com.fyber.inneractive.sdk.util.v.a(this.f4164a);
        if (sVar instanceof com.fyber.inneractive.sdk.player.ui.i) {
            sVar = ((com.fyber.inneractive.sdk.player.ui.i) sVar).z;
        }
        if (sVar != null) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(sVar.u.f4294a, 1073741824);
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(sVar.u.b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
