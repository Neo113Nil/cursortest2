package com.paypal.oslo.feature.home.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fontScaledHeight", "Landroidx/compose/ui/Modifier;", "baseHeight", "Landroidx/compose/ui/unit/Dp;", "amplifier", "", "scaleThreshold", "fontScaledHeight-DzVHIIc", "(Landroidx/compose/ui/Modifier;FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "fontScaledWidth", "baseWidth", "fontScaledWidth-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccessibilityUtilsKt {
    /* renamed from: fontScaledHeight-DzVHIIc, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m14985fontScaledHeightDzVHIIc(androidx.compose.ui.Modifier modifier, float f, float f2, float f3, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 1.15f;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-634291192, i, -1, "com.paypal.oslo.feature.home.ui.utils.fontScaledHeight (AccessibilityUtils.kt:38)");
        }
        float fontScale = ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).getFontScale();
        androidx.compose.ui.Modifier then = modifier.then(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(f * (fontScale >= f3 ? fontScale * f2 : 1.0f))));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    /* renamed from: fontScaledWidth-ziNgDLE, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m14986fontScaledWidthziNgDLE(androidx.compose.ui.Modifier modifier, float f, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-268861235, i, -1, "com.paypal.oslo.feature.home.ui.utils.fontScaledWidth (AccessibilityUtils.kt:64)");
        }
        androidx.compose.ui.Modifier then = modifier.then(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(f * ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).getFontScale())));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }
}
