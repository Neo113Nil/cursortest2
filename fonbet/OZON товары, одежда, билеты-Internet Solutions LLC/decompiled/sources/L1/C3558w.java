package L1;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3558w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3558w f16193a = new C3558w();

    public final void a(@NotNull Canvas canvas, @NotNull int[] iArr, int i11, @NotNull float[] fArr, int i12, int i13, @NotNull Font font, @NotNull Paint paint) {
        canvas.drawGlyphs(iArr, i11, fArr, i12, i13, font, paint);
    }

    public final void b(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(@NotNull Canvas canvas, @NotNull NinePatch ninePatch, @NotNull RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
