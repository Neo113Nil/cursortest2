package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "toPushTokenError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError;", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushTokenErrorMapperKt {
    public static final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError toPushTokenError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.Business.SyncFailed(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getMessage());
    }

    public static final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError toPushTokenError(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError storageError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageError, "");
        if (storageError instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError) {
            return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.StorageError("Failed to read token from local storage\nreason: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError) storageError).getThrowable().getMessage())));
        }
        if (!(storageError instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.StorageError("Failed to write token to local storage\nreason: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError) storageError).getThrowable().getMessage())));
    }
}
