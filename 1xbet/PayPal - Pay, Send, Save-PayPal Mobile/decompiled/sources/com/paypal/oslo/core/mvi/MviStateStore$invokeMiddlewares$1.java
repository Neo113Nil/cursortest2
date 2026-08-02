package com.paypal.oslo.core.mvi;

/* JADX INFO: Add missing generic type declarations: [I] */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class MviStateStore$invokeMiddlewares$1<I> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<I, kotlin.Unit> {
    /* JADX WARN: Incorrect types in method signature: (TI;)V */
    public final void getHighSpeedVideoSizes(com.paypal.oslo.core.mvi.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((com.paypal.oslo.core.mvi.MviStateStore) this.receiver).onEvent(event);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
        getHighSpeedVideoSizes((com.paypal.oslo.core.mvi.Event) obj);
        return kotlin.Unit.INSTANCE;
    }

    MviStateStore$invokeMiddlewares$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.core.mvi.MviStateStore.class, "onEvent", "onEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
