package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "LocalTextSelectionColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextSelectionColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/graphics/Color;", "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final androidx.compose.foundation.text.selection.TextSelectionColors Camera2StreamConfigurationMap;
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> LocalTextSelectionColors = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.foundation.text.selection.TextSelectionColors highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getHighSpeedVideoFpsRanges();
            return highSpeedVideoFpsRanges;
        }
    }, 1, null);
    private static final long getHighSpeedVideoFpsRangesFor;

    static {
        long Color = androidx.compose.ui.graphics.ColorKt.Color(4282550004L);
        getHighSpeedVideoFpsRangesFor = Color;
        Camera2StreamConfigurationMap = new androidx.compose.foundation.text.selection.TextSelectionColors(Color, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }
}
