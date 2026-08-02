package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"COUNTRIES", "", "COUNTRYCODE", "IMAGEINDEX", "rememberFlagPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "countryCode", "flagSize", "Lcom/paypal/pds/core/FlagSize;", "(Ljava/lang/String;Lcom/paypal/pds/core/FlagSize;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/painter/Painter;", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FlagKt {
    public static final androidx.compose.ui.graphics.painter.Painter rememberFlagPainter(java.lang.String str, com.paypal.pds.core.FlagSize flagSize, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.pds.core.FlagSize.XLarge xLarge = (i2 & 2) != 0 ? com.paypal.pds.core.FlagSize.XLarge.INSTANCE : flagSize;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(712847031, i, -1, "com.paypal.pds.core.rememberFlagPainter (Flag.kt:82)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        float flagSize2 = xLarge.getFlagSize() * context.getResources().getDisplayMetrics().density;
        int i3 = (i & 14) ^ 6;
        boolean z = (i3 > 4 && composer.changed(str)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(xLarge)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.pds.core.AsyncFlagPainter(androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(flagSize2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(flagSize2) << 32)), null);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.core.AsyncFlagPainter asyncFlagPainter = (com.paypal.pds.core.AsyncFlagPainter) rememberedValue;
        boolean changedInstance = composer.changedInstance(context);
        boolean z3 = (i3 > 4 && composer.changed(str)) || (i & 6) == 4;
        boolean changed = composer.changed(asyncFlagPainter);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | changedInstance | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1(context, str, asyncFlagPainter, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(str, xLarge, (kotlin.jvm.functions.Function2) rememberedValue2, composer, i & 126);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return asyncFlagPainter;
    }
}
