package com.paypal.oslo.core.navigation.scene.effect;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1", f = "GlowStateManager.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class GlowStateManagerKt$rememberGlowState$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.BottomSheetScaffoldState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Pair highSpeedVideoSizes;
                    highSpeedVideoSizes = com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1.getHighSpeedVideoSizes(androidx.compose.material3.BottomSheetScaffoldState.this);
                    return highSpeedVideoSizes;
                }
            });
            final float f = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.MutableFloatState mutableFloatState = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.Pair pair = (kotlin.Pair) obj2;
                    androidx.compose.material3.SheetValue sheetValue = (androidx.compose.material3.SheetValue) pair.component1();
                    java.lang.Float f2 = (java.lang.Float) pair.component2();
                    if (sheetValue == androidx.compose.material3.SheetValue.Hidden) {
                        mutableState.setValue(java.lang.Boolean.valueOf(true));
                        mutableFloatState.setFloatValue(0.0f);
                    } else if (f2 == null || f <= 0.0f) {
                        mutableState.setValue(java.lang.Boolean.valueOf(false));
                        mutableFloatState.setFloatValue(1.0f);
                    } else if (f2.floatValue() / f > 0.98f) {
                        mutableState.setValue(java.lang.Boolean.valueOf(true));
                        mutableFloatState.setFloatValue(0.0f);
                    } else {
                        mutableState.setValue(java.lang.Boolean.valueOf(false));
                        mutableFloatState.setFloatValue(1.0f);
                    }
                    if (f2 != null) {
                        mutableFloatState2.setFloatValue(f2.floatValue());
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair getHighSpeedVideoSizes(androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState) {
        java.lang.Float f;
        androidx.compose.material3.SheetValue currentValue = bottomSheetScaffoldState.getBottomSheetState().getCurrentValue();
        try {
            f = java.lang.Float.valueOf(bottomSheetScaffoldState.getBottomSheetState().requireOffset());
        } catch (java.lang.IllegalStateException unused) {
            f = null;
        }
        return new kotlin.Pair(currentValue, f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlowStateManagerKt$rememberGlowState$2$1(androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, float f, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetScaffoldState;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoSizes = mutableFloatState;
        this.Camera2StreamConfigurationMap = mutableFloatState2;
    }
}
