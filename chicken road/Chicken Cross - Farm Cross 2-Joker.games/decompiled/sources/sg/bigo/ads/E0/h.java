package sg.bigo.ads.E0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12269a = false;
    public final /* synthetic */ k b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n d;
    public final /* synthetic */ View e;

    public h(k kVar, int i, n nVar, View view) {
        this.b = kVar;
        this.c = i;
        this.d = nVar;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f12269a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.b;
        if (kVar != null) {
            kVar.a(this.c);
        }
        this.d.a(this.f12269a);
        this.e.setTag(-2123303016, null);
    }
}
