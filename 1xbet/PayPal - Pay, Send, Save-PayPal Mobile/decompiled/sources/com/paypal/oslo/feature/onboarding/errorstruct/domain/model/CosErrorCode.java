package com.paypal.oslo.feature.onboarding.errorstruct.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/CosErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_REQUEST", "UNPROCESSABLE_ENTITY", "COERCING_PARSE_VALUE", "NON_NULLABLE_VALUE_COERCED_AS_NULL", "INVALID_PARAMETER_SYNTAX", "INVALID_STRING_MIN_LENGTH", "INVALID_STRING_MAX_LENGTH", "ACCOUNT_CREATION_CREATE_ENTITY_ERROR", "CONTEXT_VALIDATION_ERROR", "CONTEXT_PARSING_ERROR", "INVALID_PHONE", com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.InitiateMaxAttempts, com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.INVALID_EMAIL, "CONFIRM_MAX_ATTEMPTS", com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.InitiateFail, "CONFIRM_FAIL", "EXPIRED_CODE", "INVALID_CODE", "SESSION_NOT_FOUND", "SESSION_SAVING_ERROR", "SESSION_FETCHING_ERROR", "INVALID_EMAIL_FORMAT", "EMAIL_STATUS_SERVICE_ERROR", "ADDRESS_SUGGEST_ERROR_VALIDATION", "ADDRESS_SUGGEST_FAIL", com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, "NAVIGATION_FLOW_NOT_AVAILABLE", "NAVIGATION_TRANSITION_ERROR", "NAVIGATION_CONFIGURATION_ERROR", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CosErrorCode {
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode ACCOUNT_CREATION_CREATE_ENTITY_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode ADDRESS_SUGGEST_ERROR_VALIDATION;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode ADDRESS_SUGGEST_FAIL;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode COERCING_PARSE_VALUE;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode CONFIRM_FAIL;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode CONFIRM_MAX_ATTEMPTS;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode CONTEXT_PARSING_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode CONTEXT_VALIDATION_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode EMAIL_STATUS_SERVICE_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode EXPIRED_CODE;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INITIATE_FAIL;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INITIATE_MAX_ATTEMPTS;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_ADDRESS;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_CODE;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_EMAIL;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_EMAIL_FORMAT;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_PARAMETER_SYNTAX;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_PHONE;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_REQUEST;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_STRING_MAX_LENGTH;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode INVALID_STRING_MIN_LENGTH;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode NAVIGATION_CONFIGURATION_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode NAVIGATION_FLOW_NOT_AVAILABLE;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode NAVIGATION_TRANSITION_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode NON_NULLABLE_VALUE_COERCED_AS_NULL;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode SESSION_FETCHING_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode SESSION_NOT_FOUND;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode SESSION_SAVING_ERROR;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode UNKNOWN;
    public static final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode UNPROCESSABLE_ENTITY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode[] getHighSpeedVideoSizes;

    private CosErrorCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_REQUEST", 0);
        INVALID_REQUEST = cosErrorCode;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode2 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("UNPROCESSABLE_ENTITY", 1);
        UNPROCESSABLE_ENTITY = cosErrorCode2;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode3 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("COERCING_PARSE_VALUE", 2);
        COERCING_PARSE_VALUE = cosErrorCode3;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode4 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("NON_NULLABLE_VALUE_COERCED_AS_NULL", 3);
        NON_NULLABLE_VALUE_COERCED_AS_NULL = cosErrorCode4;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode5 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_PARAMETER_SYNTAX", 4);
        INVALID_PARAMETER_SYNTAX = cosErrorCode5;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode6 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_STRING_MIN_LENGTH", 5);
        INVALID_STRING_MIN_LENGTH = cosErrorCode6;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode7 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_STRING_MAX_LENGTH", 6);
        INVALID_STRING_MAX_LENGTH = cosErrorCode7;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode8 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("ACCOUNT_CREATION_CREATE_ENTITY_ERROR", 7);
        ACCOUNT_CREATION_CREATE_ENTITY_ERROR = cosErrorCode8;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode9 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("CONTEXT_VALIDATION_ERROR", 8);
        CONTEXT_VALIDATION_ERROR = cosErrorCode9;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode10 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("CONTEXT_PARSING_ERROR", 9);
        CONTEXT_PARSING_ERROR = cosErrorCode10;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode11 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_PHONE", 10);
        INVALID_PHONE = cosErrorCode11;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode12 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.InitiateMaxAttempts, 11);
        INITIATE_MAX_ATTEMPTS = cosErrorCode12;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode13 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode(com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.ErrorCode.INVALID_EMAIL, 12);
        INVALID_EMAIL = cosErrorCode13;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode14 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("CONFIRM_MAX_ATTEMPTS", 13);
        CONFIRM_MAX_ATTEMPTS = cosErrorCode14;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode15 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.InitiateFail, 14);
        INITIATE_FAIL = cosErrorCode15;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode16 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("CONFIRM_FAIL", 15);
        CONFIRM_FAIL = cosErrorCode16;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode17 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("EXPIRED_CODE", 16);
        EXPIRED_CODE = cosErrorCode17;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode18 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_CODE", 17);
        INVALID_CODE = cosErrorCode18;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode19 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("SESSION_NOT_FOUND", 18);
        SESSION_NOT_FOUND = cosErrorCode19;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode20 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("SESSION_SAVING_ERROR", 19);
        SESSION_SAVING_ERROR = cosErrorCode20;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode21 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("SESSION_FETCHING_ERROR", 20);
        SESSION_FETCHING_ERROR = cosErrorCode21;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode22 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("INVALID_EMAIL_FORMAT", 21);
        INVALID_EMAIL_FORMAT = cosErrorCode22;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode23 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("EMAIL_STATUS_SERVICE_ERROR", 22);
        EMAIL_STATUS_SERVICE_ERROR = cosErrorCode23;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode24 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("ADDRESS_SUGGEST_ERROR_VALIDATION", 23);
        ADDRESS_SUGGEST_ERROR_VALIDATION = cosErrorCode24;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode25 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("ADDRESS_SUGGEST_FAIL", 24);
        ADDRESS_SUGGEST_FAIL = cosErrorCode25;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode26 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, 25);
        INVALID_ADDRESS = cosErrorCode26;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode27 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("NAVIGATION_FLOW_NOT_AVAILABLE", 26);
        NAVIGATION_FLOW_NOT_AVAILABLE = cosErrorCode27;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode28 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("NAVIGATION_TRANSITION_ERROR", 27);
        NAVIGATION_TRANSITION_ERROR = cosErrorCode28;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode29 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("NAVIGATION_CONFIGURATION_ERROR", 28);
        NAVIGATION_CONFIGURATION_ERROR = cosErrorCode29;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode30 = new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode("UNKNOWN", 29);
        UNKNOWN = cosErrorCode30;
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode[] cosErrorCodeArr = {cosErrorCode, cosErrorCode2, cosErrorCode3, cosErrorCode4, cosErrorCode5, cosErrorCode6, cosErrorCode7, cosErrorCode8, cosErrorCode9, cosErrorCode10, cosErrorCode11, cosErrorCode12, cosErrorCode13, cosErrorCode14, cosErrorCode15, cosErrorCode16, cosErrorCode17, cosErrorCode18, cosErrorCode19, cosErrorCode20, cosErrorCode21, cosErrorCode22, cosErrorCode23, cosErrorCode24, cosErrorCode25, cosErrorCode26, cosErrorCode27, cosErrorCode28, cosErrorCode29, cosErrorCode30};
        getHighSpeedVideoSizes = cosErrorCodeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cosErrorCodeArr);
    }

    public static com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode[] values() {
        return (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
