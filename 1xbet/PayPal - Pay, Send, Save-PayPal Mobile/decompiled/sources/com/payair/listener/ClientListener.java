package com.payair.listener;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0006J!\u0010\u001d\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\u0004H&¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/payair/listener/ClientListener;", "", "", "networkTokenReference", "", "onActivateToken", "(Ljava/lang/String;)V", "Lcom/payair/listener/model/EventError;", "eventError", "onAuthenticationCancelled", "(Lcom/payair/listener/model/EventError;)V", "onAuthenticationFailed", "onCardProvisionFailure", "onCardProvisionedCompleted", "onDeviceNotSecure", "()V", "Lcom/payair/listener/model/TransactionEventData;", "transactionEventData", "onPaymentAborted", "(Ljava/lang/String;Lcom/payair/listener/model/TransactionEventData;)V", "onPaymentAuthentication", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onPaymentAuthenticationSuccess", "(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V", "onPaymentCompleted", "onPaymentStopped", "(Lcom/payair/listener/model/TransactionEventData;)V", "onReplenishCompleted", "onReplenishFailed", "(Lcom/payair/listener/model/EventError;Ljava/lang/String;)V", "onResetSDK", "onTransactionReadyToBeResumed", "onTransactionRestartRequired", "onUploadUnlockKeys"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ClientListener {
    void onActivateToken(java.lang.String networkTokenReference);

    void onAuthenticationCancelled(com.payair.listener.model.EventError eventError);

    void onAuthenticationFailed(com.payair.listener.model.EventError eventError);

    void onCardProvisionFailure(com.payair.listener.model.EventError eventError);

    void onCardProvisionedCompleted(java.lang.String networkTokenReference);

    void onDeviceNotSecure();

    void onPaymentAborted(java.lang.String networkTokenReference, com.payair.listener.model.TransactionEventData transactionEventData);

    void onPaymentAuthentication();

    void onPaymentAuthenticationSuccess(androidx.biometric.BiometricPrompt.AuthenticationResult result);

    void onPaymentCompleted(java.lang.String networkTokenReference, com.payair.listener.model.TransactionEventData transactionEventData);

    void onPaymentStopped(com.payair.listener.model.TransactionEventData transactionEventData);

    void onReplenishCompleted(java.lang.String networkTokenReference);

    void onReplenishFailed(com.payair.listener.model.EventError eventError, java.lang.String networkTokenReference);

    void onResetSDK();

    void onTransactionReadyToBeResumed();

    void onTransactionRestartRequired();

    void onUploadUnlockKeys();
}
