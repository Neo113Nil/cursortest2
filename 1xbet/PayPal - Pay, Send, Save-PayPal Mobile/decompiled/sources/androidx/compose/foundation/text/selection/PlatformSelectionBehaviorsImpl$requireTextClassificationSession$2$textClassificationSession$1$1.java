package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/view/textclassifier/TextClassifier;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.view.textclassifier.TextClassifier>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        androidx.compose.foundation.text.selection.SelectedTextType selectedTextType;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.text.selection.TextClassifierHelperMethods textClassifierHelperMethods = androidx.compose.foundation.text.selection.TextClassifierHelperMethods.INSTANCE;
        context = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        selectedTextType = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        android.view.textclassifier.TextClassifier createTextClassificationSession = textClassifierHelperMethods.createTextClassificationSession(context, selectedTextType);
        this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI = createTextClassificationSession;
        return createTextClassificationSession;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.view.textclassifier.TextClassifier> continuation) {
        return ((androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = platformSelectionBehaviorsImpl;
    }
}
