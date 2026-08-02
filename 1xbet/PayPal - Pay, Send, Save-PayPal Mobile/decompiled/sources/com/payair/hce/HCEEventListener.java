package com.payair.hce;

/* loaded from: classes4.dex */
public interface HCEEventListener {
    boolean ignoreFailedTransaction();

    void onAuthenticateUser(boolean z, int i, java.util.List<java.lang.String> list);

    void onAuthenticationError(int i, java.lang.CharSequence charSequence);

    void onAuthenticationFailed();

    void onCardProvisionCompleted(byte[] bArr);

    void onCardProvisionFailure(byte[] bArr, byte[] bArr2, java.lang.Exception exc);

    void onContactlessPaymentAborted(byte[] bArr, com.payair.hce.ContactlessAbortResaon contactlessAbortResaon, java.lang.Exception exc);

    void onContactlessPaymentCompleted(byte[] bArr, boolean z, java.lang.Long l, java.util.Currency currency, byte[] bArr2);

    void onContactlessPaymentIncident(byte[] bArr, java.lang.Exception exc);

    void onDeleteCardCompleted(byte[] bArr);

    void onDeleteCardFailed(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.Exception exc);

    void onDeviceNotSecure();

    void onIdentify(boolean z, int i, java.lang.String str);

    void onReplenishCompleted(byte[] bArr, int i);

    void onReplenishFailed(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.Exception exc);

    void onRequestSessionCompleted();

    void onRequestSessionFailed(byte[] bArr, byte[] bArr2, java.lang.Exception exc);

    void onSdkUnregistered();

    void onShowAuthenticateScreen(boolean z);

    void onSignUser(boolean z, int i, java.lang.String str);

    void onSystemHealthCompleted();

    void onSystemHealthFailure(byte[] bArr, byte[] bArr2, java.lang.Exception exc);

    void onTaskStatusCompleted(byte[] bArr);

    void onTaskStatusFailed(byte[] bArr, byte[] bArr2, java.lang.Exception exc);

    void onTransactionStopped();

    void onUploadUnlockKeys();

    void onUserValidationObtained(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult);

    void sdkTooOldNeedReset();

    void transactionCanBeResumed();
}
