package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {504, 510}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldCoreModifierNode$updateScrollState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.geometry.Rect Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r6.getBringIntoViewRequester().bringIntoView(r5.Camera2StreamConfigurationMap, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r6, androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt.access$roundToNext(r5.getHighSpeedVideoFpsRanges), r5) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.ScrollState scrollState;
        androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            scrollState = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizes = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            textLayoutState = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$updateScrollState$1(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, float f, boolean z, androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = textFieldCoreModifierNode;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = rect;
    }
}
