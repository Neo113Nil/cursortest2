package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f9838c;

    public g(l lVar, int i7, int i8) {
        this.f9838c = lVar;
        this.f9836a = i7;
        this.f9837b = i8;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        e eVar = this.f9838c.mProgress;
        int i7 = this.f9836a;
        eVar.setAlpha((int) (((this.f9837b - i7) * f7) + i7));
    }
}
