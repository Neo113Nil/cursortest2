package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0709h f9461c;

    public C0708g(ViewGroup viewGroup, boolean z4, a0 a0Var, C0709h c0709h) {
        this.f9459a = viewGroup;
        this.f9460b = z4;
        this.f9461c = c0709h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t6.h.e(animator, "anim");
        this.f9459a.endViewTransition(null);
        if (this.f9460b) {
            throw null;
        }
        C0707f c0707f = this.f9461c.f9462b;
        throw null;
    }
}
