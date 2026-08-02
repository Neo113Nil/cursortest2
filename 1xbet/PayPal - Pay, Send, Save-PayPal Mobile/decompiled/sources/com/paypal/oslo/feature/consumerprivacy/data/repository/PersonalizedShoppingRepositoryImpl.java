package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/PersonalizedShoppingRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApi;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedShoppingMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApi;Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedShoppingMapper;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShopping;", "getPersonalizedShoppingSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "updatePersonalizedShoppingPreference", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApi;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/PersonalizedShoppingMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedShoppingRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PersonalizedShoppingRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi personalizedShoppingApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.PersonalizedShoppingMapper personalizedShoppingMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingMapper, "");
        this.getHighSpeedVideoFpsRangesFor = personalizedShoppingApi;
        this.getHighSpeedVideoFpsRanges = personalizedShoppingMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPersonalizedShoppingSettings(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1 personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1) {
            personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1) continuation;
            if ((personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi personalizedShoppingApi = this.getHighSpeedVideoFpsRangesFor;
                    personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = personalizedShoppingApi.getPersonalizedShoppingConsent(personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1);
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
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(this.getHighSpeedVideoFpsRanges.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()), this.getHighSpeedVideoFpsRanges.mapQueryToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1(this, continuation);
        java.lang.Object obj2 = personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = personalizedShoppingRepositoryImpl$getPersonalizedShoppingSettings$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePersonalizedShoppingPreference(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1 personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1) {
            personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1) continuation;
            if ((personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi personalizedShoppingApi = this.getHighSpeedVideoFpsRangesFor;
                    personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoSizes = 1;
                    obj = personalizedShoppingApi.updatePersonalizedShoppingConsent(z, personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping mapMutationToDomain = this.getHighSpeedVideoFpsRanges.mapMutationToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData(), z);
                    if (mapMutationToDomain != null) {
                        return new arrow.core.Ior.Right(mapMutationToDomain);
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.createUpdateFailedError());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping mapMutationToDomain2 = this.getHighSpeedVideoFpsRanges.mapMutationToDomain((com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData(), z);
                    if (mapMutationToDomain2 != null) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoFpsRanges.mapError(callError), mapMutationToDomain2);
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1(this, continuation);
        java.lang.Object obj2 = personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = personalizedShoppingRepositoryImpl$updatePersonalizedShoppingPreference$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
