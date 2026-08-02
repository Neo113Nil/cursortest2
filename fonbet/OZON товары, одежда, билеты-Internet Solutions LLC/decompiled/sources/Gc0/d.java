package Gc0;

import Fc0.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGc0/d;", "Landroid/view/View;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d extends View {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9922a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Paint f9923b;

    /* renamed from: c, reason: collision with root package name */
    private int f9924c;

    /* renamed from: d, reason: collision with root package name */
    private int f9925d;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f9926e;

    /* renamed from: f, reason: collision with root package name */
    private ValueAnimator f9927f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private e f9928g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9929h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(boolean z11, d dVar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            dVar.f9924c = ((Integer) animatedValue).intValue();
        } else {
            Object animatedValue2 = it.getAnimatedValue();
            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            dVar.f9925d = ((Integer) animatedValue2).intValue();
        }
        dVar.invalidate();
    }

    public static void b(boolean z11, d dVar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            dVar.f9924c = ((Integer) animatedValue).intValue();
        } else {
            Object animatedValue2 = it.getAnimatedValue();
            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            dVar.f9925d = ((Integer) animatedValue2).intValue();
        }
        dVar.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(e eVar) {
        final boolean z11 = eVar == e.PORTRAIT;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(getF9929h() ? 200L : 0L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Gc0.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.b(z11, this, valueAnimator);
            }
        });
        this.f9926e = ofInt;
        ofInt.start();
    }

    protected final void e(@NotNull Canvas canvas, @NotNull RectF passportRectF) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(passportRectF, "passportRectF");
        canvas.drawLine(passportRectF.left, passportRectF.centerY(), passportRectF.right, passportRectF.centerY(), this.f9923b);
    }

    protected abstract void f(@NotNull Canvas canvas);

    protected abstract void g(@NotNull Canvas canvas);

    protected final void h(@NotNull Canvas canvas, @NotNull RectF passportRectF) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(passportRectF, "passportRectF");
        canvas.drawLine(passportRectF.centerX(), passportRectF.top, passportRectF.centerX(), passportRectF.bottom, this.f9923b);
    }

    @NotNull
    /* renamed from: i, reason: from getter */
    protected final Paint getF9923b() {
        return this.f9923b;
    }

    /* renamed from: j, reason: from getter */
    protected boolean getF9929h() {
        return this.f9929h;
    }

    /* renamed from: k, reason: from getter */
    protected final boolean getF9922a() {
        return this.f9922a;
    }

    protected abstract void l(int i11, int i12);

    public final void m(@NotNull e value) {
        ValueAnimator valueAnimator;
        Intrinsics.checkNotNullParameter(value, "newOrientation");
        Intrinsics.checkNotNullParameter(value, "value");
        e eVar = this.f9928g;
        if (value == eVar) {
            return;
        }
        this.f9928g = value;
        ValueAnimator valueAnimator2 = this.f9926e;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.f9927f) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator3 = this.f9926e;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimator4 = this.f9927f;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            this.f9927f = null;
            this.f9926e = null;
        }
        if (eVar == e.UNKNOWN) {
            d(value);
            return;
        }
        final boolean z11 = eVar == e.PORTRAIT;
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.setDuration(getF9929h() ? 200L : 0L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Gc0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                d.a(z11, this, valueAnimator5);
            }
        });
        ofInt.addListener(new c(this, value));
        this.f9927f = ofInt;
        ofInt.start();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f9926e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f9927f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f9927f = null;
        this.f9926e = null;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i11 = this.f9924c;
        if (i11 == 0 && this.f9925d == 0) {
            return;
        }
        Paint paint = this.f9923b;
        if (i11 > 0) {
            paint.setAlpha(i11);
            g(canvas);
        } else {
            paint.setAlpha(this.f9925d);
            f(canvas);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        l(i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9922a = getResources().getConfiguration().smallestScreenWidthDp >= 600;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(androidx.core.content.a.getColor(context, R.color.oz_white_1));
        paint.setStrokeWidth(UiExtKt.toPxF(4.0f));
        this.f9923b = paint;
        this.f9928g = e.UNKNOWN;
        this.f9929h = true;
    }
}
