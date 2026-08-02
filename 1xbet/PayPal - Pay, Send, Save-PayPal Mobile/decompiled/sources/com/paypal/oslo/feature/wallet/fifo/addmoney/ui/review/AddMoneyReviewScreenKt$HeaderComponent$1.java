package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddMoneyReviewScreenKt$HeaderComponent$1;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;", "Lkotlin/Function0;", "", "onAmountClicked", "Lkotlin/jvm/functions/Function0;", "getOnAmountClicked", "()Lkotlin/jvm/functions/Function0;", "onDestinationClicked", "getOnDestinationClicked", "onNoteClicked", "getOnNoteClicked"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddMoneyReviewScreenKt$HeaderComponent$1 implements com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onAmountClicked;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDestinationClicked = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$HeaderComponent$1$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNoteClicked = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$HeaderComponent$1$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    AddMoneyReviewScreenKt$HeaderComponent$1(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction, kotlin.Unit> function1) {
        this.onAmountClicked = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$HeaderComponent$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$HeaderComponent$1.$r8$lambda$KBQLHutWjNFn1VyFC4TG5OgZGCI(kotlin.jvm.functions.Function1.this);
            }
        };
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$KBQLHutWjNFn1VyFC4TG5OgZGCI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.NavigateBack.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
