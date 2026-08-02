package androidx.compose.foundation.text.contextmenu.provider;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl sessionImpl = this.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                java.lang.Object receive = sessionImpl.getHighSpeedVideoSizes.receive(this);
                if (receive != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    receive = kotlin.Unit.INSTANCE;
                }
                if (receive == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTextContextMenuProvider$showTextContextMenu$2(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider, androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.SessionImpl sessionImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = basicTextContextMenuProvider;
        this.getHighSpeedVideoFpsRangesFor = sessionImpl;
    }
}
