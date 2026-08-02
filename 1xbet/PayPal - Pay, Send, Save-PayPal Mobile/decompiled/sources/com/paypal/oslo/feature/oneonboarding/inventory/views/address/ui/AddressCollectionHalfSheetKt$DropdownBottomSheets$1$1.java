package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1", f = "AddressCollectionHalfSheet.kt", i = {0}, l = {com.visa.cbp.getCertUsage.getAppPrgrmIDAID}, m = "invokeSuspend", n = {"wasVisible"}, nl = {339}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateMap<com.paypal.pds.components.DropdownState, java.lang.Integer> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.DropdownState getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            booleanRef.element = this.getHighSpeedVideoFpsRanges.getBottomSheetController().getVisible();
            final com.paypal.pds.components.DropdownState dropdownState = this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean visible;
                    visible = com.paypal.pds.components.DropdownState.this.getBottomSheetController().getVisible();
                    return java.lang.Boolean.valueOf(visible);
                }
            });
            final androidx.compose.runtime.snapshots.SnapshotStateMap<com.paypal.pds.components.DropdownState, java.lang.Integer> snapshotStateMap = this.Camera2StreamConfigurationMap;
            final com.paypal.pds.components.DropdownState dropdownState2 = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(booleanRef);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    if (kotlin.jvm.internal.Ref.BooleanRef.this.element && !booleanValue) {
                        java.lang.Integer num = snapshotStateMap.get(dropdownState2);
                        snapshotStateMap.put(dropdownState2, kotlin.coroutines.jvm.internal.Boxing.boxInt((num != null ? num.intValue() : 0) + 1));
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
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1(com.paypal.pds.components.DropdownState dropdownState, androidx.compose.runtime.snapshots.SnapshotStateMap<com.paypal.pds.components.DropdownState, java.lang.Integer> snapshotStateMap, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$DropdownBottomSheets$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = dropdownState;
        this.Camera2StreamConfigurationMap = snapshotStateMap;
    }
}
