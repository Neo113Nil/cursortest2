package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/ObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditWebViewObservabilityMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewObservabilityMiddleware$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewObservabilityMiddleware;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewObservabilityMiddleware;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public RevolvingCreditWebViewObservabilityMiddleware(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        super("RevolvingCreditWebViewObservabilityMiddleware");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.cpi = creditProductIdentifier;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
        return this.cpi;
    }
}
