package io.flutter.plugin.platform;

import a1.ViewOnAttachStateChangeListenerC0613i;
import android.view.View;

/* loaded from: classes2.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14123b;

    public /* synthetic */ A(Object obj, int i7) {
        this.f14122a = i7;
        this.f14123b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14122a) {
            case 0:
                ViewOnAttachStateChangeListenerC0613i viewOnAttachStateChangeListenerC0613i = (ViewOnAttachStateChangeListenerC0613i) this.f14123b;
                ((View) viewOnAttachStateChangeListenerC0613i.f7958b).postDelayed((o) viewOnAttachStateChangeListenerC0613i.f7959c, 128L);
                break;
            default:
                B b7 = (B) this.f14123b;
                b7.f14124a.getViewTreeObserver().removeOnDrawListener(b7);
                break;
        }
    }
}
