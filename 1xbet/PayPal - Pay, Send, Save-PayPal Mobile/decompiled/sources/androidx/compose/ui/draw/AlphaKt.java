package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "alpha", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlphaKt {
    public static final androidx.compose.ui.Modifier alpha(androidx.compose.ui.Modifier modifier, float f) {
        return f == 1.0f ? modifier : androidx.compose.ui.graphics.GraphicsLayerModifierKt.m6144graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0, null, 520187, null);
    }
}
