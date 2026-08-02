package com.paypal.oslo.feature.shoppingrewards.shared.data.repository;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* synthetic */ class BaseRepository$fetchData$5 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError> {
    public static final com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository$fetchData$5 getHighSpeedVideoSizes = new com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository$fetchData$5();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError invoke(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.core.network.graphql.error.CallError callError2 = callError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError2, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.util.RepositoryUtilKt.mapToDomainError(callError2);
    }

    BaseRepository$fetchData$5() {
        super(1, com.paypal.oslo.feature.shoppingrewards.shared.data.util.RepositoryUtilKt.class, "mapToDomainError", "mapToDomainError(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", 1);
    }
}
