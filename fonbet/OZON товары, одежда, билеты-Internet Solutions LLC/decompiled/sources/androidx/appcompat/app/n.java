package androidx.appcompat.app;

import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
final class n implements ContentFrameLayout.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37229a;

    n(l lVar) {
        this.f37229a = lVar;
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.a
    public final void onDetachedFromWindow() {
        this.f37229a.Z();
    }
}
