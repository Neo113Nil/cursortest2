package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class TextInputKt$sam$androidx_compose_foundation_text_input_KeyboardActionHandler$0 implements androidx.compose.foundation.text.input.KeyboardActionHandler, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoSizes;

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final /* synthetic */ void onKeyboardAction(kotlin.jvm.functions.Function0 function0) {
        this.getHighSpeedVideoSizes.invoke(function0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.foundation.text.input.KeyboardActionHandler) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    TextInputKt$sam$androidx_compose_foundation_text_input_KeyboardActionHandler$0(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }
}
