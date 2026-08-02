package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R/\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00058\u0007¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CheckRefundableResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {
    private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable>, kotlin.Unit> callback;
    private final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckRefundableResponseCallback(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = cardPaymentPayload;
        this.callback = function1;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable>, kotlin.Unit> getCallback() {
        return this.callback;
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
    public final void onFailure(java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
    public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
        org.json.JSONObject Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        try {
            if (!response.getIsSuccessful()) {
                java.lang.String transactionId = this.getHighSpeedVideoSizes.getTransactionId();
                int code = response.getCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend [CheckRefundable:");
                sb.append(transactionId);
                sb.append("] http code ");
                sb.append(code);
                com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
                int code2 = response.getCode();
                if (401 <= code2 && code2 < 404) {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized.INSTANCE)));
                    return;
                } else if (code2 == 404) {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound.INSTANCE)));
                    return;
                } else {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE)));
                    return;
                }
            }
            java.lang.String body = response.body();
            java.lang.String transactionId2 = this.getHighSpeedVideoSizes.getTransactionId();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("App <- Backend [CheckRefundable:");
            sb2.append(transactionId2);
            sb2.append("] ");
            sb2.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb2.toString());
            java.lang.String str = body;
            if (str != null && str.length() != 0) {
                Camera2StreamConfigurationMap = com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceKt.Camera2StreamConfigurationMap(body);
                java.lang.Boolean highSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap != null ? com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceKt.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_IS_REFUNDABLE) : null;
                if (highSpeedVideoFpsRangesFor == null) {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
                    return;
                } else {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Success(new com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload(this.getHighSpeedVideoSizes, highSpeedVideoFpsRangesFor.booleanValue()))));
                    return;
                }
            }
            this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        } catch (java.io.IOException unused) {
            com.zettle.sdk.core.log.LogKt.debug(this, "Failed to parse card payment");
            this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        }
    }
}
