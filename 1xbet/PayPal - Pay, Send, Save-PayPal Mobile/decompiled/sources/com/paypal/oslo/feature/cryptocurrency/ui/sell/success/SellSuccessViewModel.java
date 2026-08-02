package com.paypal.oslo.feature.cryptocurrency.ui.sell.success;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/SellSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessArgs;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessEvent;", "event", "", "handleEvent$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessArgs;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellSuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEffect> effect;
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessArgs getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEffect> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/SellSuccessViewModel$Factory;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessArgs;", "args", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/SellSuccessViewModel;", "create", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/model/SellSuccessArgs;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/success/SellSuccessViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessArgs args);
    }

    @dagger.assisted.AssistedInject
    public SellSuccessViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessArgs sellSuccessArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sellSuccessArgs, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sellSuccessArgs;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState(sellSuccessArgs.getAssetSymbol(), sellSuccessArgs.getAssetName(), sellSuccessArgs.getAssetLogoUrl(), sellSuccessArgs.getCryptoAmount(), sellSuccessArgs.getFiatAmount()));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEvent.CloseClick.INSTANCE)) {
            this.getHighSpeedVideoFpsRanges.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEffect.NavigateBack.INSTANCE);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEvent.ActivityClick.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.tryEmit(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessEffect.NavigateToActivity.INSTANCE);
        }
    }
}
