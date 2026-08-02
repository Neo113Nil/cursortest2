package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UNKNOWN", "EXPIRED_CARD", "VALIDATION_ERROR", "INSTRUMENT_SHARING_LIMIT_EXCEEDED", "INSTRUMENT_COUNT_LIMIT_EXCEEDED", "RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED", "INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED", "USER_ACCOUNT_LIMITED", "USER_ACCOUNT_CLOSED", "CARD_BRAND_NOT_SUPPORTED", "COUNTRY_NOT_SUPPORTED", "CARD_NOT_ALLOWED", "INSTRUMENT_NOT_SUPPORTED", "INSTRUMENT_INVALID", "RISK_DECLINE_REDIRECT_AUTH_FLOW", "INSTRUMENT_BLOCKED", "INSTRUMENT_ON_HOLD", "INSTRUMENT_INACTIVE", "INVALID_ACCOUNT_NUMBER", "INVALID_SECURITY_CODE", "INVALID_EXPIRY", com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, "INVALID_ISSUER_DETAILS", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, "UNKNOWN_CARD_DECLINE", "VENDOR_TIMEOUT", "DEPENDENT_SERVICE_ERROR", "INTERNAL_ERROR", "RESOURCE_NOT_FOUND", "PREVIOUS_REQUEST_IN_PROGRESS", "ISSUER_DECLINE", "AUTHORIZATION_FAILED", "AUTHORIZATION_NOT_ELIGIBLE", "AUTHORIZATION_TIMEOUT", "AUTH_REJECTED_BY_AVS_NO_MATCH", "AUTH_REJECTED_BY_CVV_NO_MATCH", "AUTH_REJECTED_BY_EXPIRY_NO_MATCH", "AUTH_REJECTED_BY_ISSUER", "UNCONFIRMED_CARD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalAddCardErrorReason {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTHORIZATION_FAILED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTHORIZATION_NOT_ELIGIBLE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTHORIZATION_TIMEOUT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTH_REJECTED_BY_AVS_NO_MATCH;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTH_REJECTED_BY_CVV_NO_MATCH;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTH_REJECTED_BY_EXPIRY_NO_MATCH;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason AUTH_REJECTED_BY_ISSUER;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason CARD_BRAND_NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason CARD_NOT_ALLOWED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason COUNTRY_NOT_SUPPORTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason DEPENDENT_SERVICE_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason EXPIRED_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_BLOCKED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_COUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_INACTIVE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_INVALID;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_ON_HOLD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INSTRUMENT_SHARING_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INTERNAL_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INVALID_ACCOUNT_NUMBER;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INVALID_ADDRESS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INVALID_EXPIRY;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INVALID_ISSUER_DETAILS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason INVALID_SECURITY_CODE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason ISSUER_DECLINE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason PREVIOUS_REQUEST_IN_PROGRESS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason RESOURCE_NOT_FOUND;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason RISK_DECLINE_REDIRECT_AUTH_FLOW;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason RISK_DENIED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason UNCONFIRMED_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason UNKNOWN_CARD_DECLINE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason USER_ACCOUNT_CLOSED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason USER_ACCOUNT_LIMITED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason VALIDATION_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason VENDOR_TIMEOUT;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalAddCardErrorReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("UNKNOWN", 0, "UNKNOWN");
        UNKNOWN = externalAddCardErrorReason;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("EXPIRED_CARD", 1, "EXPIRED_CARD");
        EXPIRED_CARD = externalAddCardErrorReason2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("VALIDATION_ERROR", 2, "VALIDATION_ERROR");
        VALIDATION_ERROR = externalAddCardErrorReason3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_SHARING_LIMIT_EXCEEDED", 3, "INSTRUMENT_SHARING_LIMIT_EXCEEDED");
        INSTRUMENT_SHARING_LIMIT_EXCEEDED = externalAddCardErrorReason4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_COUNT_LIMIT_EXCEEDED", 4, "INSTRUMENT_COUNT_LIMIT_EXCEEDED");
        INSTRUMENT_COUNT_LIMIT_EXCEEDED = externalAddCardErrorReason5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED", 5, "RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED");
        RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED = externalAddCardErrorReason6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED", 6, "INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED");
        INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED = externalAddCardErrorReason7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("USER_ACCOUNT_LIMITED", 7, "USER_ACCOUNT_LIMITED");
        USER_ACCOUNT_LIMITED = externalAddCardErrorReason8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("USER_ACCOUNT_CLOSED", 8, "USER_ACCOUNT_CLOSED");
        USER_ACCOUNT_CLOSED = externalAddCardErrorReason9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason10 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("CARD_BRAND_NOT_SUPPORTED", 9, "CARD_BRAND_NOT_SUPPORTED");
        CARD_BRAND_NOT_SUPPORTED = externalAddCardErrorReason10;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason11 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("COUNTRY_NOT_SUPPORTED", 10, "COUNTRY_NOT_SUPPORTED");
        COUNTRY_NOT_SUPPORTED = externalAddCardErrorReason11;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason12 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("CARD_NOT_ALLOWED", 11, "CARD_NOT_ALLOWED");
        CARD_NOT_ALLOWED = externalAddCardErrorReason12;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason13 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_NOT_SUPPORTED", 12, "INSTRUMENT_NOT_SUPPORTED");
        INSTRUMENT_NOT_SUPPORTED = externalAddCardErrorReason13;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason14 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_INVALID", 13, "INSTRUMENT_INVALID");
        INSTRUMENT_INVALID = externalAddCardErrorReason14;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason15 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("RISK_DECLINE_REDIRECT_AUTH_FLOW", 14, "RISK_DECLINE_REDIRECT_AUTH_FLOW");
        RISK_DECLINE_REDIRECT_AUTH_FLOW = externalAddCardErrorReason15;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason16 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_BLOCKED", 15, "INSTRUMENT_BLOCKED");
        INSTRUMENT_BLOCKED = externalAddCardErrorReason16;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason17 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_ON_HOLD", 16, "INSTRUMENT_ON_HOLD");
        INSTRUMENT_ON_HOLD = externalAddCardErrorReason17;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason18 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INSTRUMENT_INACTIVE", 17, "INSTRUMENT_INACTIVE");
        INSTRUMENT_INACTIVE = externalAddCardErrorReason18;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason19 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INVALID_ACCOUNT_NUMBER", 18, "INVALID_ACCOUNT_NUMBER");
        INVALID_ACCOUNT_NUMBER = externalAddCardErrorReason19;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason20 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INVALID_SECURITY_CODE", 19, "INVALID_SECURITY_CODE");
        INVALID_SECURITY_CODE = externalAddCardErrorReason20;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason21 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INVALID_EXPIRY", 20, "INVALID_EXPIRY");
        INVALID_EXPIRY = externalAddCardErrorReason21;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason22 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, 21, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress);
        INVALID_ADDRESS = externalAddCardErrorReason22;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason23 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INVALID_ISSUER_DETAILS", 22, "INVALID_ISSUER_DETAILS");
        INVALID_ISSUER_DETAILS = externalAddCardErrorReason23;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason24 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, 23, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED);
        RISK_DENIED = externalAddCardErrorReason24;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason25 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("UNKNOWN_CARD_DECLINE", 24, "UNKNOWN_CARD_DECLINE");
        UNKNOWN_CARD_DECLINE = externalAddCardErrorReason25;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason26 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("VENDOR_TIMEOUT", 25, "VENDOR_TIMEOUT");
        VENDOR_TIMEOUT = externalAddCardErrorReason26;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason27 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("DEPENDENT_SERVICE_ERROR", 26, "DEPENDENT_SERVICE_ERROR");
        DEPENDENT_SERVICE_ERROR = externalAddCardErrorReason27;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason28 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("INTERNAL_ERROR", 27, "INTERNAL_ERROR");
        INTERNAL_ERROR = externalAddCardErrorReason28;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason29 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("RESOURCE_NOT_FOUND", 28, "RESOURCE_NOT_FOUND");
        RESOURCE_NOT_FOUND = externalAddCardErrorReason29;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason30 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("PREVIOUS_REQUEST_IN_PROGRESS", 29, "PREVIOUS_REQUEST_IN_PROGRESS");
        PREVIOUS_REQUEST_IN_PROGRESS = externalAddCardErrorReason30;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason31 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("ISSUER_DECLINE", 30, "ISSUER_DECLINE");
        ISSUER_DECLINE = externalAddCardErrorReason31;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason32 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTHORIZATION_FAILED", 31, "AUTHORIZATION_FAILED");
        AUTHORIZATION_FAILED = externalAddCardErrorReason32;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason33 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTHORIZATION_NOT_ELIGIBLE", 32, "AUTHORIZATION_NOT_ELIGIBLE");
        AUTHORIZATION_NOT_ELIGIBLE = externalAddCardErrorReason33;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason34 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTHORIZATION_TIMEOUT", 33, "AUTHORIZATION_TIMEOUT");
        AUTHORIZATION_TIMEOUT = externalAddCardErrorReason34;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason35 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTH_REJECTED_BY_AVS_NO_MATCH", 34, "AUTH_REJECTED_BY_AVS_NO_MATCH");
        AUTH_REJECTED_BY_AVS_NO_MATCH = externalAddCardErrorReason35;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason36 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTH_REJECTED_BY_CVV_NO_MATCH", 35, "AUTH_REJECTED_BY_CVV_NO_MATCH");
        AUTH_REJECTED_BY_CVV_NO_MATCH = externalAddCardErrorReason36;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason37 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTH_REJECTED_BY_EXPIRY_NO_MATCH", 36, "AUTH_REJECTED_BY_EXPIRY_NO_MATCH");
        AUTH_REJECTED_BY_EXPIRY_NO_MATCH = externalAddCardErrorReason37;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason38 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("AUTH_REJECTED_BY_ISSUER", 37, "AUTH_REJECTED_BY_ISSUER");
        AUTH_REJECTED_BY_ISSUER = externalAddCardErrorReason38;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason39 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("UNCONFIRMED_CARD", 38, "UNCONFIRMED_CARD");
        UNCONFIRMED_CARD = externalAddCardErrorReason39;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason40 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason("UNKNOWN__", 39, "UNKNOWN__");
        UNKNOWN__ = externalAddCardErrorReason40;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[] externalAddCardErrorReasonArr = {externalAddCardErrorReason, externalAddCardErrorReason2, externalAddCardErrorReason3, externalAddCardErrorReason4, externalAddCardErrorReason5, externalAddCardErrorReason6, externalAddCardErrorReason7, externalAddCardErrorReason8, externalAddCardErrorReason9, externalAddCardErrorReason10, externalAddCardErrorReason11, externalAddCardErrorReason12, externalAddCardErrorReason13, externalAddCardErrorReason14, externalAddCardErrorReason15, externalAddCardErrorReason16, externalAddCardErrorReason17, externalAddCardErrorReason18, externalAddCardErrorReason19, externalAddCardErrorReason20, externalAddCardErrorReason21, externalAddCardErrorReason22, externalAddCardErrorReason23, externalAddCardErrorReason24, externalAddCardErrorReason25, externalAddCardErrorReason26, externalAddCardErrorReason27, externalAddCardErrorReason28, externalAddCardErrorReason29, externalAddCardErrorReason30, externalAddCardErrorReason31, externalAddCardErrorReason32, externalAddCardErrorReason33, externalAddCardErrorReason34, externalAddCardErrorReason35, externalAddCardErrorReason36, externalAddCardErrorReason37, externalAddCardErrorReason38, externalAddCardErrorReason39, externalAddCardErrorReason40};
        getHighSpeedVideoSizes = externalAddCardErrorReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(externalAddCardErrorReasonArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalAddCardErrorReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UNKNOWN", "EXPIRED_CARD", "VALIDATION_ERROR", "INSTRUMENT_SHARING_LIMIT_EXCEEDED", "INSTRUMENT_COUNT_LIMIT_EXCEEDED", "RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED", "INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED", "USER_ACCOUNT_LIMITED", "USER_ACCOUNT_CLOSED", "CARD_BRAND_NOT_SUPPORTED", "COUNTRY_NOT_SUPPORTED", "CARD_NOT_ALLOWED", "INSTRUMENT_NOT_SUPPORTED", "INSTRUMENT_INVALID", "RISK_DECLINE_REDIRECT_AUTH_FLOW", "INSTRUMENT_BLOCKED", "INSTRUMENT_ON_HOLD", "INSTRUMENT_INACTIVE", "INVALID_ACCOUNT_NUMBER", "INVALID_SECURITY_CODE", "INVALID_EXPIRY", com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, "INVALID_ISSUER_DETAILS", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, "UNKNOWN_CARD_DECLINE", "VENDOR_TIMEOUT", "DEPENDENT_SERVICE_ERROR", "INTERNAL_ERROR", "RESOURCE_NOT_FOUND", "PREVIOUS_REQUEST_IN_PROGRESS", "ISSUER_DECLINE", "AUTHORIZATION_FAILED", "AUTHORIZATION_NOT_ELIGIBLE", "AUTHORIZATION_TIMEOUT", "AUTH_REJECTED_BY_AVS_NO_MATCH", "AUTH_REJECTED_BY_CVV_NO_MATCH", "AUTH_REJECTED_BY_EXPIRY_NO_MATCH", "AUTH_REJECTED_BY_ISSUER", "UNCONFIRMED_CARD"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.UNKNOWN, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.EXPIRED_CARD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.VALIDATION_ERROR, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_SHARING_LIMIT_EXCEEDED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_COUNT_LIMIT_EXCEEDED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.USER_ACCOUNT_LIMITED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.USER_ACCOUNT_CLOSED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.CARD_BRAND_NOT_SUPPORTED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.COUNTRY_NOT_SUPPORTED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.CARD_NOT_ALLOWED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_NOT_SUPPORTED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_INVALID, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.RISK_DECLINE_REDIRECT_AUTH_FLOW, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_BLOCKED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_ON_HOLD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INSTRUMENT_INACTIVE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INVALID_ACCOUNT_NUMBER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INVALID_SECURITY_CODE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INVALID_EXPIRY, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INVALID_ADDRESS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INVALID_ISSUER_DETAILS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.RISK_DENIED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.UNKNOWN_CARD_DECLINE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.VENDOR_TIMEOUT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.DEPENDENT_SERVICE_ERROR, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.INTERNAL_ERROR, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.RESOURCE_NOT_FOUND, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.PREVIOUS_REQUEST_IN_PROGRESS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.ISSUER_DECLINE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTHORIZATION_FAILED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTHORIZATION_NOT_ELIGIBLE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTHORIZATION_TIMEOUT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTH_REJECTED_BY_AVS_NO_MATCH, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTH_REJECTED_BY_CVV_NO_MATCH, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTH_REJECTED_BY_EXPIRY_NO_MATCH, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.AUTH_REJECTED_BY_ISSUER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.UNCONFIRMED_CARD});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason) obj;
            return externalAddCardErrorReason == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.UNKNOWN__ : externalAddCardErrorReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
