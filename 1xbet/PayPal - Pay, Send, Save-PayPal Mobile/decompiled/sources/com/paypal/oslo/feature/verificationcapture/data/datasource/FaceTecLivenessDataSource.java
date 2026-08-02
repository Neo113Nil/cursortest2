package com.paypal.oslo.feature.verificationcapture.data.datasource;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b&\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecLivenessDataSource;", "", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "restConfig", "<init>", "(Lcom/paypal/oslo/core/network/rest/config/RestConfig;)V", "Landroid/content/Context;", "context", "", "deviceKeyIdentifier", "productionKey", "licenseExpirationDate", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "", "initialize", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "setSessionToken", "(Ljava/lang/String;)V", "", "isReady", "()Z", "isWebFlow", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge;", "webViewBridge", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "performLivenessCheck$verification_capture_prodRelease", "(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/webview/FaceTecWebViewBridge;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "isStage", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FaceTecLivenessDataSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.rest.config.RestConfig getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;
    private static final java.lang.String getHighSpeedVideoFpsRanges = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmzPueQlt3cGWQ7f4zWRz\no3/2+aVf4pSOLrexMd5wboPOoRF0pktrMNA+Eeoes3U92gbZcqP/FSU1+gszmVsp\nIMIKDihoKA/IhvKNI0MU/6I9V6mAQzlAfcywwla25kgrYC+7zk/eXZSJW9tt1ktn\nMxOmsQEzL11qiMApcmrA5V6buVhc3GjhvoHCbBL3G1IBHVz8PVSOpSSa8Ou/YqmS\nA3tgEDQMrioYO6ttd7VUpxK4/y2j/988XbkljVlP9zU1a4MzTQjAkJpdOc9epDfz\nfDk0K9v0hJh7EFEiaQ1tvAsLCUxDVZ/tyTaXcDxn92h+B2kkU6inwL8bDgcvCwCE\nCwIDAQAB\n-----END PUBLIC KEY-----";

    @javax.inject.Inject
    public FaceTecLivenessDataSource(com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restConfig, "");
        this.getHighSpeedVideoFpsRanges = restConfig;
    }

    public final boolean isStage() {
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getBaseUrl(), (java.lang.CharSequence) "stage.paypal.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getBaseUrl(), (java.lang.CharSequence) "qa.paypal.com", false, 2, (java.lang.Object) null);
    }

    public final java.lang.Object initialize(final android.content.Context context, final java.lang.String str, java.lang.String str2, final java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, kotlin.Unit>> continuation) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec SDK already initialized", null, null, 6, null);
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final java.lang.String format = java.lang.String.format("appId       = \"com.paypal.*,com.yourcompany.PPClient\"\nexpiryDate  = %s\nkey        = %s\n", java.util.Arrays.copyOf(new java.lang.Object[]{str3, str2}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        try {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() == 3) {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) split$default.get(0));
                int parseInt2 = java.lang.Integer.parseInt((java.lang.String) split$default.get(1));
                int parseInt3 = java.lang.Integer.parseInt((java.lang.String) split$default.get(2));
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(parseInt, parseInt2 - 1, parseInt3);
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                if (calendar2.after(calendar)) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                    int i = calendar2.get(1);
                    int i2 = calendar2.get(2);
                    int i3 = calendar2.get(5);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i);
                    sb.append("-");
                    sb.append(i2 + 1);
                    sb.append("-");
                    sb.append(i3);
                    com.paypal.android.logger.Logger.w$default(logger, "FaceTec license may be expired", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expiration_date", str3), kotlin.TuplesKt.to("today", sb.toString())), null, 4, null);
                }
            }
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String concat = "Could not parse license expiration date: ".concat(java.lang.String.valueOf(str3));
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.w$default(logger2, concat, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
        }
        com.facetec.sdk.FaceTecSDK.preload(context);
        com.facetec.sdk.FaceTecSDK.initializeInProductionMode(context, format, str, getHighSpeedVideoFpsRanges, new com.facetec.sdk.FaceTecSDK.InitializeCallback() { // from class: com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource$initialize$2$1
            @Override // com.facetec.sdk.FaceTecSDK.InitializeCallback
            public final void onCompletion(boolean z) {
                if (z) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec SDK initialized successfully", null, null, 6, null);
                    com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource.this.getHighResolutionOutputSizeshNQ4ISI = true;
                    try {
                        com.paypal.oslo.feature.verificationcapture.util.FaceTecCustomization.INSTANCE.applyCustomization(context);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec UI customization applied", null, null, 6, null);
                    } catch (java.lang.Exception e2) {
                        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                        java.lang.String concat2 = "Failed to apply FaceTec customization: ".concat(java.lang.String.valueOf(e2.getMessage()));
                        java.lang.String message2 = e2.getMessage();
                        if (message2 == null) {
                            message2 = "Unknown";
                        }
                        com.paypal.android.logger.Logger.w$default(logger3, concat2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message2)), null, 4, null);
                    }
                    kotlinx.coroutines.CancellableContinuation<arrow.core.Either<com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, kotlin.Unit>> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(arrow.core.EitherKt.right(kotlin.Unit.INSTANCE)));
                    return;
                }
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec SDK initialization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceKeyIdentifier", str), kotlin.TuplesKt.to("licenseExpirationDate", str3), kotlin.TuplesKt.to("formattedProductionKey", format)), null, null, 12, null);
                kotlinx.coroutines.CancellableContinuation<arrow.core.Either<com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, kotlin.Unit>> cancellableContinuation2 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("SDK_INIT_FAILED", "Failed to initialize FaceTec SDK. Check license expiration date and credentials.", false, null, 12, null))));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void setSessionToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        this.getHighSpeedVideoFpsRangesFor = token;
    }

    /* renamed from: isReady, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.Object performLivenessCheck$verification_capture_prodRelease$default(com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge faceTecWebViewBridge, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        java.lang.String str3 = (i & 4) != 0 ? "" : str;
        java.lang.String str4 = (i & 8) != 0 ? "" : str2;
        if ((i & 16) != 0) {
            faceTecWebViewBridge = null;
        }
        return faceTecLivenessDataSource.performLivenessCheck$verification_capture_prodRelease(context, z2, str3, str4, faceTecWebViewBridge, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object performLivenessCheck$verification_capture_prodRelease(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.verificationcapture.webview.FaceTecWebViewBridge faceTecWebViewBridge, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, ? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource$performLivenessCheck$1 faceTecLivenessDataSource$performLivenessCheck$1;
        int i;
        android.app.Activity activity;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource$performLivenessCheck$1) {
            faceTecLivenessDataSource$performLivenessCheck$1 = (com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource$performLivenessCheck$1) continuation;
            if ((faceTecLivenessDataSource$performLivenessCheck$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                faceTecLivenessDataSource$performLivenessCheck$1.getInputFormats -= 2147483648;
                java.lang.Object obj = faceTecLivenessDataSource$performLivenessCheck$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = faceTecLivenessDataSource$performLivenessCheck$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!getGetHighResolutionOutputSizeshNQ4ISI()) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("SDK_NOT_INITIALIZED", "FaceTec SDK is not initialized", false, null, 12, null));
                    }
                    java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
                    if (str3 == null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("NO_SESSION_TOKEN", "No session token available", false, null, 12, null));
                    }
                    if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                    } else {
                        android.content.Context context2 = context;
                        while ((context2 instanceof android.content.ContextWrapper) && !(context2 instanceof android.app.Activity)) {
                            context2 = ((android.content.ContextWrapper) context2).getBaseContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "");
                        }
                        if (context2 instanceof android.app.Activity) {
                            activity = (android.app.Activity) context2;
                        } else {
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("NO_ACTIVITY_CONTEXT", "FaceTec requires Activity context to launch UI. Please ensure context is from an Activity.", false, null, 12, null));
                        }
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Starting FaceTec liveness check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("is_web_flow", java.lang.String.valueOf(z))), null, 4, null);
                    boolean z2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getBaseUrl(), (java.lang.CharSequence) "stage.paypal.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getBaseUrl(), (java.lang.CharSequence) "qa.paypal.com", false, 2, (java.lang.Object) null);
                    com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessProcessor faceTecLivenessProcessor = new com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessProcessor(activity, str3, null, null, null, z, str, str2, faceTecWebViewBridge, z2, 28, null);
                    faceTecLivenessDataSource$performLivenessCheck$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(context);
                    faceTecLivenessDataSource$performLivenessCheck$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    faceTecLivenessDataSource$performLivenessCheck$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    faceTecLivenessDataSource$performLivenessCheck$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(faceTecWebViewBridge);
                    faceTecLivenessDataSource$performLivenessCheck$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    faceTecLivenessDataSource$performLivenessCheck$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activity);
                    faceTecLivenessDataSource$performLivenessCheck$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(faceTecLivenessProcessor);
                    faceTecLivenessDataSource$performLivenessCheck$1.getOutputMinFrameDuration = z;
                    faceTecLivenessDataSource$performLivenessCheck$1.getHighResolutionOutputSizeshNQ4ISI = z2 ? 1 : 0;
                    faceTecLivenessDataSource$performLivenessCheck$1.getInputFormats = 1;
                    obj = faceTecLivenessProcessor.performLivenessCheck(faceTecLivenessDataSource$performLivenessCheck$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = faceTecLivenessDataSource$performLivenessCheck$1.getHighResolutionOutputSizeshNQ4ISI;
                    boolean z3 = faceTecLivenessDataSource$performLivenessCheck$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult) obj);
            }
        }
        faceTecLivenessDataSource$performLivenessCheck$1 = new com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource$performLivenessCheck$1(this, continuation);
        java.lang.Object obj2 = faceTecLivenessDataSource$performLivenessCheck$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = faceTecLivenessDataSource$performLivenessCheck$1.getInputFormats;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult) obj2);
    }
}
