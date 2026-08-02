package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextRange;", "Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", i = {0, 0, 0, 1}, l = {369, 159}, m = "invokeSuspend", n = {"suggestedSelection", "$this$withLock_u24default$iv", "newSelection", "newSelection"}, s = {"L$0", "L$1", "J$0", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.TextRange>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.os.LocaleList Camera2StreamConfigurationMap;
        java.lang.Object highSpeedVideoSizes;
        long j;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        java.lang.CharSequence charSequence;
        android.view.textclassifier.TextSelection textSelection;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) this.getOutputMinFrameDuration;
            android.view.textclassifier.TextSelection.Request.Builder builder = new android.view.textclassifier.TextSelection.Request.Builder(this.getHighSpeedVideoFpsRanges, androidx.compose.ui.text.TextRange.m8037getMinimpl(this.getHighSpeedVideoSizes), androidx.compose.ui.text.TextRange.m8036getMaximpl(this.getHighSpeedVideoSizes));
            Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap();
            android.view.textclassifier.TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(Camera2StreamConfigurationMap);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            android.view.textclassifier.TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            if (android.os.Build.VERSION.SDK_INT < 31 || suggestSelection.getTextClassification() == null) {
                this.getHighSpeedVideoFpsRangesFor = TextRange;
                this.getInputFormats = 2;
                highSpeedVideoSizes = this.getOutputFormats.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, TextRange, textClassifier, this);
                if (highSpeedVideoSizes != coroutine_suspended) {
                    j = TextRange;
                }
            } else {
                mutex = this.getOutputFormats.Camera2StreamConfigurationMap;
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.getOutputFormats;
                java.lang.CharSequence charSequence2 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = suggestSelection;
                this.Camera2StreamConfigurationMap = mutex;
                this.getHighResolutionOutputSizeshNQ4ISI = platformSelectionBehaviorsImpl2;
                this.getInputSizeshNQ4ISI = charSequence2;
                this.getHighSpeedVideoFpsRangesFor = TextRange;
                this.getInputFormats = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    platformSelectionBehaviorsImpl = platformSelectionBehaviorsImpl2;
                    charSequence = charSequence2;
                    textSelection = suggestSelection;
                    j = TextRange;
                    android.view.textclassifier.TextClassification textClassification = textSelection.getTextClassification();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(textClassification);
                    platformSelectionBehaviorsImpl.Camera2StreamConfigurationMap(new androidx.compose.foundation.text.selection.TextClassificationResult(charSequence, j, textClassification, null));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            j = this.getHighSpeedVideoFpsRangesFor;
            java.lang.CharSequence charSequence3 = (java.lang.CharSequence) this.getInputSizeshNQ4ISI;
            platformSelectionBehaviorsImpl = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl) this.getHighResolutionOutputSizeshNQ4ISI;
            mutex = (kotlinx.coroutines.sync.Mutex) this.Camera2StreamConfigurationMap;
            textSelection = (android.view.textclassifier.TextSelection) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            charSequence = charSequence3;
            try {
                android.view.textclassifier.TextClassification textClassification2 = textSelection.getTextClassification();
                kotlin.jvm.internal.Intrinsics.checkNotNull(textClassification2);
                platformSelectionBehaviorsImpl.Camera2StreamConfigurationMap(new androidx.compose.foundation.text.selection.TextClassificationResult(charSequence, j, textClassification2, null));
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
                mutex.unlock(null);
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return androidx.compose.ui.text.TextRange.m8027boximpl(j);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(android.view.textclassifier.TextClassifier textClassifier, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.TextRange> continuation) {
        return ((androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(textClassifier, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputFormats, continuation);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.getOutputMinFrameDuration = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(java.lang.CharSequence charSequence, long j, androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = charSequence;
        this.getHighSpeedVideoSizes = j;
        this.getOutputFormats = platformSelectionBehaviorsImpl;
    }
}
