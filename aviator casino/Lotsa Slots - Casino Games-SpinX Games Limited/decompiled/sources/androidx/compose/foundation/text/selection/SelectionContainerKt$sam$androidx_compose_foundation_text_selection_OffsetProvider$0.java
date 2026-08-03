package androidx.compose.foundation.text.selection;

/* compiled from: SelectionContainer.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements androidx.compose.foundation.text.selection.OffsetProvider, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function0 function;

    SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(kotlin.jvm.functions.Function0 function0) {
        this.function = function0;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.foundation.text.selection.OffsetProvider) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo850provideF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.function.invoke()).getPackedValue();
    }
}
