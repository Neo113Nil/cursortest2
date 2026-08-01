package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class sh extends View {
    public static final a h = new a(null);
    public static final int i = -436207617;
    public static final int j = -1711276033;
    public static final int k = -15262682;

    /* renamed from: a, reason: collision with root package name */
    public final c6 f5010a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final RectF e;
    public float f;
    public float g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(Context context, AttributeSet attributeSet, int i2, c6 densityProvider) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f5010a = densityProvider;
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.sh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sh.a();
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.sh$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sh.a(sh.this);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.sh$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sh.b(sh.this);
            }
        });
        this.e = new RectF();
        this.f = 1.0f;
        this.g = -1.0f;
    }

    public static final Paint a() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(k);
        return paint;
    }

    public static final Paint b(sh shVar) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(shVar.f5010a.a(2));
        paint.setColor(i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private final Paint getArcBackgroundPaint() {
        return (Paint) this.c.getValue();
    }

    public final int getArcColor() {
        return getProgressPaint().getColor();
    }

    public final Paint getBackgroundPaint() {
        return (Paint) this.b.getValue();
    }

    public final int getBackgroundPaintColor() {
        return getBackgroundPaint().getColor();
    }

    public final float getProgress() {
        return this.f;
    }

    public final Paint getProgressPaint() {
        return (Paint) this.d.getValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(this.e.centerX(), this.e.centerY(), this.e.width() / 2, getBackgroundPaint());
        canvas.drawArc(this.e, 0.0f, 360.0f, false, getArcBackgroundPaint());
        float f = this.f;
        if (f > 0.0f) {
            canvas.drawArc(this.e, -90.0f, f * 360.0f, false, getProgressPaint());
        }
        this.g = this.f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float strokeWidth = getProgressPaint().getStrokeWidth() / 2;
        this.e.set(strokeWidth, strokeWidth, i2 - strokeWidth, i3 - strokeWidth);
    }

    public final void setArcColor(int i2) {
        getProgressPaint().setColor(i2);
        invalidate();
    }

    public final void setBackgroundPaintColor(int i2) {
        getBackgroundPaint().setColor(i2);
        invalidate();
    }

    public final void setProgress(float f) {
        float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        if (coerceIn != this.f || this.g == -1.0f) {
            this.f = coerceIn;
            this.g = coerceIn;
            invalidate();
        }
    }

    public static final Paint a(sh shVar) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(shVar.f5010a.a(2));
        paint.setColor(j);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }
}
