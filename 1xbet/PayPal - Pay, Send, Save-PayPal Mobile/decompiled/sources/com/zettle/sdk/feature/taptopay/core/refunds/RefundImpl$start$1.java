package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl$start$1", f = "RefundImpl.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RefundImpl$start$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal refundInternal;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            refundInternal = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> effects = refundInternal.getEffects();
            final com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl refundImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (effects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl$start$1.1
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
                
                    r3 = r1.getHighSpeedVideoSizes;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects effects2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlin.jvm.functions.Function1 function1;
                    kotlin.jvm.functions.Function1 function12;
                    kotlin.jvm.functions.Function1 function13;
                    kotlin.jvm.functions.Function1 function14;
                    if (effects2 instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieved) {
                        function14 = com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl.this.Camera2StreamConfigurationMap;
                        if (function14 != null) {
                            function14.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieved) effects2).getCardPaymentPayload()));
                        }
                    } else if (effects2 instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieveFailed) {
                        function13 = com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl.this.Camera2StreamConfigurationMap;
                        if (function13 != null) {
                            function13.invoke(new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieveFailed) effects2).getReason()));
                        }
                    } else if (effects2 instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefunded) {
                        function12 = com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl.this.getHighSpeedVideoSizes;
                        if (function12 != null) {
                            function12.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult.Success(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefunded) effects2).getPayload()));
                        }
                    } else if ((effects2 instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefundFailed) && function1 != null) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult.Failed(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefundFailed) effects2).getReason()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl$start$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl$start$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefundImpl$start$1(com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl refundImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl$start$1> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = refundImpl;
    }
}
