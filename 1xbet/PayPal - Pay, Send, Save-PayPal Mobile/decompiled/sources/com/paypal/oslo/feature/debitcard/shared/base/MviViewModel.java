package com.paypal.oslo.feature.debitcard.shared.base;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B!\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00120\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR-\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c8EX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R!\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\"8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R!\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00020'8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/Event;", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/core/mvi/UiEffect;", "E", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/mvi/Reducer;", "reducer", "<init>", "(Lcom/paypal/oslo/core/mvi/Reducer;)V", "initialState", "()Lcom/paypal/oslo/core/mvi/UiState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "event", "", "processEvent", "(Lcom/paypal/oslo/core/mvi/Event;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/Reducer;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "stateStore$delegate", "Lkotlin/Lazy;", "getStateStore", "()Lcom/paypal/oslo/core/mvi/MviStateStore;", "stateStore", "Lkotlinx/coroutines/flow/StateFlow;", "uiState$delegate", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "uiEffect$delegate", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MviViewModel<S extends com.paypal.oslo.core.mvi.UiState, I extends com.paypal.oslo.core.mvi.Event, E extends com.paypal.oslo.core.mvi.UiEffect> extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.Reducer<S, I, E> getHighSpeedVideoSizes;

    /* renamed from: stateStore$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy stateStore;

    /* renamed from: uiEffect$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uiEffect;

    /* renamed from: uiState$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uiState;

    protected abstract S initialState();

    protected abstract java.lang.String stateStoreName();

    public MviViewModel(com.paypal.oslo.core.mvi.Reducer<S, I, E> reducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reducer, "");
        this.getHighSpeedVideoSizes = reducer;
        this.stateStore = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.base.MviViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.shared.base.MviViewModel.$r8$lambda$kSRvI52FB9XczKV2axn5nIOTXfw(com.paypal.oslo.feature.debitcard.shared.base.MviViewModel.this);
            }
        });
        this.uiState = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.base.MviViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.coroutines.flow.StateFlow uiState;
                uiState = com.paypal.oslo.feature.debitcard.shared.base.MviViewModel.this.getStateStore().getUiState();
                return uiState;
            }
        });
        this.uiEffect = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.base.MviViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.coroutines.flow.Flow uiEffect;
                uiEffect = com.paypal.oslo.feature.debitcard.shared.base.MviViewModel.this.getStateStore().getUiEffect();
                return uiEffect;
            }
        });
    }

    protected java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<S, I>> middlewares() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    protected final com.paypal.oslo.core.mvi.MviStateStore<S, I, E> getStateStore() {
        return (com.paypal.oslo.core.mvi.MviStateStore) this.stateStore.getValue();
    }

    public final kotlinx.coroutines.flow.StateFlow<S> getUiState() {
        return (kotlinx.coroutines.flow.StateFlow) this.uiState.getValue();
    }

    public final kotlinx.coroutines.flow.Flow<E> getUiEffect() {
        return (kotlinx.coroutines.flow.Flow) this.uiEffect.getValue();
    }

    public final void processEvent(I event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        getStateStore().onEvent(event);
    }

    public static /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore $r8$lambda$kSRvI52FB9XczKV2axn5nIOTXfw(com.paypal.oslo.feature.debitcard.shared.base.MviViewModel mviViewModel) {
        return new com.paypal.oslo.core.mvi.MviStateStore(mviViewModel.stateStoreName(), mviViewModel.initialState(), mviViewModel.getHighSpeedVideoSizes, mviViewModel.middlewares(), androidx.view.ViewModelKt.getViewModelScope(mviViewModel));
    }
}
