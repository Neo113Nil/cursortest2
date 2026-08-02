package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningViewModel;", "Landroidx/lifecycle/ViewModel;", "", "intent", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter;", "provisioningFlowRouter", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "route", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "getRoute", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoProvisioningViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult route;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningViewModel$Factory;", "", "", "intent", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel create(java.lang.String intent);
    }

    @dagger.assisted.AssistedInject
    public CryptoProvisioningViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter cryptoProvisioningFlowRouter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoProvisioningFlowRouter, "");
        this.getHighSpeedVideoSizes = str;
        this.route = cryptoProvisioningFlowRouter.routeProvisioningFlow(str);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult getRoute() {
        return this.route;
    }
}
