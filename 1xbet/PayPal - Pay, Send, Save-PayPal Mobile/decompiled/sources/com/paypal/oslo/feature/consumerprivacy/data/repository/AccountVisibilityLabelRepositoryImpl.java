package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/AccountVisibilityLabelRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityLabelRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityLabelApi;", "apolloClient", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityLabelApi;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PrivacyError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityLabelData;", "getAccountVisibilityData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityLabelApi;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountVisibilityLabelRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AccountVisibilityLabelRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi accountVisibilityLabelApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityLabelApi, "");
        this.getHighSpeedVideoSizes = accountVisibilityLabelApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAccountVisibilityData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.repository.PrivacyError, com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1 accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting2;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1) {
            accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1) continuation;
            if ((accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi accountVisibilityLabelApi = this.getHighSpeedVideoSizes;
                    accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges = 1;
                    obj = accountVisibilityLabelApi.getAllowDiscoverability(accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.repository.PrivacyError.NetworkError.INSTANCE);
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (privacySetting2 = data.getPrivacySetting()) != null && (searchPrivacy2 = privacySetting2.getSearchPrivacy()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(searchPrivacy2.getAllowDiscoverability());
                    }
                    return new arrow.core.Ior.Right(new com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData(bool));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (privacySetting = data2.getPrivacySetting()) != null && (searchPrivacy = privacySetting.getSearchPrivacy()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(searchPrivacy.getAllowDiscoverability());
                    }
                    return new arrow.core.Ior.Both(com.paypal.oslo.feature.consumerprivacy.domain.repository.PrivacyError.NetworkError.INSTANCE, new com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData(bool));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
