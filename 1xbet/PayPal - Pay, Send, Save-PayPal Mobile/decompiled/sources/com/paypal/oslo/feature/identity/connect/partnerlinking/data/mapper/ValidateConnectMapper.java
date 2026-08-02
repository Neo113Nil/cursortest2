package com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r*\u00060\u0011j\u0002`\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/data/mapper/ValidateConnectMapper;", "", "<init>", "()V", "T", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/data/mapper/ValidateConnectMapper$ValidateConnectResponseData;", "extractData", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectResult;", "mapGraphQLResponse$identity_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "toDomain$identity_prodRelease", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "ValidateConnectResponseData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateConnectMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper();

    private ValidateConnectMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ arrow.core.Either mapGraphQLResponse$identity_prodRelease$default(com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper validateConnectMapper, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return validateConnectMapper.mapGraphQLResponse$identity_prodRelease(graphQLData, list, function1);
    }

    public final <T> arrow.core.Either<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult> mapGraphQLResponse$identity_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<T> data, java.util.List<?> errors, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData> extractData) {
        java.lang.String returnUrl;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extractData, "");
        if (errors != null && (!errors.isEmpty())) {
            java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) errors);
            if (firstOrNull == null || (str = firstOrNull.toString()) == null) {
                str = "GraphQL error occurred";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError(str));
        }
        T data2 = data.getData();
        com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData invoke = data2 != null ? extractData.invoke(data2) : null;
        if (invoke == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError("Missing validateConnect response"));
        }
        java.lang.String connectUrl = invoke.getConnectUrl();
        if (connectUrl == null || connectUrl.length() == 0 || (returnUrl = invoke.getReturnUrl()) == null || returnUrl.length() == 0) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError("Invalid response: missing URLs"));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult(invoke.getConnectUrl(), invoke.getReturnUrl()));
    }

    public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError toDomain$identity_prodRelease(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        if ((exc instanceof java.net.UnknownHostException) || (exc instanceof java.net.ConnectException) || (exc instanceof java.net.SocketTimeoutException)) {
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError(exc);
        }
        if (exc instanceof java.lang.IllegalArgumentException) {
            java.lang.String message = exc.getMessage();
            if (message == null) {
                message = "Invalid input";
            }
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput(message);
        }
        java.lang.String message2 = exc.getMessage();
        if (message2 == null) {
            message2 = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError(message2);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/data/mapper/ValidateConnectMapper$ValidateConnectResponseData;", "", "", "connectUrl", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/data/mapper/ValidateConnectMapper$ValidateConnectResponseData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConnectUrl", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidateConnectResponseData {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final java.lang.String returnUrl;

        public ValidateConnectResponseData(java.lang.String str, java.lang.String str2) {
            this.connectUrl = str;
            this.returnUrl = str2;
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.connectUrl;
            java.lang.String str2 = this.returnUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateConnectResponseData(connectUrl=");
            sb.append(str);
            sb.append(", returnUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.connectUrl;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.returnUrl;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData validateConnectResponseData = (com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, validateConnectResponseData.connectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, validateConnectResponseData.returnUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData copy(java.lang.String connectUrl, java.lang.String returnUrl) {
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData(connectUrl, returnUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData validateConnectResponseData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validateConnectResponseData.connectUrl;
            }
            if ((i & 2) != 0) {
                str2 = validateConnectResponseData.returnUrl;
            }
            return validateConnectResponseData.copy(str, str2);
        }
    }
}
