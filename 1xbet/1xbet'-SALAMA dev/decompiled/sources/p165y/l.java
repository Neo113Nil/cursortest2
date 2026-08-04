package p165y;

import android.view.View;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18120g;

    @Override // p165y.p
    public final boolean b(float f7, long j, View view, e eVar) {
        switch (this.f18120g) {
            case 0:
                view.setAlpha(a(f7, j, view, eVar));
                break;
            case 1:
                view.setElevation(a(f7, j, view, eVar));
                break;
            case 2:
                view.setRotation(a(f7, j, view, eVar));
                break;
            case 3:
                view.setRotationX(a(f7, j, view, eVar));
                break;
            case 4:
                view.setRotationY(a(f7, j, view, eVar));
                break;
            case 5:
                view.setScaleX(a(f7, j, view, eVar));
                break;
            case 6:
                view.setScaleY(a(f7, j, view, eVar));
                break;
            case 7:
                view.setTranslationX(a(f7, j, view, eVar));
                break;
            case 8:
                view.setTranslationY(a(f7, j, view, eVar));
                break;
            default:
                view.setTranslationZ(a(f7, j, view, eVar));
                break;
        }
        return this.f18129d;
    }
}
