package androidx.compose.ui.text.style;

/* compiled from: TextForegroundStyle.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final androidx.compose.ui.text.style.TextForegroundStyle lerp(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle, androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof androidx.compose.ui.text.style.BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof androidx.compose.ui.text.style.BrushStyle)) {
            return androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m4381from8_81llA(androidx.compose.ui.graphics.ColorKt.m2164lerpjxsXWHM(textForegroundStyle.mo4258getColor0d7_KjU(), textForegroundStyle2.mo4258getColor0d7_KjU(), f));
        }
        if (z && (textForegroundStyle2 instanceof androidx.compose.ui.text.style.BrushStyle)) {
            return androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.from((androidx.compose.ui.graphics.Brush) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(((androidx.compose.ui.text.style.BrushStyle) textForegroundStyle).getBrush(), ((androidx.compose.ui.text.style.BrushStyle) textForegroundStyle2).getBrush(), f), androidx.compose.ui.util.MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f));
        }
        return (androidx.compose.ui.text.style.TextForegroundStyle) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m4380modulateDxMtmZc(long j, float f) {
        return (java.lang.Float.isNaN(f) || f >= 1.0f) ? j : androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f, kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        return java.lang.Float.isNaN(f) ? function0.invoke().floatValue() : f;
    }
}
