package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0687g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0688h f9461c;

    public C0687g(ViewGroup viewGroup, boolean z4, a0 a0Var, C0688h c0688h) {
        this.f9459a = viewGroup;
        this.f9460b = z4;
        this.f9461c = c0688h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t6.h.e(animator, "anim");
        this.f9459a.endViewTransition(null);
        if (this.f9460b) {
            throw null;
        }
        C0686f c0686f = this.f9461c.f9462b;
        throw null;
    }
}
