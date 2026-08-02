package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.CharSequence getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, textClassifier, this);
            if (highSpeedVideoSizes == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(android.view.textclassifier.TextClassifier textClassifier, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2) create(textClassifier, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2.getHighSpeedVideoFpsRanges = obj;
        return platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, java.lang.CharSequence charSequence, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = platformSelectionBehaviorsImpl;
        this.getHighSpeedVideoSizes = charSequence;
        this.Camera2StreamConfigurationMap = j;
    }
}
