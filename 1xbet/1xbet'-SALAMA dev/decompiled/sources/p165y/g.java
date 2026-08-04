package p165y;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18111f;

    @Override // p165y.k
    public final void c(View view, float f7) {
        switch (this.f18111f) {
            case 0:
                view.setAlpha(a(f7));
                break;
            case 1:
                view.setElevation(a(f7));
                break;
            case 2:
                view.setPivotX(a(f7));
                break;
            case 3:
                view.setPivotY(a(f7));
                break;
            case 4:
                view.setRotation(a(f7));
                break;
            case 5:
                view.setRotationX(a(f7));
                break;
            case 6:
                view.setRotationY(a(f7));
                break;
            case 7:
                view.setScaleX(a(f7));
                break;
            case 8:
                view.setScaleY(a(f7));
                break;
            case 9:
                view.setTranslationX(a(f7));
                break;
            case 10:
                view.setTranslationY(a(f7));
                break;
            default:
                view.setTranslationZ(a(f7));
                break;
        }
    }
}
