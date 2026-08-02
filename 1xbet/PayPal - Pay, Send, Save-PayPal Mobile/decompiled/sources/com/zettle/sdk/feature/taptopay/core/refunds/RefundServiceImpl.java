package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundServiceImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPayload", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "checkRefundable", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Lkotlin/jvm/functions/Function1;)V", "", "request", "", "amount", "Lcom/zettle/sdk/feature/taptopay/core/refunds/DoRefundResult;", "refund", "(Lcom/zettle/sdk/commons/network/NetworkClient;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "paymentReferenceId", "Ljava/util/Currency;", "currency", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RetrievePaymentResult;", "retrievePayment", "(Lcom/zettle/sdk/commons/network/NetworkClient;Ljava/lang/String;Ljava/util/Currency;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundServiceImpl implements com.zettle.sdk.feature.taptopay.core.refunds.RefundService, com.zettle.sdk.core.log.Loggable {
    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.RefundService
    public final void retrievePayment(com.zettle.sdk.commons.network.NetworkClient networkClient, java.lang.String paymentReferenceId, java.util.Currency currency, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend resources/payment/card");
        networkClient.request("payment/card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("apiReference", paymentReferenceId)), new com.zettle.sdk.feature.taptopay.core.refunds.RetrieveCardPaymentResponseCallback(paymentReferenceId, new com.zettle.sdk.feature.taptopay.core.refunds.models.CardPaymentPayloadParser(currency, paymentReferenceId), callback));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.RefundService
    public final void checkRefundable(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPayload, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable>, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend resources/payment/card/refundable");
        networkClient.request("payment/card/refundable/".concat(java.lang.String.valueOf(java.net.URLEncoder.encode(cardPayload.getTransactionId(), kotlin.text.Charsets.UTF_8.name()))), kotlin.collections.MapsKt.emptyMap(), new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResponseCallback(cardPayload, callback));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.RefundService
    public final void refund(com.zettle.sdk.commons.network.NetworkClient networkClient, java.lang.String request, long amount, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable>, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend [Refund] ".concat(java.lang.String.valueOf(request)));
        networkClient.request("refund", request, new com.zettle.sdk.feature.taptopay.core.refunds.RefundResponseCallback(null, amount, callback, 1, null));
    }
}
