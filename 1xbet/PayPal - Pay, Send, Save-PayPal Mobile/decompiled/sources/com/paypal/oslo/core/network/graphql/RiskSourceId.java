package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getRawValue", "CardConnect", "Identity", "UserProfile", "Onboarding", "OneOnboarding", "Subscriptions", "DebitCard", "BusinessPayAndGetPaid", "P2P", "TapToPay", "Wallet"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RiskSourceId {
    private final java.lang.String rawValue;

    public RiskSourceId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.rawValue = str;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof com.paypal.oslo.core.network.graphql.RiskSourceId) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rawValue, ((com.paypal.oslo.core.network.graphql.RiskSourceId) other).rawValue);
        }
        return false;
    }

    public final int hashCode() {
        return this.rawValue.hashCode();
    }

    public final java.lang.String toString() {
        return this.rawValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$CardConnect;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "eligibilityRequest", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getEligibilityRequest", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class CardConnect {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.CardConnect INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.CardConnect();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId eligibilityRequest = new com.paypal.oslo.core.network.graphql.RiskSourceId("cardConnect.eligibilityRequest");

        private CardConnect() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getEligibilityRequest() {
            return eligibilityRequest;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$Identity;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "credentialVerification", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getCredentialVerification", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "login", "getLogin", "logout", "getLogout", "deviceBinding", "getDeviceBinding", "deviceUnbinding", "getDeviceUnbinding", "emailConfirmation", "getEmailConfirmation", "otpGeneration", "getOtpGeneration", "passkeyEnrollmentChallenge", "getPasskeyEnrollmentChallenge", "passkeyLoginChallenge", "getPasskeyLoginChallenge", "passwordRecovery", "getPasswordRecovery", "phoneConfirmationComplete", "getPhoneConfirmationComplete", "phoneConfirmationInitiate", "getPhoneConfirmationInitiate", "codeToTokenExchange", "getCodeToTokenExchange", "sessionTransfer", "getSessionTransfer", "stepupNotificationDeliver", "getStepupNotificationDeliver", "stepupNotificationLogin", "getStepupNotificationLogin", "stepupValidationChallenge", "getStepupValidationChallenge", "stepupValidationLogin", "getStepupValidationLogin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Identity {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.Identity INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.Identity();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId credentialVerification = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.credentialVerification");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId login = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.login");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId logout = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.logout");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId deviceBinding = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.deviceBinding");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId deviceUnbinding = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.deviceUnbinding");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId emailConfirmation = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.emailConfirmation");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId otpGeneration = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.otpGeneration");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId passkeyEnrollmentChallenge = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.passkeyEnrollmentChallenge");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId passkeyLoginChallenge = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.passkeyLoginChallenge");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId passwordRecovery = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.passwordRecovery");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId phoneConfirmationComplete = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.phoneConfirmationComplete");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId phoneConfirmationInitiate = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.phoneConfirmationInitiate");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId codeToTokenExchange = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.codeToTokenExchange");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId sessionTransfer = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.sessionTransfer");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId stepupNotificationDeliver = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.stepupNotificationDeliver");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId stepupNotificationLogin = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.stepupNotificationLogin");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId stepupValidationChallenge = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.stepupValidationChallenge");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId stepupValidationLogin = new com.paypal.oslo.core.network.graphql.RiskSourceId("identity.stepupValidationLogin");

        private Identity() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getCredentialVerification() {
            return credentialVerification;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getLogin() {
            return login;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getLogout() {
            return logout;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDeviceBinding() {
            return deviceBinding;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDeviceUnbinding() {
            return deviceUnbinding;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getEmailConfirmation() {
            return emailConfirmation;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getOtpGeneration() {
            return otpGeneration;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPasskeyEnrollmentChallenge() {
            return passkeyEnrollmentChallenge;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPasskeyLoginChallenge() {
            return passkeyLoginChallenge;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPasswordRecovery() {
            return passwordRecovery;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPhoneConfirmationComplete() {
            return phoneConfirmationComplete;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPhoneConfirmationInitiate() {
            return phoneConfirmationInitiate;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getCodeToTokenExchange() {
            return codeToTokenExchange;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getSessionTransfer() {
            return sessionTransfer;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getStepupNotificationDeliver() {
            return stepupNotificationDeliver;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getStepupNotificationLogin() {
            return stepupNotificationLogin;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getStepupValidationChallenge() {
            return stepupValidationChallenge;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getStepupValidationLogin() {
            return stepupValidationLogin;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$UserProfile;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "addAddress", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getAddAddress", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "addEmail", "getAddEmail", "addPhone", "getAddPhone", "deleteEmail", "getDeleteEmail", "deletePhone", "getDeletePhone", "deleteProfilePicture", "getDeleteProfilePicture", "initiateEmailConfirmation", "getInitiateEmailConfirmation", "initiatePhoneConfirmation", "getInitiatePhoneConfirmation", "makePrimaryEmail", "getMakePrimaryEmail", "makePrimaryPhone", "getMakePrimaryPhone", "reconfirmEmail", "getReconfirmEmail", "reinitiateEmailConfirmation", "getReinitiateEmailConfirmation", "reinitiatePhoneConfirmation", "getReinitiatePhoneConfirmation", "replacePrimaryEmail", "getReplacePrimaryEmail", "replacePhone", "getReplacePhone", "updateEmail", "getUpdateEmail", "updateProfilePicture", "getUpdateProfilePicture", "verifyEmailWithOtp", "getVerifyEmailWithOtp", "verifyPhone", "getVerifyPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class UserProfile {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.UserProfile();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId addAddress = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.addAddress");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId addEmail = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.addEmail");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId addPhone = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.addPhone");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId deleteEmail = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.deleteEmail");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId deletePhone = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.deletePhone");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId deleteProfilePicture = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.deleteProfilePicture");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId initiateEmailConfirmation = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.initiateEmailConfirmation");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId initiatePhoneConfirmation = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.initiatePhoneConfirmation");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId makePrimaryEmail = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.makePrimaryEmail");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId makePrimaryPhone = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.makePrimaryPhone");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId reconfirmEmail = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.reconfirmEmail");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId reinitiateEmailConfirmation = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.reinitiateEmailConfirmation");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId reinitiatePhoneConfirmation = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.reinitiatePhoneConfirmation");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId replacePrimaryEmail = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.replacePrimaryEmail");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId replacePhone = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.replacePhone");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updateEmail = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.updateEmail");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updateProfilePicture = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.updateProfilePicture");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId verifyEmailWithOtp = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.verifyEmailWithOtp");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId verifyPhone = new com.paypal.oslo.core.network.graphql.RiskSourceId("userProfile.verifyPhone");

        private UserProfile() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getAddAddress() {
            return addAddress;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getAddEmail() {
            return addEmail;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getAddPhone() {
            return addPhone;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDeleteEmail() {
            return deleteEmail;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDeletePhone() {
            return deletePhone;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDeleteProfilePicture() {
            return deleteProfilePicture;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getInitiateEmailConfirmation() {
            return initiateEmailConfirmation;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getInitiatePhoneConfirmation() {
            return initiatePhoneConfirmation;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getMakePrimaryEmail() {
            return makePrimaryEmail;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getMakePrimaryPhone() {
            return makePrimaryPhone;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReconfirmEmail() {
            return reconfirmEmail;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReinitiateEmailConfirmation() {
            return reinitiateEmailConfirmation;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReinitiatePhoneConfirmation() {
            return reinitiatePhoneConfirmation;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReplacePrimaryEmail() {
            return replacePrimaryEmail;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReplacePhone() {
            return replacePhone;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdateEmail() {
            return updateEmail;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdateProfilePicture() {
            return updateProfilePicture;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getVerifyEmailWithOtp() {
            return verifyEmailWithOtp;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getVerifyPhone() {
            return verifyPhone;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$Onboarding;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "createAccount", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getCreateAccount", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "emailConfirmationConfirm", "getEmailConfirmationConfirm", "emailConfirmationInitiate", "getEmailConfirmationInitiate", "emailConfirmationResend", "getEmailConfirmationResend", "phoneConfirmationConfirm", "getPhoneConfirmationConfirm", "phoneConfirmationInitiate", "getPhoneConfirmationInitiate", "phoneConfirmationResend", "getPhoneConfirmationResend", "publicCredentialMetadata", "getPublicCredentialMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Onboarding {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.Onboarding();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId createAccount = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.createAccount");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId emailConfirmationConfirm = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.emailConfirmationConfirm");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId emailConfirmationInitiate = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.emailConfirmationInitiate");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId emailConfirmationResend = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.emailConfirmationResend");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId phoneConfirmationConfirm = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.phoneConfirmationConfirm");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId phoneConfirmationInitiate = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.phoneConfirmationInitiate");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId phoneConfirmationResend = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.phoneConfirmationResend");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId publicCredentialMetadata = new com.paypal.oslo.core.network.graphql.RiskSourceId("onboarding.publicCredentialMetadata");

        private Onboarding() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getCreateAccount() {
            return createAccount;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getEmailConfirmationConfirm() {
            return emailConfirmationConfirm;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getEmailConfirmationInitiate() {
            return emailConfirmationInitiate;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getEmailConfirmationResend() {
            return emailConfirmationResend;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPhoneConfirmationConfirm() {
            return phoneConfirmationConfirm;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPhoneConfirmationInitiate() {
            return phoneConfirmationInitiate;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPhoneConfirmationResend() {
            return phoneConfirmationResend;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPublicCredentialMetadata() {
            return publicCredentialMetadata;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$OneOnboarding;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getFlow", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getGetFlow", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "submitAccountCreation", "getSubmitAccountCreation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class OneOnboarding {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.OneOnboarding INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.OneOnboarding();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId getFlow = new com.paypal.oslo.core.network.graphql.RiskSourceId("oneOnboarding.getFlow");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId submitAccountCreation = new com.paypal.oslo.core.network.graphql.RiskSourceId("oneOnboarding.submitAccountCreation");

        private OneOnboarding() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getGetFlow() {
            return getFlow;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getSubmitAccountCreation() {
            return submitAccountCreation;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$Subscriptions;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "fundingInstruments", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getFundingInstruments", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "fundingInstrumentsByFI", "getFundingInstrumentsByFI", "updateFundingInstrument", "getUpdateFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Subscriptions {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.Subscriptions INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.Subscriptions();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId fundingInstruments = new com.paypal.oslo.core.network.graphql.RiskSourceId("subscriptions.fundingInstruments");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId fundingInstrumentsByFI = new com.paypal.oslo.core.network.graphql.RiskSourceId("subscriptions.fundingInstrumentsByFI");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updateFundingInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("subscriptions.updateFundingInstrument");

        private Subscriptions() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getFundingInstruments() {
            return fundingInstruments;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getFundingInstrumentsByFI() {
            return fundingInstrumentsByFI;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdateFundingInstrument() {
            return updateFundingInstrument;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$DebitCard;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "activatePhysicalDebitInstrument", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getActivatePhysicalDebitInstrument", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "createDebitInstrumentDigitizationData", "getCreateDebitInstrumentDigitizationData", "debitInstrumentCardCredential", "getDebitInstrumentCardCredential", "debitInstrumentPin", "getDebitInstrumentPin", "debitInstrumentTokenEligibilities", "getDebitInstrumentTokenEligibilities", "evaluateDebitInstrumentFundingOptions", "getEvaluateDebitInstrumentFundingOptions", "provisionDebitInstrument", "getProvisionDebitInstrument", "reissueDebitInstrument", "getReissueDebitInstrument", "replaceVirtualDebitInstrument", "getReplaceVirtualDebitInstrument", "requestPhysicalDebitInstrument", "getRequestPhysicalDebitInstrument", "setDebitInstrumentFundingOptions", "getSetDebitInstrumentFundingOptions", "setDebitInstrumentPin", "getSetDebitInstrumentPin", "unlockDebitInstrument", "getUnlockDebitInstrument", "updateDebitInstrumentBillingAddress", "getUpdateDebitInstrumentBillingAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DebitCard {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.DebitCard INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.DebitCard();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId activatePhysicalDebitInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.activatePhysicalDebitInstrument");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId createDebitInstrumentDigitizationData = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.createDebitInstrumentDigitizationData");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId debitInstrumentCardCredential = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.debitInstrumentCardCredential");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId debitInstrumentPin = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.debitInstrumentPin");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId debitInstrumentTokenEligibilities = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.debitInstrumentTokenEligibilities");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId evaluateDebitInstrumentFundingOptions = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.evaluateDebitInstrumentFundingOptions");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId provisionDebitInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.provisionDebitInstrument");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId reissueDebitInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.reissueDebitInstrument");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId replaceVirtualDebitInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.replaceVirtualDebitInstrument");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId requestPhysicalDebitInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.requestPhysicalDebitInstrument");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId setDebitInstrumentFundingOptions = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.setDebitInstrumentFundingOptions");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId setDebitInstrumentPin = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.setDebitInstrumentPin");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId unlockDebitInstrument = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.unlockDebitInstrument");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updateDebitInstrumentBillingAddress = new com.paypal.oslo.core.network.graphql.RiskSourceId("debitCard.updateDebitInstrumentBillingAddress");

        private DebitCard() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getActivatePhysicalDebitInstrument() {
            return activatePhysicalDebitInstrument;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getCreateDebitInstrumentDigitizationData() {
            return createDebitInstrumentDigitizationData;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDebitInstrumentCardCredential() {
            return debitInstrumentCardCredential;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDebitInstrumentPin() {
            return debitInstrumentPin;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getDebitInstrumentTokenEligibilities() {
            return debitInstrumentTokenEligibilities;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getEvaluateDebitInstrumentFundingOptions() {
            return evaluateDebitInstrumentFundingOptions;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getProvisionDebitInstrument() {
            return provisionDebitInstrument;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReissueDebitInstrument() {
            return reissueDebitInstrument;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getReplaceVirtualDebitInstrument() {
            return replaceVirtualDebitInstrument;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getRequestPhysicalDebitInstrument() {
            return requestPhysicalDebitInstrument;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getSetDebitInstrumentFundingOptions() {
            return setDebitInstrumentFundingOptions;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getSetDebitInstrumentPin() {
            return setDebitInstrumentPin;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUnlockDebitInstrument() {
            return unlockDebitInstrument;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdateDebitInstrumentBillingAddress() {
            return updateDebitInstrumentBillingAddress;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$BusinessPayAndGetPaid;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "ttp", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getTtp", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class BusinessPayAndGetPaid {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.BusinessPayAndGetPaid INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.BusinessPayAndGetPaid();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId ttp = new com.paypal.oslo.core.network.graphql.RiskSourceId("businessPayAndGetPaid.ttp");

        private BusinessPayAndGetPaid() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getTtp() {
            return ttp;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$P2P;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "addFinancialInstruments", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getAddFinancialInstruments", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "completePendingPaymentTransfer", "getCompletePendingPaymentTransfer", "executePaymentTransfer", "getExecutePaymentTransfer", "getPaymentDestinationOptions", "getGetPaymentDestinationOptions", "getPaymentRequest", "getGetPaymentRequest", "getPaymentTransfer", "getGetPaymentTransfer", "getPaymentTransferFlowConfiguration", "getGetPaymentTransferFlowConfiguration", "getPaymentTransferFxQuote", "getGetPaymentTransferFxQuote", "resolvePaymentContingencyForTransferAttempt", "getResolvePaymentContingencyForTransferAttempt", "resolvePlanContingencyForTransferAttempt", "getResolvePlanContingencyForTransferAttempt", "startPaymentTransferAttempt", "getStartPaymentTransferAttempt", "startPaymentTransferAttemptForSubflow", "getStartPaymentTransferAttemptForSubflow", "updatePaymentTransferAttemptAmountAndIntent", "getUpdatePaymentTransferAttemptAmountAndIntent", "updatePaymentTransferAttemptNote", "getUpdatePaymentTransferAttemptNote", "updatePaymentTransferAttemptReceiver", "getUpdatePaymentTransferAttemptReceiver", "updatePaymentTransferAttemptTransferType", "getUpdatePaymentTransferAttemptTransferType", "updatePaymentTransferAttemptCurrencyConversion", "getUpdatePaymentTransferAttemptCurrencyConversion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class P2P {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.P2P INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.P2P();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId addFinancialInstruments = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.addFinancialInstruments");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId completePendingPaymentTransfer = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.completePendingPaymentTransfer");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId executePaymentTransfer = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.executePaymentTransfer");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentDestinationOptions = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.getPaymentDestinationOptions");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentRequest = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.getPaymentRequest");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentTransfer = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.getPaymentTransfer");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentTransferFlowConfiguration = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.getPaymentTransferFlowConfiguration");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentTransferFxQuote = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.getPaymentTransferFxQuote");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId resolvePaymentContingencyForTransferAttempt = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.resolvePaymentContingencyForTransferAttempt");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId resolvePlanContingencyForTransferAttempt = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.resolvePlanContingencyForTransferAttempt");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId startPaymentTransferAttempt = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.startPaymentTransferAttempt");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId startPaymentTransferAttemptForSubflow = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.startPaymentTransferAttemptForSubflow");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptAmountAndIntent = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.updatePaymentTransferAttemptAmountAndIntent");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptNote = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.updatePaymentTransferAttemptNote");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptReceiver = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.updatePaymentTransferAttemptReceiver");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptTransferType = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.updatePaymentTransferAttemptTransferType");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptCurrencyConversion = new com.paypal.oslo.core.network.graphql.RiskSourceId("p2p.updatePaymentTransferAttemptCurrencyConversion");

        private P2P() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getAddFinancialInstruments() {
            return addFinancialInstruments;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getCompletePendingPaymentTransfer() {
            return completePendingPaymentTransfer;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getExecutePaymentTransfer() {
            return executePaymentTransfer;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getGetPaymentDestinationOptions() {
            return getPaymentDestinationOptions;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getGetPaymentRequest() {
            return getPaymentRequest;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getGetPaymentTransfer() {
            return getPaymentTransfer;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getGetPaymentTransferFlowConfiguration() {
            return getPaymentTransferFlowConfiguration;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getGetPaymentTransferFxQuote() {
            return getPaymentTransferFxQuote;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getResolvePaymentContingencyForTransferAttempt() {
            return resolvePaymentContingencyForTransferAttempt;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getResolvePlanContingencyForTransferAttempt() {
            return resolvePlanContingencyForTransferAttempt;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getStartPaymentTransferAttempt() {
            return startPaymentTransferAttempt;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getStartPaymentTransferAttemptForSubflow() {
            return startPaymentTransferAttemptForSubflow;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdatePaymentTransferAttemptAmountAndIntent() {
            return updatePaymentTransferAttemptAmountAndIntent;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdatePaymentTransferAttemptNote() {
            return updatePaymentTransferAttemptNote;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdatePaymentTransferAttemptReceiver() {
            return updatePaymentTransferAttemptReceiver;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdatePaymentTransferAttemptTransferType() {
            return updatePaymentTransferAttemptTransferType;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdatePaymentTransferAttemptCurrencyConversion() {
            return updatePaymentTransferAttemptCurrencyConversion;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$TapToPay;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "prepareAddCard", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getPrepareAddCard", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class TapToPay {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.TapToPay INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.TapToPay();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId prepareAddCard = new com.paypal.oslo.core.network.graphql.RiskSourceId("tapToPay.prepareAddCard");

        private TapToPay() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getPrepareAddCard() {
            return prepareAddCard;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/RiskSourceId$Wallet;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getAddCard", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OPERATION_NAME, "getUpdateCard", "removeCard", "getRemoveCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Wallet {
        public static final com.paypal.oslo.core.network.graphql.RiskSourceId.Wallet INSTANCE = new com.paypal.oslo.core.network.graphql.RiskSourceId.Wallet();
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId addCard = new com.paypal.oslo.core.network.graphql.RiskSourceId("wallet.addCard");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId updateCard = new com.paypal.oslo.core.network.graphql.RiskSourceId("wallet.updateCard");
        private static final com.paypal.oslo.core.network.graphql.RiskSourceId removeCard = new com.paypal.oslo.core.network.graphql.RiskSourceId("wallet.removeCard");

        private Wallet() {
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getAddCard() {
            return addCard;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getUpdateCard() {
            return updateCard;
        }

        public final com.paypal.oslo.core.network.graphql.RiskSourceId getRemoveCard() {
            return removeCard;
        }
    }
}
