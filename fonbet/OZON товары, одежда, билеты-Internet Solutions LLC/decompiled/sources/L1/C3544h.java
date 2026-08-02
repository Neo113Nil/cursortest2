package L1;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3544h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3544h f16189a = new C3544h();

    public final void a(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        canvas.drawTextRun(charSequence, i11, i12, i13, i14, f7, f11, z11, paint);
    }

    public final void b(@NotNull Canvas canvas, @NotNull char[] cArr, int i11, int i12, int i13, int i14, float f7, float f11, boolean z11, @NotNull Paint paint) {
        canvas.drawTextRun(cArr, i11, i12, i13, i14, f7, f11, z11, paint);
    }
}
