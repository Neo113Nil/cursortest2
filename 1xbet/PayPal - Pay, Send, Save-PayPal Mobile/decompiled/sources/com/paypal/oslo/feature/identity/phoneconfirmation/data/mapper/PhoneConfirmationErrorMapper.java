package com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/mapper/PhoneConfirmationErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "mapCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneConfirmationErrorMapper {
    public static final int $stable = 0;

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MSG_BLOCKED = "blocked";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MSG_EXPIRED = "expired";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MSG_INVALID_CODE = "invalid code";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MSG_TOO_MANY = "too many";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MSG_UNAUTHENTICATED = "unauthenticated";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MSG_UNAUTHORIZED = "unauthorized";

    @java.lang.Deprecated
    public static final int HTTP_TOO_MANY_REQUESTS = 429;

    @java.lang.Deprecated
    public static final int HTTP_UNAUTHORIZED = 401;

    @java.lang.Deprecated
    public static final long MILLIS_PER_SECOND = 1000;
    private static final com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.Companion Companion = new com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.Companion(null);
    private static final kotlin.ranges.IntRange getHighSpeedVideoFpsRangesFor = new kotlin.ranges.IntRange(500, 599);

    @javax.inject.Inject
    public PhoneConfirmationErrorMapper() {
    }

    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError mapCallError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.text.MatchResult find$default;
        java.util.List<java.lang.String> groupValues;
        java.lang.String str;
        java.lang.Long longOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        java.lang.Long l = null;
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String message = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage();
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) ERROR_MSG_TOO_MANY, true)) {
                return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts(null, 1, null);
            }
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) ERROR_MSG_INVALID_CODE, true)) {
                return com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode.INSTANCE;
            }
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) ERROR_MSG_EXPIRED, true)) {
                return com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired.INSTANCE;
            }
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) ERROR_MSG_BLOCKED, true)) {
                return com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked.INSTANCE;
            }
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) ERROR_MSG_UNAUTHORIZED, true) || kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) ERROR_MSG_UNAUTHENTICATED, true)) {
                return com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized.INSTANCE;
            }
            return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown(message.length() != 0 ? message : null);
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError.INSTANCE);
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
            int code = httpError.getCode();
            if (code == 401) {
                return com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized.INSTANCE;
            }
            if (code == 429) {
                java.lang.String body = httpError.getBody();
                if (body != null && body.length() != 0 && (find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("[\"']?retry[_-]?after[\"']?\\s*[:=]\\s*(\\d+)", kotlin.text.RegexOption.IGNORE_CASE), body, 0, 2, null)) != null && (groupValues = find$default.getGroupValues()) != null && (str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(groupValues, 1)) != null && (longOrNull = kotlin.text.StringsKt.toLongOrNull(str)) != null) {
                    l = java.lang.Long.valueOf(longOrNull.longValue() * 1000);
                }
                return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts(l);
            }
            kotlin.ranges.IntRange intRange = getHighSpeedVideoFpsRangesFor;
            return (code > intRange.getLast() || intRange.getFirst() > code) ? new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError(httpError.getCode(), httpError.getBody())) : new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError(httpError.getCode());
        }
        if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause()));
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/mapper/PhoneConfirmationErrorMapper$Companion;", "", "<init>", "()V", "", "HTTP_UNAUTHORIZED", com.visa.cbp.getEncExpo.warmup, "HTTP_TOO_MANY_REQUESTS", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "", "MILLIS_PER_SECOND", "J", "", "ERROR_MSG_TOO_MANY", "Ljava/lang/String;", "ERROR_MSG_INVALID_CODE", "ERROR_MSG_EXPIRED", "ERROR_MSG_BLOCKED", "ERROR_MSG_UNAUTHORIZED", "ERROR_MSG_UNAUTHENTICATED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
