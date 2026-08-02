package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1", f = "AddressCollectionHalfSheet.kt", i = {0}, l = {197}, m = "invokeSuspend", n = {"wasVisible"}, nl = {203}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            booleanRef.element = this.getHighResolutionOutputSizeshNQ4ISI.getVisible();
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean visible;
                    visible = com.paypal.pds.components.BottomSheetController.this.getVisible();
                    return java.lang.Boolean.valueOf(visible);
                }
            });
            final androidx.compose.ui.focus.FocusManager focusManager = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(booleanRef);
            this.getHighSpeedVideoSizes = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    if (kotlin.jvm.internal.Ref.BooleanRef.this.element && !booleanValue) {
                        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
                    }
                    kotlin.jvm.internal.Ref.BooleanRef.this.element = booleanValue;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.focus.FocusManager focusManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$6$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = focusManager;
    }
}
