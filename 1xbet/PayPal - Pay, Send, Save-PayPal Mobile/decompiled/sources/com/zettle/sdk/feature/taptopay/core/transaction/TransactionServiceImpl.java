package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0005$%&'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JG\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00172\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00052\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJO\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u001f2\u001e\u0010!\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionServiceImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "Lcom/zettle/sdk/commons/network/NetworkClient;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequest;", "p1", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "p2", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult;", "", "", "p3", "abortPayment", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequest;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult;", "finalizePayment", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionCardPaymentResult;", "payment", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionRequest;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction;", "recoverTransactionRequest", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/commons/network/NetworkClient;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPaySignatureResult;", "p4", "signatureRequest", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;Lkotlin/jvm/functions/Function1;)V", "AbortResponseCallback", "CardResponseCallback", "FinalizeResponseCallback", "PermissiveSignatureResponseCallback", "TransactionRecoverCallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TransactionServiceImpl implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionService, com.zettle.sdk.core.log.Loggable {
    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionService
    public final void payment(com.zettle.sdk.commons.network.NetworkClient p0, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p1, com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequest p2, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend /softspace ".concat(java.lang.String.valueOf(p2)));
        p0.request("/softspace", p2.toString(), new com.zettle.sdk.feature.taptopay.core.transaction.TransactionServiceImpl.CardResponseCallback(p1, p3, com.zettle.sdk.commons.network.ResponseParser.INSTANCE.create()));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionService
    public final void finalizePayment(com.zettle.sdk.commons.network.NetworkClient p0, com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest p1, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p2, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult, ? extends java.lang.Throwable>, kotlin.Unit> p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend /softspace/finalize ".concat(java.lang.String.valueOf(p1)));
        p0.request("/softspace/finalize", p1.toString(), new com.zettle.sdk.feature.taptopay.core.transaction.TransactionServiceImpl.FinalizeResponseCallback(p3));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionService
    public final void abortPayment(com.zettle.sdk.commons.network.NetworkClient p0, com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest p1, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p2, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult, ? extends java.lang.Throwable>, kotlin.Unit> p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend /softspace/abort ".concat(java.lang.String.valueOf(p1)));
        p0.request("/softspace/abort", p1.toString(), new com.zettle.sdk.feature.taptopay.core.transaction.TransactionServiceImpl.AbortResponseCallback(p3));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionService
    public final void signatureRequest(com.zettle.sdk.commons.network.NetworkClient p0, com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest p1, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p2, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload p3, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult, ? extends java.lang.Throwable>, kotlin.Unit> p4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "");
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend /softspace/signature ".concat(java.lang.String.valueOf(p1)));
        p0.request("/softspace/signature", p1.toString(), new com.zettle.sdk.feature.taptopay.core.transaction.TransactionServiceImpl.PermissiveSignatureResponseCallback(p2, p4, com.zettle.sdk.commons.network.ResponseParser.INSTANCE.create(), p3));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionService
    public final void recoverTransactionRequest(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo p0, com.zettle.sdk.commons.network.NetworkClient p1, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable>, kotlin.Unit> p2) {
        java.lang.Object obj;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        java.util.Iterator<T> it = p1.getCookiesForRequest("/softspace").iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.Cookie) obj).name(), "RP-SESS")) {
                    break;
                }
            }
        }
        okhttp3.Cookie cookie = (okhttp3.Cookie) obj;
        if (cookie == null || (value = cookie.value()) == null) {
            p2.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(p0, com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError.INSTANCE)));
        } else {
            p1.request("cardpayment/approved", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sessionId", value)), new com.zettle.sdk.feature.taptopay.core.transaction.TransactionServiceImpl.TransactionRecoverCallback(p0, p2, com.zettle.sdk.commons.network.ResponseParser.INSTANCE.create()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R,\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionServiceImpl$CardResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionCardPaymentResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "Lcom/zettle/sdk/commons/network/ResponseParser;", "responseParser", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;Lcom/zettle/sdk/commons/network/ResponseParser;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/commons/network/ResponseParser;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CardResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.zettle.sdk.commons.network.ResponseParser getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        public CardResponseCallback(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult, ? extends java.lang.Throwable>, kotlin.Unit> function1, com.zettle.sdk.commons.network.ResponseParser responseParser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseParser, "");
            this.getHighSpeedVideoSizes = transactionInfo;
            this.Camera2StreamConfigurationMap = function1;
            this.getHighSpeedVideoFpsRangesFor = responseParser;
        }

        @Override // com.zettle.sdk.core.log.Loggable
        /* renamed from: getLogTag */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onFailure(java.io.IOException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            if (e instanceof java.net.SocketTimeoutException) {
                this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByNetworkTimeout.INSTANCE)));
            } else if (e instanceof java.net.UnknownHostException) {
                this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError.INSTANCE)));
            } else {
                this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
            }
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.lang.String body = response.body();
            int code = response.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend /softspace code : ");
            sb.append(code);
            sb.append(" ");
            sb.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
            if (response.getCode() == 200 && body != null) {
                if (!response.getIsSuccessful()) {
                    this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(null))));
                    return;
                }
                com.zettle.sdk.commons.network.Response parse = this.getHighSpeedVideoFpsRangesFor.parse(body);
                if (!parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                    this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, com.zettle.sdk.feature.taptopay.core.FailureReason.ParsingError.INSTANCE)));
                    return;
                }
                if (parse.getGetHighSpeedVideoSizes() != 200) {
                    int getHighSpeedVideoSizes = parse.getGetHighSpeedVideoSizes();
                    if (500 <= getHighSpeedVideoSizes && getHighSpeedVideoSizes < 600) {
                        response.invalidateUrl();
                    }
                    if (parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                        this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionDeclinedPayload(parse))));
                        return;
                    } else {
                        this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyPayload.INSTANCE)));
                        return;
                    }
                }
                com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload transactionPayload = com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionPayload(parse);
                java.lang.String state = transactionPayload.getState();
                if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.zettle.sdk.commons.network.JsonKt.EMV_STATE_ISSUE_APP_COMMAND)) {
                    this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionAppCommandPayload(parse))));
                    return;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.zettle.sdk.commons.network.JsonKt.EMV_STATE_COMMUNICATION_FINISHED)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(transactionPayload.getResult(), com.zettle.sdk.commons.network.JsonKt.EMV_RESULT_TRANSACTION_APPROVED)) {
                            this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionApprovedPayload(parse))));
                            return;
                        } else {
                            this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionDeclinedPayload(parse))));
                            return;
                        }
                    }
                    this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(transactionPayload.getState()))));
                    return;
                }
            }
            if (response.getCode() == 500) {
                this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TransactionCardPaymentResult.Failed(this.getHighSpeedVideoSizes, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError("Internal Server Error"))));
            } else {
                this.Camera2StreamConfigurationMap.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionServiceImpl$FinalizeResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneFinalizeResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FinalizeResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {
        private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult, ? extends java.lang.Throwable>, kotlin.Unit> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeResponseCallback(kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult, ? extends java.lang.Throwable>, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
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
            this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.lang.String body = response.body();
            int code = response.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend /softspace/finalize code : ");
            sb.append(code);
            sb.append(" ");
            sb.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
            if (response.getCode() == 200) {
                this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.Finalized.INSTANCE));
            } else {
                this.getHighSpeedVideoFpsRanges.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneFinalizeResult.UnknownCode.INSTANCE));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionServiceImpl$AbortResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapOnPhoneAbortResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AbortResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult, ? extends java.lang.Throwable>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public AbortResponseCallback(kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult, ? extends java.lang.Throwable>, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }

        @Override // com.zettle.sdk.core.log.Loggable
        /* renamed from: getLogTag */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onFailure(java.io.IOException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.lang.String body = response.body();
            int code = response.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend /softspace/abort code : ");
            sb.append(code);
            sb.append(" ");
            sb.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
            if (response.getCode() == 200) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult.Aborted.INSTANCE));
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(com.zettle.sdk.feature.taptopay.core.transaction.TapOnPhoneAbortResult.UnknownCode.INSTANCE));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R,\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionServiceImpl$PermissiveSignatureResponseCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPaySignatureResult;", "", "", com.sun.jna.Callback.METHOD_NAME, "Lcom/zettle/sdk/commons/network/ResponseParser;", "responseParser", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "transactionApprovedPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;Lcom/zettle/sdk/commons/network/ResponseParser;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/commons/network/ResponseParser;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PermissiveSignatureResponseCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult, ? extends java.lang.Throwable>, kotlin.Unit> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.zettle.sdk.commons.network.ResponseParser Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        public PermissiveSignatureResponseCallback(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult, ? extends java.lang.Throwable>, kotlin.Unit> function1, com.zettle.sdk.commons.network.ResponseParser responseParser, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseParser, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
            this.getHighSpeedVideoFpsRanges = transactionInfo;
            this.getHighSpeedVideoSizes = function1;
            this.Camera2StreamConfigurationMap = responseParser;
            this.getHighSpeedVideoFpsRangesFor = transactionApprovedPayload;
        }

        @Override // com.zettle.sdk.core.log.Loggable
        /* renamed from: getLogTag */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onFailure(java.io.IOException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            if (e instanceof java.net.SocketTimeoutException) {
                this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed(this.getHighSpeedVideoFpsRanges, com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByNetworkTimeout.INSTANCE)));
            } else if (e instanceof java.net.UnknownHostException) {
                this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed(this.getHighSpeedVideoFpsRanges, com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError.INSTANCE)));
            } else {
                this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
            }
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.lang.String body = response.body();
            int code = response.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend /softspace/signature code : ");
            sb.append(code);
            sb.append(" ");
            sb.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
            if (response.getCode() == 200 && body != null) {
                if (!response.getIsSuccessful()) {
                    this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed(this.getHighSpeedVideoFpsRanges, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(null))));
                    return;
                }
                com.zettle.sdk.commons.network.Response parse = this.Camera2StreamConfigurationMap.parse(body);
                if (!parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                    this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed(this.getHighSpeedVideoFpsRanges, com.zettle.sdk.feature.taptopay.core.FailureReason.ParsingError.INSTANCE)));
                    return;
                }
                if (parse.getGetHighSpeedVideoSizes() != 200) {
                    int getHighSpeedVideoSizes = parse.getGetHighSpeedVideoSizes();
                    if (500 <= getHighSpeedVideoSizes && getHighSpeedVideoSizes < 600) {
                        response.invalidateUrl();
                    }
                    if (parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                        this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionDeclinedPayload(parse))));
                        return;
                    } else {
                        this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed(this.getHighSpeedVideoFpsRanges, com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyPayload.INSTANCE)));
                        return;
                    }
                }
                this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.updateCardPaymentUUID(this.getHighSpeedVideoFpsRangesFor, com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toSignaturePayload(parse).getCardPaymentUUID()))));
                return;
            }
            if (response.getCode() == 500) {
                this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPaySignatureResult.Failed(this.getHighSpeedVideoFpsRanges, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError("Internal Server Error"))));
            } else {
                this.getHighSpeedVideoSizes.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R/\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00058\u0007¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionServiceImpl$TransactionRecoverCallback;", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lkotlin/Function1;", "Lcom/izettle/android/core/data/result/Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction;", "", "", com.sun.jna.Callback.METHOD_NAME, "Lcom/zettle/sdk/commons/network/ResponseParser;", "responseParser", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;Lcom/zettle/sdk/commons/network/ResponseParser;)V", "Ljava/io/IOException;", "e", "onFailure", "(Ljava/io/IOException;)V", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "response", "onResponse", "(Lcom/zettle/sdk/commons/network/NetworkClient$Response;)V", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/commons/network/ResponseParser;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionRecoverCallback implements com.zettle.sdk.commons.network.NetworkClient.Callback, com.zettle.sdk.core.log.Loggable {
        private final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable>, kotlin.Unit> callback;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.zettle.sdk.commons.network.ResponseParser getHighSpeedVideoSizes;
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

        /* JADX WARN: Multi-variable type inference failed */
        public TransactionRecoverCallback(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, kotlin.jvm.functions.Function1<? super com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable>, kotlin.Unit> function1, com.zettle.sdk.commons.network.ResponseParser responseParser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseParser, "");
            this.info = transactionInfo;
            this.callback = function1;
            this.getHighSpeedVideoSizes = responseParser;
        }

        @Override // com.zettle.sdk.core.log.Loggable
        /* renamed from: getLogTag */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
            return this.info;
        }

        public final kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction, ? extends java.lang.Throwable>, kotlin.Unit> getCallback() {
            return this.callback;
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onFailure(java.io.IOException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            com.zettle.sdk.core.log.LogKt.debug(this, "Recover Tx request failed ".concat(java.lang.String.valueOf(e.getMessage())));
            this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(this.info, e instanceof java.net.UnknownHostException ? com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError.INSTANCE : new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(java.lang.String.valueOf(e.getMessage())))));
        }

        @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
        public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.lang.String body = response.body();
            int code = response.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("App <- Backend /softspace code : ");
            sb.append(code);
            sb.append(" ");
            sb.append(body);
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
            if (response.getCode() == 200 && body != null) {
                if (!response.getIsSuccessful()) {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(this.info, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(null))));
                    return;
                }
                com.zettle.sdk.commons.network.Response parse = this.getHighSpeedVideoSizes.parse(body);
                if (!parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(this.info, com.zettle.sdk.feature.taptopay.core.FailureReason.ParsingError.INSTANCE)));
                    return;
                }
                if (parse.getGetHighSpeedVideoSizes() != 200) {
                    int getHighSpeedVideoSizes = parse.getGetHighSpeedVideoSizes();
                    if (500 <= getHighSpeedVideoSizes && getHighSpeedVideoSizes < 600) {
                        response.invalidateUrl();
                    }
                    if (parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                        this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionDeclinedPayload(parse))));
                        return;
                    } else {
                        this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(this.info, com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyPayload.INSTANCE)));
                        return;
                    }
                }
                com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload transactionPayload = com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionPayload(parse);
                java.lang.String state = transactionPayload.getState();
                if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.zettle.sdk.commons.network.JsonKt.EMV_STATE_ISSUE_APP_COMMAND)) {
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionAppCommandPayload(parse))));
                    return;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.zettle.sdk.commons.network.JsonKt.EMV_STATE_COMMUNICATION_FINISHED)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(transactionPayload.getResult(), com.zettle.sdk.commons.network.JsonKt.EMV_RESULT_TRANSACTION_APPROVED)) {
                            this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionApprovedPayload(parse))));
                            return;
                        } else {
                            this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Success(com.zettle.sdk.feature.taptopay.core.transaction.models.ResponseKt.toTransactionDeclinedPayload(parse))));
                            return;
                        }
                    }
                    this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(this.info, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError(transactionPayload.getState()))));
                    return;
                }
            }
            if (response.getCode() == 500) {
                this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asSuccess(new com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction.Failed(this.info, new com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError("Internal Server Error"))));
            } else {
                this.callback.invoke(com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Invalid response")));
            }
        }
    }
}
