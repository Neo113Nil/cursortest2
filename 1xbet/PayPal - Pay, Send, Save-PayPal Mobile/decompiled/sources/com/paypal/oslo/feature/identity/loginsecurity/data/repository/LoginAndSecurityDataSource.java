package com.paypal.oslo.feature.identity.loginsecurity.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/data/repository/LoginAndSecurityDataSource;", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/repository/LoginAndSecurityRepository;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;", "getAllFeatures", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoginAndSecurityDataSource implements com.paypal.oslo.feature.identity.loginsecurity.domain.repository.LoginAndSecurityRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public LoginAndSecurityDataSource() {
    }

    @Override // com.paypal.oslo.feature.identity.loginsecurity.domain.repository.LoginAndSecurityRepository
    public final java.util.List<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature> getAllFeatures() {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType[]{com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.FACE_ID, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.TOUCH_ID, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.EXTEND_LOGIN_SESSION});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature((com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType) it.next(), false));
        }
        return arrayList;
    }
}
