package com.paypal.oslo.feature.inappcheckout.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "statusBarHeight", "(Landroidx/compose/runtime/Composer;I)F", "Landroid/content/Context;", "context", "", "colorRes", "Landroidx/compose/ui/graphics/Color;", "rememberColorValue", "(Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)J", "stringRes", "", "", "formatArgs", "", "rememberStringValue", "(Landroid/content/Context;I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UiUtilsKt {
    public static final float statusBarHeight(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1413858326, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.statusBarHeight (UiUtils.kt:26)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        float mo1415toDpu2uoSUM = density.mo1415toDpu2uoSUM(androidx.compose.foundation.layout.WindowInsets_androidKt.getStatusBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6).getTop(density));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mo1415toDpu2uoSUM;
    }

    public static final long rememberColorValue(android.content.Context context, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-12111376, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.rememberColorValue (UiUtils.kt:33)");
        }
        boolean z = (((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.ColorKt.Color(androidx.core.content.ContextCompat.getColor(context, i)));
            composer.updateRememberedValue(rememberedValue);
        }
        long m6006unboximpl = ((androidx.compose.ui.graphics.Color) rememberedValue).m6006unboximpl();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m6006unboximpl;
    }

    public static final java.lang.String rememberStringValue(android.content.Context context, int i, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(388418143, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.rememberStringValue (UiUtils.kt:43)");
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
        spreadBuilder.add(context);
        spreadBuilder.add(java.lang.Integer.valueOf(i));
        spreadBuilder.addSpread(objArr);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = context.getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rememberedValue, "");
        java.lang.String str = (java.lang.String) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return str;
    }
}
