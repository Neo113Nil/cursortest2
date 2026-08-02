package com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/viewmodel/ThanksViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/reducer/ThanksReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/reducer/ThanksReducer;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "entity", "", "initialize", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;", "event", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/reducer/ThanksReducer;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThanksViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State> state;

    @javax.inject.Inject
    public ThanksViewModel(com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer.ThanksReducer thanksReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksReducer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = thanksReducer;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State(false, null, null, 7, null));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        onEvent(new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise(entity));
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(this.getHighResolutionOutputSizeshNQ4ISI.reduce(mutableStateFlow.getValue(), event));
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleBackPress.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel$onEvent$1(this, null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel$onEvent$2(event, this, null), 3, null);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleReturnToMerchantButtonClick.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
