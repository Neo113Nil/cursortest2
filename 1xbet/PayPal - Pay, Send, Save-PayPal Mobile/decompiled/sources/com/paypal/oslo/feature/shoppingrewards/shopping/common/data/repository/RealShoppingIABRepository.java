package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\n2\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u000fJ*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\n2\u0006\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0014\u0010\u000fJ*\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0013\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/RealShoppingIABRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "honeyStoreId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "fetchStoreInfoByHoneyStoreId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offerId", "", "enrollInOffer", "p0", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/api/graphql/schema/type/StoresInput;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/api/graphql/schema/type/StoresInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldagger/Lazy;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RealShoppingIABRepository extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository {
    public static final int MAX_ENROLLMENT_RETRIES = 5;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;
    public static final int $stable = 8;

    public RealShoppingIABRepository(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository
    public final java.lang.Object fetchStoreInfoByHoneyStoreId(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>>> continuation) {
        return getHighSpeedVideoFpsRanges(new com.paypal.oslo.api.graphql.schema.type.StoresInput(com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(str))), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object enrollInOffer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<kotlin.Unit>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository$enrollInOffer$1 realShoppingIABRepository$enrollInOffer$1;
        int i;
        java.lang.String str2;
        int i2;
        arrow.core.Ior ior;
        java.lang.String str3;
        arrow.core.Ior ior2;
        arrow.core.Ior ior3;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository realShoppingIABRepository = this;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository$enrollInOffer$1) {
            realShoppingIABRepository$enrollInOffer$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository$enrollInOffer$1) continuation;
            if ((realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = realShoppingIABRepository$enrollInOffer$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizesFor;
                int i3 = 5;
                char c = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "[IAB] Repository enrollInOffer called", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", str2)), null, 4, null);
                    i2 = 0;
                    ior = null;
                    if (i2 < i3) {
                    }
                } else if (i == 1) {
                    i2 = realShoppingIABRepository$enrollInOffer$1.Camera2StreamConfigurationMap;
                    str3 = (java.lang.String) realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    ior2 = (arrow.core.Ior) obj;
                    if (ior2 != null) {
                    }
                    if (!ior3.isLeft()) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizes;
                    i2 = realShoppingIABRepository$enrollInOffer$1.Camera2StreamConfigurationMap;
                    ior = (arrow.core.Ior) realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.String str4 = (java.lang.String) realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    char c2 = 2;
                    str2 = str4;
                    int i4 = 5;
                    int i5 = 1;
                    char c3 = 0;
                    i2 += i5;
                    realShoppingIABRepository = this;
                    i3 = i4;
                    c = c3;
                    if (i2 < i3) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
                        kotlin.Pair pair = kotlin.TuplesKt.to("offerId", str2);
                        kotlin.Pair pair2 = kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i2 + 1));
                        kotlin.Pair pair3 = kotlin.TuplesKt.to("maxRetries", kotlin.coroutines.jvm.internal.Boxing.boxInt(i3));
                        kotlin.Pair[] pairArr = new kotlin.Pair[3];
                        pairArr[c] = pair;
                        pairArr[1] = pair2;
                        pairArr[2] = pair3;
                        com.paypal.android.logger.Logger.d$default(logger, "[IAB] Repository enrollment attempt starting", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRanges = str2;
                        realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        realShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        realShoppingIABRepository$enrollInOffer$1.Camera2StreamConfigurationMap = i2;
                        realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object highSpeedVideoSizes = realShoppingIABRepository.getHighSpeedVideoSizes(str2, realShoppingIABRepository$enrollInOffer$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            str3 = str2;
                            obj = highSpeedVideoSizes;
                            ior2 = (arrow.core.Ior) obj;
                            if (ior2 != null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                                ior3 = null;
                            } else {
                                ior3 = ior2;
                            }
                            if (!ior3.isLeft()) {
                                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
                                kotlin.Pair pair4 = kotlin.TuplesKt.to("offerId", str3);
                                kotlin.Pair pair5 = kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i2 + 1));
                                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                                pairArr2[c] = pair4;
                                pairArr2[1] = pair5;
                                com.paypal.android.logger.Logger.d$default(logger2, "[IAB] Repository enrollment SUCCESS", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                                return ior2;
                            }
                            com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) ior2.leftOrNull();
                            if (dataResultError != null && !(dataResultError instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.NoInternet) && !(dataResultError instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown)) {
                                com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
                                kotlin.Pair pair6 = kotlin.TuplesKt.to("offerId", str3);
                                kotlin.Pair pair7 = kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i2 + 1));
                                kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                                pairArr3[c] = pair6;
                                pairArr3[1] = pair7;
                                com.paypal.android.logger.Logger.d$default(logger3, "[IAB] Repository enrollment FAILED with non-retryable error, aborting", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                                return ior2;
                            }
                            if (i2 < 4) {
                                long j2 = 1000 << i2;
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "[IAB] Repository enrollment FAILED, retrying after delay", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", str3), kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i2 + 1)), kotlin.TuplesKt.to("nextDelayMs", kotlin.coroutines.jvm.internal.Boxing.boxLong(j2))), null, 4, null);
                                realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRanges = str3;
                                realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoFpsRangesFor = ior2;
                                realShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(dataResultError);
                                realShoppingIABRepository$enrollInOffer$1.Camera2StreamConfigurationMap = i2;
                                realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizes = j2;
                                c2 = 2;
                                realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizesFor = 2;
                                if (kotlinx.coroutines.DelayKt.delay(j2, realShoppingIABRepository$enrollInOffer$1) != coroutine_suspended) {
                                    i4 = 5;
                                    c3 = 0;
                                    i5 = 1;
                                    java.lang.String str5 = str3;
                                    ior = ior2;
                                    str2 = str5;
                                }
                            } else {
                                c2 = 2;
                                i4 = 5;
                                c3 = 0;
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "[IAB] Repository enrollment FAILED, all retries exhausted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", str3), kotlin.TuplesKt.to("attempts", kotlin.coroutines.jvm.internal.Boxing.boxInt(5))), null, 4, null);
                                i5 = 1;
                                java.lang.String str6 = str3;
                                ior = ior2;
                                str2 = str6;
                            }
                            i2 += i5;
                            realShoppingIABRepository = this;
                            i3 = i4;
                            c = c3;
                            if (i2 < i3) {
                                if (ior != null) {
                                    return ior;
                                }
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                                return null;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        realShoppingIABRepository$enrollInOffer$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository$enrollInOffer$1(realShoppingIABRepository, continuation);
        java.lang.Object obj2 = realShoppingIABRepository$enrollInOffer$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = realShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizesFor;
        int i32 = 5;
        char c4 = 0;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<kotlin.Unit>>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput = new com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput(str, "SHOP_IAB_SHOPPINGCOLLECTIONS_PROMOTIONS", com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID);
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation(enrollInPromotionOfferInput), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository.$r8$lambda$fMfw_G2pviJKz29ml2KWigLGZ4E((com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Data) obj);
            }
        }, null, continuation, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.StoresInput storesInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput merchantOffersInput = new com.paypal.oslo.api.graphql.schema.type.MerchantOffersInput("SHOP_IAB_SHOPPINGCOLLECTIONS_PROMOTIONS", com.paypal.oslo.api.graphql.schema.type.PromotionPlatform.ANDROID, null, null, null, 28, null);
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery(storesInput, merchantOffersInput), com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.StoreInfoMapperKt.getStoreInfoDataMapper(), null, null, continuation, 12, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fMfw_G2pviJKz29ml2KWigLGZ4E(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return kotlin.Unit.INSTANCE;
    }
}
