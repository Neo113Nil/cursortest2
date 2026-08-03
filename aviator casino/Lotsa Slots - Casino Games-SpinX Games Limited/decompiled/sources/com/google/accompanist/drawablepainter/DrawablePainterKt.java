package com.google.accompanist.drawablepainter;

/* compiled from: DrawablePainter.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000e\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"MAIN_HANDLER", "Landroid/os/Handler;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "MAIN_HANDLER$delegate", "Lkotlin/Lazy;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "Landroid/graphics/drawable/Drawable;", "getIntrinsicSize", "(Landroid/graphics/drawable/Drawable;)J", "rememberDrawablePainter", "Landroidx/compose/ui/graphics/painter/Painter;", "drawable", "(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "drawablepainter_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawablePainterKt {
    private static final kotlin.Lazy MAIN_HANDLER$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.os.Handler>() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final android.os.Handler invoke() {
            return new android.os.Handler(android.os.Looper.getMainLooper());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Handler getMAIN_HANDLER() {
        return (android.os.Handler) MAIN_HANDLER$delegate.getValue();
    }

    public static final androidx.compose.ui.graphics.painter.Painter rememberDrawablePainter(android.graphics.drawable.Drawable drawable, androidx.compose.runtime.Composer composer, int i) {
        com.google.accompanist.drawablepainter.DrawablePainter drawablePainter;
        composer.startReplaceableGroup(1756822313);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberDrawablePainter)");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1756822313, i, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:151)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
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
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
                    drawablePainter = new com.google.accompanist.drawablepainter.DrawablePainter(mutate);
                }
                rememberedValue = drawablePainter;
            }
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.ui.graphics.painter.Painter painter = (androidx.compose.ui.graphics.painter.Painter) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return painter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(android.graphics.drawable.Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return androidx.compose.ui.geometry.SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
    }
}
