package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "provisioningCoordinator", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;", "flowCapability", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;)V", "", "onProvisioningCompleted", "()V", "onProvisioningCanceled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProvisioningGateViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState> state;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateViewModel$Factory;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;", "flowCapability", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateViewModel;", "create", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;)Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel create(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability);
    }

    @dagger.assisted.AssistedInject
    public ProvisioningGateViewModel(com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator, @dagger.assisted.Assisted com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyProvisioningCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowCapability, "");
        this.Camera2StreamConfigurationMap = cryptocurrencyProvisioningCoordinator;
        this.getHighSpeedVideoSizes = flowCapability;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState> getState() {
        return this.state;
    }

    public final void onProvisioningCompleted() {
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Provisioned.INSTANCE);
    }

    public final void onProvisioningCanceled() {
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Canceled.INSTANCE);
    }
}
