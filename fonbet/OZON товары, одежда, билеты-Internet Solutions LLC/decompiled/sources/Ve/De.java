package Ve;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class De extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f28859a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28860b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f28861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(Context context, int i11, int i12) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28859a = 10;
        Paint paint = new Paint();
        this.f28861c = paint;
        this.f28859a = i11;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i12);
        this.f28860b = i11;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f7 = this.f28859a;
        Paint paint = this.f28861c;
        float f11 = this.f28860b;
        canvas.drawCircle(f11, f11, f7, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int i13 = this.f28859a * 2;
        setMeasuredDimension(i13, i13);
    }
}
