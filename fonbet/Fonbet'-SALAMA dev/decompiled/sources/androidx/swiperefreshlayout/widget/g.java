package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f9838c;

    public g(l lVar, int i7, int i8) {
        this.f9838c = lVar;
        this.f9836a = i7;
        this.f9837b = i8;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        this.f9838c.mProgress.setAlpha((int) (((this.f9837b - r0) * f7) + this.f9836a));
    }
}
