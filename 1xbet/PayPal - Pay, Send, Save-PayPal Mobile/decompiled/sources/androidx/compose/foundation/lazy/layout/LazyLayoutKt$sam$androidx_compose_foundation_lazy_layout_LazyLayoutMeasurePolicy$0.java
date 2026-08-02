package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0 implements androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    public final /* synthetic */ androidx.compose.ui.layout.MeasureResult mo1785measure0kLqBqw(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        return (androidx.compose.ui.layout.MeasureResult) this.getHighResolutionOutputSizeshNQ4ISI.invoke(lazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints.m8542boximpl(j));
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0(kotlin.jvm.functions.Function2 function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
