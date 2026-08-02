package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1", f = "CommonContextMenuArea.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.foundation.text.MenuItemsAvailability> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.runtime.MutableState<androidx.compose.foundation.text.MenuItemsAvailability> mutableState2 = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = mutableState2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object contextMenuItemsAvailability = androidx.compose.foundation.text.CommonContextMenuAreaKt.getContextMenuItemsAvailability(this.getHighSpeedVideoSizes, this);
            if (contextMenuItemsAvailability == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState = mutableState2;
            obj = contextMenuItemsAvailability;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (androidx.compose.runtime.MutableState) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(androidx.compose.runtime.MutableState<androidx.compose.foundation.text.MenuItemsAvailability> mutableState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoSizes = textFieldSelectionState;
    }
}
