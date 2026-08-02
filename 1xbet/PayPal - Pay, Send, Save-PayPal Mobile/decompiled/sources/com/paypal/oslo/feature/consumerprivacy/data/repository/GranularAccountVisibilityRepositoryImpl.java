package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0013\u0010\rJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0014\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0015\u0010\rJ$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0016\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0017\u0010\rJ$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0018\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0019\u0010\rJ$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u001a\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/GranularAccountVisibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/GranularAccountVisibilityRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/GranularAccountVisibilityApi;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/GranularAccountVisibilityApi;Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;)V", "", "allowSendMoneyByEmail", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "updateAllowSendMoneyByEmail", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowSendMoneyByPhone", "updateAllowSendMoneyByPhone", "allowSendMoneyByName", "updateAllowSendMoneyByName", "allowSendMoneyByUsername", "updateAllowSendMoneyByUsername", "allowRequestMoneyByEmail", "updateAllowRequestMoneyByEmail", "allowRequestMoneyByPhone", "updateAllowRequestMoneyByPhone", "allowRequestMoneyByName", "updateAllowRequestMoneyByName", "allowRequestMoneyByUsername", "updateAllowRequestMoneyByUsername", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/GranularAccountVisibilityApi;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GranularAccountVisibilityRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GranularAccountVisibilityRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(granularAccountVisibilityApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityDataMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = granularAccountVisibilityApi;
        this.getHighSpeedVideoFpsRanges = accountVisibilityDataMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowSendMoneyByEmail(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1 granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByEmailMutation.UpdateAllowSendMoneyByEmail updateAllowSendMoneyByEmail;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByEmailMutation.UpdateAllowSendMoneyByEmail updateAllowSendMoneyByEmail2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighSpeedVideoSizes = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = granularAccountVisibilityApi.updateAllowSendMoneyByEmail(z, granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByEmailMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByEmailMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowSendMoneyByEmail2 = data.getUpdateAllowSendMoneyByEmail()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByEmail2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByEmailMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByEmailMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowSendMoneyByEmail = data2.getUpdateAllowSendMoneyByEmail()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByEmail.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByEmail$1.getHighResolutionOutputSizeshNQ4ISI;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowSendMoneyByPhone(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1 granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByPhoneMutation.UpdateAllowSendMoneyByPhone updateAllowSendMoneyByPhone;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByPhoneMutation.UpdateAllowSendMoneyByPhone updateAllowSendMoneyByPhone2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoSizes = 1;
                    obj = granularAccountVisibilityApi.updateAllowSendMoneyByPhone(z, granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByPhoneMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByPhoneMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowSendMoneyByPhone2 = data.getUpdateAllowSendMoneyByPhone()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByPhone2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByPhoneMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByPhoneMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowSendMoneyByPhone = data2.getUpdateAllowSendMoneyByPhone()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByPhone.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByPhone$1.getHighSpeedVideoSizes;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowSendMoneyByName(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1 granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByNameMutation.UpdateAllowSendMoneyByName updateAllowSendMoneyByName;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByNameMutation.UpdateAllowSendMoneyByName updateAllowSendMoneyByName2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoFpsRanges = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoSizes = 1;
                    obj = granularAccountVisibilityApi.updateAllowSendMoneyByName(z, granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByNameMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByNameMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowSendMoneyByName2 = data.getUpdateAllowSendMoneyByName()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByName2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByNameMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByNameMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowSendMoneyByName = data2.getUpdateAllowSendMoneyByName()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByName.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByName$1.getHighSpeedVideoSizes;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowSendMoneyByUsername(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1 granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByUsernameMutation.UpdateAllowSendMoneyByUsername updateAllowSendMoneyByUsername;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByUsernameMutation.UpdateAllowSendMoneyByUsername updateAllowSendMoneyByUsername2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = granularAccountVisibilityApi.updateAllowSendMoneyByUsername(z, granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByUsernameMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByUsernameMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowSendMoneyByUsername2 = data.getUpdateAllowSendMoneyByUsername()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByUsername2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByUsernameMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowSendMoneyByUsernameMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowSendMoneyByUsername = data2.getUpdateAllowSendMoneyByUsername()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowSendMoneyByUsername.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowSendMoneyByUsername$1.getHighSpeedVideoFpsRangesFor;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowRequestMoneyByEmail(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1 granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByEmailMutation.UpdateAllowRequestMoneyByEmail updateAllowRequestMoneyByEmail;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByEmailMutation.UpdateAllowRequestMoneyByEmail updateAllowRequestMoneyByEmail2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.getHighSpeedVideoSizes = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.Camera2StreamConfigurationMap = 1;
                    obj = granularAccountVisibilityApi.updateAllowRequestMoneyByEmail(z, granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByEmailMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByEmailMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowRequestMoneyByEmail2 = data.getUpdateAllowRequestMoneyByEmail()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByEmail2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByEmailMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByEmailMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowRequestMoneyByEmail = data2.getUpdateAllowRequestMoneyByEmail()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByEmail.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByEmail$1.Camera2StreamConfigurationMap;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowRequestMoneyByPhone(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1 granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByPhoneMutation.UpdateAllowRequestMoneyByPhone updateAllowRequestMoneyByPhone;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByPhoneMutation.UpdateAllowRequestMoneyByPhone updateAllowRequestMoneyByPhone2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.Camera2StreamConfigurationMap = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRanges = 1;
                    obj = granularAccountVisibilityApi.updateAllowRequestMoneyByPhone(z, granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByPhoneMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByPhoneMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowRequestMoneyByPhone2 = data.getUpdateAllowRequestMoneyByPhone()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByPhone2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByPhoneMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByPhoneMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowRequestMoneyByPhone = data2.getUpdateAllowRequestMoneyByPhone()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByPhone.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByPhone$1.getHighSpeedVideoFpsRanges;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowRequestMoneyByName(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1 granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.UpdateAllowRequestMoneyByName updateAllowRequestMoneyByName2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighSpeedVideoFpsRangesFor = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = granularAccountVisibilityApi.updateAllowRequestMoneyByName(z, granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowRequestMoneyByName2 = data.getUpdateAllowRequestMoneyByName()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByName2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByNameMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowRequestMoneyByName = data2.getUpdateAllowRequestMoneyByName()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByName.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByName$1.getHighResolutionOutputSizeshNQ4ISI;
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
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowRequestMoneyByUsername(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1 granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByUsernameMutation.UpdateAllowRequestMoneyByUsername updateAllowRequestMoneyByUsername;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByUsernameMutation.UpdateAllowRequestMoneyByUsername updateAllowRequestMoneyByUsername2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1) {
            granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1) continuation;
            if ((granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi granularAccountVisibilityApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.Camera2StreamConfigurationMap = z;
                    granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoSizes = 1;
                    obj = granularAccountVisibilityApi.updateAllowRequestMoneyByUsername(z, granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByUsernameMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByUsernameMutation.Data) graphQLData.getData();
                    if (data != null && (updateAllowRequestMoneyByUsername2 = data.getUpdateAllowRequestMoneyByUsername()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByUsername2.getSuccess());
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
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper accountVisibilityDataMapper2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByUsernameMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdateAllowRequestMoneyByUsernameMutation.Data) graphQLData2.getData();
                    if (data2 != null && (updateAllowRequestMoneyByUsername = data2.getUpdateAllowRequestMoneyByUsername()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateAllowRequestMoneyByUsername.getSuccess());
                    }
                    if (accountVisibilityDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1(this, continuation);
        java.lang.Object obj2 = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = granularAccountVisibilityRepositoryImpl$updateAllowRequestMoneyByUsername$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
