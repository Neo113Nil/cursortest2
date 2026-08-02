package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalContentAlpha", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalContentAlpha", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentAlphaKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> LocalContentAlpha = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ContentAlphaKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Float.valueOf(androidx.compose.material.ContentAlphaKt.$r8$lambda$Ab02HrwCkB_RyDmtcgO_rxSm3sE());
        }
    }, 1, null);

    public static /* synthetic */ float $r8$lambda$Ab02HrwCkB_RyDmtcgO_rxSm3sE() {
        return 1.0f;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
