package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", i = {}, l = {107, 108}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.ClickTextContextMenuDataProvider getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r6.getHighSpeedVideoFpsRangesFor.showTextContextMenu(r6.getHighSpeedVideoSizes, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r7.invoke(r1, r6) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2 function2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            function2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            if (function2 != null) {
                androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap = 1;
            }
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
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextContextMenuGestureNode$tryShowContextMenu$1(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode textContextMenuGestureNode, long j, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider textContextMenuProvider, androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.ClickTextContextMenuDataProvider clickTextContextMenuDataProvider, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = textContextMenuGestureNode;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = textContextMenuProvider;
        this.getHighSpeedVideoSizes = clickTextContextMenuDataProvider;
    }
}
