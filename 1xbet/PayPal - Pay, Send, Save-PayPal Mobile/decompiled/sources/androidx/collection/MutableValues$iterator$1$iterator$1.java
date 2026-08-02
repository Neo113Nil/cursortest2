package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1696}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes6.dex */
final class MutableValues$iterator$1$iterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.collection.MutableValues<K, V> getOutputFormats;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0090 -> B:5:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:15:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:6:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0073 -> B:5:0x0093). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        androidx.collection.MutableScatterMap mutableScatterMap;
        long[] jArr;
        int length;
        int i;
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            mutableScatterMap = ((androidx.collection.MutableValues) this.getOutputFormats).Camera2StreamConfigurationMap;
            jArr = mutableScatterMap.metadata;
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
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        long j2 = this.getHighSpeedVideoFpsRanges;
        int i5 = this.Camera2StreamConfigurationMap;
        int i6 = this.getHighSpeedVideoSizes;
        long[] jArr2 = (long[]) this.getInputFormats;
        kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                i = i5;
                length = i6;
                jArr = jArr2;
                sequenceScope = sequenceScope2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i3 = 0;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        i6 = length;
                        i5 = i;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt((i5 << 3) + i3);
                                this.getInputSizeshNQ4ISI = sequenceScope2;
                                this.getInputFormats = jArr2;
                                this.getHighSpeedVideoSizes = i6;
                                this.Camera2StreamConfigurationMap = i5;
                                this.getHighSpeedVideoFpsRanges = j2;
                                this.getHighResolutionOutputSizeshNQ4ISI = i4;
                                this.getHighSpeedVideoFpsRangesFor = i3;
                                this.getHighSpeedVideoSizesFor = 1;
                                if (sequenceScope2.yield(boxInt, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            j2 >>= 8;
                            i3++;
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.Integer> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.collection.MutableValues$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.collection.MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new androidx.collection.MutableValues$iterator$1$iterator$1(this.getOutputFormats, continuation);
        mutableValues$iterator$1$iterator$1.getInputSizeshNQ4ISI = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableValues$iterator$1$iterator$1(androidx.collection.MutableValues<K, V> mutableValues, kotlin.coroutines.Continuation<? super androidx.collection.MutableValues$iterator$1$iterator$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = mutableValues;
    }
}
