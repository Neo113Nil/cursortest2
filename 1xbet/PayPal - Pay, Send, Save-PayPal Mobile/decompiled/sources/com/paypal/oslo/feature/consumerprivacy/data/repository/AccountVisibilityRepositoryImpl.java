package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u001d\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001e\u0010\u0010R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/AccountVisibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityApi;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityApi;Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "getAccountVisibilityData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "allowFindByIdentifiers", "updateAllowFindByIdentifiers", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowPaymentRequests", "updateAllowPaymentRequests", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "paymentRequestsFrom", "updatePaymentRequestsFrom", "(ZZLcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowFindViaPayPalMe", "", "profileId", "updateAllowFindViaPayPalMe", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowVenmoDiscovery", "updateAllowVenmoDiscovery", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityApi;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountVisibilityRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AccountVisibilityRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityDataMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = accountVisibilityApi;
        this.getHighSpeedVideoFpsRangesFor = accountVisibilityDataMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAccountVisibilityData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$getAccountVisibilityData$1 accountVisibilityRepositoryImpl$getAccountVisibilityData$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$getAccountVisibilityData$1) {
            accountVisibilityRepositoryImpl$getAccountVisibilityData$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$getAccountVisibilityData$1) continuation;
            if ((accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = accountVisibilityApi.getSearchPrivacy(accountVisibilityRepositoryImpl$getAccountVisibilityData$1);
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
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(this.getHighSpeedVideoFpsRangesFor.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()), this.getHighSpeedVideoFpsRangesFor.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityRepositoryImpl$getAccountVisibilityData$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$getAccountVisibilityData$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityRepositoryImpl$getAccountVisibilityData$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowFindByIdentifiers(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1 accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindByIdentifiersMutation.UpdateAllowFindByIdentifiers updateAllowFindByIdentifiers;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindByIdentifiersMutation.UpdateAllowFindByIdentifiers updateAllowFindByIdentifiers2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1) {
            accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1) continuation;
            if ((accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighSpeedVideoFpsRangesFor = z;
                    accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = accountVisibilityApi.updateAllowFindByIdentifiers(z, accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindByIdentifiersMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindByIdentifiersMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowFindByIdentifiers2 = data.getUpdateAllowFindByIdentifiers()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowFindByIdentifiers2.getSuccess());
                    }
                    if (accountVisibilityDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindByIdentifiersMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindByIdentifiersMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowFindByIdentifiers = data2.getUpdateAllowFindByIdentifiers()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowFindByIdentifiers.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityRepositoryImpl$updateAllowFindByIdentifiers$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowPaymentRequests(boolean z, boolean z2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1 accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.UpdateAllowPaymentRequests updateAllowPaymentRequests2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1) {
            accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1) continuation;
            if ((accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.getHighSpeedVideoFpsRangesFor = z;
                    accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.getHighSpeedVideoSizes = z2;
                    accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.Camera2StreamConfigurationMap = 1;
                    obj = accountVisibilityApi.updateAllowPaymentRequests(z, z2, accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.getHighSpeedVideoSizes;
                    boolean z4 = accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowPaymentRequests2 = data.getUpdateAllowPaymentRequests()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowPaymentRequests2.getSuccess());
                    }
                    if (accountVisibilityDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowPaymentRequestsMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowPaymentRequests = data2.getUpdateAllowPaymentRequests()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowPaymentRequests.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityRepositoryImpl$updateAllowPaymentRequests$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePaymentRequestsFrom(boolean z, boolean z2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1 accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePaymentRequestsFromMutation.UpdatePaymentRequestsFrom updatePaymentRequestsFrom;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePaymentRequestsFromMutation.UpdatePaymentRequestsFrom updatePaymentRequestsFrom2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1) {
            accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1) continuation;
            if ((accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequestsFromType);
                    accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighSpeedVideoFpsRangesFor = z;
                    accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.Camera2StreamConfigurationMap = z2;
                    accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = accountVisibilityApi.updatePaymentRequestsFrom(z, z2, paymentRequestsFromType, accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.Camera2StreamConfigurationMap;
                    boolean z4 = accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePaymentRequestsFromMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePaymentRequestsFromMutation.Data) graphQLData.getData();
                    if (data != null && (updatePaymentRequestsFrom2 = data.getUpdatePaymentRequestsFrom()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updatePaymentRequestsFrom2.getSuccess());
                    }
                    if (accountVisibilityDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePaymentRequestsFromMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePaymentRequestsFromMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updatePaymentRequestsFrom = data2.getUpdatePaymentRequestsFrom()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updatePaymentRequestsFrom.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowFindViaPayPalMe(boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1 accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindViaPayPalMeMutation.UpdateAllowFindViaPayPalMe updateAllowFindViaPayPalMe;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindViaPayPalMeMutation.UpdateAllowFindViaPayPalMe updateAllowFindViaPayPalMe2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1) {
            accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1) continuation;
            if ((accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.Camera2StreamConfigurationMap = z;
                    accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = accountVisibilityApi.updateAllowFindViaPayPalMe(z, str, accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindViaPayPalMeMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindViaPayPalMeMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowFindViaPayPalMe2 = data.getUpdateAllowFindViaPayPalMe()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowFindViaPayPalMe2.getSuccess());
                    }
                    if (accountVisibilityDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindViaPayPalMeMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowFindViaPayPalMeMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowFindViaPayPalMe = data2.getUpdateAllowFindViaPayPalMe()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowFindViaPayPalMe.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityRepositoryImpl$updateAllowFindViaPayPalMe$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowVenmoDiscovery(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1 accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowVenmoDiscoveryMutation.UpdateAllowVenmoDiscovery updateAllowVenmoDiscovery;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowVenmoDiscoveryMutation.UpdateAllowVenmoDiscovery updateAllowVenmoDiscovery2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1) {
            accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1) continuation;
            if ((accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi accountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighSpeedVideoSizes = z;
                    accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = accountVisibilityApi.updateAllowVenmoDiscovery(z, accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowVenmoDiscoveryMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowVenmoDiscoveryMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowVenmoDiscovery2 = data.getUpdateAllowVenmoDiscovery()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowVenmoDiscovery2.getSuccess());
                    }
                    if (accountVisibilityDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowVenmoDiscoveryMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowVenmoDiscoveryMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowVenmoDiscovery = data2.getUpdateAllowVenmoDiscovery()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowVenmoDiscovery.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRangesFor.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRangesFor.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
