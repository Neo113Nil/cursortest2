package com.paypal.oslo.core.navigation.scene.effect;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1", f = "GlowStateManager.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSuspend", n = {"anchorOffset"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class GlowStateManagerKt$MonitorL1ContentAlpha$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.BottomSheetScaffoldState Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState = this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Triple highSpeedVideoSizes;
                    highSpeedVideoSizes = com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1.getHighSpeedVideoSizes(androidx.compose.material3.BottomSheetScaffoldState.this);
                    return highSpeedVideoSizes;
                }
            });
            final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            final float f = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1.2
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Float, java.lang.Number] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.Triple triple = (kotlin.Triple) obj2;
                    androidx.compose.material3.SheetValue sheetValue = (androidx.compose.material3.SheetValue) triple.component1();
                    androidx.compose.material3.SheetValue sheetValue2 = (androidx.compose.material3.SheetValue) triple.component2();
                    ?? r8 = (T) ((java.lang.Float) triple.component3());
                    float f2 = 1.0f;
                    if (sheetValue == androidx.compose.material3.SheetValue.Hidden) {
                        function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f));
                        objectRef.element = null;
                    } else if (r8 != 0) {
                        if (objectRef.element == null) {
                            objectRef.element = r8;
                        }
                        java.lang.Float f3 = objectRef.element;
                        if (f3 == null) {
                            return kotlin.Unit.INSTANCE;
                        }
                        float floatValue = r8.floatValue() - f3.floatValue();
                        float f4 = f * 0.3f;
                        if (floatValue > 0.0f) {
                            f2 = floatValue < f4 ? 1.0f - (kotlin.ranges.RangesKt.coerceIn(floatValue / f4, 0.0f, 1.0f) * 0.7f) : 0.3f;
                        }
                        function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f2));
                        if (sheetValue == androidx.compose.material3.SheetValue.Expanded && sheetValue2 == androidx.compose.material3.SheetValue.Expanded) {
                            objectRef.element = r8;
                        }
                        return kotlin.Unit.INSTANCE;
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
    public static final kotlin.Triple getHighSpeedVideoSizes(androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState) {
        java.lang.Float f;
        androidx.compose.material3.SheetValue currentValue = bottomSheetScaffoldState.getBottomSheetState().getCurrentValue();
        androidx.compose.material3.SheetValue targetValue = bottomSheetScaffoldState.getBottomSheetState().getTargetValue();
        try {
            f = java.lang.Float.valueOf(bottomSheetScaffoldState.getBottomSheetState().requireOffset());
        } catch (java.lang.IllegalStateException unused) {
            f = null;
        }
        return new kotlin.Triple(currentValue, targetValue, f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GlowStateManagerKt$MonitorL1ContentAlpha$1$1(androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, float f, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bottomSheetScaffoldState;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = f;
    }
}
