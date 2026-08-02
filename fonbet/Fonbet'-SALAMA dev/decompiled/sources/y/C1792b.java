package y;

import android.view.View;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792b extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18099d;

    @Override // y.f
    public final void d(View view, float f7) {
        switch (this.f18099d) {
            case 0:
                view.setAlpha(a(f7));
                break;
            case 1:
                view.setElevation(a(f7));
                break;
            case 2:
                view.setRotation(a(f7));
                break;
            case 3:
                view.setRotationX(a(f7));
                break;
            case 4:
                view.setRotationY(a(f7));
                break;
            case 5:
                view.setScaleX(a(f7));
                break;
            case 6:
                view.setScaleY(a(f7));
                break;
            case 7:
                view.setTranslationX(a(f7));
                break;
            case 8:
                view.setTranslationY(a(f7));
                break;
            default:
                view.setTranslationZ(a(f7));
                break;
        }
    }
}
