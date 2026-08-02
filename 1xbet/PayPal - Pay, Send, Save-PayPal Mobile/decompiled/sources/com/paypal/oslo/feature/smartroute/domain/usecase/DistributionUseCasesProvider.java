package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/DistributionUseCasesProvider;", "", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetDistributionConfigurationUseCase;", "getConfiguration", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;", "saveConfiguration", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/UpdatePyusdOptInStatusUseCase;", "updatePyusdOptInStatus", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;", "deactivateAutoReload", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetDistributionConfigurationUseCase;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;Lcom/paypal/oslo/feature/smartroute/domain/usecase/UpdatePyusdOptInStatusUseCase;Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;)V", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetDistributionConfigurationUseCase;", "getGetConfiguration", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetDistributionConfigurationUseCase;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;", "getSaveConfiguration", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/UpdatePyusdOptInStatusUseCase;", "getUpdatePyusdOptInStatus", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/UpdatePyusdOptInStatusUseCase;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;", "getDeactivateAutoReload", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionUseCasesProvider {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReload;
    private final com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase getConfiguration;
    private final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveConfiguration;
    private final com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase updatePyusdOptInStatus;

    @javax.inject.Inject
    public DistributionUseCasesProvider(com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase getDistributionConfigurationUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase updatePyusdOptInStatusUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReloadUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDistributionConfigurationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveDistributionConfigurationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePyusdOptInStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateAutoReloadUseCase, "");
        this.getConfiguration = getDistributionConfigurationUseCase;
        this.saveConfiguration = saveDistributionConfigurationUseCase;
        this.updatePyusdOptInStatus = updatePyusdOptInStatusUseCase;
        this.deactivateAutoReload = deactivateAutoReloadUseCase;
    }

    public final com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase getGetConfiguration() {
        return this.getConfiguration;
    }

    public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase getSaveConfiguration() {
        return this.saveConfiguration;
    }

    public final com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase getUpdatePyusdOptInStatus() {
        return this.updatePyusdOptInStatus;
    }

    public final com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase getDeactivateAutoReload() {
        return this.deactivateAutoReload;
    }
}
