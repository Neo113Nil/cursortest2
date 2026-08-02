package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/Event;", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "<init>", "()V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "state", "Lkotlin/Function1;", "eventDispatcher", "onState", "(Lcom/paypal/oslo/core/mvi/UiState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SideEffectMiddleware<S extends com.paypal.oslo.core.mvi.UiState, I extends com.paypal.oslo.core.mvi.Event> implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<S, I> {
    public static final int $stable = 0;

    public abstract java.lang.Object onState(S s, kotlin.jvm.functions.Function1<? super I, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<S, I> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware$invoke$1(this, input, null), 3, null);
    }
}
