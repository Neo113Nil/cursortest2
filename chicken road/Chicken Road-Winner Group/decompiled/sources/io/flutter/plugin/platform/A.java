package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9233b;

    public /* synthetic */ A(int i3, Object obj) {
        this.f9232a = i3;
        this.f9233b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9232a) {
            case 0:
                B b3 = (B) this.f9233b;
                ((View) b3.f9235b).postDelayed((n) b3.f9236c, 128L);
                break;
            default:
                C c3 = (C) this.f9233b;
                c3.f9237a.getViewTreeObserver().removeOnDrawListener(c3);
                break;
        }
    }
}
