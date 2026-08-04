package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0684d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0685e f9454b;

    public AnimationAnimationListenerC0684d(a0 a0Var, ViewGroup viewGroup, C0685e c0685e) {
        this.f9453a = viewGroup;
        this.f9454b = c0685e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        t6.h.e(animation, "animation");
        C0685e c0685e = this.f9454b;
        ViewGroup viewGroup = this.f9453a;
        viewGroup.post(new K5.a(6, viewGroup, c0685e));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        t6.h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        t6.h.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
