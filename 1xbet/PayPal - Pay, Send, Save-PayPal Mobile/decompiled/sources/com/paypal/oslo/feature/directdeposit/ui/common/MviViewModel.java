package com.paypal.oslo.feature.directdeposit.ui.common;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0007J#\u0010\r\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/common/MviViewModel;", com.visa.cbp.getEncExpo.warmup, "S", "E", "Landroidx/lifecycle/ViewModel;", "initialState", "<init>", "(Ljava/lang/Object;)V", "intent", "", "processIntent", "Lkotlin/Function1;", "reducer", "reduce", "(Lkotlin/jvm/functions/Function1;)V", "effect", "emitEffect", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MviViewModel<I, S, E> extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<E> effect;
    private final kotlinx.coroutines.flow.MutableSharedFlow<E> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableStateFlow<S> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<S> state;

    public abstract void processIntent(I intent);

    public MviViewModel(S s) {
        kotlinx.coroutines.flow.MutableStateFlow<S> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(s);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<E> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<S> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<E> getEffect() {
        return this.effect;
    }

    public final void reduce(kotlin.jvm.functions.Function1<? super S, ? extends S> reducer) {
        amex.AMEXKernel aMEXKernel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reducer, "");
        kotlinx.coroutines.flow.MutableStateFlow<S> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            aMEXKernel = (java.lang.Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(aMEXKernel, reducer.invoke(aMEXKernel)));
    }

    public final void emitEffect(E effect) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel$emitEffect$1(this, effect, null), 3, null);
    }
}
