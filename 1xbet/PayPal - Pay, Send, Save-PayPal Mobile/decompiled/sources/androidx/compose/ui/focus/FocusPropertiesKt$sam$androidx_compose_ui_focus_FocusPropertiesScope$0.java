package androidx.compose.ui.focus;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements androidx.compose.ui.focus.FocusPropertiesScope, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRangesFor;

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.ui.focus.FocusPropertiesScope) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(androidx.compose.ui.focus.FocusProperties focusProperties) {
        this.getHighSpeedVideoFpsRangesFor.invoke(focusProperties);
    }

    FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(kotlin.jvm.functions.Function1 function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
