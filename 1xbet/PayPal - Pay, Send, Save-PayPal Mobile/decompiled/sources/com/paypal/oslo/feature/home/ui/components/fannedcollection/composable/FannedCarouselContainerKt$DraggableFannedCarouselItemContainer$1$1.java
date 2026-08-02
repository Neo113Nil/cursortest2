package com.paypal.oslo.feature.home.ui.components.fannedcollection.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1", f = "FannedCarouselContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes.getHideWhileTranslating()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1$1", f = "FannedCarouselContainer.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(1.0f);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.runtime.MutableFloatState mutableFloatState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = mutableFloatState;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableFloatState mutableFloatState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$DraggableFannedCarouselItemContainer$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = fannedCarouselPosition;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState;
    }
}
