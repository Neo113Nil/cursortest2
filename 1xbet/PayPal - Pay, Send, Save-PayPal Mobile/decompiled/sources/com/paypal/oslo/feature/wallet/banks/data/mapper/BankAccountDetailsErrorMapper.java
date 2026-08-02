package com.paypal.oslo.feature.wallet.banks.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankAccountDetailsErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public BankAccountDetailsErrorMapper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r1.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.ServiceUnavailable.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r1.equals("UNAUTHENTICATED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.Unauthorized.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1.equals("VALIDATION_ERROR") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.InvalidData.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r1.equals("INVALID_REQUEST") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r1.equals(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (r1.equals(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SERVICE_UNAVAILABLE) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError toDomain(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError().getClass()).getSimpleName();
            com.paypal.android.logger.Logger.d$default(logger, "Network error occurred while fetching bank account details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "")), null, 4, null);
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Network.INSTANCE;
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY());
        java.lang.String errorCode = graphQLError.getErrorCode();
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("errorCode", errorCode == null ? "null" : errorCode);
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", graphQLError.getMessage());
        java.lang.String correlationId = graphQLError.getCorrelationId();
        if (correlationId == null) {
            correlationId = "null";
        }
        pairArr[2] = kotlin.TuplesKt.to("correlationId", correlationId);
        com.paypal.android.logger.Logger.d$default(logger2, "Mapping GraphQL error to domain error", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        if (errorCode != null) {
            switch (errorCode.hashCode()) {
                case -2139298426:
                    break;
                case -1356775180:
                    break;
                case -1125000185:
                    break;
                case -998542686:
                    break;
                case -849706474:
                    break;
                case -630263762:
                    break;
                case -8285211:
                    if (errorCode.equals("RESOURCE_NOT_FOUND")) {
                        return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.NotFound.INSTANCE;
                    }
                    break;
            }
        }
        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
        if (errorCode == null) {
            errorCode = "null";
        }
        pairArr2[0] = kotlin.TuplesKt.to("errorCode", errorCode);
        pairArr2[1] = kotlin.TuplesKt.to("errorMessage", graphQLError.getMessage());
        java.lang.String correlationId2 = graphQLError.getCorrelationId();
        pairArr2[2] = kotlin.TuplesKt.to("correlationId", correlationId2 != null ? correlationId2 : "null");
        com.paypal.android.logger.Logger.w$default(logger3, "Unmapped GraphQL error code encountered", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown(graphQLError.getMessage());
    }
}
