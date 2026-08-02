package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/graphics/Color;", "LocalContentColor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalContentColor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentColorKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> LocalContentColor = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.material3.ContentColorKt$LocalContentColor$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ androidx.compose.ui.graphics.Color invoke() {
            return androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU());
        }
    }, 1, null);

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
