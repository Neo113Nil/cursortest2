package sg.bigo.ads.F;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12284a;

    public c(d dVar) {
        this.f12284a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        d dVar = this.f12284a;
        int i = dVar.c - 1;
        ViewGroup viewGroup = dVar.f12285a;
        Handler handler = new Handler(Looper.getMainLooper());
        if (i <= 0) {
            return;
        }
        handler.post(new d(viewGroup, 100L, i));
    }
}
