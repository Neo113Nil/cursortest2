package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class B implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f14124a;

    /* renamed from: b, reason: collision with root package name */
    public A f14125b;

    public B(View view, A a2) {
        this.f14124a = view;
        this.f14125b = a2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        A a2 = this.f14125b;
        if (a2 == null) {
            return;
        }
        a2.run();
        this.f14125b = null;
        this.f14124a.post(new A(this, 1));
    }
}
