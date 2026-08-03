package io.ktor.http.cio;

/* compiled from: HttpHeadersMap.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HttpHeadersMap$getAll$1", f = "HttpHeadersMap.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"$this$sequence", "headerIndex"}, s = {"L$0", "I$0"})
/* loaded from: classes6.dex */
final class HttpHeadersMap$getAll$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.CharSequence>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $name;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.http.cio.HttpHeadersMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpHeadersMap$getAll$1(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String str, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpHeadersMap$getAll$1> continuation) {
        super(2, continuation);
        this.this$0 = httpHeadersMap;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.HttpHeadersMap$getAll$1 httpHeadersMap$getAll$1 = new io.ktor.http.cio.HttpHeadersMap$getAll$1(this.this$0, this.$name, continuation);
        httpHeadersMap$getAll$1.L$0 = obj;
        return httpHeadersMap$getAll$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.CharSequence> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.HttpHeadersMap$getAll$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r7.L$0 = r4;
        r7.I$0 = r1;
        r7.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r4.yield(r7.this$0.valueAtOffset(r5), r7) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0085, code lost:
    
        if (r1 != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0094, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:5:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2;
        kotlin.sequences.SequenceScope sequenceScope;
        io.ktor.http.cio.HeadersData headersData;
        boolean headerHasName;
        int i3;
        io.ktor.http.cio.HeadersData headersData2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
            if (this.this$0.getSize() != 0) {
                int abs = java.lang.Math.abs(io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(this.$name, 0, 0, 3, null));
                i = this.this$0.headerCapacity;
                i2 = abs % i;
                sequenceScope = sequenceScope2;
                while (true) {
                    headersData = this.this$0.headersData;
                    int i5 = i2 * 6;
                    if (headersData.at(i5) == -1) {
                        break;
                    }
                    headerHasName = this.this$0.headerHasName(this.$name, i5);
                    if (headerHasName) {
                        break;
                    }
                    i3 = this.this$0.headerCapacity;
                    i2 = (i2 + 1) % i3;
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            headersData2 = this.this$0.headersData;
            i2 = headersData2.at((i2 * 6) + 5);
        }
    }
}
