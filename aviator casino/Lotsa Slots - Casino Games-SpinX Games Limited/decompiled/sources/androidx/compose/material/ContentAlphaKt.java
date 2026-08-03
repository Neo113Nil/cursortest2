package androidx.compose.material;

/* compiled from: ContentAlpha.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalContentAlpha", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalContentAlpha", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentAlphaKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> LocalContentAlpha = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: androidx.compose.material.ContentAlphaKt$LocalContentAlpha$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Float invoke() {
            return java.lang.Float.valueOf(1.0f);
        }
    }, 1, null);

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
