package com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/viewmodel/AcceptMoneyChoiceViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEvent;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEffect;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AcceptMoneyChoiceViewModel extends androidx.view.ViewModel {
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AcceptMoneyChoiceViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceState.Display("$250"));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.Camera2StreamConfigurationMap = Channel$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect> getEffect() {
        return this.effect;
    }

    public final void processEvent(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel$processEvent$1(event, this, null), 3, null);
    }
}
