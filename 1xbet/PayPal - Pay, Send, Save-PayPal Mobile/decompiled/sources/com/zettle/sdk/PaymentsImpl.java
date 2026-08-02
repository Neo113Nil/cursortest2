package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/PaymentsImpl;", "Lcom/zettle/sdk/Payments;", "Lcom/zettle/sdk/headless/HeadlessActionRegistry;", "registry", "<init>", "(Lcom/zettle/sdk/headless/HeadlessActionRegistry;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/OfflinePaymentEvent;", "offlinePaymentEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/PaymentParameters;", "parameters", "Lcom/zettle/sdk/PaymentSession;", "startPayment", "(Lcom/zettle/sdk/PaymentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/headless/HeadlessActionRegistry;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentsImpl implements com.zettle.sdk.Payments {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.headless.HeadlessActionRegistry getHighSpeedVideoSizes;

    public PaymentsImpl(com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headlessActionRegistry, "");
        this.getHighSpeedVideoSizes = headlessActionRegistry;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.Payments
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startPayment(com.zettle.sdk.PaymentParameters paymentParameters, kotlin.coroutines.Continuation<? super com.zettle.sdk.PaymentSession> continuation) {
        com.zettle.sdk.PaymentsImpl$startPayment$1 paymentsImpl$startPayment$1;
        int i;
        if (continuation instanceof com.zettle.sdk.PaymentsImpl$startPayment$1) {
            paymentsImpl$startPayment$1 = (com.zettle.sdk.PaymentsImpl$startPayment$1) continuation;
            if ((paymentsImpl$startPayment$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                paymentsImpl$startPayment$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = paymentsImpl$startPayment$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentsImpl$startPayment$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry = this.getHighSpeedVideoSizes;
                    com.zettle.sdk.headless.HeadlessAction.Payments.StartPayment startPayment = new com.zettle.sdk.headless.HeadlessAction.Payments.StartPayment(paymentParameters);
                    paymentsImpl$startPayment$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = headlessActionRegistry.execute(startPayment, paymentsImpl$startPayment$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((com.zettle.sdk.headless.HeadlessResult) obj).handleErrors$core_publicRelease();
            }
        }
        paymentsImpl$startPayment$1 = new com.zettle.sdk.PaymentsImpl$startPayment$1(this, continuation);
        java.lang.Object obj2 = paymentsImpl$startPayment$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentsImpl$startPayment$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return ((com.zettle.sdk.headless.HeadlessResult) obj2).handleErrors$core_publicRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.Payments
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object offlinePaymentEvents(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zettle.sdk.OfflinePaymentEvent>> continuation) {
        com.zettle.sdk.PaymentsImpl$offlinePaymentEvents$1 paymentsImpl$offlinePaymentEvents$1;
        int i;
        if (continuation instanceof com.zettle.sdk.PaymentsImpl$offlinePaymentEvents$1) {
            paymentsImpl$offlinePaymentEvents$1 = (com.zettle.sdk.PaymentsImpl$offlinePaymentEvents$1) continuation;
            if ((paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.headless.HeadlessActionRegistry headlessActionRegistry = this.getHighSpeedVideoSizes;
                    com.zettle.sdk.headless.HeadlessAction.Payments.OfflinePaymentEvents offlinePaymentEvents = com.zettle.sdk.headless.HeadlessAction.Payments.OfflinePaymentEvents.INSTANCE;
                    paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoSizes = 1;
                    obj = headlessActionRegistry.execute(offlinePaymentEvents, paymentsImpl$offlinePaymentEvents$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((com.zettle.sdk.headless.HeadlessResult) obj).handleErrors$core_publicRelease();
            }
        }
        paymentsImpl$offlinePaymentEvents$1 = new com.zettle.sdk.PaymentsImpl$offlinePaymentEvents$1(this, continuation);
        java.lang.Object obj2 = paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentsImpl$offlinePaymentEvents$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return ((com.zettle.sdk.headless.HeadlessResult) obj2).handleErrors$core_publicRelease();
    }
}
