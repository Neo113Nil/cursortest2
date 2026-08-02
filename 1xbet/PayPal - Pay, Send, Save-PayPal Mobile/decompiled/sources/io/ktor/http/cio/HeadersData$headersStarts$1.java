package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.HeadersData$headersStarts$1", f = "HttpHeadersMap.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "invokeSuspend", n = {"$this$sequence", "arr", "joinedIndex", "localIndex"}, s = {"L$0", "L$2", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class HeadersData$headersStarts$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ io.ktor.http.cio.HeadersData getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005e -> B:6:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007a -> B:5:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0040 -> B:7:0x004a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        java.util.List list;
        java.util.Iterator it;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoSizesFor;
            list = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            it = list.iterator();
            i = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.getHighSpeedVideoSizes;
            int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int[] iArr = (int[]) this.getHighSpeedVideoFpsRanges;
            java.util.Iterator it2 = (java.util.Iterator) this.Camera2StreamConfigurationMap;
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = sequenceScope2;
            int[] iArr2 = iArr;
            int i5 = i4;
            java.util.Iterator it3 = it2;
            int[] iArr3 = iArr2;
            i3 += 6;
            i5 += 6;
            if (i3 < iArr3.length) {
                it = it3;
                i = i5;
                if (!it.hasNext()) {
                    iArr3 = (int[]) it.next();
                    i5 = i;
                    it3 = it;
                    i3 = 0;
                    if (i3 < iArr3.length) {
                        if (this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI.get(i5 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i5 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] != -1) {
                            this.getHighSpeedVideoSizesFor = sequenceScope;
                            this.Camera2StreamConfigurationMap = it3;
                            this.getHighSpeedVideoFpsRanges = iArr3;
                            this.getHighResolutionOutputSizeshNQ4ISI = i5;
                            this.getHighSpeedVideoSizes = i3;
                            this.getHighSpeedVideoFpsRangesFor = 1;
                            if (sequenceScope.yield(kotlin.coroutines.jvm.internal.Boxing.boxInt(i5), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            sequenceScope2 = sequenceScope;
                            int[] iArr4 = iArr3;
                            it2 = it3;
                            i4 = i5;
                            iArr = iArr4;
                            sequenceScope = sequenceScope2;
                            int[] iArr22 = iArr;
                            int i52 = i4;
                            java.util.Iterator it32 = it2;
                            int[] iArr32 = iArr22;
                        }
                        i3 += 6;
                        i52 += 6;
                        if (i3 < iArr32.length) {
                        }
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.Integer> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.HeadersData$headersStarts$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.HeadersData$headersStarts$1 headersData$headersStarts$1 = new io.ktor.http.cio.HeadersData$headersStarts$1(this.getOutputMinFrameDuration, continuation);
        headersData$headersStarts$1.getHighSpeedVideoSizesFor = obj;
        return headersData$headersStarts$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeadersData$headersStarts$1(io.ktor.http.cio.HeadersData headersData, kotlin.coroutines.Continuation<? super io.ktor.http.cio.HeadersData$headersStarts$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = headersData;
    }
}
