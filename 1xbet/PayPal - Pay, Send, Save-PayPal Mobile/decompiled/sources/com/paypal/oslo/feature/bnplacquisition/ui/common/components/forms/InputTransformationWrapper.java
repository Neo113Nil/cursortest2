package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper;", "", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "p0", "Lkotlin/Function1;", "", "", "p1", "<init>", "(Lcom/paypal/pds/components/textinput/VisualTransformation;Lkotlin/jvm/functions/Function1;)V", "visualTransformation", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "getVisualTransformation", "()Lcom/paypal/pds/components/textinput/VisualTransformation;", "filteredOnValueChange", "Lkotlin/jvm/functions/Function1;", "getFilteredOnValueChange", "()Lkotlin/jvm/functions/Function1;", "Masked", "Currency", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper$Currency;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper$Masked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class InputTransformationWrapper {
    public static final int $stable = com.paypal.pds.components.textinput.VisualTransformation.$stable;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> filteredOnValueChange;
    private final com.paypal.pds.components.textinput.VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    private InputTransformationWrapper(com.paypal.pds.components.textinput.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        this.visualTransformation = visualTransformation;
        this.filteredOnValueChange = function1;
    }

    public final com.paypal.pds.components.textinput.VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getFilteredOnValueChange() {
        return this.filteredOnValueChange;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper$Masked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper;", "Lcom/paypal/pds/components/textinput/MaskedInputTransformation;", "transformation", "<init>", "(Lcom/paypal/pds/components/textinput/MaskedInputTransformation;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Masked extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputTransformationWrapper {
        public static final int $stable = com.paypal.pds.components.textinput.VisualTransformation.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Masked(com.paypal.pds.components.textinput.MaskedInputTransformation maskedInputTransformation) {
            super(maskedInputTransformation.getVisualTransformation(), maskedInputTransformation.getFilteredOnValueChange(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedInputTransformation, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper$Currency;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputTransformationWrapper;", "Lcom/paypal/pds/components/textinput/CurrencyInputTransformation;", "transformation", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "currencyVisualTransformation", "<init>", "(Lcom/paypal/pds/components/textinput/CurrencyInputTransformation;Lcom/paypal/pds/components/textinput/VisualTransformation;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Currency extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputTransformationWrapper {
        public static final int $stable = com.paypal.pds.components.textinput.VisualTransformation.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Currency(com.paypal.pds.components.textinput.CurrencyInputTransformation currencyInputTransformation, com.paypal.pds.components.textinput.VisualTransformation visualTransformation) {
            super(visualTransformation, currencyInputTransformation.getFilteredOnValueChange(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyInputTransformation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualTransformation, "");
        }
    }

    public /* synthetic */ InputTransformationWrapper(com.paypal.pds.components.textinput.VisualTransformation visualTransformation, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(visualTransformation, function1);
    }
}
