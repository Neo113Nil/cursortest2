package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HttpHeadersMap$getAll$1", f = "HttpHeadersMap.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"$this$sequence", "headerIndex"}, s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
final class HttpHeadersMap$getAll$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.CharSequence>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.http.cio.HttpHeadersMap getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        r7.getHighResolutionOutputSizeshNQ4ISI = r4;
        r7.Camera2StreamConfigurationMap = r1;
        r7.getHighSpeedVideoFpsRangesFor = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r4.yield(r7.getHighSpeedVideoFpsRanges.valueAtOffset(r5), r7) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0099, code lost:
    
        if (r1 != (-1)) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007e -> B:5:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2;
        kotlin.sequences.SequenceScope sequenceScope;
        io.ktor.http.cio.HeadersData headersData;
        boolean highSpeedVideoFpsRanges;
        int i3;
        io.ktor.http.cio.HeadersData headersData2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getHighResolutionOutputSizeshNQ4ISI;
            if (this.getHighSpeedVideoFpsRanges.getSize() == 0) {
                return kotlin.Unit.INSTANCE;
            }
            int abs = java.lang.Math.abs(io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(this.getHighSpeedVideoSizes, 0, 0, 3, null));
            i = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            i2 = abs % i;
            sequenceScope = sequenceScope2;
            while (true) {
                headersData = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                int i5 = i2 * 6;
                if (headersData.getHighResolutionOutputSizeshNQ4ISI.get(i5 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i5 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] == -1) {
                    break;
                }
                highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i5);
                if (highSpeedVideoFpsRanges) {
                    break;
                }
                i3 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                i2 = (i2 + 1) % i3;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i4 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = this.Camera2StreamConfigurationMap;
        sequenceScope = (kotlin.sequences.SequenceScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        headersData2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        int i6 = (i2 * 6) + 5;
        i2 = headersData2.getHighResolutionOutputSizeshNQ4ISI.get(i6 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i6 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.CharSequence> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.HttpHeadersMap$getAll$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.HttpHeadersMap$getAll$1 httpHeadersMap$getAll$1 = new io.ktor.http.cio.HttpHeadersMap$getAll$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        httpHeadersMap$getAll$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return httpHeadersMap$getAll$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpHeadersMap$getAll$1(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String str, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HttpHeadersMap$getAll$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = httpHeadersMap;
        this.getHighSpeedVideoSizes = str;
    }
}
