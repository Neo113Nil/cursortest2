package com.paypal.oslo.feature.dataprivacy.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/repository/UserAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;", "Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;", "dataSource", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/LinkedAccount;", "getLinkedAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAccountRepositoryImpl implements com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UserAccountRepositoryImpl(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyGraphQLDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.Camera2StreamConfigurationMap = dataPrivacyGraphQLDataSource;
        this.getHighSpeedVideoSizes = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLinkedAccounts(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, ? extends java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount>>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl$getLinkedAccounts$1 userAccountRepositoryImpl$getLinkedAccounts$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl$getLinkedAccounts$1) {
            userAccountRepositoryImpl$getLinkedAccounts$1 = (com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl$getLinkedAccounts$1) continuation;
            if ((userAccountRepositoryImpl$getLinkedAccounts$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                userAccountRepositoryImpl$getLinkedAccounts$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = userAccountRepositoryImpl$getLinkedAccounts$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userAccountRepositoryImpl$getLinkedAccounts$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
                    java.lang.String id = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getId() : null;
                    if (id == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError.INSTANCE);
                    }
                    com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource = this.Camera2StreamConfigurationMap;
                    userAccountRepositoryImpl$getLinkedAccounts$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                    userAccountRepositoryImpl$getLinkedAccounts$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = dataPrivacyGraphQLDataSource.getIdentityLinks(id, userAccountRepositoryImpl$getLinkedAccounts$1);
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
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(com.paypal.oslo.feature.dataprivacy.data.mapper.IdentityLinksMapperKt.toLinkedAccounts((com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data) ((arrow.core.Ior.Right) ior).getValue()));
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                return new arrow.core.Ior.Both(both.getLeftValue(), com.paypal.oslo.feature.dataprivacy.data.mapper.IdentityLinksMapperKt.toLinkedAccounts((com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data) both.getRightValue()));
            }
        }
        userAccountRepositoryImpl$getLinkedAccounts$1 = new com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl$getLinkedAccounts$1(this, continuation);
        java.lang.Object obj2 = userAccountRepositoryImpl$getLinkedAccounts$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userAccountRepositoryImpl$getLinkedAccounts$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
