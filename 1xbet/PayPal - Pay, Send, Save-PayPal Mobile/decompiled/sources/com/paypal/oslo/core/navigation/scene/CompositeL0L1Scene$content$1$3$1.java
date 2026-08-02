package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$3$1", f = "OsloScene.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes2.dex */
final class CompositeL0L1Scene$content$1$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.L1TabState Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.BottomSheetScaffoldState getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r4.getHighSpeedVideoSizes.getBottomSheetState().hide(r4) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r4.getHighSpeedVideoSizes.getBottomSheetState().expand(r4) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            if (!z) {
                z3 = this.getHighSpeedVideoFpsRanges.getOutputFormats;
                if (z3 && this.getHighSpeedVideoSizes.getBottomSheetState().getCurrentValue() != androidx.compose.material3.SheetValue.Hidden) {
                    this.getHighSpeedVideoFpsRangesFor = 1;
                }
            }
            z2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            if (z2 && this.Camera2StreamConfigurationMap.isExpanded() && this.getHighSpeedVideoSizes.getBottomSheetState().getCurrentValue() != androidx.compose.material3.SheetValue.Expanded) {
                this.getHighSpeedVideoFpsRangesFor = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeL0L1Scene$content$1$3$1(com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene compositeL0L1Scene, androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, com.paypal.oslo.core.navigation.scene.L1TabState l1TabState, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = compositeL0L1Scene;
        this.getHighSpeedVideoSizes = bottomSheetScaffoldState;
        this.Camera2StreamConfigurationMap = l1TabState;
    }
}
