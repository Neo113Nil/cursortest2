package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SelectionManager$contextMenuAreaModifier$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.selection.SelectionManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Pair<androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextRange> contextTextAndSelection$foundation = this.getHighSpeedVideoSizes.getContextTextAndSelection$foundation();
            if (contextTextAndSelection$foundation != null) {
                androidx.compose.foundation.text.selection.SelectionManager selectionManager = this.getHighSpeedVideoSizes;
                androidx.compose.ui.text.AnnotatedString component1 = contextTextAndSelection$foundation.component1();
                long getHighResolutionOutputSizeshNQ4ISI = contextTextAndSelection$foundation.component2().getGetHighResolutionOutputSizeshNQ4ISI();
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = selectionManager.getPlatformSelectionBehaviors();
                if (platformSelectionBehaviors != null) {
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (platformSelectionBehaviors.mo2378onShowSelectionToolbarSbBc2M(component1, getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$contextMenuAreaModifier$2(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = selectionManager;
    }
}
