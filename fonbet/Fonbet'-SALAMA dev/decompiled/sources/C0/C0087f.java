package C0;

import P.U;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: C0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1260a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1261b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1262c;

    public C0087f(View view) {
        this.f1262c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1260a) {
            case 0:
                this.f1261b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1260a) {
            case 0:
                if (!this.f1261b) {
                    C0089h c0089h = (C0089h) this.f1262c;
                    if (((Float) c0089h.f1285u.getAnimatedValue()).floatValue() != 0.0f) {
                        c0089h.f1286v = 2;
                        c0089h.f1278n.invalidate();
                        break;
                    } else {
                        c0089h.f1286v = 0;
                        c0089h.e(0);
                        break;
                    }
                } else {
                    this.f1261b = false;
                    break;
                }
            default:
                O0.u uVar = O0.t.f4897a;
                View view = (View) this.f1262c;
                uVar.S(view, 1.0f);
                if (this.f1261b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1260a) {
            case 1:
                WeakHashMap weakHashMap = U.f5037a;
                View view = (View) this.f1262c;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f1261b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0087f(C0089h c0089h) {
        this.f1262c = c0089h;
    }
}
