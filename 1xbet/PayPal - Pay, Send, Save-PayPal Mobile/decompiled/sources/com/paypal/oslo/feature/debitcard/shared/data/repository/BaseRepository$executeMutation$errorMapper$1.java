package com.paypal.oslo.feature.debitcard.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class BaseRepository$executeMutation$errorMapper$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> {
    public static final com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$errorMapper$1 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$errorMapper$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError invoke(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.core.network.graphql.error.CallError callError2 = callError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError2, "");
        return com.paypal.oslo.feature.debitcard.shared.data.repository.RepositoryUtilKt.mapToDomainError(callError2);
    }

    BaseRepository$executeMutation$errorMapper$1() {
        super(1, com.paypal.oslo.feature.debitcard.shared.data.repository.RepositoryUtilKt.class, "mapToDomainError", "mapToDomainError(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError;", 1);
    }
}
