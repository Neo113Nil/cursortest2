package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class TapToPayPaymentContainer$sam$androidx_lifecycle_Observer$0 implements androidx.view.Observer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.view.Observer
    public final /* synthetic */ void onChanged(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.view.Observer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    TapToPayPaymentContainer$sam$androidx_lifecycle_Observer$0(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
