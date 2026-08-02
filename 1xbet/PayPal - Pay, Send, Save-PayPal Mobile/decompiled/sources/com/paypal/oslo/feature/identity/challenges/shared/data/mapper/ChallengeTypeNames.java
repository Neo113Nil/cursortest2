package com.paypal.oslo.feature.identity.challenges.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/data/mapper/ChallengeTypeNames;", "", "<init>", "()V", "", "TEXT_OTP", "Ljava/lang/String;", "EMAIL_OTP", "WHATSAPP_OTP", "PHONE_OTP", "AUTHENTICATOR_APP", "SECURITY_QUESTION", "CREDIT_CARD", "SILENT_AUTH", "SKIP_AND_LOGIN", "CHANGE_PASSWORD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChallengeTypeNames {
    public static final int $stable = 0;
    public static final java.lang.String AUTHENTICATOR_APP = "AuthenticatorAppIdentityChallenge";
    public static final java.lang.String CHANGE_PASSWORD = "ChangePasswordIdentityChallenge";
    public static final java.lang.String CREDIT_CARD = "CreditCardIdentityChallenge";
    public static final java.lang.String EMAIL_OTP = "EmailOneTimePasscodeIdentityChallenge";
    public static final com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames INSTANCE = new com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames();
    public static final java.lang.String PHONE_OTP = "PhoneOneTimePasscodeIdentityChallenge";
    public static final java.lang.String SECURITY_QUESTION = "SecurityQuestionIdentityChallenge";
    public static final java.lang.String SILENT_AUTH = "SilentAuthenticationIdentityChallenge";
    public static final java.lang.String SKIP_AND_LOGIN = "SkipChangePasswordAndLoginIdentityChallenge";
    public static final java.lang.String TEXT_OTP = "TextOneTimePasscodeIdentityChallenge";
    public static final java.lang.String WHATSAPP_OTP = "WhatsappOneTimePasscodeIdentityChallenge";

    private ChallengeTypeNames() {
    }
}
