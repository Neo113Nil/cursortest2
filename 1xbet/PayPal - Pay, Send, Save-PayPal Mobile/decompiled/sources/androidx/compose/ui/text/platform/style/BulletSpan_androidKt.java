package androidx.compose.ui.text.platform.style;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BulletSpan_androidKt {
    public static final /* synthetic */ void access$draw(androidx.compose.ui.graphics.Outline outline, android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
            canvas.save();
            androidx.compose.ui.graphics.Outline.Generic generic = (androidx.compose.ui.graphics.Outline.Generic) outline;
            androidx.compose.ui.geometry.Rect rect = generic.getRect();
            canvas.translate(f, f2 - ((rect.getBottom() - rect.getTop()) / 2.0f));
            androidx.compose.ui.graphics.Path path = generic.getPath();
            if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
                canvas.drawPath(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), paint);
                canvas.restore();
                return;
            }
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
            if (!androidx.compose.ui.geometry.RoundRectKt.isSimple(rounded.getRoundRect())) {
                androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                androidx.compose.ui.graphics.Path.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
                canvas.save();
                canvas.translate(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f));
                if (Path instanceof androidx.compose.ui.graphics.AndroidPath) {
                    canvas.drawPath(((androidx.compose.ui.graphics.AndroidPath) Path).getInternalPath(), paint);
                    canvas.restore();
                    return;
                }
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5802getTopLeftCornerRadiuskKHJgLs() >> 32));
            canvas.drawRoundRect(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f), (i * rounded.getRoundRect().getWidth()) + f, (rounded.getRoundRect().getHeight() / 2.0f) + f2, intBitsToFloat, intBitsToFloat, paint);
            return;
        }
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Rectangle)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.graphics.Outline.Rectangle rectangle = (androidx.compose.ui.graphics.Outline.Rectangle) outline;
        androidx.compose.ui.geometry.Rect rect2 = rectangle.getRect();
        float bottom = (rect2.getBottom() - rect2.getTop()) / 2.0f;
        androidx.compose.ui.geometry.Rect rect3 = rectangle.getRect();
        float right = rect3.getRight();
        float left = rect3.getLeft();
        androidx.compose.ui.geometry.Rect rect4 = rectangle.getRect();
        canvas.drawRect(f, f2 - bottom, (i * (right - left)) + f, f2 + ((rect4.getBottom() - rect4.getTop()) / 2.0f), paint);
    }

    /* renamed from: access$setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final /* synthetic */ void m8303access$setBrushAndDrawyzxVdVo(android.graphics.Paint paint, androidx.compose.ui.graphics.Brush brush, float f, long j, kotlin.jvm.functions.Function0 function0) {
        java.lang.Integer num = null;
        if (brush == null) {
            if (!java.lang.Float.isNaN(f)) {
                num = java.lang.Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) java.lang.Math.rint(f * 255.0f));
            }
            function0.invoke();
            if (num != null) {
                paint.setAlpha(num.intValue());
                return;
            }
            return;
        }
        if (brush instanceof androidx.compose.ui.graphics.SolidColor) {
            int color = paint.getColor();
            if (!java.lang.Float.isNaN(f)) {
                num = java.lang.Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) java.lang.Math.rint(f * 255.0f));
            }
            paint.setColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(((androidx.compose.ui.graphics.SolidColor) brush).getValue()));
            function0.invoke();
            paint.setColor(color);
            if (num != null) {
                paint.setAlpha(num.intValue());
                return;
            }
            return;
        }
        if (!(brush instanceof androidx.compose.ui.graphics.ShaderBrush)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        android.graphics.Shader shader = paint.getShader();
        if (!java.lang.Float.isNaN(f)) {
            num = java.lang.Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) java.lang.Math.rint(f * 255.0f));
        }
        paint.setShader(((androidx.compose.ui.graphics.ShaderBrush) brush).mo5965createShaderuvyYCjk(j));
        function0.invoke();
        paint.setShader(shader);
        if (num != null) {
            paint.setAlpha(num.intValue());
        }
    }

    public static final /* synthetic */ void access$setDrawStyle(android.graphics.Paint paint, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(drawStyle, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof androidx.compose.ui.graphics.drawscope.Stroke)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        androidx.compose.ui.graphics.drawscope.Stroke stroke = (androidx.compose.ui.graphics.drawscope.Stroke) drawStyle;
        paint.setStrokeWidth(stroke.getWidth());
        paint.setStrokeMiter(stroke.getMiter());
        paint.setStrokeCap(androidx.compose.ui.text.platform.style.DrawStyleSpan_androidKt.m8305toAndroidCapBeK7IIE(stroke.getCap()));
        paint.setStrokeJoin(androidx.compose.ui.text.platform.style.DrawStyleSpan_androidKt.m8306toAndroidJoinWw9F2mQ(stroke.getJoin()));
        androidx.compose.ui.graphics.PathEffect pathEffect = stroke.getPathEffect();
        paint.setPathEffect(pathEffect != null ? androidx.compose.ui.graphics.AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
    }
}
