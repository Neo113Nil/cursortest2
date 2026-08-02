package com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel$loadVariants$1", f = "CommerceItemProductDetailsViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, nl = {134}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class CommerceItemProductDetailsViewModel$loadVariants$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase getCommerceItemVariantsUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard card;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getCommerceItemVariantsUseCase = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            invoke = getCommerceItemVariantsUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel commerceItemProductDetailsViewModel = this.getInputFormats;
        java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            java.util.ArrayList arrayList = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            if (!arrayList.isEmpty()) {
                mutableStateFlow = commerceItemProductDetailsViewModel.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData productDetailData = (com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData) mutableStateFlow.getValue();
                java.lang.Object obj2 = null;
                java.lang.String cashBack = (productDetailData == null || (card = productDetailData.getCard()) == null) ? null : card.getCashBack();
                java.lang.String str4 = cashBack;
                if (str4 != null && str4.length() != 0) {
                    java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> list = arrayList;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard : list) {
                        java.lang.String cashBack2 = productCard.getCashBack();
                        if (cashBack2 == null || cashBack2.length() == 0) {
                            productCard = productCard.copy((r30 & 1) != 0 ? productCard.id : null, (r30 & 2) != 0 ? productCard.imageUrl : null, (r30 & 4) != 0 ? productCard.secondaryImageUrls : null, (r30 & 8) != 0 ? productCard.itemName : null, (r30 & 16) != 0 ? productCard.info : null, (r30 & 32) != 0 ? productCard.price : null, (r30 & 64) != 0 ? productCard.listPrice : null, (r30 & 128) != 0 ? productCard.cashBack : cashBack, (r30 & 256) != 0 ? productCard.url : null, (r30 & 512) != 0 ? productCard.details : null, (r30 & 1024) != 0 ? productCard.agenticActions : null, (r30 & 2048) != 0 ? productCard.storeId : null, (r30 & 4096) != 0 ? productCard.storeLogo : null, (r30 & 8192) != 0 ? productCard.storeName : null);
                        }
                        arrayList2.add(productCard);
                    }
                    arrayList = arrayList2;
                }
                java.util.Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) next).getId(), str3)) {
                        obj2 = next;
                        break;
                    }
                }
                com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard2 = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) obj2;
                if (productCard2 == null) {
                    productCard2 = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) kotlin.collections.CollectionsKt.first((java.util.List) arrayList);
                }
                commerceItemProductDetailsViewModel.initializeWithVariants$search_and_intelligence_prodRelease(arrayList, productCard2);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.PDP_VARIANTS_REQUEST_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", str), kotlin.TuplesKt.to("product_id", str2), kotlin.TuplesKt.to("error_message", ((com.paypal.oslo.feature.searchandintelligence.domain.error.GetCommerceItemVariantsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel$loadVariants$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel$loadVariants$1(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommerceItemProductDetailsViewModel$loadVariants$1(com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel commerceItemProductDetailsViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel$loadVariants$1> continuation) {
        super(2, continuation);
        this.getInputFormats = commerceItemProductDetailsViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getHighSpeedVideoFpsRanges = str4;
    }
}
