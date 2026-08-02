package com.paypal.oslo.feature.debitcard.api.widget;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetBridgeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;", "provider", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;)V", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;", "getProvider", "()Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetBridgeViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider provider;

    @javax.inject.Inject
    public DebitCardWidgetBridgeViewModel(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider debitCardWidgetProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetProvider, "");
        this.provider = debitCardWidgetProvider;
    }

    public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider getProvider() {
        return this.provider;
    }
}
