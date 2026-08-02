package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "frameRate", "preferredFrameRate", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/FrameRateCategory;", "frameRateCategory", "preferredFrameRate-kI47g10"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameRateKt {
    public static final androidx.compose.ui.Modifier preferredFrameRate(androidx.compose.ui.Modifier modifier, float f) {
        return androidx.compose.ui.ComposeUiFlags.isAdaptiveRefreshRateEnabled ? androidx.compose.ui.graphics.GraphicsLayerModifierKt.m6144graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null).then(new androidx.compose.ui.FrameRateElement(f)) : modifier;
    }

    /* renamed from: preferredFrameRate-kI47g10, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m5514preferredFrameRatekI47g10(androidx.compose.ui.Modifier modifier, float f) {
        return androidx.compose.ui.ComposeUiFlags.isAdaptiveRefreshRateEnabled ? androidx.compose.ui.graphics.GraphicsLayerModifierKt.m6144graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null).then(new androidx.compose.ui.FrameRateElement(f)) : modifier;
    }
}
