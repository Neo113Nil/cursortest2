package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", i = {}, l = {567}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.text.input.OffsetMapping getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.text.TextRange getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviors getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.text.input.TextFieldValue highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            obj = this.getHighSpeedVideoSizes.mo2379suggestSelectionForLongPressOrDoubleClickpYaCww(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.text.TextRange textRange = (androidx.compose.ui.text.TextRange) obj;
        if (textRange != null) {
            androidx.compose.ui.text.input.OffsetMapping offsetMapping = this.getHighResolutionOutputSizeshNQ4ISI;
            long getHighResolutionOutputSizeshNQ4ISI = textRange.getGetHighResolutionOutputSizeshNQ4ISI();
            long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(offsetMapping.transformedToOriginal(androidx.compose.ui.text.TextRange.m8039getStartimpl(getHighResolutionOutputSizeshNQ4ISI)), offsetMapping.transformedToOriginal(androidx.compose.ui.text.TextRange.m8034getEndimpl(getHighResolutionOutputSizeshNQ4ISI)));
            if (!androidx.compose.ui.text.TextRange.m8031equalsimpl(TextRange, this.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats.getValue$foundation().getText(), this.getHighSpeedVideoFpsRangesFor) && this.getHighResolutionOutputSizeshNQ4ISI == this.getOutputFormats.getOffsetMapping()) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange$foundation = this.getOutputFormats.getOnValueChange$foundation();
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.TextFieldSelectionManager.getHighSpeedVideoFpsRanges(this.getOutputFormats.getValue$foundation().getAnnotatedString(), TextRange);
                onValueChange$foundation.invoke(highSpeedVideoFpsRanges);
                this.getOutputFormats.m2450setLatestSelectionOEnZFl4$foundation(androidx.compose.ui.text.TextRange.m8027boximpl(TextRange));
            }
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$maybeSuggestSelection$1(androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors, java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.OffsetMapping offsetMapping, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = platformSelectionBehaviors;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = textRange;
        this.getOutputFormats = textFieldSelectionManager;
        this.getHighResolutionOutputSizeshNQ4ISI = offsetMapping;
    }
}
