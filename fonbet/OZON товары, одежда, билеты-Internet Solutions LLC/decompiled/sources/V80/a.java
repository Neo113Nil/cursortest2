package V80;

import Ij.C3261b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class a extends ColorDrawable {

    /* renamed from: a, reason: collision with root package name */
    private final int f28434a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Paint f28435b;

    public a(int i11, int i12) {
        super(i11);
        this.f28434a = i12;
        this.f28435b = C3261b.b(1, i11);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(getBounds().width() / 2, getBounds().height() / 2, this.f28434a, this.f28435b);
    }
}
