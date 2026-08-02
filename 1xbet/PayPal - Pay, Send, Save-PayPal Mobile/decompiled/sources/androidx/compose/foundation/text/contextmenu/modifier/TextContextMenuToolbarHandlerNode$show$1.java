package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", i = {}, l = {205, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextContextMenuToolbarHandlerNode$show$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7.invoke(r6) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6.getHighResolutionOutputSizeshNQ4ISI.showTextContextMenu(r6.getHighSpeedVideoFpsRangesFor, r6) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.lang.Throwable th2) {
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onHide = this.getHighSpeedVideoFpsRangesFor.getOnHide();
            if (onHide == null) {
                throw th2;
            }
            this.Camera2StreamConfigurationMap = th2;
            this.getHighSpeedVideoFpsRanges = 4;
            if (onHide.invoke(this) != coroutine_suspended) {
                th = th2;
            }
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onShow = this.getHighSpeedVideoFpsRangesFor.getOnShow();
            if (onShow != null) {
                this.getHighSpeedVideoFpsRanges = 1;
                if (onShow.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onHide2 = this.getHighSpeedVideoFpsRangesFor.getOnHide();
                    if (onHide2 != null) {
                        this.getHighSpeedVideoFpsRanges = 3;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextContextMenuToolbarHandlerNode$show$1(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider textContextMenuProvider, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = textContextMenuToolbarHandlerNode;
        this.getHighResolutionOutputSizeshNQ4ISI = textContextMenuProvider;
    }
}
