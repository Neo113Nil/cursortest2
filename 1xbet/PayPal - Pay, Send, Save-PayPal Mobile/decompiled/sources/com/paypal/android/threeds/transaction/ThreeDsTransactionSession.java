package com.paypal.android.threeds.transaction;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/android/threeds/transaction/ThreeDsTransactionSession;", "", "<init>", "()V", "Ljava/security/KeyPair;", "getEphemeralKeyPair", "()Ljava/security/KeyPair;", "createEphemeralKeyPair", "", "getSdkTransactionId", "()Ljava/lang/String;", "createSdkTransactionId", "", "cleanup", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/security/KeyPair;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "getChallengeStatusReceiver", "()Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "setChallengeStatusReceiver", "(Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;)V", "requestorAppUrl", "getRequestorAppUrl", "setRequestorAppUrl", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsTransactionSession {
    private static com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static java.security.KeyPair Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.String requestorAppUrl;
    public static final com.paypal.android.threeds.transaction.ThreeDsTransactionSession INSTANCE = new com.paypal.android.threeds.transaction.ThreeDsTransactionSession();
    public static final int $stable = 8;

    private ThreeDsTransactionSession() {
    }

    public final com.paypal.android.threeds.interfaces.ChallengeStatusReceiver getChallengeStatusReceiver() {
        return challengeStatusReceiver;
    }

    public final void setChallengeStatusReceiver(com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver2) {
        challengeStatusReceiver = challengeStatusReceiver2;
    }

    public final java.lang.String getRequestorAppUrl() {
        return requestorAppUrl;
    }

    public final void setRequestorAppUrl(java.lang.String str) {
        requestorAppUrl = str;
    }

    public final java.security.KeyPair getEphemeralKeyPair() {
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = createEphemeralKeyPair();
        }
        java.security.KeyPair keyPair = Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(keyPair, "");
        return keyPair;
    }

    public final java.security.KeyPair createEphemeralKeyPair() {
        java.security.KeyPair generateEphemeralKeyPair = com.paypal.android.threeds.utils.CryptoUtils.INSTANCE.generateEphemeralKeyPair();
        Camera2StreamConfigurationMap = generateEphemeralKeyPair;
        kotlin.jvm.internal.Intrinsics.checkNotNull(generateEphemeralKeyPair, "");
        return generateEphemeralKeyPair;
    }

    public final java.lang.String getSdkTransactionId() {
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighResolutionOutputSizeshNQ4ISI = createSdkTransactionId();
        }
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
        return str;
    }

    public final java.lang.String createSdkTransactionId() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        getHighResolutionOutputSizeshNQ4ISI = obj;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return obj;
    }

    public final void cleanup() {
        getHighResolutionOutputSizeshNQ4ISI = null;
        challengeStatusReceiver = null;
        Camera2StreamConfigurationMap = null;
        requestorAppUrl = null;
    }
}
