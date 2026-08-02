package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, 304, 308}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "$this$sequence", "matcher", "nextStart", "splitCount", "$this$sequence", "matcher", "nextStart", "splitCount"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, 305, 309}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes3.dex */
final class Regex$splitToSequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.CharSequence getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.text.Regex getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (r0.yield(r4.subSequence(r11, r4.length()).toString(), r10) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r0.yield(r10.getHighSpeedVideoSizes.toString(), r10) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:13:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.regex.Pattern pattern;
        int i;
        java.util.regex.Matcher matcher;
        int i2;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getInputSizeshNQ4ISI;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pattern = this.getHighSpeedVideoSizesFor.nativePattern;
            java.util.regex.Matcher matcher2 = pattern.matcher(this.getHighSpeedVideoSizes);
            if (this.getHighResolutionOutputSizeshNQ4ISI != 1 && matcher2.find()) {
                i = 0;
                matcher = matcher2;
                i2 = 0;
                this.getOutputFormats = sequenceScope;
                this.getHighSpeedVideoFpsRangesFor = matcher;
                this.getHighSpeedVideoFpsRanges = i;
                this.Camera2StreamConfigurationMap = i2;
                this.getInputSizeshNQ4ISI = 2;
                if (sequenceScope.yield(this.getHighSpeedVideoSizes.subSequence(i, matcher.start()).toString(), this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(matcher2);
            this.getInputSizeshNQ4ISI = 1;
        } else if (i3 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            int i4 = this.Camera2StreamConfigurationMap;
            matcher = (java.util.regex.Matcher) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            int end = matcher.end();
            int i5 = i4 + 1;
            if (i5 == this.getHighResolutionOutputSizeshNQ4ISI - 1 && matcher.find()) {
                i = end;
                i2 = i5;
                this.getOutputFormats = sequenceScope;
                this.getHighSpeedVideoFpsRangesFor = matcher;
                this.getHighSpeedVideoFpsRanges = i;
                this.Camera2StreamConfigurationMap = i2;
                this.getInputSizeshNQ4ISI = 2;
                if (sequenceScope.yield(this.getHighSpeedVideoSizes.subSequence(i, matcher.start()).toString(), this) != coroutine_suspended) {
                    i4 = i2;
                    int end2 = matcher.end();
                    int i52 = i4 + 1;
                    if (i52 == this.getHighResolutionOutputSizeshNQ4ISI - 1) {
                    }
                    java.lang.CharSequence charSequence = this.getHighSpeedVideoSizes;
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(matcher);
                    this.getHighSpeedVideoFpsRanges = end2;
                    this.Camera2StreamConfigurationMap = i52;
                    this.getInputSizeshNQ4ISI = 3;
                }
                return coroutine_suspended;
            }
            java.lang.CharSequence charSequence2 = this.getHighSpeedVideoSizes;
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(matcher);
            this.getHighSpeedVideoFpsRanges = end2;
            this.Camera2StreamConfigurationMap = i52;
            this.getInputSizeshNQ4ISI = 3;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.String> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.text.Regex$splitToSequence$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.text.Regex$splitToSequence$1 regex$splitToSequence$1 = new kotlin.text.Regex$splitToSequence$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        regex$splitToSequence$1.getOutputFormats = obj;
        return regex$splitToSequence$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, kotlin.coroutines.Continuation<? super kotlin.text.Regex$splitToSequence$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = regex;
        this.getHighSpeedVideoSizes = charSequence;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
