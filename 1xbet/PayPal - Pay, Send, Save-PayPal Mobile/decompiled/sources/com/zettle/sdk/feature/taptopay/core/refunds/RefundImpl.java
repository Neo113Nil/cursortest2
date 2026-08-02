package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0015R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal;", "refundInternal", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "", "amount", "", "refundReferenceId", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult;", "", "result", "doRefund", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "end", "()V", "paymentReferenceId", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "retrievePaymentInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundImpl implements com.zettle.sdk.feature.taptopay.core.refunds.Refund {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    private kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult, kotlin.Unit> getHighSpeedVideoSizes;

    public RefundImpl(kotlinx.coroutines.CoroutineScope coroutineScope, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal refundInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundInternal, "");
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = refundInternal;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.Refund
    public final void start() {
        this.getHighResolutionOutputSizeshNQ4ISI = com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(this.getHighSpeedVideoFpsRanges, new com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl$start$1(this, null));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.Refund
    public final void end() {
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.Job job2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (job2 != null && job2.isActive() && (job = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.Refund
    public final void retrievePaymentInfo(java.lang.String paymentReferenceId, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.Camera2StreamConfigurationMap = result;
        this.getHighSpeedVideoFpsRangesFor.dispatchAction(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.RetrievePaymentInfo(paymentReferenceId));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.Refund
    public final void doRefund(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, java.lang.Long amount, java.lang.String refundReferenceId, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult, kotlin.Unit> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoSizes = result;
        this.getHighSpeedVideoFpsRangesFor.dispatchAction(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.DoRefund(cardPaymentPayload, amount, refundReferenceId));
    }
}
