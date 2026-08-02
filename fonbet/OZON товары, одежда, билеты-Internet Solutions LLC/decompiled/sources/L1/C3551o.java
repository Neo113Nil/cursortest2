package L1;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3551o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3551o f16191a = new C3551o();

    public final void a(@NotNull Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(@NotNull Canvas canvas, int i11, @NotNull BlendMode blendMode) {
        canvas.drawColor(i11, blendMode);
    }

    public final void c(@NotNull Canvas canvas, long j11) {
        canvas.drawColor(j11);
    }

    public final void d(@NotNull Canvas canvas, long j11, @NotNull BlendMode blendMode) {
        canvas.drawColor(j11, blendMode);
    }

    public final void e(@NotNull Canvas canvas, @NotNull RectF rectF, float f7, float f11, @NotNull RectF rectF2, float f12, float f13, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f7, f11, rectF2, f12, f13, paint);
    }

    public final void f(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull float[] fArr, @NotNull RectF rectF2, @NotNull float[] fArr2, @NotNull Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(@NotNull Canvas canvas, @NotNull RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(@NotNull Canvas canvas, @NotNull MeasuredText measuredText, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        canvas.drawTextRun(measuredText, i11, i12, i13, i14, f7, f11, z11, paint);
    }

    public final void i(@NotNull Canvas canvas) {
        canvas.enableZ();
    }
}
