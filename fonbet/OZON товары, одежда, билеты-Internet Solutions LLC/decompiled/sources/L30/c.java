package L30;

import C.D;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public final class c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    private final int f16490a;

    public c(int i11) {
        this.f16490a = i11;
    }

    public final int a() {
        return this.f16490a;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.d(this.f16490a));
    }
}
