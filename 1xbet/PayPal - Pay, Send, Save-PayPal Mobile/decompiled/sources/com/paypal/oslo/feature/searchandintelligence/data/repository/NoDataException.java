package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/NoDataException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "originalError", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getOriginalError", "()Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NoDataException extends java.lang.Exception {
    private final com.paypal.oslo.core.network.graphql.error.CallError originalError;
    private static final com.paypal.oslo.feature.searchandintelligence.data.repository.NoDataException.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.data.repository.NoDataException.Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ NoDataException(com.paypal.oslo.core.network.graphql.error.CallError callError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : callError);
    }

    public final com.paypal.oslo.core.network.graphql.error.CallError getOriginalError() {
        return this.originalError;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/NoDataException$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static java.lang.String getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.error.CallError p0) {
            if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
                return "No data received: ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0).m11659getErrors1X0FAY()))).getMessage()));
            }
            if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                return "No data received: ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError()));
            }
            if (p0 != null) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return "No data received from server";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NoDataException(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        super(com.paypal.oslo.feature.searchandintelligence.data.repository.NoDataException.Companion.getHighSpeedVideoSizes(callError));
        this.originalError = callError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoDataException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
