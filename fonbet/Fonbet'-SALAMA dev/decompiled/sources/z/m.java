package z;

import android.view.animation.Interpolator;
import u.C1616e;

/* loaded from: classes.dex */
public final class m implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1616e f18307b;

    public /* synthetic */ m(C1616e c1616e, int i7) {
        this.f18306a = i7;
        this.f18307b = c1616e;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.f18306a) {
        }
        return (float) this.f18307b.a(f7);
    }
}
