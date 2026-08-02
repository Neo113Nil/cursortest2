package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1188}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes6.dex */
final class MutableSetWrapper$iterator$1$iterator$1<E> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.collection.MutableSetWrapper<E> getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ androidx.collection.MutableSetWrapper$iterator$1 getOutputSizes;
    private /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a8 -> B:5:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:15:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:6:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0080 -> B:5:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        androidx.collection.MutableScatterSet mutableScatterSet;
        androidx.collection.MutableSetWrapper$iterator$1 mutableSetWrapper$iterator$1;
        androidx.collection.MutableSetWrapper<E> mutableSetWrapper;
        long[] jArr;
        int length;
        int i;
        long j;
        androidx.collection.MutableScatterSet mutableScatterSet2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputMinFrameDuration;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputSizeshNQ4ISI;
            mutableScatterSet = ((androidx.collection.MutableSetWrapper) this.getInputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            mutableSetWrapper$iterator$1 = this.getOutputSizes;
            mutableSetWrapper = this.getInputSizeshNQ4ISI;
            jArr = mutableScatterSet.metadata;
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
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        long j2 = this.getHighSpeedVideoSizes;
        int i5 = this.getHighSpeedVideoFpsRanges;
        int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
        long[] jArr2 = (long[]) this.getOutputFormats;
        androidx.collection.MutableSetWrapper<E> mutableSetWrapper2 = (androidx.collection.MutableSetWrapper) this.getHighSpeedVideoSizesFor;
        androidx.collection.MutableSetWrapper$iterator$1 mutableSetWrapper$iterator$12 = (androidx.collection.MutableSetWrapper$iterator$1) this.getInputFormats;
        kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                jArr = jArr2;
                mutableSetWrapper = mutableSetWrapper2;
                mutableSetWrapper$iterator$1 = mutableSetWrapper$iterator$12;
                sequenceScope = sequenceScope2;
                int i7 = i6;
                i = i5;
                length = i7;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i3 = 0;
                        jArr2 = jArr;
                        mutableSetWrapper2 = mutableSetWrapper;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        mutableSetWrapper$iterator$12 = mutableSetWrapper$iterator$1;
                        j2 = j;
                        int i8 = i;
                        i6 = length;
                        i5 = i8;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i3;
                                mutableSetWrapper$iterator$12.setCurrent(i9);
                                mutableScatterSet2 = ((androidx.collection.MutableSetWrapper) mutableSetWrapper2).Camera2StreamConfigurationMap;
                                java.lang.Object obj2 = mutableScatterSet2.elements[i9];
                                this.getOutputSizeshNQ4ISI = sequenceScope2;
                                this.getInputFormats = mutableSetWrapper$iterator$12;
                                this.getHighSpeedVideoSizesFor = mutableSetWrapper2;
                                this.getOutputFormats = jArr2;
                                this.getHighResolutionOutputSizeshNQ4ISI = i6;
                                this.getHighSpeedVideoFpsRanges = i5;
                                this.getHighSpeedVideoSizes = j2;
                                this.getHighSpeedVideoFpsRangesFor = i4;
                                this.Camera2StreamConfigurationMap = i3;
                                this.getOutputMinFrameDuration = 1;
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
        return ((androidx.collection.MutableSetWrapper$iterator$1$iterator$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.collection.MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new androidx.collection.MutableSetWrapper$iterator$1$iterator$1(this.getInputSizeshNQ4ISI, this.getOutputSizes, continuation);
        mutableSetWrapper$iterator$1$iterator$1.getOutputSizeshNQ4ISI = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableSetWrapper$iterator$1$iterator$1(androidx.collection.MutableSetWrapper<E> mutableSetWrapper, androidx.collection.MutableSetWrapper$iterator$1 mutableSetWrapper$iterator$1, kotlin.coroutines.Continuation<? super androidx.collection.MutableSetWrapper$iterator$1$iterator$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = mutableSetWrapper;
        this.getOutputSizes = mutableSetWrapper$iterator$1;
    }
}
