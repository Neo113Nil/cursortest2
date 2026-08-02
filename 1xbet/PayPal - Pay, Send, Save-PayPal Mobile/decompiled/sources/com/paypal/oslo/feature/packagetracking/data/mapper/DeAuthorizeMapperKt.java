package com.paypal.oslo.feature.packagetracking.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingMutation$DeauthorizePackageTracking;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/DeAuthorizeData;", "toDomain", "(Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingMutation$DeauthorizePackageTracking;)Lcom/paypal/oslo/feature/packagetracking/domain/model/DeAuthorizeData;", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeAuthorizeMapperKt {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData toDomain(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingMutation.DeauthorizePackageTracking deauthorizePackageTracking) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deauthorizePackageTracking, "");
        java.lang.Boolean deauthorized = deauthorizePackageTracking.getDeauthorized();
        boolean booleanValue = deauthorized != null ? deauthorized.booleanValue() : false;
        java.lang.Boolean dataDeleted = deauthorizePackageTracking.getDataDeleted();
        boolean booleanValue2 = dataDeleted != null ? dataDeleted.booleanValue() : false;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider emailProvider = deauthorizePackageTracking.getEmailProvider();
        return new com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData(booleanValue, booleanValue2, emailProvider != null ? com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toDomain(emailProvider) : null);
    }

    public static final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData> toDomain(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization deauthorization : list2) {
            java.lang.Boolean deauthorized = deauthorization.getDeauthorized();
            boolean booleanValue = deauthorized != null ? deauthorized.booleanValue() : false;
            java.lang.Boolean dataDeleted = deauthorization.getDataDeleted();
            boolean booleanValue2 = dataDeleted != null ? dataDeleted.booleanValue() : false;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider emailProvider = deauthorization.getEmailProvider();
            arrayList.add(new com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData(booleanValue, booleanValue2, emailProvider != null ? com.paypal.oslo.feature.packagetracking.data.mapper.EmailProviderMapperKt.toDomain(emailProvider) : null));
        }
        return arrayList;
    }
}
