package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R,\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/commons/network/ResponseParser;", "responseParser", "", "amount", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/DoRefundResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/zettle/sdk/commons/network/ResponseParser;JLkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/network/ResponseParser;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.commons.network.ResponseParser Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable>, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public RefundResponseCallback(com.zettle.sdk.commons.network.ResponseParser responseParser, long j, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = responseParser;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public /* synthetic */ RefundResponseCallback(com.zettle.sdk.commons.network.ResponseParser responseParser, long j, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.zettle.sdk.commons.network.ResponseParser.INSTANCE.create() : responseParser, j, function1);
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
    public final void onFailure(java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
    public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        try {
            if (!response.getIsSuccessful()) {
                int code = response.getCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend [Refund] http code ");
                sb.append(code);
                com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
                int code2 = response.getCode();
                if (401 <= code2 && code2 < 404) {
                    this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized.INSTANCE)));
                    return;
                } else if (code2 == 404) {
                    this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound.INSTANCE)));
                    return;
                } else {
                    this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE)));
                    return;
                }
            }
            java.lang.String body = response.body();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("App <- Backend [Refund] ");
            sb2.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb2.toString());
            java.lang.String str = body;
            if (str != null && str.length() != 0) {
                com.zettle.sdk.commons.network.Response parse = this.Camera2StreamConfigurationMap.parse(body);
                if (parse.getGetHighSpeedVideoSizes() != 200) {
                    int getHighSpeedVideoSizes = parse.getGetHighSpeedVideoSizes();
                    if (401 <= getHighSpeedVideoSizes && getHighSpeedVideoSizes < 404) {
                        this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized.INSTANCE)));
                        return;
                    } else if (getHighSpeedVideoSizes == 404) {
                        this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound.INSTANCE)));
                        return;
                    } else {
                        this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE)));
                        return;
                    }
                }
                if (!parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                    this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
                    return;
                }
                try {
                    this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Success(com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayloadKt.toRefundPayload(parse, this.getHighResolutionOutputSizeshNQ4ISI))));
                    return;
                } catch (java.io.IOException e) {
                    try {
                        this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundErrorsKt.toRefundFailureReason(((com.zettle.sdk.feature.taptopay.core.refunds.models.RefundErrorPayload) parse.payload(new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundErrorPayloadParser())).getError()))));
                        return;
                    } catch (java.io.IOException e2) {
                        kotlin.ExceptionsKt.addSuppressed(e, e2);
                        throw e;
                    }
                }
            }
            this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        } catch (java.io.IOException unused) {
            com.zettle.sdk.core.log.LogKt.debug(this, "Failed to refund payment");
            this.getHighSpeedVideoFpsRangesFor.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError.INSTANCE)));
        }
    }
}
