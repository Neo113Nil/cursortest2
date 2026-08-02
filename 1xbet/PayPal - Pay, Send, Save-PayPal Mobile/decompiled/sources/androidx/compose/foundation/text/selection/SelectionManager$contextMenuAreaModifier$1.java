package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "clickLocation", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SelectionManager$contextMenuAreaModifier$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.selection.SelectionManager getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j = this.getHighSpeedVideoFpsRanges;
            kotlin.Pair<androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextRange> contextTextAndSelection$foundation = this.getHighResolutionOutputSizeshNQ4ISI.getContextTextAndSelection$foundation();
            if (contextTextAndSelection$foundation != null) {
                androidx.compose.foundation.text.selection.SelectionManager selectionManager = this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.text.AnnotatedString component1 = contextTextAndSelection$foundation.component1();
                long getHighResolutionOutputSizeshNQ4ISI = contextTextAndSelection$foundation.component2().getGetHighResolutionOutputSizeshNQ4ISI();
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = selectionManager.getPlatformSelectionBehaviors();
                if (platformSelectionBehaviors != null) {
                    androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(j);
                    this.getHighSpeedVideoSizes = 1;
                    if (platformSelectionBehaviors.mo2377onShowContextMenu_2OEclM(component1, getHighResolutionOutputSizeshNQ4ISI, m5741boximpl, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1) create(androidx.compose.ui.geometry.Offset.m5741boximpl(offset.m5762unboximpl()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1 selectionManager$contextMenuAreaModifier$1 = new androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        selectionManager$contextMenuAreaModifier$1.getHighSpeedVideoFpsRanges = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
        return selectionManager$contextMenuAreaModifier$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$contextMenuAreaModifier$1(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = selectionManager;
    }
}
