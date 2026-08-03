package androidx.compose.material;

/* compiled from: ContentColor.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"LocalContentColor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/graphics/Color;", "getLocalContentColor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentColorKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> LocalContentColor = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.material.ContentColorKt$LocalContentColor$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.Color invoke() {
            return androidx.compose.ui.graphics.Color.m2103boximpl(m1348invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m1348invoke0d7_KjU() {
            return androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU();
        }
    }, 1, null);

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
