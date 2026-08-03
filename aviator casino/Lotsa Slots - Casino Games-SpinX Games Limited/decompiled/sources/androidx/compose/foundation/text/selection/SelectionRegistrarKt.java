package androidx.compose.foundation.text.selection;

/* compiled from: SelectionRegistrar.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalSelectionRegistrar", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "getLocalSelectionRegistrar", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "hasSelection", "", "selectableId", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> LocalSelectionRegistrar = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.selection.SelectionRegistrar>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarKt$LocalSelectionRegistrar$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.foundation.text.selection.SelectionRegistrar invoke() {
            return null;
        }
    }, 1, null);

    public static final boolean hasSelection(androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j) {
        java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> subselections;
        if (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(java.lang.Long.valueOf(j));
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }
}
