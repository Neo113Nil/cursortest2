package com.paypal.pds.components.textinput;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "CurrencyInputTransformation is no longer needed. Input filtering is now handled automatically by TextInput when using VisualTransformation.Currency.", replaceWith = @kotlin.ReplaceWith(expression = "VisualTransformation.Currency()", imports = {"com.paypal.pds.components.textinput.VisualTransformation"}))
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/components/textinput/CurrencyInputTransformation;", "", "Lkotlin/Function1;", "", "", "onValueChange", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "filteredOnValueChange", "getFilteredOnValueChange", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyInputTransformation {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> filteredOnValueChange;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputTransformation(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
        this.filteredOnValueChange = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.textinput.CurrencyInputTransformation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.components.textinput.CurrencyInputTransformation.m22089$r8$lambda$BdLk5JtrVgBMb3DerFpAJXShk4(com.paypal.pds.components.textinput.CurrencyInputTransformation.this, (java.lang.String) obj);
            }
        };
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getFilteredOnValueChange() {
        return this.filteredOnValueChange;
    }

    /* renamed from: $r8$lambda$BdLk5Jt-rVgBMb3DerFpAJXShk4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22089$r8$lambda$BdLk5JtrVgBMb3DerFpAJXShk4(com.paypal.pds.components.textinput.CurrencyInputTransformation currencyInputTransformation, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        currencyInputTransformation.getHighSpeedVideoSizes.invoke(str);
        return kotlin.Unit.INSTANCE;
    }
}
