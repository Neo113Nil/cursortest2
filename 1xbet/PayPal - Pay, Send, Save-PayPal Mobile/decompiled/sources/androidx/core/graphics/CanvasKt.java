package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0013\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001c2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001d\u001aM\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010#\u001aM\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u0012\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010&"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "withSave", "(Landroid/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "", "x", "y", "withTranslation", "(Landroid/graphics/Canvas;FFLkotlin/jvm/functions/Function1;)V", "degrees", "pivotX", "pivotY", "withRotation", "(Landroid/graphics/Canvas;FFFLkotlin/jvm/functions/Function1;)V", "withScale", "(Landroid/graphics/Canvas;FFFFLkotlin/jvm/functions/Function1;)V", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "clipRect", "withClip", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lkotlin/jvm/functions/Function1;)V", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "(Landroid/graphics/Canvas;IIIILkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CanvasKt {
    public static final void withSave(android.graphics.Canvas canvas, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withTranslation(android.graphics.Canvas canvas, float f, float f2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withTranslation$default(android.graphics.Canvas canvas, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withRotation(android.graphics.Canvas canvas, float f, float f2, float f3, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withRotation$default(android.graphics.Canvas canvas, float f, float f2, float f3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withScale(android.graphics.Canvas canvas, float f, float f2, float f3, float f4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withScale$default(android.graphics.Canvas canvas, float f, float f2, float f3, float f4, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSkew(android.graphics.Canvas canvas, float f, float f2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withSkew$default(android.graphics.Canvas canvas, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static /* synthetic */ void withMatrix$default(android.graphics.Canvas canvas, android.graphics.Matrix matrix, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            matrix = new android.graphics.Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withMatrix(android.graphics.Canvas canvas, android.graphics.Matrix matrix, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(android.graphics.Canvas canvas, android.graphics.Rect rect, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(android.graphics.Canvas canvas, android.graphics.RectF rectF, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(android.graphics.Canvas canvas, float f, float f2, float f3, float f4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(android.graphics.Canvas canvas, android.graphics.Path path, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> function1) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            function1.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
