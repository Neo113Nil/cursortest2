package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$loadOffer$1", f = "ShoppingIABViewModel.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 226}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "isFirstTime"}, nl = {200, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, s = {"L$0", "L$0", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABViewModel$loadOffer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        if (r1 == r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01dc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003b, code lost:
    
        if (r3 != r2) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState;
        boolean z;
        boolean z2;
        java.util.ArrayList arrayList;
        java.lang.Object access$fetchOfferDetails;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState copy;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        boolean z3 = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
            this.getHighSpeedVideoSizes = 1;
            highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                access$fetchOfferDetails = obj;
                com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) access$fetchOfferDetails;
                if (useCaseResult == null) {
                    com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Skipping backend fetch - no honeyStoreId", null, null, 6, null);
                    mutableStateFlow2 = shoppingIABViewModel.getInputSizeshNQ4ISI;
                    do {
                        value2 = mutableStateFlow2.getValue();
                        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState2 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState) value2;
                        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContent = shoppingIABUiState2.getBannerContent();
                        if (bannerContent != null) {
                            if (bannerContent.getCtaMode() == com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Loading) {
                                bannerContent = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData.copy$default(bannerContent, null, null, 0, false, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Hidden, 15, null);
                            }
                            bannerContentData = bannerContent;
                        } else {
                            bannerContentData = null;
                        }
                        copy = shoppingIABUiState2.copy((r28 & 1) != 0 ? shoppingIABUiState2.isLoadingData : false, (r28 & 2) != 0 ? shoppingIABUiState2.iabOfferDetails : null, (r28 & 4) != 0 ? shoppingIABUiState2.benefitDetails : null, (r28 & 8) != 0 ? shoppingIABUiState2.showInterstitial : false, (r28 & 16) != 0 ? shoppingIABUiState2.dialog : null, (r28 & 32) != 0 ? shoppingIABUiState2.toolBarInfo : null, (r28 & 64) != 0 ? shoppingIABUiState2.navBarInfo : null, (r28 & 128) != 0 ? shoppingIABUiState2.bannerContent : bannerContentData, (r28 & 256) != 0 ? shoppingIABUiState2.webViewConfig : null, (r28 & 512) != 0 ? shoppingIABUiState2.dataError : null, (r28 & 1024) != 0 ? shoppingIABUiState2.shouldDestroyWebView : false, (r28 & 2048) != 0 ? shoppingIABUiState2.showContinueButton : false, (r28 & 4096) != 0 ? shoppingIABUiState2.continueClicked : false);
                    } while (!mutableStateFlow2.compareAndSet(value2, copy));
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel.access$processOfferDetailsResult(this.getHighSpeedVideoFpsRangesFor, useCaseResult, this.Camera2StreamConfigurationMap);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRanges = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) highSpeedVideoFpsRanges).booleanValue();
        mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
            shoppingIABUiState = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState) value;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits = iabOfferDetails.getBenefits();
            if (benefits != null) {
                java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> list = benefits;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    for (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType : list) {
                        if (benefitType == com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY || benefitType == com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR) {
                            z = z3;
                            break;
                        }
                    }
                }
            }
            z = false;
            boolean access$getHasMerchantOffer = com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModelKt.access$getHasMerchantOffer(iabOfferDetails.getBenefitsMetadata());
            z2 = (z || access$getHasMerchantOffer || booleanValue) ? z3 : false;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = kotlin.TuplesKt.to("showContinueButton", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
            z3 = true;
            pairArr[1] = kotlin.TuplesKt.to("hasBnplOffer", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
            pairArr[2] = kotlin.TuplesKt.to("hasMerchantOffer", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(access$getHasMerchantOffer));
            pairArr[3] = kotlin.TuplesKt.to("isFirstTimeMerchant", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
            java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits2 = iabOfferDetails.getBenefits();
            if (benefits2 != null) {
                java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> list2 = benefits2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it.next()).name());
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            pairArr[4] = kotlin.TuplesKt.to("navBenefits", arrayList);
            com.paypal.android.logger.Logger.d$default(logger, "Interstitial mode decided", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        } while (!mutableStateFlow.compareAndSet(value, z2 ? shoppingIABUiState.copy((r28 & 1) != 0 ? shoppingIABUiState.isLoadingData : false, (r28 & 2) != 0 ? shoppingIABUiState.iabOfferDetails : null, (r28 & 4) != 0 ? shoppingIABUiState.benefitDetails : null, (r28 & 8) != 0 ? shoppingIABUiState.showInterstitial : false, (r28 & 16) != 0 ? shoppingIABUiState.dialog : null, (r28 & 32) != 0 ? shoppingIABUiState.toolBarInfo : null, (r28 & 64) != 0 ? shoppingIABUiState.navBarInfo : null, (r28 & 128) != 0 ? shoppingIABUiState.bannerContent : null, (r28 & 256) != 0 ? shoppingIABUiState.webViewConfig : null, (r28 & 512) != 0 ? shoppingIABUiState.dataError : null, (r28 & 1024) != 0 ? shoppingIABUiState.shouldDestroyWebView : false, (r28 & 2048) != 0 ? shoppingIABUiState.showContinueButton : true, (r28 & 4096) != 0 ? shoppingIABUiState.continueClicked : false) : shoppingIABUiState.copy((r28 & 1) != 0 ? shoppingIABUiState.isLoadingData : false, (r28 & 2) != 0 ? shoppingIABUiState.iabOfferDetails : null, (r28 & 4) != 0 ? shoppingIABUiState.benefitDetails : null, (r28 & 8) != 0 ? shoppingIABUiState.showInterstitial : false, (r28 & 16) != 0 ? shoppingIABUiState.dialog : null, (r28 & 32) != 0 ? shoppingIABUiState.toolBarInfo : null, (r28 & 64) != 0 ? shoppingIABUiState.navBarInfo : null, (r28 & 128) != 0 ? shoppingIABUiState.bannerContent : null, (r28 & 256) != 0 ? shoppingIABUiState.webViewConfig : null, (r28 & 512) != 0 ? shoppingIABUiState.dataError : null, (r28 & 1024) != 0 ? shoppingIABUiState.shouldDestroyWebView : false, (r28 & 2048) != 0 ? shoppingIABUiState.showContinueButton : false, (r28 & 4096) != 0 ? shoppingIABUiState.continueClicked : false)));
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRanges = booleanValue;
        this.getHighSpeedVideoSizes = 2;
        access$fetchOfferDetails = com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel.access$fetchOfferDetails(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getHoneyStoreId(), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$loadOffer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$loadOffer$1 shoppingIABViewModel$loadOffer$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$loadOffer$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        shoppingIABViewModel$loadOffer$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return shoppingIABViewModel$loadOffer$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABViewModel$loadOffer$1(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$loadOffer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = shoppingIABViewModel;
        this.Camera2StreamConfigurationMap = iabOfferDetails;
    }
}
