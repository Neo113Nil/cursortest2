package androidx.compose.runtime.collection;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {31}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"}, v = 1)
/* loaded from: classes3.dex */
final class ScatterSetWrapper$iterator$1<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.collection.ScatterSetWrapper<T> getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0091 -> B:5:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:15:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:6:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0074 -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        java.lang.Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputSizeshNQ4ISI;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoSizesFor;
            androidx.collection.ScatterSet<T> set$runtime = this.getOutputFormats.getSet$runtime();
            objArr = set$runtime.elements;
            jArr = set$runtime.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = this.Camera2StreamConfigurationMap;
        long j2 = this.getHighSpeedVideoFpsRanges;
        i = this.getHighSpeedVideoFpsRangesFor;
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        long[] jArr2 = (long[]) this.getOutputMinFrameDuration;
        java.lang.Object[] objArr2 = (java.lang.Object[]) this.getInputFormats;
        kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.sequences.SequenceScope sequenceScope3 = sequenceScope2;
        j2 >>= 8;
        i3++;
        kotlin.sequences.SequenceScope sequenceScope4 = sequenceScope3;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i5;
                jArr = jArr2;
                objArr = objArr2;
                sequenceScope = sequenceScope4;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        sequenceScope4 = sequenceScope;
                        i3 = 0;
                        jArr2 = jArr;
                        i5 = length;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        objArr2 = objArr;
                        j2 = j;
                        if (i3 < i4) {
                            sequenceScope3 = sequenceScope4;
                            if ((255 & j2) < 128) {
                                java.lang.Object obj2 = objArr2[(i << 3) + i3];
                                this.getHighSpeedVideoSizesFor = sequenceScope4;
                                this.getInputFormats = objArr2;
                                this.getOutputMinFrameDuration = jArr2;
                                this.getHighResolutionOutputSizeshNQ4ISI = i5;
                                this.getHighSpeedVideoFpsRangesFor = i;
                                this.getHighSpeedVideoFpsRanges = j2;
                                this.Camera2StreamConfigurationMap = i4;
                                this.getHighSpeedVideoSizes = i3;
                                this.getInputSizeshNQ4ISI = 1;
                                java.lang.Object yield = sequenceScope4.yield(obj2, this);
                                sequenceScope3 = sequenceScope4;
                                if (yield == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            j2 >>= 8;
                            i3++;
                            kotlin.sequences.SequenceScope sequenceScope42 = sequenceScope3;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.sequences.SequenceScope<? super T> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1(this.getOutputFormats, continuation);
        scatterSetWrapper$iterator$1.getHighSpeedVideoSizesFor = obj;
        return scatterSetWrapper$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterSetWrapper$iterator$1(androidx.compose.runtime.collection.ScatterSetWrapper<T> scatterSetWrapper, kotlin.coroutines.Continuation<? super androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = scatterSetWrapper;
    }
}
