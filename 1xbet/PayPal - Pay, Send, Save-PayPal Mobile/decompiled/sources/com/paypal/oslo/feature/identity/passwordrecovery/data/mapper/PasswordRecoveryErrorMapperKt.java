package com.paypal.oslo.feature.identity.passwordrecovery.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\n\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\"\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "toPasswordRecoveryError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getOutputFormats", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasswordRecoveryErrorMapperKt {
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("\\b(invalid|bad)\\s+(token|reset)\\b");
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("\\b(expired|expir(e|ation))\\b");
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("\\bpassword\\b.*(recently\\s+used|already\\s+used|reused)\\b");
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("\\b(illegal|invalid|forbidden)\\s+(character|char)s?\\b");
    private static final kotlin.text.Regex getOutputFormats = new kotlin.text.Regex("\\bsequence\\b");
    private static final kotlin.text.Regex getHighSpeedVideoSizesFor = new kotlin.text.Regex("\\brepeated\\s+characters?\\b");
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("\\bforbidden\\s+word\\b");

    public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError toPasswordRecoveryError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return toPasswordRecoveryError(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError());
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return toPasswordRecoveryError(arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError toPasswordRecoveryError(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.NetworkError.INSTANCE;
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError(((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError).getMessage());
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0048, code lost:
    
        if (r3.equals("ILLEGAL_CHARACTERS") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005c, code lost:
    
        r3 = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordIllegalCharacters.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0051, code lost:
    
        if (r3.equals("EXPIRED_TOKEN") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        r3 = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ExpiredResetToken.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005a, code lost:
    
        if (r3.equals(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.INVALID_CHARACTERS) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0067, code lost:
    
        if (r3.equals("INVALID_RESET_TOKEN") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007f, code lost:
    
        r3 = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.InvalidResetToken.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007d, code lost:
    
        if (r3.equals("INVALID_TOKEN") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
    
        if (r3.equals("TOKEN_EXPIRED") != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:2:0x000c->B:43:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError toPasswordRecoveryError(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list) {
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError passwordRecoveryError;
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed passwordRecentlyUsed;
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError passwordRecoveryError2;
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            passwordRecoveryError = null;
            if (it.hasNext()) {
                java.lang.String errorCode = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getErrorCode();
                if (errorCode != null) {
                    java.util.Locale locale = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = errorCode.toUpperCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    switch (upperCase.hashCode()) {
                        case -2088940080:
                            if (upperCase.equals("PASSWORD_RECENTLY_USED")) {
                                passwordRecentlyUsed = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed.INSTANCE;
                                break;
                            }
                            break;
                        case -1502917712:
                            if (upperCase.equals("FORBIDDEN_WORD")) {
                                passwordRecentlyUsed = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordForbiddenWord.INSTANCE;
                                break;
                            }
                            break;
                        case -1345867105:
                            break;
                        case -1098472079:
                            break;
                        case -951309233:
                            if (upperCase.equals(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ErrorCode.REPEATED_CHARACTERS)) {
                                passwordRecentlyUsed = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRepeatedCharacters.INSTANCE;
                                break;
                            }
                            break;
                        case -778486687:
                            break;
                        case -42323502:
                            break;
                        case 1349533727:
                            break;
                        case 1409383155:
                            break;
                        case 1606593765:
                            if (upperCase.equals("PASSWORD_SEQUENCE")) {
                                passwordRecentlyUsed = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordSequence.INSTANCE;
                                break;
                            }
                            break;
                    }
                    if (passwordRecentlyUsed == null) {
                    }
                }
                passwordRecentlyUsed = null;
                if (passwordRecentlyUsed == null) {
                }
            } else {
                passwordRecentlyUsed = null;
            }
        }
        if (passwordRecentlyUsed != null) {
            return passwordRecentlyUsed;
        }
        java.util.Iterator<T> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                passwordRecoveryError2 = getHighSpeedVideoFpsRanges(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it2.next()).getMessage());
                if ((passwordRecoveryError2 instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError) || (passwordRecoveryError2 instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError)) {
                    passwordRecoveryError2 = null;
                }
                if (passwordRecoveryError2 != null) {
                }
            } else {
                passwordRecoveryError2 = null;
            }
        }
        if (passwordRecoveryError2 != null) {
            return passwordRecoveryError2;
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (graphQLError != null && (message = graphQLError.getMessage()) != null) {
            passwordRecoveryError = getHighSpeedVideoFpsRanges(message);
        }
        return passwordRecoveryError == null ? com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError.INSTANCE : passwordRecoveryError;
    }

    private static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String str2 = lowerCase;
        if (getHighSpeedVideoFpsRangesFor.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.InvalidResetToken.INSTANCE;
        }
        if (Camera2StreamConfigurationMap.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ExpiredResetToken.INSTANCE;
        }
        if (getHighSpeedVideoSizes.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed.INSTANCE;
        }
        if (getHighSpeedVideoFpsRanges.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordIllegalCharacters.INSTANCE;
        }
        if (getOutputFormats.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordSequence.INSTANCE;
        }
        if (getHighSpeedVideoSizesFor.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRepeatedCharacters.INSTANCE;
        }
        if (getHighResolutionOutputSizeshNQ4ISI.containsMatchIn(str2)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordForbiddenWord.INSTANCE;
        }
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError(str);
    }
}
