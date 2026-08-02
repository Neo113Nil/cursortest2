package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DateInputKt$DateInputTextField$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.Locale Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.CalendarModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.internal.DateInputFormat getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.Long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long TextRange;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor;
        if (l != null) {
            androidx.compose.material3.internal.CalendarModel calendarModel = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.material3.internal.DateInputFormat dateInputFormat = this.getHighSpeedVideoFpsRanges;
            java.util.Locale locale = this.Camera2StreamConfigurationMap;
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState = this.getHighSpeedVideoSizes;
            java.lang.String formatWithPattern = calendarModel.formatWithPattern(l.longValue(), dateInputFormat.getPatternWithoutDelimiters(), locale);
            if (formatWithPattern.length() == 0) {
                TextRange = androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
            } else {
                TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(formatWithPattern.length(), formatWithPattern.length());
            }
            mutableState.setValue(new androidx.compose.ui.text.input.TextFieldValue(formatWithPattern, TextRange, (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.DateInputKt$DateInputTextField$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.DateInputKt$DateInputTextField$5$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateInputKt$DateInputTextField$5$1(java.lang.Long l, androidx.compose.material3.internal.CalendarModel calendarModel, androidx.compose.material3.internal.DateInputFormat dateInputFormat, java.util.Locale locale, androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState, kotlin.coroutines.Continuation<? super androidx.compose.material3.DateInputKt$DateInputTextField$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = l;
        this.getHighResolutionOutputSizeshNQ4ISI = calendarModel;
        this.getHighSpeedVideoFpsRanges = dateInputFormat;
        this.Camera2StreamConfigurationMap = locale;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
