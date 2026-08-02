package androidx.compose.foundation.text.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements androidx.compose.foundation.text.selection.OffsetProvider, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function0 getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo1994provideF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.getHighResolutionOutputSizeshNQ4ISI.invoke()).m5762unboximpl();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.foundation.text.selection.OffsetProvider) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(kotlin.jvm.functions.Function0 function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
