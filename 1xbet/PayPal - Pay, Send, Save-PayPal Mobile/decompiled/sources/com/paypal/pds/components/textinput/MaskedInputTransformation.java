package com.paypal.pds.components.textinput;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "MaskedInputTransformation is no longer needed. Input filtering is now handled automatically by NumberMaskingInputTransformation when using VisualTransformation.Number or VisualTransformation.PhoneWithDialingCode with TextInput.")
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/pds/components/textinput/MaskedInputTransformation;", "", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "visualTransformation", "Lkotlin/Function1;", "", "", "onValueChange", "<init>", "(Lcom/paypal/pds/components/textinput/VisualTransformation;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "getVisualTransformation", "()Lcom/paypal/pds/components/textinput/VisualTransformation;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "filteredOnValueChange", "getFilteredOnValueChange", "()Lkotlin/jvm/functions/Function1;", "getFilteredOnValueChange$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaskedInputTransformation {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> filteredOnValueChange;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.pds.components.textinput.VisualTransformation visualTransformation;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "filteredOnValueChange is no longer needed. Use the regular onValueChange callback directly.", replaceWith = @kotlin.ReplaceWith(expression = "onValueChange", imports = {}))
    public static /* synthetic */ void getFilteredOnValueChange$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaskedInputTransformation(com.paypal.pds.components.textinput.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualTransformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.visualTransformation = visualTransformation;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.filteredOnValueChange = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.textinput.MaskedInputTransformation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.components.textinput.MaskedInputTransformation.$r8$lambda$UadME8B4m22ww_LwvMhAHYNdbh0(com.paypal.pds.components.textinput.MaskedInputTransformation.this, (java.lang.String) obj);
            }
        };
    }

    public final com.paypal.pds.components.textinput.VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getFilteredOnValueChange() {
        return this.filteredOnValueChange;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UadME8B4m22ww_LwvMhAHYNdbh0(com.paypal.pds.components.textinput.MaskedInputTransformation maskedInputTransformation, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        maskedInputTransformation.getHighSpeedVideoFpsRangesFor.invoke(str);
        return kotlin.Unit.INSTANCE;
    }
}
