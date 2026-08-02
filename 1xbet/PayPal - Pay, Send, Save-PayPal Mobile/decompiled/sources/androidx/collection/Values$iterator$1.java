package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.Values$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {1446}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes6.dex */
final class Values$iterator$1<V> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.collection.Values<K, V> getInputSizeshNQ4ISI;
    int getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

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
        androidx.collection.ScatterMap scatterMap;
        java.lang.Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputFormats;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
            scatterMap = ((androidx.collection.Values) this.getInputSizeshNQ4ISI).getHighSpeedVideoFpsRanges;
            objArr = scatterMap.values;
            jArr = scatterMap.metadata;
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
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        long j2 = this.getHighSpeedVideoSizes;
        i = this.getHighSpeedVideoFpsRanges;
        int i5 = this.Camera2StreamConfigurationMap;
        long[] jArr2 = (long[]) this.getHighSpeedVideoSizesFor;
        java.lang.Object[] objArr2 = (java.lang.Object[]) this.getInputFormats;
        kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getOutputMinFrameDuration;
        kotlin.ResultKt.throwOnFailure(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i5;
                jArr = jArr2;
                objArr = objArr2;
                sequenceScope = sequenceScope2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i3 = 0;
                        jArr2 = jArr;
                        i5 = length;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        objArr2 = objArr;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                java.lang.Object obj2 = objArr2[(i << 3) + i3];
                                this.getOutputMinFrameDuration = sequenceScope2;
                                this.getInputFormats = objArr2;
                                this.getHighSpeedVideoSizesFor = jArr2;
                                this.Camera2StreamConfigurationMap = i5;
                                this.getHighSpeedVideoFpsRanges = i;
                                this.getHighSpeedVideoSizes = j2;
                                this.getHighSpeedVideoFpsRangesFor = i4;
                                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                                this.getOutputFormats = 1;
                                if (sequenceScope2.yield(obj2, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.collection.Values$iterator$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.collection.Values$iterator$1 values$iterator$1 = new androidx.collection.Values$iterator$1(this.getInputSizeshNQ4ISI, continuation);
        values$iterator$1.getOutputMinFrameDuration = obj;
        return values$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Values$iterator$1(androidx.collection.Values<K, V> values, kotlin.coroutines.Continuation<? super androidx.collection.Values$iterator$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = values;
    }
}
