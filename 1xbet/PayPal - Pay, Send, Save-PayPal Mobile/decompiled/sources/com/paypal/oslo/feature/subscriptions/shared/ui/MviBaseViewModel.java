package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0001H\u0004¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0002H&¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/MviBaseViewModel;", "State", "Effect", "Event", "Landroidx/lifecycle/ViewModel;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "update", "", "updateState", "(Lkotlin/jvm/functions/Function1;)V", "effect", "emitEffect", "event", "onEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MviBaseViewModel<State, Effect, Event> extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<Effect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<State> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<Effect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<State> uiState;

    public abstract void onEvent(Event event);

    public MviBaseViewModel(State state) {
        kotlinx.coroutines.flow.MutableStateFlow<State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(state);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = MutableStateFlow;
        kotlinx.coroutines.channels.Channel<Effect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<State> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<Effect> getUiEffect() {
        return this.uiEffect;
    }

    protected final void updateState(kotlin.jvm.functions.Function1<? super State, ? extends State> update) {
        amex.AMEXKernel aMEXKernel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(update, "");
        kotlinx.coroutines.flow.MutableStateFlow<State> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            aMEXKernel = (java.lang.Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(aMEXKernel, update.invoke(aMEXKernel)));
    }

    protected final void emitEffect(Effect effect) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(effect);
        if (kotlinx.coroutines.channels.ChannelResult.m24088isFailureimpl(obj)) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = kotlin.TuplesKt.to("effect", java.lang.String.valueOf(effect));
            pairArr[1] = kotlin.TuplesKt.to("className", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
            pairArr[2] = kotlin.TuplesKt.to("error", kotlinx.coroutines.channels.ChannelResult.m24090toStringimpl(obj));
            java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(obj);
            pairArr[3] = kotlin.TuplesKt.to("errorDescription", m24083exceptionOrNullimpl != null ? m24083exceptionOrNullimpl.getLocalizedMessage() : null);
            com.paypal.android.logger.Logger.w$default(logger, "failed to send effect", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        }
    }
}
