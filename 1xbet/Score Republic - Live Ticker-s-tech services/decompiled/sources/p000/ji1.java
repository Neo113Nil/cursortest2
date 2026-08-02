package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ji1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f3944a;

    public ji1(View view) {
        this.f3944a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m2912a(float f) {
        View view = (View) this.f3944a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2913b() {
        View view = (View) this.f3944a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2914c(long j) {
        View view = (View) this.f3944a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2915d(li1 li1Var) {
        View view = (View) this.f3944a.get();
        if (view != null) {
            if (li1Var != null) {
                view.animate().setListener(new C0159e2(li1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2916e(float f) {
        View view = (View) this.f3944a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
