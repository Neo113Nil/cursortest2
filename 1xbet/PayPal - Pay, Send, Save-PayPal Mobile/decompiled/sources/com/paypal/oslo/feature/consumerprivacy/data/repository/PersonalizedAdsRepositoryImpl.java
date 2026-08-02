package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/PersonalizedAdsRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApi;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedAdsMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApi;Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedAdsMapper;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedAdsPreference;", "getPersonalizedAdsPreference", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "updatePersonalizedAdsPreference", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApi;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedAdsMapper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedAdsRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PersonalizedAdsRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi personalizedAdsApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedAdsMapper personalizedAdsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedAdsApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedAdsMapper, "");
        this.getHighSpeedVideoSizes = personalizedAdsApi;
        this.getHighResolutionOutputSizeshNQ4ISI = personalizedAdsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPersonalizedAdsPreference(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1 personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1) {
            personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1) continuation;
            if ((personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi personalizedAdsApi = this.getHighSpeedVideoSizes;
                    personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = personalizedAdsApi.getPersonalizedAdsPreference(personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1);
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
                    return new arrow.core.Ior.Left(this.getHighResolutionOutputSizeshNQ4ISI.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(this.getHighResolutionOutputSizeshNQ4ISI.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference mapQueryToDomain = this.getHighResolutionOutputSizeshNQ4ISI.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData());
                    if (mapQueryToDomain != null) {
                        return new arrow.core.Ior.Both(this.getHighResolutionOutputSizeshNQ4ISI.mapError(callError), mapQueryToDomain);
                    }
                    return new arrow.core.Ior.Left(this.getHighResolutionOutputSizeshNQ4ISI.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1(this, continuation);
        java.lang.Object obj2 = personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = personalizedAdsRepositoryImpl$getPersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePersonalizedAdsPreference(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1 personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.UpdatePersonalizedAds updatePersonalizedAds;
        com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.UpdatePersonalizedAds updatePersonalizedAds2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1) {
            personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1) continuation;
            if ((personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi personalizedAdsApi = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.api.graphql.schema.type.UpdatePersonalizedAdsInput updatePersonalizedAdsInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePersonalizedAdsInput(z);
                    personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoFpsRanges = z;
                    personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoSizes = 1;
                    obj = personalizedAdsApi.updatePersonalizedAdsPreference(updatePersonalizedAdsInput, personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighResolutionOutputSizeshNQ4ISI.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (updatePersonalizedAds2 = data.getUpdatePersonalizedAds()) != null) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updatePersonalizedAds2.getSuccess()));
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (updatePersonalizedAds = data2.getUpdatePersonalizedAds()) != null) {
                        return new arrow.core.Ior.Both(this.getHighResolutionOutputSizeshNQ4ISI.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updatePersonalizedAds.getSuccess()));
                    }
                    return new arrow.core.Ior.Left(this.getHighResolutionOutputSizeshNQ4ISI.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1(this, continuation);
        java.lang.Object obj2 = personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = personalizedAdsRepositoryImpl$updatePersonalizedAdsPreference$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
