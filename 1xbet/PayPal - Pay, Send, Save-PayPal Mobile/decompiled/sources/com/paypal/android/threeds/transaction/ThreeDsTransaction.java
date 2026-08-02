package com.paypal.android.threeds.transaction;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c"}, d2 = {"Lcom/paypal/android/threeds/transaction/ThreeDsTransaction;", "Lcom/paypal/android/threeds/interfaces/Transaction;", "", "messageVersion", "sdkTransactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/android/threeds/data/model/AuthenticationRequestParameters;", "getAuthenticationRequestParameters", "()Lcom/paypal/android/threeds/data/model/AuthenticationRequestParameters;", "Landroid/app/Activity;", "activity", "Lcom/paypal/android/threeds/data/model/ChallengeParameters;", "challengeParameters", "Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "challengeStatusReceiver", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "", "doChallenge", "(Landroid/app/Activity;Lcom/paypal/android/threeds/data/model/ChallengeParameters;Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;I)V", "Lcom/paypal/android/threeds/ui/customviews/ProgressDialog;", "getProgressView", "(Landroid/app/Activity;)Lcom/paypal/android/threeds/ui/customviews/ProgressDialog;", "close", "()V", "Ljava/lang/String;", "getMessageVersion", "()Ljava/lang/String;", "getSdkTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsTransaction implements com.paypal.android.threeds.interfaces.Transaction {
    public static final int $stable = 0;
    private final java.lang.String messageVersion;
    private final java.lang.String sdkTransactionId;

    public ThreeDsTransaction(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.messageVersion = str;
        this.sdkTransactionId = str2;
    }

    public final java.lang.String getMessageVersion() {
        return this.messageVersion;
    }

    public final java.lang.String getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    @Override // com.paypal.android.threeds.interfaces.Transaction
    public final com.paypal.android.threeds.data.model.AuthenticationRequestParameters getAuthenticationRequestParameters() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Getting authentication request parameters for transaction: ".concat(java.lang.String.valueOf(this.sdkTransactionId)), null, null, 6, null);
        try {
            java.lang.String valueOf = java.lang.String.valueOf(com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getDeviceData());
            java.lang.String str = this.sdkTransactionId;
            java.lang.String sdkAppId = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getSdkAppId();
            java.lang.String sdkEphemeralPublicKey = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getSdkEphemeralPublicKey();
            java.lang.String str2 = this.messageVersion;
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "AuthenticationRequestParameters created", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sdkAppId", sdkAppId), kotlin.TuplesKt.to("sdkReferenceNumber", com.paypal.android.threeds.utils.ThreeDsSdkUtils.SDK_REFERENCE_NUMBER), kotlin.TuplesKt.to("messageVersion", str2)), null, 4, null);
            return new com.paypal.android.threeds.data.model.AuthenticationRequestParameters(valueOf, str, sdkAppId, com.paypal.android.threeds.utils.ThreeDsSdkUtils.SDK_REFERENCE_NUMBER, sdkEphemeralPublicKey, str2);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to create AuthenticationRequestParameters: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.utils.ConstantUtil.SDK_RUNTIME_EXCEPTION, null, null, 6, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.utils.ConstantUtil.SDK_RUNTIME_EXCEPTION, null, null, 6, null);
        }
    }

    @Override // com.paypal.android.threeds.interfaces.Transaction
    public final void doChallenge(android.app.Activity activity, com.paypal.android.threeds.data.model.ChallengeParameters challengeParameters, com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver, int timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeStatusReceiver, "");
        com.paypal.android.threeds.transaction.MessageVersion messageVersion = com.paypal.android.threeds.transaction.MessageVersion.INSTANCE;
        java.lang.String messageVersion2 = challengeParameters.getMessageVersion();
        if (messageVersion2 == null) {
            messageVersion2 = this.messageVersion;
        }
        messageVersion.setCURRENT(messageVersion2);
        com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        java.lang.String str = this.sdkTransactionId;
        java.lang.String str2 = this.messageVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Starting challenge flow for transaction: ");
        sb.append(str);
        sb.append(", timeout: ");
        sb.append(timeout);
        sb.append("ms with the messageVersion: ");
        sb.append(str2);
        com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
        if (timeout < 5) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Invalid timeout value: ".concat(java.lang.String.valueOf(timeout)), null, null, new com.paypal.android.threeds.exceptions.InvalidInputException(com.paypal.android.threeds.utils.ConstantUtil.TIME_OUT_INVALID, null, 2, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.InvalidInputException(com.paypal.android.threeds.utils.ConstantUtil.TIME_OUT_INVALID, null, 2, null);
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Setting challenge status receiver and preparing challenge activity", null, null, 6, null);
        try {
            com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.setChallengeStatusReceiver(challengeStatusReceiver);
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.paypal.android.threeds.ChallengeActivity.class);
            intent.putExtra(com.paypal.android.threeds.utils.ConstantUtil.CHALLENGE_PARAMS, challengeParameters);
            intent.putExtra(com.paypal.android.threeds.utils.ConstantUtil.CHALLENGE_TIMEOUT, timeout);
            com.paypal.android.logger.Logger logger2 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            java.lang.String str3 = this.sdkTransactionId;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Launching ChallengeActivity for transaction: ");
            sb2.append(str3);
            com.paypal.android.logger.Logger.i$default(logger2, sb2.toString(), null, null, 6, null);
            activity.startActivity(intent);
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to start ChallengeActivity", null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.utils.ConstantUtil.SDK_RUNTIME_EXCEPTION, null, null, 6, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.utils.ConstantUtil.SDK_RUNTIME_EXCEPTION, null, null, 6, null);
        }
    }

    @Override // com.paypal.android.threeds.interfaces.Transaction
    public final com.paypal.android.threeds.ui.customviews.ProgressDialog getProgressView(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Creating progress view for transaction: ".concat(java.lang.String.valueOf(this.sdkTransactionId)), null, null, 6, null);
        try {
            if (activity.isDestroyed() || activity.isFinishing()) {
                com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Cannot create progress view", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isDestroyed", java.lang.Boolean.valueOf(activity.isDestroyed())), kotlin.TuplesKt.to("isFinishing", java.lang.Boolean.valueOf(activity.isFinishing()))), null, new com.paypal.android.threeds.exceptions.InvalidInputException(com.paypal.android.threeds.utils.ConstantUtil.ACTIVITY_INVALID, null, 2, null), 4, null);
                throw new com.paypal.android.threeds.exceptions.InvalidInputException(com.paypal.android.threeds.utils.ConstantUtil.ACTIVITY_INVALID, null, 2, null);
            }
            return new com.paypal.android.threeds.ui.customviews.ProgressDialog(activity);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Failed to create progress view: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.utils.ConstantUtil.SDK_RUNTIME_EXCEPTION, null, null, 6, null), 6, null);
            throw new com.paypal.android.threeds.exceptions.SDKRuntimeException(com.paypal.android.threeds.utils.ConstantUtil.SDK_RUNTIME_EXCEPTION, null, null, 6, null);
        }
    }

    @Override // com.paypal.android.threeds.interfaces.Transaction
    public final void close() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ThreeDsTransaction closing - transaction: ".concat(java.lang.String.valueOf(this.sdkTransactionId)), null, null, 6, null);
        com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.cleanup();
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ThreeDsTransaction cleanup completed", null, null, 6, null);
    }
}
