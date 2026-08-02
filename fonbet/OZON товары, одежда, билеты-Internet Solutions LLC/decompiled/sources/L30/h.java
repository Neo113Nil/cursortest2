package L30;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f16500a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private L60.b f16501b;

    public final void a(@NotNull final Window window, final float f7) {
        Intrinsics.checkNotNullParameter(window, "window");
        final float f11 = window.getAttributes().screenBrightness;
        this.f16500a.post(new Runnable() { // from class: L30.g
            @Override // java.lang.Runnable
            public final void run() {
                float f12 = f7;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f11, f12).setDuration(350L);
                final h hVar = this;
                final Window window2 = window;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: L30.f
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) Bi.a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        h.this.getClass();
                        Window window3 = window2;
                        WindowManager.LayoutParams attributes = window3.getAttributes();
                        attributes.screenBrightness = floatValue;
                        window3.setAttributes(attributes);
                    }
                });
                duration.start();
            }
        });
        L60.b bVar = this.f16501b;
        if (bVar != null) {
            bVar.invoke(Boolean.TRUE);
        }
    }

    public final void b(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f16500a.post(new GI.d(2, this, window));
        L60.b bVar = this.f16501b;
        if (bVar != null) {
            bVar.invoke(Boolean.FALSE);
        }
    }

    public final void c(L60.b bVar) {
        this.f16501b = bVar;
    }
}
