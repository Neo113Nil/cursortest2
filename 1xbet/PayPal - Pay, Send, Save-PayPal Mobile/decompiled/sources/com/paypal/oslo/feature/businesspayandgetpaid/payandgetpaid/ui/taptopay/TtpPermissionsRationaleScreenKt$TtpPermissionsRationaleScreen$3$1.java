package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1", f = "TtpPermissionsRationaleScreen.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, nl = {113}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleCallbacks getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.view.Lifecycle getHighSpeedVideoSizes;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1$1", f = "TtpPermissionsRationaleScreen.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, nl = {112}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleCallbacks getHighSpeedVideoSizes;
        int getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean booleanValue;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
                if (booleanValue) {
                    this.getInputSizeshNQ4ISI = 1;
                    if (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt.handleAction(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationPermissionCheck.INSTANCE, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(true));
                    return kotlin.Unit.INSTANCE;
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
            return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, android.content.Context context, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleCallbacks ttpRationaleCallbacks, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = permissionController;
            this.getHighSpeedVideoFpsRangesFor = context;
            this.getHighSpeedVideoSizes = ttpRationaleCallbacks;
            this.getHighSpeedVideoFpsRanges = function0;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighSpeedVideoSizes, androidx.lifecycle.Lifecycle.State.RESUMED, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1.AnonymousClass1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1(androidx.view.Lifecycle lifecycle, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, android.content.Context context, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleCallbacks ttpRationaleCallbacks, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = lifecycle;
        this.getOutputMinFrameDuration = permissionController;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoFpsRanges = ttpRationaleCallbacks;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
