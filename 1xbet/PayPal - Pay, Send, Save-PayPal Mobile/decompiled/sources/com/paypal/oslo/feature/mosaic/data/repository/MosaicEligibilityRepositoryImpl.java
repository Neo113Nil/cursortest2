package com.paypal.oslo.feature.mosaic.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/data/repository/MosaicEligibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/mosaic/domain/repository/MosaicEligibilityRepository;", "Lcom/paypal/oslo/feature/mosaic/data/source/MosaicEligibilityRemoteDataSource;", "remoteDataSource", "<init>", "(Lcom/paypal/oslo/feature/mosaic/data/source/MosaicEligibilityRemoteDataSource;)V", "", "processName", "encryptedProcessId", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;", "getEligibility", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/mosaic/data/source/MosaicEligibilityRemoteDataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicEligibilityRepositoryImpl implements com.paypal.oslo.feature.mosaic.domain.repository.MosaicEligibilityRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public MosaicEligibilityRepositoryImpl(com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource mosaicEligibilityRemoteDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicEligibilityRemoteDataSource, "");
        this.getHighSpeedVideoFpsRanges = mosaicEligibilityRemoteDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility] */
    /* JADX WARN: Type inference failed for: r13v18, types: [com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility] */
    @Override // com.paypal.oslo.feature.mosaic.domain.repository.MosaicEligibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getEligibility(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility>>> continuation) {
        com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl$getEligibility$1 mosaicEligibilityRepositoryImpl$getEligibility$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility;
        com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility2;
        if (continuation instanceof com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl$getEligibility$1) {
            mosaicEligibilityRepositoryImpl$getEligibility$1 = (com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl$getEligibility$1) continuation;
            if ((mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mosaicEligibilityRepositoryImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput = new com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str2), null, 4, null);
                    com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource mosaicEligibilityRemoteDataSource = this.getHighSpeedVideoFpsRanges;
                    mosaicEligibilityRepositoryImpl$getEligibility$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mosaicPageEligibilityInput);
                    mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = mosaicEligibilityRemoteDataSource.getEligibility(mosaicPageEligibilityInput, mosaicEligibilityRepositoryImpl$getEligibility$1);
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
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data data = (com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data) graphQLData.getData();
                    if (data != null && (mosaicPageEligibility2 = data.getMosaicPageEligibility()) != null) {
                        boolean isSupportedOnMosaic = mosaicPageEligibility2.isSupportedOnMosaic();
                        boolean isWebSupported = mosaicPageEligibility2.isWebSupported();
                        boolean isNativeSupported = mosaicPageEligibility2.isNativeSupported();
                        java.lang.Object qualifiedIntentId = mosaicPageEligibility2.getQualifiedIntentId();
                        r12 = new com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility(isSupportedOnMosaic, isWebSupported, isNativeSupported, qualifiedIntentId != null ? qualifiedIntentId.toString() : null);
                    }
                    return new arrow.core.Ior.Right(new com.paypal.oslo.core.network.graphql.GraphQLData(r12, graphQLData.getExtensions()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data data2 = (com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data) graphQLData2.getData();
                    if (data2 != null && (mosaicPageEligibility = data2.getMosaicPageEligibility()) != null) {
                        boolean isSupportedOnMosaic2 = mosaicPageEligibility.isSupportedOnMosaic();
                        boolean isWebSupported2 = mosaicPageEligibility.isWebSupported();
                        boolean isNativeSupported2 = mosaicPageEligibility.isNativeSupported();
                        java.lang.Object qualifiedIntentId2 = mosaicPageEligibility.getQualifiedIntentId();
                        r12 = new com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility(isSupportedOnMosaic2, isWebSupported2, isNativeSupported2, qualifiedIntentId2 != null ? qualifiedIntentId2.toString() : null);
                    }
                    return new arrow.core.Ior.Both(leftValue, new com.paypal.oslo.core.network.graphql.GraphQLData(r12, graphQLData2.getExtensions()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        mosaicEligibilityRepositoryImpl$getEligibility$1 = new com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl$getEligibility$1(this, continuation);
        java.lang.Object obj2 = mosaicEligibilityRepositoryImpl$getEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mosaicEligibilityRepositoryImpl$getEligibility$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
