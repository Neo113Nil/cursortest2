package com.paypal.oslo.core.mvi;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\t\u0010\n\u001aS\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\b0\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\f*\u00020\u000b\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/mvi/UiState;", "S", "Lcom/paypal/oslo/core/mvi/UiEffect;", "E", "state", "effect", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "output", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/UiEffect;)Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Event;", com.visa.cbp.getEncExpo.warmup, "event", "unexpectedEvent", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/Event;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReducerHelperKt {
    public static /* synthetic */ arrow.core.Either output$default(com.paypal.oslo.core.mvi.UiState uiState, com.paypal.oslo.core.mvi.UiEffect uiEffect, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uiEffect = null;
        }
        return output(uiState, uiEffect);
    }

    public static final <S extends com.paypal.oslo.core.mvi.UiState, E extends com.paypal.oslo.core.mvi.UiEffect> arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<S, E>> output(S s, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(s, e));
    }

    public static final <S extends com.paypal.oslo.core.mvi.UiState, I extends com.paypal.oslo.core.mvi.Event, E extends com.paypal.oslo.core.mvi.UiEffect> arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<S, E>> unexpectedEvent(S s, I i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i, "");
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(s, i));
    }
}
