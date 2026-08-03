package kotlin.text;

/* compiled from: Regex.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {279, 287, 291}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes6.dex */
final class Regex$splitToSequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ kotlin.text.Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(kotlin.text.Regex regex, java.lang.CharSequence charSequence, int i, kotlin.coroutines.Continuation<? super kotlin.text.Regex$splitToSequence$1> continuation) {
        super(2, continuation);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.text.Regex$splitToSequence$1 regex$splitToSequence$1 = new kotlin.text.Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, continuation);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.String> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.text.Regex$splitToSequence$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:13:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.regex.Pattern pattern;
        int i;
        kotlin.sequences.SequenceScope sequenceScope;
        java.util.regex.Matcher matcher;
        int i2;
        java.lang.CharSequence charSequence;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
            pattern = this.this$0.nativePattern;
            java.util.regex.Matcher matcher2 = pattern.matcher(this.$input);
            if (this.$limit == 1 || !matcher2.find()) {
                this.label = 1;
                if (sequenceScope2.yield(this.$input.toString(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                i = 0;
                sequenceScope = sequenceScope2;
                matcher = matcher2;
                i2 = 0;
                this.L$0 = sequenceScope;
                this.L$1 = matcher;
                this.I$0 = i2;
                this.label = 2;
                if (sequenceScope.yield(this.$input.subSequence(i, matcher.start()).toString(), this) == coroutine_suspended) {
                }
                i = matcher.end();
                i2++;
                if (i2 != this.$limit - 1) {
                }
                charSequence = this.$input;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (sequenceScope.yield(charSequence.subSequence(i, charSequence.length()).toString(), this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                i2 = this.I$0;
                java.util.regex.Matcher matcher3 = (java.util.regex.Matcher) this.L$1;
                sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                matcher = matcher3;
                i = matcher.end();
                i2++;
                if (i2 != this.$limit - 1 || !matcher.find()) {
                    charSequence = this.$input;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (sequenceScope.yield(charSequence.subSequence(i, charSequence.length()).toString(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                this.L$0 = sequenceScope;
                this.L$1 = matcher;
                this.I$0 = i2;
                this.label = 2;
                if (sequenceScope.yield(this.$input.subSequence(i, matcher.start()).toString(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = matcher.end();
                i2++;
                if (i2 != this.$limit - 1) {
                }
                charSequence = this.$input;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (sequenceScope.yield(charSequence.subSequence(i, charSequence.length()).toString(), this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
