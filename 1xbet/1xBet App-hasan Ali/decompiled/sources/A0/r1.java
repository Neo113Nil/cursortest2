package A0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
public final class r1 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;

    public /* synthetic */ r1(int i) {
        this.f566a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f566a) {
            case 0:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", view);
                L1.a.t(view);
                throw null;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                if (!(view instanceof l0.m) || (outline2 = ((l0.m) view).f17754o) == null) {
                    return;
                }
                outline.set(outline2);
                return;
        }
    }
}
