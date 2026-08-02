package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Shapes;", "LocalShapes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShapesKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Shapes> LocalShapes = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ShapesKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.material.Shapes highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.material.ShapesKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.Shapes getHighSpeedVideoSizes() {
        return new androidx.compose.material.Shapes(null, null, null, 7, null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Shapes> getLocalShapes() {
        return LocalShapes;
    }
}
