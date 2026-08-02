package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000e\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/MockShoppingIABRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "<init>", "()V", "", "honeyStoreId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "fetchStoreInfoByHoneyStoreId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offerId", "", "enrollInOffer", "p0", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockShoppingIABRepository implements com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchStoreInfoByHoneyStoreId(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1 mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1;
        int i;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Companion companion;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1) {
            mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1) continuation;
            if ((mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Companion companion2 = com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE;
                    mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.getHighSpeedVideoFpsRangesFor = companion2;
                    mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1);
                    if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = highResolutionOutputSizeshNQ4ISI;
                    companion = companion2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Companion) mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(companion.success(null, obj));
            }
        }
        mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1(this, continuation);
        java.lang.Object obj2 = mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockShoppingIABRepository$fetchStoreInfoByHoneyStoreId$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(companion.success(null, obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object enrollInOffer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<kotlin.Unit>>> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$enrollInOffer$1 mockShoppingIABRepository$enrollInOffer$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$enrollInOffer$1) {
            mockShoppingIABRepository$enrollInOffer$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$enrollInOffer$1) continuation;
            if ((mockShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockShoppingIABRepository$enrollInOffer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(200L, mockShoppingIABRepository$enrollInOffer$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(null, kotlin.Unit.INSTANCE));
            }
        }
        mockShoppingIABRepository$enrollInOffer$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$enrollInOffer$1(this, continuation);
        java.lang.Object obj2 = mockShoppingIABRepository$enrollInOffer$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockShoppingIABRepository$enrollInOffer$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.INSTANCE.success(null, kotlin.Unit.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$generateIabOfferDetails$1 mockShoppingIABRepository$generateIabOfferDetails$1;
        int i;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$generateIabOfferDetails$1) {
            mockShoppingIABRepository$generateIabOfferDetails$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$generateIabOfferDetails$1) continuation;
            if ((mockShoppingIABRepository$generateIabOfferDetails$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockShoppingIABRepository$generateIabOfferDetails$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockShoppingIABRepository$generateIabOfferDetails$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockShoppingIABRepository$generateIabOfferDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockShoppingIABRepository$generateIabOfferDetails$1.getHighSpeedVideoFpsRangesFor = str;
                    mockShoppingIABRepository$generateIabOfferDetails$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(200L, mockShoppingIABRepository$generateIabOfferDetails$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) mockShoppingIABRepository$generateIabOfferDetails$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str3;
                }
                return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails("https://www.nike.com/", null, null, null, null, null, "Pay in 4 available", str2, "mock-offer-id", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[]{com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK}), new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation("Get 5% back", kotlin.collections.CollectionsKt.listOf("https://paypal.com/terms"), "Terms apply", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"checkcircle", "check"}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Earn points on purchases", "Check out with PayPal"})), getHighSpeedVideoFpsRangesFor(), 2110, null);
            }
        }
        mockShoppingIABRepository$generateIabOfferDetails$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$generateIabOfferDetails$1(this, continuation);
        java.lang.Object obj2 = mockShoppingIABRepository$generateIabOfferDetails$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockShoppingIABRepository$generateIabOfferDetails$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails("https://www.nike.com/", null, null, null, null, null, "Pay in 4 available", str2, "mock-offer-id", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[]{com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK}), new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation("Get 5% back", kotlin.collections.CollectionsKt.listOf("https://paypal.com/terms"), "Terms apply", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"checkcircle", "check"}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Earn points on purchases", "Check out with PayPal"})), getHighSpeedVideoFpsRangesFor(), 2110, null);
    }

    private static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails getHighSpeedVideoFpsRangesFor() {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails(com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository.m19609$r8$lambda$UrEBc0VEm8aaWMGZgIWnM81wiI((com.paypal.pds.core.Builder) obj);
            }
        }), "Split your way with PayPal Pay in 4", "Taking you to", com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle, null, 16, null);
    }

    /* renamed from: $r8$lambda$U-rEBc0VEm8aaWMGZgIWnM81wiI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19609$r8$lambda$UrEBc0VEm8aaWMGZgIWnM81wiI(com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, "Buy Now Pay Later at", null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
