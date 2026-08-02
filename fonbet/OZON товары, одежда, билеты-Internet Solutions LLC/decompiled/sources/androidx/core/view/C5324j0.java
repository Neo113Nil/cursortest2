package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: androidx.core.view.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5324j0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5328l0 f42297a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f42298b;

    C5324j0(InterfaceC5328l0 interfaceC5328l0, View view) {
        this.f42297a = interfaceC5328l0;
        this.f42298b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f42297a.onAnimationCancel();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f42297a.onAnimationEnd();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f42297a.a();
    }
}
