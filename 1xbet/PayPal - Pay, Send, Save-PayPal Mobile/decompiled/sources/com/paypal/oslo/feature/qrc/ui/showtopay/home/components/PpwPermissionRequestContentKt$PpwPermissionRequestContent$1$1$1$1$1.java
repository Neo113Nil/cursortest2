package com.paypal.oslo.feature.qrc.ui.showtopay.home.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1", f = "PpwPermissionRequestContent.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, nl = {76}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.getHighSpeedVideoSizes.requestPermission(new com.paypal.oslo.core.permission.domain.model.PermissionRequest(com.paypal.oslo.core.permission.domain.model.PermissionType.FineLocation.INSTANCE, "To provide location for PayPal World", com.paypal.oslo.feature.qrc.domain.utils.Constants.FEATURE_QRC), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus = (com.paypal.oslo.core.permission.domain.model.PermissionStatus) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted.INSTANCE)) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.ShouldShowRationale.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.navigateToPermissionSettings();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt$PpwPermissionRequestContent$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = permissionController;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
