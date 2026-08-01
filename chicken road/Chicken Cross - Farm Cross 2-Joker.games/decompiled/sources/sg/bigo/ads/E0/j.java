package sg.bigo.ads.E0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12271a = false;
    public final /* synthetic */ View b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Drawable d;

    public j(View view, Drawable drawable, Drawable drawable2) {
        this.b = view;
        this.c = drawable;
        this.d = drawable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12271a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setBackground(this.f12271a ? this.c : this.d);
        this.b.setTag(-2123303016, null);
    }
}
