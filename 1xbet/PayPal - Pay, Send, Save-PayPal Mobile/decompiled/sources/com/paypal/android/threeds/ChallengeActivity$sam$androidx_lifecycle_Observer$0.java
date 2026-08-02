package com.paypal.android.threeds;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ChallengeActivity$sam$androidx_lifecycle_Observer$0 implements androidx.view.Observer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 Camera2StreamConfigurationMap;

    @Override // androidx.view.Observer
    public final /* synthetic */ void onChanged(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.view.Observer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    ChallengeActivity$sam$androidx_lifecycle_Observer$0(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = function1;
    }
}
