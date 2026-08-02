package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef.this);
            }
        };
        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef.this);
            }
        };
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.getHighSpeedVideoSizes;
        java.lang.Object detectVerticalDragGestures$default = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, null, function0, function02, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef.this, function03, (androidx.compose.ui.input.pointer.PointerInputChange) obj, ((java.lang.Float) obj2).floatValue());
            }
        }, continuation, 1, null);
        return detectVerticalDragGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectVerticalDragGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef floatRef) {
        floatRef.element = 0.0f;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange, "");
        floatRef.element += f;
        if (floatRef.element < -50.0f) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef floatRef) {
        floatRef.element = 0.0f;
        return kotlin.Unit.INSTANCE;
    }

    StepupOtpVerificationScreenKt$OtpEffectHandler$7$4$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoSizes = function0;
    }
}
