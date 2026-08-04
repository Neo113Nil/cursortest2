package p169z;

import android.view.animation.Interpolator;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18313b;

    public /* synthetic */ m(e eVar, int i7) {
        this.f18312a = i7;
        this.f18313b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.f18312a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (float) this.f18313b.a(f7);
    }
}
