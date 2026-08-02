package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R4\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/collection/MutableEntries$iterator$1;", "", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/util/Map$Entry;", "", "remove", "()V", "", "current", com.visa.cbp.getEncExpo.warmup, "getCurrent", "()I", "setCurrent", "(I)V", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableEntries$iterator$1<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
    private int current = -1;
    final /* synthetic */ androidx.collection.MutableEntries<K, V> getHighSpeedVideoFpsRangesFor;
    private java.util.Iterator<? extends java.util.Map.Entry<K, V>> iterator;

    MutableEntries$iterator$1(androidx.collection.MutableEntries<K, V> mutableEntries) {
        this.getHighSpeedVideoFpsRangesFor = mutableEntries;
        this.iterator = kotlin.sequences.SequencesKt.iterator(new androidx.collection.MutableEntries$iterator$1.AnonymousClass1(mutableEntries, this, null));
    }

    public final java.util.Iterator<java.util.Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final void setIterator(java.util.Iterator<? extends java.util.Map.Entry<K, V>> it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        this.iterator = it;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1538}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    /* renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.Map.Entry<K, V>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        long Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        final /* synthetic */ androidx.collection.MutableEntries<K, V> getOutputFormats;
        int getOutputMinFrameDuration;
        final /* synthetic */ androidx.collection.MutableEntries$iterator$1 getOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00b7 -> B:6:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0062 -> B:7:0x0078). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00cf -> B:17:0x00d1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0081 -> B:5:0x002c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.sequences.SequenceScope sequenceScope;
            androidx.collection.MutableScatterMap mutableScatterMap;
            androidx.collection.MutableEntries$iterator$1 mutableEntries$iterator$1;
            androidx.collection.MutableEntries<K, V> mutableEntries;
            long[] jArr;
            int length;
            int i;
            long j;
            androidx.collection.MutableScatterMap mutableScatterMap2;
            androidx.collection.MutableScatterMap mutableScatterMap3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.getOutputMinFrameDuration;
            int i3 = 8;
            int i4 = 1;
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputStallDurationlomOqCM;
                mutableScatterMap = ((androidx.collection.MutableEntries) this.getOutputFormats).Camera2StreamConfigurationMap;
                mutableEntries$iterator$1 = this.getOutputSizeshNQ4ISI;
                mutableEntries = this.getOutputFormats;
                jArr = mutableScatterMap.metadata;
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
            int i5 = this.getHighSpeedVideoSizes;
            int i6 = this.getHighSpeedVideoFpsRanges;
            long j2 = this.Camera2StreamConfigurationMap;
            int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i8 = this.getHighSpeedVideoFpsRangesFor;
            long[] jArr2 = (long[]) this.getInputSizeshNQ4ISI;
            androidx.collection.MutableEntries<K, V> mutableEntries2 = (androidx.collection.MutableEntries) this.getHighSpeedVideoSizesFor;
            androidx.collection.MutableEntries$iterator$1 mutableEntries$iterator$12 = (androidx.collection.MutableEntries$iterator$1) this.getInputFormats;
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getOutputStallDurationlomOqCM;
            kotlin.ResultKt.throwOnFailure(obj);
            int i9 = i4;
            j2 >>= 8;
            i5 += i9;
            i4 = i9;
            i3 = 8;
            if (i5 < i6) {
                int i10 = i3;
                int i11 = i4;
                if (i6 == i10) {
                    jArr = jArr2;
                    mutableEntries = mutableEntries2;
                    mutableEntries$iterator$1 = mutableEntries$iterator$12;
                    sequenceScope = sequenceScope2;
                    int i12 = i8;
                    i = i7;
                    length = i12;
                    if (i != length) {
                        i++;
                        i4 = i11;
                        i3 = i10;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            sequenceScope2 = sequenceScope;
                            i5 = 0;
                            jArr2 = jArr;
                            mutableEntries2 = mutableEntries;
                            i6 = 8 - ((~(i - length)) >>> 31);
                            mutableEntries$iterator$12 = mutableEntries$iterator$1;
                            j2 = j;
                            int i13 = i;
                            i8 = length;
                            i7 = i13;
                            if (i5 < i6) {
                                if ((255 & j2) < 128) {
                                    mutableEntries$iterator$12.setCurrent((i7 << 3) + i5);
                                    mutableScatterMap2 = ((androidx.collection.MutableEntries) mutableEntries2).Camera2StreamConfigurationMap;
                                    java.lang.Object[] objArr = mutableScatterMap2.keys;
                                    mutableScatterMap3 = ((androidx.collection.MutableEntries) mutableEntries2).Camera2StreamConfigurationMap;
                                    androidx.collection.MutableMapEntry mutableMapEntry = new androidx.collection.MutableMapEntry(objArr, mutableScatterMap3.values, mutableEntries$iterator$12.getCurrent());
                                    this.getOutputStallDurationlomOqCM = sequenceScope2;
                                    this.getInputFormats = mutableEntries$iterator$12;
                                    this.getHighSpeedVideoSizesFor = mutableEntries2;
                                    this.getInputSizeshNQ4ISI = jArr2;
                                    this.getHighSpeedVideoFpsRangesFor = i8;
                                    this.getHighResolutionOutputSizeshNQ4ISI = i7;
                                    this.Camera2StreamConfigurationMap = j2;
                                    this.getHighSpeedVideoFpsRanges = i6;
                                    this.getHighSpeedVideoSizes = i5;
                                    i9 = 1;
                                    this.getOutputMinFrameDuration = 1;
                                    if (sequenceScope2.yield(mutableMapEntry, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j2 >>= 8;
                                    i5 += i9;
                                    i4 = i9;
                                    i3 = 8;
                                    if (i5 < i6) {
                                    }
                                }
                                int i92 = i4;
                                j2 >>= 8;
                                i5 += i92;
                                i4 = i92;
                                i3 = 8;
                                if (i5 < i6) {
                                }
                            }
                        } else {
                            i10 = i3;
                            i11 = i4;
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
            return ((androidx.collection.MutableEntries$iterator$1.AnonymousClass1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.collection.MutableEntries$iterator$1.AnonymousClass1 anonymousClass1 = new androidx.collection.MutableEntries$iterator$1.AnonymousClass1(this.getOutputFormats, this.getOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getOutputStallDurationlomOqCM = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.collection.MutableEntries<K, V> mutableEntries, androidx.collection.MutableEntries$iterator$1 mutableEntries$iterator$1, kotlin.coroutines.Continuation<? super androidx.collection.MutableEntries$iterator$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputFormats = mutableEntries;
            this.getOutputSizeshNQ4ISI = mutableEntries$iterator$1;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final java.util.Map.Entry<K, V> next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        androidx.collection.MutableScatterMap mutableScatterMap;
        if (this.current != -1) {
            mutableScatterMap = ((androidx.collection.MutableEntries) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            mutableScatterMap.removeValueAt(this.current);
            this.current = -1;
        }
    }
}
