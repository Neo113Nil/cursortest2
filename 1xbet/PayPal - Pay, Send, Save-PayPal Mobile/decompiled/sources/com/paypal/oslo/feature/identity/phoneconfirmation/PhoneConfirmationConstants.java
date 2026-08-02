package com.paypal.oslo.feature.identity.phoneconfirmation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/PhoneConfirmationConstants;", "", "<init>", "()V", "PhoneValidation", "OTPValidation", "MockData", "NavKeys", "ReducerNames"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants();

    private PhoneConfirmationConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/PhoneConfirmationConstants$PhoneValidation;", "", "<init>", "()V", "", "MIN_PHONE_NUMBER_LENGTH", com.visa.cbp.getEncExpo.warmup, "MAX_PHONE_NUMBER_LENGTH", "MIN_COUNTRY_CODE_LENGTH", "MAX_COUNTRY_CODE_LENGTH", "MASKED_DIGITS_COUNT", "", "MASKING_CHARACTER", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneValidation {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.PhoneValidation INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.PhoneValidation();
        public static final int MASKED_DIGITS_COUNT = 4;
        public static final java.lang.String MASKING_CHARACTER = "•";
        public static final int MAX_COUNTRY_CODE_LENGTH = 3;
        public static final int MAX_PHONE_NUMBER_LENGTH = 15;
        public static final int MIN_COUNTRY_CODE_LENGTH = 1;
        public static final int MIN_PHONE_NUMBER_LENGTH = 7;

        private PhoneValidation() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/PhoneConfirmationConstants$OTPValidation;", "", "<init>", "()V", "", "OTP_CODE_LENGTH", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OTPValidation {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.OTPValidation INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.OTPValidation();
        public static final int OTP_CODE_LENGTH = 6;

        private OTPValidation() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/PhoneConfirmationConstants$MockData;", "", "<init>", "()V", "", "NETWORK_DELAY_MILLIS", "J", "", "MOCK_BLOCKED_PHONE", "Ljava/lang/String;", "MOCK_EXPIRED_OTP", "MOCK_VALID_OTP", "MOCK_DEVICE_ID", "PHONE_MASK_FORMAT_TEMPLATE", "VALIDATION_ERROR_EMPTY_PHONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MockData {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.MockData INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.MockData();
        public static final java.lang.String MOCK_BLOCKED_PHONE = "5555555555";
        public static final java.lang.String MOCK_DEVICE_ID = "android_device_12345";
        public static final java.lang.String MOCK_EXPIRED_OTP = "000000";
        public static final java.lang.String MOCK_VALID_OTP = "123456";
        public static final long NETWORK_DELAY_MILLIS = 1000;
        public static final java.lang.String PHONE_MASK_FORMAT_TEMPLATE = "(***) ***-";
        public static final java.lang.String VALIDATION_ERROR_EMPTY_PHONE = "Phone number cannot be empty";

        private MockData() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/PhoneConfirmationConstants$NavKeys;", "", "<init>", "()V", "", "PHONE_NUMBER_KEY", "Ljava/lang/String;", "MASKED_PHONE_NUMBER_KEY", "COUNTRY_CODE_KEY", "DEVICE_ID_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavKeys {
        public static final int $stable = 0;
        public static final java.lang.String COUNTRY_CODE_KEY = "countryCode";
        public static final java.lang.String DEVICE_ID_KEY = "deviceId";
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.NavKeys INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.NavKeys();
        public static final java.lang.String MASKED_PHONE_NUMBER_KEY = "maskedPhoneNumber";
        public static final java.lang.String PHONE_NUMBER_KEY = "phoneNumber";

        private NavKeys() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/PhoneConfirmationConstants$ReducerNames;", "", "<init>", "()V", "", "PHONE_CONFIRMATION", "Ljava/lang/String;", "OTP_VERIFICATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ReducerNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.ReducerNames INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.ReducerNames();
        public static final java.lang.String OTP_VERIFICATION = "OTPVerificationReducer";
        public static final java.lang.String PHONE_CONFIRMATION = "PhoneConfirmationReducer";

        private ReducerNames() {
        }
    }
}
