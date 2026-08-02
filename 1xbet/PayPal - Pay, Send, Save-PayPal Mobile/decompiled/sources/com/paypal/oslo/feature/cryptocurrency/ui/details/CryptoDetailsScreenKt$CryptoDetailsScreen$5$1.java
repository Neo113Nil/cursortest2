package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1", f = "CryptoDetailsScreen.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {143}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsScreenKt$CryptoDetailsScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputFormats;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1$1", f = "CryptoDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getInputFormats;
        int getOutputFormats;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect assetPriceDetailsEffect = (com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect) this.getInputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt.m13884access$handleEffectsJfh4LTQ(assetPriceDetailsEffect, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect assetPriceDetailsEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1.AnonymousClass1) create(assetPriceDetailsEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
            this.Camera2StreamConfigurationMap = bottomSheetController2;
            this.getOutputMinFrameDuration = bottomSheetController3;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = str2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizesFor.getEffect(), new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsScreenKt$CryptoDetailsScreen$5$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt$CryptoDetailsScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = cryptoDetailsViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
        this.getHighSpeedVideoSizes = bottomSheetController2;
        this.getInputFormats = bottomSheetController3;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
    }
}
