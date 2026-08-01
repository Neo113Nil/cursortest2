package sg.bigo.ads.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.h.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5124A extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12798a;

    public C5124A(ValueCallback valueCallback) {
        this.f12798a = valueCallback;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueCallback valueCallback = this.f12798a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }
}
