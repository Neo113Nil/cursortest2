package n1;

import A0.X0;
import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public N f18387a;

    public O(int i, Interpolator interpolator, long j5) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f18387a = new M(X0.i(i, interpolator, j5));
        } else {
            this.f18387a = new J(i, interpolator, j5);
        }
    }
}
