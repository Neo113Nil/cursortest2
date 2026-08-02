package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R,\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RetrieveCardPaymentResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "", "id", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/CardPaymentPayloadParser;", "parser", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RetrievePaymentResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Ljava/lang/String;Lcom/zettle/sdk/feature/taptopay/core/refunds/models/CardPaymentPayloadParser;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/CardPaymentPayloadParser;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RetrieveCardPaymentResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.models.CardPaymentPayloadParser getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public RetrieveCardPaymentResponseCallback(java.lang.String str, com.zettle.sdk.feature.taptopay.core.refunds.models.CardPaymentPayloadParser cardPaymentPayloadParser, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayloadParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = cardPaymentPayloadParser;
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
    public final void onFailure(java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        if (e instanceof java.net.UnknownHostException) {
            this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        } else {
            this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
        }
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
    public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
        org.json.JSONObject Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        try {
            if (!response.getIsSuccessful()) {
                java.lang.String str = this.getHighSpeedVideoSizes;
                int code = response.getCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend [RetrieveCardPayment:");
                sb.append(str);
                sb.append("] http code ");
                sb.append(code);
                com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
                int code2 = response.getCode();
                if (401 <= code2 && code2 < 404) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized.INSTANCE)));
                    return;
                } else if (code2 == 404) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound.INSTANCE)));
                    return;
                } else {
                    this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE)));
                    return;
                }
            }
            java.lang.String body = response.body();
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("App <- Backend [RetrieveCardPayment:");
            sb2.append(str2);
            sb2.append("] ");
            sb2.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb2.toString());
            java.lang.String str3 = body;
            if (str3 != null && str3.length() != 0) {
                Camera2StreamConfigurationMap = com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceKt.Camera2StreamConfigurationMap(body);
                if (Camera2StreamConfigurationMap == null) {
                    this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
                    return;
                } else {
                    this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Success(this.getHighResolutionOutputSizeshNQ4ISI.parse(Camera2StreamConfigurationMap))));
                    return;
                }
            }
            this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        } catch (java.io.IOException unused) {
            com.zettle.sdk.core.log.LogKt.debug(this, "Failed to parse card payment");
            this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        }
    }
}
