package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/style/TextForegroundStyle;Landroidx/compose/ui/text/style/TextForegroundStyle;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "modulate", "Lkotlin/Function0;", "p0", "Camera2StreamConfigurationMap", "(FLkotlin/jvm/functions/Function0;)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextDrawStyleKt {
    public static final androidx.compose.ui.text.style.TextForegroundStyle lerp(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle, androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof androidx.compose.ui.text.style.BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof androidx.compose.ui.text.style.BrushStyle)) {
            return androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(textForegroundStyle.getGetHighResolutionOutputSizeshNQ4ISI(), textForegroundStyle2.getGetHighResolutionOutputSizeshNQ4ISI(), f));
        }
        if (z && (textForegroundStyle2 instanceof androidx.compose.ui.text.style.BrushStyle)) {
            androidx.compose.ui.text.style.BrushStyle brushStyle = (androidx.compose.ui.text.style.BrushStyle) textForegroundStyle;
            androidx.compose.ui.text.style.BrushStyle brushStyle2 = (androidx.compose.ui.text.style.BrushStyle) textForegroundStyle2;
            return androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.from((androidx.compose.ui.graphics.Brush) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(brushStyle.getBrush(), brushStyle2.getBrush(), f), androidx.compose.ui.util.MathHelpersKt.lerp(brushStyle.getGetHighResolutionOutputSizeshNQ4ISI(), brushStyle2.getGetHighResolutionOutputSizeshNQ4ISI(), f));
        }
        return (androidx.compose.ui.text.style.TextForegroundStyle) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m8469modulateDxMtmZc(long j, float f) {
        return (java.lang.Float.isNaN(f) || f >= 1.0f) ? j : androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, androidx.compose.ui.graphics.Color.m5998getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(float f, kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        return java.lang.Float.isNaN(f) ? function0.invoke().floatValue() : f;
    }
}
