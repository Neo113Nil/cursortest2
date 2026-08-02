package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import h2.C6785c;

/* loaded from: classes8.dex */
final class j implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6785c f41423a;

    j(C6785c c6785c) {
        this.f41423a = c6785c;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        return (float) this.f41423a.a(f7);
    }
}
