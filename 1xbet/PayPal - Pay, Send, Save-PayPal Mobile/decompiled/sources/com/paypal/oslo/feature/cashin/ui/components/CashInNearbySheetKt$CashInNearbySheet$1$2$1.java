package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CashInNearbySheetKt$CashInNearbySheet$1$2$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.unit.Density getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRanges;
        final androidx.compose.runtime.MutableFloatState mutableFloatState = this.Camera2StreamConfigurationMap;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1.Camera2StreamConfigurationMap(androidx.compose.ui.unit.Density.this, mutableFloatState, mutableState);
            }
        };
        final androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.Camera2StreamConfigurationMap;
        java.lang.Object detectVerticalDragGestures$default = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, null, function0, null, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1.getHighSpeedVideoSizes(androidx.compose.runtime.MutableFloatState.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj, ((java.lang.Float) obj2).floatValue());
            }
        }, continuation, 5, null);
        return detectVerticalDragGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectVerticalDragGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
        float floatValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange, "");
        floatValue = mutableFloatState.getFloatValue();
        mutableFloatState.setFloatValue(floatValue + f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableFloatState mutableFloatState, final androidx.compose.runtime.MutableState mutableState) {
        float floatValue;
        floatValue = mutableFloatState.getFloatValue();
        com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.handleDragEnd(density, floatValue, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        mutableFloatState.setFloatValue(0.0f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    CashInNearbySheetKt$CashInNearbySheet$1$2$1(androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        this.getHighSpeedVideoFpsRanges = density;
        this.Camera2StreamConfigurationMap = mutableFloatState;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
