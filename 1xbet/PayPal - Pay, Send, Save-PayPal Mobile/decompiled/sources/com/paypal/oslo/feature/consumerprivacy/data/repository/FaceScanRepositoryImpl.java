package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/FaceScanRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/FaceScanRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApi;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/FaceScanMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApi;Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/FaceScanMapper;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanStatus;", "getFaceScanStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteFaceScan", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApi;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/FaceScanMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaceScanRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.mapper.FaceScanMapper Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FaceScanRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi faceScanApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.FaceScanMapper faceScanMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanMapper, "");
        this.getHighSpeedVideoSizes = faceScanApi;
        this.Camera2StreamConfigurationMap = faceScanMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getFaceScanStatus(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError, com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$getFaceScanStatus$1 faceScanRepositoryImpl$getFaceScanStatus$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$getFaceScanStatus$1) {
            faceScanRepositoryImpl$getFaceScanStatus$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$getFaceScanStatus$1) continuation;
            if ((faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi faceScanApi = this.getHighSpeedVideoSizes;
                    faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = faceScanApi.getFaceScanStatus(faceScanRepositoryImpl$getFaceScanStatus$1);
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
                    return new arrow.core.Ior.Left(this.Camera2StreamConfigurationMap.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(this.Camera2StreamConfigurationMap.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return new arrow.core.Ior.Both(this.Camera2StreamConfigurationMap.mapError((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()), this.Camera2StreamConfigurationMap.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        faceScanRepositoryImpl$getFaceScanStatus$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$getFaceScanStatus$1(this, continuation);
        java.lang.Object obj2 = faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = faceScanRepositoryImpl$getFaceScanStatus$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteFaceScan(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$deleteFaceScan$1 faceScanRepositoryImpl$deleteFaceScan$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$deleteFaceScan$1) {
            faceScanRepositoryImpl$deleteFaceScan$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$deleteFaceScan$1) continuation;
            if ((faceScanRepositoryImpl$deleteFaceScan$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                faceScanRepositoryImpl$deleteFaceScan$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = faceScanRepositoryImpl$deleteFaceScan$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = faceScanRepositoryImpl$deleteFaceScan$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi faceScanApi = this.getHighSpeedVideoSizes;
                    faceScanRepositoryImpl$deleteFaceScan$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = faceScanApi.deleteFaceScanData(faceScanRepositoryImpl$deleteFaceScan$1);
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
                    return new arrow.core.Ior.Left(this.Camera2StreamConfigurationMap.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    if (this.Camera2StreamConfigurationMap.isMutationSuccessful((com.paypal.oslo.feature.consumerprivacy.graphql.DeleteFaceScanDataMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData())) {
                        return new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
                    }
                    return new arrow.core.Ior.Left(this.Camera2StreamConfigurationMap.createDeleteFailedError());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    if (this.Camera2StreamConfigurationMap.isMutationSuccessful((com.paypal.oslo.feature.consumerprivacy.graphql.DeleteFaceScanDataMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData())) {
                        return new arrow.core.Ior.Both(this.Camera2StreamConfigurationMap.mapError(callError), kotlin.Unit.INSTANCE);
                    }
                    return new arrow.core.Ior.Left(this.Camera2StreamConfigurationMap.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        faceScanRepositoryImpl$deleteFaceScan$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl$deleteFaceScan$1(this, continuation);
        java.lang.Object obj2 = faceScanRepositoryImpl$deleteFaceScan$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = faceScanRepositoryImpl$deleteFaceScan$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
