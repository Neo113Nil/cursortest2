package com.payair.listener;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H&¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010#\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u000eH&¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0011J7\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH&¢\u0006\u0004\b*\u0010\u0003J'\u0010,\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0006H&¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H&¢\u0006\u0004\b1\u0010)J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u0003J/\u00103\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b3\u0010\u0018J\u0017\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u0004H&¢\u0006\u0004\b5\u00106J'\u00108\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010-J\u000f\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010\u0003J/\u0010:\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b:\u0010\u0018J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0011J/\u0010=\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b=\u0010\u0018J\u000f\u0010>\u001a\u00020\u000bH&¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u000bH&¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000bH&¢\u0006\u0004\bD\u0010\u0003"}, d2 = {"Lcom/payair/listener/HceEventListenerImpl;", "Lcom/payair/hce/HCEEventListener;", "<init>", "()V", "", "isSuccessful", "", "statusCode", "", "", "missingInfo", "", "onAuthenticateUser", "(ZILjava/util/List;)V", "", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "onCardProvisionCompleted", "([B)V", "errorCode", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "onCardProvisionFailure", "([B[BLjava/lang/Exception;)V", "Lcom/payair/hce/ContactlessAbortResaon;", "contactlessAbortResaon", "onContactlessPaymentAborted", "([BLcom/payair/hce/ContactlessAbortResaon;Ljava/lang/Exception;)V", "isTransactionCompletedOnTheApplication", "", "amount", "Ljava/util/Currency;", "currency", "transactionOutcome", "onContactlessPaymentCompleted", "([BZLjava/lang/Long;Ljava/util/Currency;[B)V", "onContactlessPaymentIncident", "([BLjava/lang/Exception;)V", "onDeleteCardCompleted", "onDeleteCardFailed", "([B[B[BLjava/lang/Exception;)V", "onDeviceNotSecure", "autoStartToken", "onIdentify", "(ZILjava/lang/String;)V", "numberOfTransactionCredentials", "onReplenishCompleted", "([BI)V", "onReplenishFailed", "onRequestSessionCompleted", "onRequestSessionFailed", "isDeviceUnlock", "onShowAuthenticateScreen", "(Z)V", "redirectURL", "onSignUser", "onSystemHealthCompleted", "onSystemHealthFailure", "taskStatus", "onTaskStatusCompleted", "onTaskStatusFailed", "onTransactionStopped", "onUploadUnlockKeys", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onUserValidationObtained", "(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V", "sdkTooOldNeedReset"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HceEventListenerImpl implements com.payair.hce.HCEEventListener {
    @Override // com.payair.hce.HCEEventListener
    public abstract void onCardProvisionCompleted(byte[] tokenUniqueReference);

    @Override // com.payair.hce.HCEEventListener
    public abstract void onCardProvisionFailure(byte[] errorCode, byte[] errorMessage, java.lang.Exception exception);

    @Override // com.payair.hce.HCEEventListener
    public abstract void onContactlessPaymentAborted(byte[] tokenUniqueReference, com.payair.hce.ContactlessAbortResaon contactlessAbortResaon, java.lang.Exception exception);

    @Override // com.payair.hce.HCEEventListener
    public abstract void onContactlessPaymentCompleted(byte[] tokenUniqueReference, boolean isTransactionCompletedOnTheApplication, java.lang.Long amount, java.util.Currency currency, byte[] transactionOutcome);

    @Override // com.payair.hce.HCEEventListener
    public abstract void onContactlessPaymentIncident(byte[] tokenUniqueReference, java.lang.Exception exception);

    @Override // com.payair.hce.HCEEventListener
    public abstract void onDeviceNotSecure();

    @Override // com.payair.hce.HCEEventListener
    public abstract void onReplenishCompleted(byte[] tokenUniqueReference, int numberOfTransactionCredentials);

    @Override // com.payair.hce.HCEEventListener
    public abstract void onReplenishFailed(byte[] tokenUniqueReference, byte[] errorCode, byte[] errorMessage, java.lang.Exception exception);

    @Override // com.payair.hce.HCEEventListener
    public void onRequestSessionCompleted() {
    }

    @Override // com.payair.hce.HCEEventListener
    public abstract void onShowAuthenticateScreen(boolean isDeviceUnlock);

    @Override // com.payair.hce.HCEEventListener
    public void onSystemHealthCompleted() {
    }

    @Override // com.payair.hce.HCEEventListener
    public abstract void onTransactionStopped();

    @Override // com.payair.hce.HCEEventListener
    public abstract void onUploadUnlockKeys();

    @Override // com.payair.hce.HCEEventListener
    public abstract void onUserValidationObtained(androidx.biometric.BiometricPrompt.AuthenticationResult result);

    @Override // com.payair.hce.HCEEventListener
    public abstract void sdkTooOldNeedReset();

    @Override // com.payair.hce.HCEEventListener
    public void onTaskStatusFailed(byte[] errorCode, byte[] errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onTaskStatusCompleted(byte[] taskStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskStatus, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onSystemHealthFailure(byte[] errorCode, byte[] errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onSignUser(boolean isSuccessful, int statusCode, java.lang.String redirectURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectURL, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onRequestSessionFailed(byte[] errorCode, byte[] errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onIdentify(boolean isSuccessful, int statusCode, java.lang.String autoStartToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoStartToken, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onDeleteCardFailed(byte[] tokenUniqueReference, byte[] errorCode, byte[] errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onDeleteCardCompleted(byte[] tokenUniqueReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
    }

    @Override // com.payair.hce.HCEEventListener
    public void onAuthenticateUser(boolean isSuccessful, int statusCode, java.util.List<java.lang.String> missingInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingInfo, "");
    }
}
