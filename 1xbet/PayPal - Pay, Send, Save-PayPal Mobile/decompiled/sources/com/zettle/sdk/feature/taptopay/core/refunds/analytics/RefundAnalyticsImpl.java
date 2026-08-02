package com.zettle.sdk.feature.taptopay.core.refunds.analytics;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalyticsImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalytics;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "effects", "", "track", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "effect", "triggerEvent$core_publicRelease", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalyticInitRefund;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalyticInitRefund;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionFailed;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionSuccess;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundTransactionSuccess;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RetrieveTransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RetrieveTransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RetrieveTransactionSuccess;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RetrieveTransactionSuccess;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundAnalyticsImpl implements com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalytics {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionSuccess getHighSpeedVideoFpsRanges;
    private final com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionFailed getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.analytics.RetrieveTransactionSuccess getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.analytics.RetrieveTransactionFailed Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticInitRefund getHighSpeedVideoFpsRangesFor;

    public RefundAnalyticsImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticInitRefundImpl(analytics, appInfo);
        this.getHighSpeedVideoSizes = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RetrieveTransactionSuccessImpl(analytics, appInfo);
        this.Camera2StreamConfigurationMap = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RetrieveTransactionFailedImpl(analytics, appInfo);
        this.getHighSpeedVideoFpsRanges = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionSuccessImpl(analytics, appInfo);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundTransactionFailedImpl(analytics, appInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object track(kotlinx.coroutines.flow.SharedFlow<? extends com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> sharedFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl$track$1 refundAnalyticsImpl$track$1;
        int i;
        if (continuation instanceof com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl$track$1) {
            refundAnalyticsImpl$track$1 = (com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl$track$1) continuation;
            if ((refundAnalyticsImpl$track$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                refundAnalyticsImpl$track$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = refundAnalyticsImpl$track$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = refundAnalyticsImpl$track$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor.invoke();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl$track$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Object emit(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects effects, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl.this.triggerEvent$core_publicRelease(effects);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    refundAnalyticsImpl$track$1.getHighSpeedVideoSizes = 1;
                    if (sharedFlow.collect(flowCollector, refundAnalyticsImpl$track$1) == coroutine_suspended) {
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
        }
        refundAnalyticsImpl$track$1 = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl$track$1(this, continuation);
        java.lang.Object obj2 = refundAnalyticsImpl$track$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = refundAnalyticsImpl$track$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public final void triggerEvent$core_publicRelease(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects effect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
        if (effect instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieveFailed) {
            this.Camera2StreamConfigurationMap.invoke(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieveFailed) effect).getReason().toString());
            return;
        }
        if (effect instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieved) {
            this.getHighSpeedVideoSizes.invoke(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieved) effect).getCardPaymentPayload().getTransactionId());
            return;
        }
        if (effect instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefundFailed) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefundFailed) effect).getReason().toString());
        } else if (effect instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefunded) {
            com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefunded paymentRefunded = (com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefunded) effect;
            this.getHighSpeedVideoFpsRanges.invoke(paymentRefunded.getPayload().getTransactionId(), paymentRefunded.getPayload().getRefundedAmount());
        }
    }
}
