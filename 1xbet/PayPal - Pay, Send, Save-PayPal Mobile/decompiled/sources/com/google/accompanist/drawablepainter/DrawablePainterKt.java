package com.google.accompanist.drawablepainter;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Landroidx/compose/ui/graphics/painter/Painter;", "rememberDrawablePainter", "(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/os/Handler;", "MAIN_HANDLER$delegate", "Lkotlin/Lazy;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "MAIN_HANDLER", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawablePainterKt {
    private static final kotlin.Lazy MAIN_HANDLER$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            android.os.Handler MAIN_HANDLER_delegate$lambda$0;
            MAIN_HANDLER_delegate$lambda$0 = com.google.accompanist.drawablepainter.DrawablePainterKt.MAIN_HANDLER_delegate$lambda$0();
            return MAIN_HANDLER_delegate$lambda$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Handler getMAIN_HANDLER() {
        return (android.os.Handler) MAIN_HANDLER$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Handler MAIN_HANDLER_delegate$lambda$0() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final androidx.compose.ui.graphics.painter.Painter rememberDrawablePainter(android.graphics.drawable.Drawable drawable, androidx.compose.runtime.Composer composer, int i) {
        com.google.accompanist.drawablepainter.DrawablePainter drawablePainter;
        composer.startReplaceGroup(1756822313);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1756822313, i, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:164)");
        }
        composer.startReplaceGroup(289266787);
        boolean changed = composer.changed(drawable);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            if (drawable == null) {
                rememberedValue = com.google.accompanist.drawablepainter.EmptyPainter.INSTANCE;
            } else {
                if (drawable instanceof android.graphics.drawable.ColorDrawable) {
                    drawablePainter = new androidx.compose.ui.graphics.painter.ColorPainter(androidx.compose.ui.graphics.ColorKt.Color(((android.graphics.drawable.ColorDrawable) drawable).getColor()), null);
                } else {
                    android.graphics.drawable.Drawable mutate = drawable.mutate();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "");
                    drawablePainter = new com.google.accompanist.drawablepainter.DrawablePainter(mutate);
                }
                rememberedValue = drawablePainter;
            }
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.graphics.painter.Painter painter = (androidx.compose.ui.graphics.painter.Painter) rememberedValue;
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return painter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(android.graphics.drawable.Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return androidx.compose.ui.geometry.SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }
}
