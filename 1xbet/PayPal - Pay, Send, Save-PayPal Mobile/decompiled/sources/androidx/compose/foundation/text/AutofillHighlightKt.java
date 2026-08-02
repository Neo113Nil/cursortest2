package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "defaultColor", "resolveAutofillHighlight-WkMS-hQ", "(Landroidx/compose/ui/graphics/Brush;JJ)Landroidx/compose/ui/graphics/Brush;", "resolveAutofillHighlight", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofillHighlightBrush", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAutofillHighlightBrush", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofillHighlightColor", "getLocalAutofillHighlightColor", "getLocalAutofillHighlightColor$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillHighlightKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Brush> LocalAutofillHighlightBrush = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.ui.graphics.Brush highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.foundation.text.AutofillHighlightKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    }, 1, null);
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> LocalAutofillHighlightColor = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$LocalAutofillHighlightColor$1
        private static long getHighSpeedVideoSizes() {
            return androidx.compose.foundation.text.AutofillHighlight_androidKt.autofillHighlightColor();
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ androidx.compose.ui.graphics.Color invoke() {
            return androidx.compose.ui.graphics.Color.m5986boximpl(getHighSpeedVideoSizes());
        }
    }, 1, null);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use LocalAutofillHighlightBrush instead. To provide a solid color, use SolidColor(yourColor).", replaceWith = @kotlin.ReplaceWith(expression = "LocalAutofillHighlightBrush", imports = {"androidx.compose.foundation.text.LocalAutofillHighlightBrush"}))
    public static /* synthetic */ void getLocalAutofillHighlightColor$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Brush> getLocalAutofillHighlightBrush() {
        return LocalAutofillHighlightBrush;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.Brush getHighSpeedVideoSizes() {
        return new androidx.compose.ui.graphics.SolidColor(androidx.compose.foundation.text.AutofillHighlight_androidKt.autofillHighlightColor(), null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }

    /* renamed from: resolveAutofillHighlight-WkMS-hQ, reason: not valid java name */
    public static final androidx.compose.ui.graphics.Brush m1980resolveAutofillHighlightWkMShQ(androidx.compose.ui.graphics.Brush brush, long j, long j2) {
        return !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, j2) ? new androidx.compose.ui.graphics.SolidColor(j, null) : brush;
    }
}
