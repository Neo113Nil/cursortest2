package com.paypal.oslo.feature.notificationcenter.badge.data.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/badge/data/repository/NotificationBadgeRepositoryImpl;", "Lcom/paypal/oslo/feature/notificationcenter/badge/domain/repository/NotificationBadgeRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/badge/domain/repository/NotificationBadgeError;", "", "getBadgeCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationBadgeRepositoryImpl implements com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public NotificationBadgeRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBadgeCount(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeError, java.lang.Integer>> continuation) {
        com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1 notificationBadgeRepositoryImpl$getBadgeCount$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeError.GraphQL graphQL;
        java.lang.String message;
        if (continuation instanceof com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1) {
            notificationBadgeRepositoryImpl$getBadgeCount$1 = (com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1) continuation;
            if ((notificationBadgeRepositoryImpl$getBadgeCount$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                notificationBadgeRepositoryImpl$getBadgeCount$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1 notificationBadgeRepositoryImpl$getBadgeCount$12 = notificationBadgeRepositoryImpl$getBadgeCount$1;
                java.lang.Object obj = notificationBadgeRepositoryImpl$getBadgeCount$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationBadgeRepositoryImpl$getBadgeCount$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationBadgeCountQuery getNotificationBadgeCountQuery = new com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationBadgeCountQuery();
                    notificationBadgeRepositoryImpl$getBadgeCount$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getNotificationBadgeCountQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, notificationBadgeRepositoryImpl$getBadgeCount$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (either instanceof arrow.core.Either.Left) {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                } else {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue();
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        graphQL = new com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeError.GraphQL(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage());
                    } else {
                        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                            message = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause().getMessage();
                            if (message == null) {
                                message = com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR;
                            }
                        } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                            java.lang.String message2 = httpError.getMessage();
                            message = message2 == null ? "HTTP error ".concat(java.lang.String.valueOf(httpError.getCode())) : message2;
                        } else {
                            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            message = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
                            if (message == null) {
                                message = "Unknown network error";
                            }
                        }
                        graphQL = new com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeError.Network(message);
                    }
                    right = new arrow.core.Either.Left(graphQL);
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationBadgeCountQuery.Data data = (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationBadgeCountQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    return new arrow.core.Either.Right(kotlin.coroutines.jvm.internal.Boxing.boxInt(data != null ? data.getBadgeCount() : 0));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        notificationBadgeRepositoryImpl$getBadgeCount$1 = new com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1(this, continuation);
        com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl$getBadgeCount$1 notificationBadgeRepositoryImpl$getBadgeCount$122 = notificationBadgeRepositoryImpl$getBadgeCount$1;
        java.lang.Object obj2 = notificationBadgeRepositoryImpl$getBadgeCount$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationBadgeRepositoryImpl$getBadgeCount$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (either instanceof arrow.core.Either.Left) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
