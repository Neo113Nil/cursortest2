package com.unity3d.ads.core.domain.events;

/* compiled from: EventObservers.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/events/EventObservers;", "", "operativeEventObserver", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "diagnosticEventObserver", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "transactionEventObserver", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "(Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;)V", "getDiagnosticEventObserver", "()Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "getOperativeEventObserver", "()Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "getTransactionEventObserver", "()Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventObservers {
    private final com.unity3d.ads.core.domain.events.DiagnosticEventObserver diagnosticEventObserver;
    private final com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver;
    private final com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver;

    public EventObservers(com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver, com.unity3d.ads.core.domain.events.DiagnosticEventObserver diagnosticEventObserver, com.unity3d.ads.core.domain.events.TransactionEventObserver transactionEventObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventObserver, "operativeEventObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventObserver, "diagnosticEventObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final com.unity3d.ads.core.domain.events.OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final com.unity3d.ads.core.domain.events.DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final com.unity3d.ads.core.domain.events.TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.events.EventObservers$invoke$1 eventObservers$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.domain.events.EventObservers eventObservers;
        com.unity3d.ads.core.domain.events.DiagnosticEventObserver diagnosticEventObserver;
        com.unity3d.ads.core.domain.events.EventObservers eventObservers2;
        if (continuation instanceof com.unity3d.ads.core.domain.events.EventObservers$invoke$1) {
            eventObservers$invoke$1 = (com.unity3d.ads.core.domain.events.EventObservers$invoke$1) continuation;
            if ((eventObservers$invoke$1.label & Integer.MIN_VALUE) != 0) {
                eventObservers$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = eventObservers$invoke$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eventObservers$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver = this.operativeEventObserver;
                    eventObservers$invoke$1.L$0 = this;
                    eventObservers$invoke$1.label = 1;
                    if (operativeEventObserver.invoke(eventObservers$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eventObservers = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eventObservers2 = (com.unity3d.ads.core.domain.events.EventObservers) eventObservers$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        eventObservers2.transactionEventObserver.invoke();
                        return kotlin.Unit.INSTANCE;
                    }
                    eventObservers = (com.unity3d.ads.core.domain.events.EventObservers) eventObservers$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                diagnosticEventObserver = eventObservers.diagnosticEventObserver;
                eventObservers$invoke$1.L$0 = eventObservers;
                eventObservers$invoke$1.label = 2;
                if (diagnosticEventObserver.invoke(eventObservers$invoke$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                eventObservers2 = eventObservers;
                eventObservers2.transactionEventObserver.invoke();
                return kotlin.Unit.INSTANCE;
            }
        }
        eventObservers$invoke$1 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1(this, continuation);
        java.lang.Object obj2 = eventObservers$invoke$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eventObservers$invoke$1.label;
        if (i != 0) {
        }
        diagnosticEventObserver = eventObservers.diagnosticEventObserver;
        eventObservers$invoke$1.L$0 = eventObservers;
        eventObservers$invoke$1.label = 2;
        if (diagnosticEventObserver.invoke(eventObservers$invoke$1) != coroutine_suspended) {
        }
    }
}
