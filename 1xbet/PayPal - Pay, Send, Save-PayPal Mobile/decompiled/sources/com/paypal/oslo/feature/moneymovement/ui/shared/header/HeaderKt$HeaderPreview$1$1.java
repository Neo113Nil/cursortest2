package com.paypal.oslo.feature.moneymovement.ui.shared.header;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/shared/header/HeaderKt$HeaderPreview$1$1;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;", "Lkotlin/Function0;", "", "onAmountClicked", "Lkotlin/jvm/functions/Function0;", "getOnAmountClicked", "()Lkotlin/jvm/functions/Function0;", "onDestinationClicked", "getOnDestinationClicked", "onNoteClicked", "getOnNoteClicked"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderKt$HeaderPreview$1$1 implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onAmountClicked = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$HeaderPreview$1$1$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDestinationClicked = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$HeaderPreview$1$1$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNoteClicked = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$HeaderPreview$1$1$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    HeaderKt$HeaderPreview$1$1() {
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAmountClicked() {
        return this.onAmountClicked;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDestinationClicked() {
        return this.onDestinationClicked;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoteClicked() {
        return this.onNoteClicked;
    }
}
