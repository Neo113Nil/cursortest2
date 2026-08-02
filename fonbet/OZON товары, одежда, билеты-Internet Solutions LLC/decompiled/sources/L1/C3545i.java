package L1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3545i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3545i f16190a = new C3545i();

    public final boolean a(@NotNull Canvas canvas, @NotNull Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(@NotNull Canvas canvas, float f7, float f11, float f12, float f13) {
        return canvas.clipOutRect(f7, f11, f12, f13);
    }

    public final boolean c(@NotNull Canvas canvas, int i11, int i12, int i13, int i14) {
        return canvas.clipOutRect(i11, i12, i13, i14);
    }

    public final boolean d(@NotNull Canvas canvas, @NotNull Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(@NotNull Canvas canvas, @NotNull RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
