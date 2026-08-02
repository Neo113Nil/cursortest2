package com.paypal.oslo.feature.consumerprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/FaceScanMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetFaceScanStatusQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanStatus;", "mapQueryToDomain", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetFaceScanStatusQuery$Data;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanStatus;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/DeleteFaceScanDataMutation$Data;", "", "isMutationSuccessful", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/DeleteFaceScanDataMutation$Data;)Z", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "mapError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "createDeleteFailedError", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FaceScanMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FaceScanMapper() {
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus mapQueryToDomain(com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery.Data data) {
        com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery.PrivacySetting privacySetting;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery.FaceScan faceScan = (data == null || (privacySetting = data.getPrivacySetting()) == null) ? null : privacySetting.getFaceScan();
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus(faceScan != null ? faceScan.getStatus() : false);
    }

    public final boolean isMutationSuccessful(com.paypal.oslo.feature.consumerprivacy.graphql.DeleteFaceScanDataMutation.Data data) {
        com.paypal.oslo.feature.consumerprivacy.graphql.DeleteFaceScanDataMutation.DeleteFaceScanData deleteFaceScanData;
        if (data == null || (deleteFaceScanData = data.getDeleteFaceScanData()) == null) {
            return false;
        }
        return deleteFaceScanData.getSuccess();
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError mapError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError("Network error occurred: ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError())));
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
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError("GraphQL error: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), null, null, null, 0, null, null, 63, null))));
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError createDeleteFailedError() {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError("Failed to delete face scan data");
    }
}
