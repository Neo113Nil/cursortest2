package androidx.compose.material;

/* compiled from: Shapes.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalShapes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Shapes;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShapesKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Shapes> LocalShapes = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.material.Shapes>() { // from class: androidx.compose.material.ShapesKt$LocalShapes$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.material.Shapes invoke() {
            return new androidx.compose.material.Shapes(null, null, null, 7, null);
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Shapes> getLocalShapes() {
        return LocalShapes;
    }
}
