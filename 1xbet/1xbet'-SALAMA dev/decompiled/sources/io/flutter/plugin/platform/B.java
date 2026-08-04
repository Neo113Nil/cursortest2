package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f14131b;

    public B(View view, A a2) {
        this.f14130a = view;
        this.f14131b = a2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        A a2 = this.f14131b;
        if (a2 == null) {
            return;
        }
        a2.run();
        this.f14131b = null;
        this.f14130a.post(new A(this, 1));
    }
}
