package L1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3554s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3554s f16192a = new C3554s();

    public final boolean a(@NotNull Canvas canvas, float f7, float f11, float f12, float f13) {
        boolean quickReject;
        quickReject = canvas.quickReject(f7, f11, f12, f13);
        return quickReject;
    }

    public final boolean b(@NotNull Canvas canvas, @NotNull Path path) {
        boolean quickReject;
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    public final boolean c(@NotNull Canvas canvas, @NotNull RectF rectF) {
        boolean quickReject;
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }
}
