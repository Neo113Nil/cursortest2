package com.paypal.oslo.feature.searchandintelligence.ui.accessibility;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/Dp;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "fontScaleBasedSize-i1RSzL4", "(FFLandroidx/compose/runtime/Composer;I)F", "fontScaleBasedSize"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FontScaleBasedSizeKt {
    /* renamed from: fontScaleBasedSize-i1RSzL4, reason: not valid java name */
    public static final float m19175fontScaleBasedSizei1RSzL4(float f, float f2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1086974033, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.accessibility.fontScaleBasedSize (FontScaleBasedSize.kt:25)");
        }
        float m8644lerpMdfbLM = androidx.compose.ui.unit.DpKt.m8644lerpMdfbLM(f, f2, kotlin.ranges.RangesKt.coerceIn(((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).getFontScale() - 1.0f, 0.0f, 1.0f));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m8644lerpMdfbLM;
    }
}
