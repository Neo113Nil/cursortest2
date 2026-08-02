package com.paypal.oslo.feature.consumerprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0095\u0001\u0010\u0018\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\"2\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/ConnectedAppsDataMapper;", "", "<init>", "()V", "", "id", "category", "appId", "appName", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "mapBaseConsent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "externalUserId", "status", "grantTime", "expiryTime", "revokedTime", "consumerDataRightsArrangementId", "grantId", "", "isUnifiedAccountLinkingClient", "", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PermissionData;", "permissions", "mapAuthConsent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "providerName", "mapProviderConsent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "success", "mapMutationSuccess", "(Ljava/lang/Boolean;)Z", "deauthorized", "dataDeleted", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/RemoveProviderResult;", "mapRemoveProviderResult", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/RemoveProviderResult;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsError;", "mapError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsError;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "createOperationFailedError", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConnectedAppsDataMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ConnectedAppsDataMapper() {
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent mapBaseConsent(java.lang.String id, java.lang.String category, java.lang.String appId, java.lang.String appName) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent(id == null ? "" : id, category == null ? "" : category, appId == null ? "" : appId, appName == null ? "" : appName, null, null, null, null, null, null, null, false, null, null, 8192, null);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent mapAuthConsent(java.lang.String id, java.lang.String category, java.lang.String appId, java.lang.String appName, java.lang.String externalUserId, java.lang.String status, java.lang.String grantTime, java.lang.String expiryTime, java.lang.String revokedTime, java.lang.String consumerDataRightsArrangementId, java.lang.String grantId, java.lang.Boolean isUnifiedAccountLinkingClient, java.util.List<com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData> permissions) {
        java.util.ArrayList arrayList;
        java.lang.String str = id == null ? "" : id;
        java.lang.String str2 = category == null ? "" : category;
        java.lang.String str3 = appId == null ? "" : appId;
        java.lang.String str4 = appName == null ? "" : appName;
        boolean booleanValue = isUnifiedAccountLinkingClient != null ? isUnifiedAccountLinkingClient.booleanValue() : false;
        if (permissions != null) {
            java.util.List<com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData> list = permissions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData permissionData : list) {
                java.util.List<java.lang.String> values = permissionData.getValues();
                if (values == null) {
                    values = kotlin.collections.CollectionsKt.emptyList();
                }
                java.lang.String key = permissionData.getKey();
                if (key == null) {
                    key = "";
                }
                arrayList2.add(new com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentPermission(values, key, permissionData.getSharingStartTime()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent(str, str2, str3, str4, externalUserId, status, grantTime, expiryTime, revokedTime, consumerDataRightsArrangementId, grantId, booleanValue, arrayList, null, 8192, null);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent mapProviderConsent(java.lang.String id, java.lang.String category, java.lang.String appId, java.lang.String appName, java.lang.String externalUserId, java.lang.String providerName) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent(id == null ? "" : id, category == null ? "" : category, appId == null ? "" : appId, appName == null ? "" : appName, externalUserId, null, null, null, null, null, null, false, null, providerName);
    }

    public final boolean mapMutationSuccess(java.lang.Boolean success) {
        if (success != null) {
            return success.booleanValue();
        }
        return false;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult mapRemoveProviderResult(java.lang.Boolean deauthorized, java.lang.Boolean dataDeleted) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult(deauthorized != null ? deauthorized.booleanValue() : false, dataDeleted != null ? dataDeleted.booleanValue() : false);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError mapError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError("NETWORK_ERROR", "Network error occurred: ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError())), true);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError("GRAPHQL_ERROR", "GraphQL error: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), null, null, null, 0, null, null, 63, null))), false);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError createOperationFailedError(java.lang.String operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError("OPERATION_FAILED", "Failed to ".concat(java.lang.String.valueOf(operation)), true);
    }
}
