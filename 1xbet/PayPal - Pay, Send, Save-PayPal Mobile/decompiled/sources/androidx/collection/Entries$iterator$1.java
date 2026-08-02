package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1414}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes6.dex */
final class Entries$iterator$1<K, V> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.Map.Entry<? extends K, ? extends V>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ androidx.collection.Entries<K, V> getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a3 -> B:5:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:6:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b4 -> B:16:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0073 -> B:5:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        androidx.collection.ScatterMap scatterMap;
        androidx.collection.Entries<K, V> entries;
        long[] jArr;
        int length;
        int i;
        long j;
        androidx.collection.ScatterMap scatterMap2;
        androidx.collection.ScatterMap scatterMap3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizesFor;
        int i3 = 8;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputFormats;
            scatterMap = ((androidx.collection.Entries) this.getInputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            entries = this.getInputSizeshNQ4ISI;
            jArr = scatterMap.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = this.getHighSpeedVideoSizes;
        long j2 = this.getHighSpeedVideoFpsRanges;
        i = this.Camera2StreamConfigurationMap;
        int i6 = this.getHighSpeedVideoFpsRangesFor;
        long[] jArr2 = (long[]) this.getOutputMinFrameDuration;
        androidx.collection.Entries<K, V> entries2 = (androidx.collection.Entries) this.getOutputFormats;
        kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getInputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        j2 >>= 8;
        i4++;
        i3 = 8;
        if (i4 < i5) {
            int i7 = i3;
            if (i5 == i7) {
                length = i6;
                jArr = jArr2;
                entries = entries2;
                sequenceScope = sequenceScope2;
                if (i != length) {
                    i++;
                    i3 = i7;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i4 = 0;
                        jArr2 = jArr;
                        i6 = length;
                        i5 = 8 - ((~(i - length)) >>> 31);
                        entries2 = entries;
                        j2 = j;
                        if (i4 < i5) {
                            if ((255 & j2) < 128) {
                                int i8 = (i << 3) + i4;
                                scatterMap2 = ((androidx.collection.Entries) entries2).Camera2StreamConfigurationMap;
                                java.lang.Object obj2 = scatterMap2.keys[i8];
                                scatterMap3 = ((androidx.collection.Entries) entries2).Camera2StreamConfigurationMap;
                                androidx.collection.MapEntry mapEntry = new androidx.collection.MapEntry(obj2, scatterMap3.values[i8]);
                                this.getInputFormats = sequenceScope2;
                                this.getOutputFormats = entries2;
                                this.getOutputMinFrameDuration = jArr2;
                                this.getHighSpeedVideoFpsRangesFor = i6;
                                this.Camera2StreamConfigurationMap = i;
                                this.getHighSpeedVideoFpsRanges = j2;
                                this.getHighSpeedVideoSizes = i5;
                                this.getHighResolutionOutputSizeshNQ4ISI = i4;
                                this.getHighSpeedVideoSizesFor = 1;
                                if (sequenceScope2.yield(mapEntry, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                            i3 = 8;
                            if (i4 < i5) {
                            }
                        }
                    } else {
                        i7 = i3;
                        if (i != length) {
                        }
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.collection.Entries$iterator$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.collection.Entries$iterator$1 entries$iterator$1 = new androidx.collection.Entries$iterator$1(this.getInputSizeshNQ4ISI, continuation);
        entries$iterator$1.getInputFormats = obj;
        return entries$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Entries$iterator$1(androidx.collection.Entries<K, V> entries, kotlin.coroutines.Continuation<? super androidx.collection.Entries$iterator$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = entries;
    }
}
