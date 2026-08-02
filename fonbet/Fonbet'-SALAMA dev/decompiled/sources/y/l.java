package y;

import android.view.View;
import u.C1616e;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18114g;

    @Override // y.p
    public final boolean b(float f7, long j, View view, C1616e c1616e) {
        switch (this.f18114g) {
            case 0:
                view.setAlpha(a(f7, j, view, c1616e));
                break;
            case 1:
                view.setElevation(a(f7, j, view, c1616e));
                break;
            case 2:
                view.setRotation(a(f7, j, view, c1616e));
                break;
            case 3:
                view.setRotationX(a(f7, j, view, c1616e));
                break;
            case 4:
                view.setRotationY(a(f7, j, view, c1616e));
                break;
            case 5:
                view.setScaleX(a(f7, j, view, c1616e));
                break;
            case 6:
                view.setScaleY(a(f7, j, view, c1616e));
                break;
            case 7:
                view.setTranslationX(a(f7, j, view, c1616e));
                break;
            case 8:
                view.setTranslationY(a(f7, j, view, c1616e));
                break;
            default:
                view.setTranslationZ(a(f7, j, view, c1616e));
                break;
        }
        return this.f18123d;
    }
}
