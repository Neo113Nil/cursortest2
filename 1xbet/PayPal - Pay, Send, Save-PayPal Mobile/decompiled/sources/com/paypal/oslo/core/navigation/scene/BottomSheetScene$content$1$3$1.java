package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$3$1", f = "BottomSheetScene.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes2.dex */
final class BottomSheetScene$content$1$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.core.navigation.scene.DismissType> getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.BottomSheetScene<T> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.getHighSpeedVideoFpsRangesFor.getVisible()) {
            completableDeferred = ((com.paypal.oslo.core.navigation.scene.BottomSheetScene) this.getOutputMinFrameDuration).getHighSpeedVideoFpsRanges;
            completableDeferred.complete(kotlin.Unit.INSTANCE);
            int i = com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$3$1.WhenMappings.$EnumSwitchMapping$0[com.paypal.oslo.core.navigation.scene.BottomSheetScene.access$content$lambda$0$4(this.getHighSpeedVideoSizes).ordinal()];
            if (i == 1) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
                if (function0 == null) {
                    function0 = ((com.paypal.oslo.core.navigation.scene.BottomSheetScene) this.getOutputMinFrameDuration).getOutputFormats;
                }
                function0.invoke();
            } else if (i == 2) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (function02 == null) {
                    function02 = ((com.paypal.oslo.core.navigation.scene.BottomSheetScene) this.getOutputMinFrameDuration).getOutputFormats;
                }
                function02.invoke();
            } else if (i == 3) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.Camera2StreamConfigurationMap;
                if (function03 == null) {
                    function03 = ((com.paypal.oslo.core.navigation.scene.BottomSheetScene) this.getOutputMinFrameDuration).getOutputFormats;
                }
                function03.invoke();
            } else if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.navigation.scene.DismissType.values().length];
            try {
                iArr[com.paypal.oslo.core.navigation.scene.DismissType.Camera2StreamConfigurationMap.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.navigation.scene.DismissType.getHighSpeedVideoFpsRanges.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.navigation.scene.DismissType.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.navigation.scene.DismissType.getHighSpeedVideoFpsRangesFor.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$3$1(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomSheetScene$content$1$3$1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.scene.BottomSheetScene<T> bottomSheetScene, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.MutableState<com.paypal.oslo.core.navigation.scene.DismissType> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
        this.getOutputMinFrameDuration = bottomSheetScene;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
        this.Camera2StreamConfigurationMap = function03;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
