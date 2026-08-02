package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006Ji\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/android/threeds/utils/ThreeDsSdkUtils;", "", "<init>", "()V", "", "getSdkVersion", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "getSdkAppId", "(Landroid/content/Context;)Ljava/lang/String;", "getSdkEphemeralPublicKey", "Lcom/paypal/android/threeds/data/model/ChallengeResponse;", "challengeResponse", "", "oobContinue", "challengeDataEntry", "challengeNoEntry", "challengeCancel", "resendChallenge", "whitelistingDataEntry", "challengeHTMLDataEntry", "Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "getChallengeRequest", "(Lcom/paypal/android/threeds/data/model/ChallengeResponse;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/ChallengeRequest;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "protocolErrorType", "sdkTransId", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "getErrorMessage", "(Lcom/paypal/android/threeds/data/model/ProtocolErrorType;Lcom/paypal/android/threeds/data/model/ChallengeResponse;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/ErrorMessage;", "SDK_REFERENCE_NUMBER", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsSdkUtils {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.utils.ThreeDsSdkUtils INSTANCE = new com.paypal.android.threeds.utils.ThreeDsSdkUtils();
    public static final java.lang.String SDK_REFERENCE_NUMBER = "3DS_LOA_SDK_PAIN_020200_01020";

    private ThreeDsSdkUtils() {
    }

    public final java.lang.String getSdkVersion() {
        return com.paypal.android.threeds.BuildConfig.SDK_VERSION;
    }

    public final java.lang.String getSdkEphemeralPublicKey() {
        java.security.KeyPair createEphemeralKeyPair = com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.createEphemeralKeyPair();
        com.paypal.android.threeds.utils.CryptoUtils cryptoUtils = com.paypal.android.threeds.utils.CryptoUtils.INSTANCE;
        java.security.PublicKey publicKey = createEphemeralKeyPair.getPublic();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publicKey, "");
        return cryptoUtils.generateSdkEphemeralKey(publicKey);
    }

    public final com.paypal.android.threeds.data.model.ChallengeRequest getChallengeRequest(com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, java.lang.Boolean oobContinue, java.lang.String challengeDataEntry, java.lang.String challengeNoEntry, java.lang.String challengeCancel, java.lang.String resendChallenge, java.lang.String whitelistingDataEntry, java.lang.String challengeHTMLDataEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResponse, "");
        return new com.paypal.android.threeds.data.model.ChallengeRequest(challengeResponse.getThreeDsServerTransId(), challengeResponse.getAcsTransId(), null, challengeResponse.getMessageVersion(), challengeResponse.getSdkTransId(), null, com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.getRequestorAppUrl(), challengeDataEntry, challengeNoEntry, challengeCancel, oobContinue, resendChallenge, whitelistingDataEntry, challengeHTMLDataEntry, 36, null);
    }

    public final com.paypal.android.threeds.data.model.ErrorMessage getErrorMessage(com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType, com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse, java.lang.String sdkTransId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolErrorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTransId, "");
        return new com.paypal.android.threeds.data.model.ErrorMessage(challengeResponse != null ? challengeResponse.getThreeDsServerTransId() : null, challengeResponse != null ? challengeResponse.getAcsTransId() : null, null, protocolErrorType.getErrorCode(), protocolErrorType.getErrorComponent(), protocolErrorType.getErrorDescription(), protocolErrorType.getErrorDetail(), "CRes", "Erro", com.paypal.android.threeds.transaction.MessageVersion.INSTANCE.getCURRENT(), sdkTransId, 4, null);
    }

    public final java.lang.String getSdkAppId(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("ThreeSdkDsPrefs", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        java.lang.String string = sharedPreferences.getString("ThreeDsSdkAppId", null);
        if (string != null) {
            return string;
        }
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        sharedPreferences.edit().putString("ThreeDsSdkAppId", obj).apply();
        return obj;
    }
}
