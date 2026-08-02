package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010#J\u0015\u0010+\u001a\u00020\f2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b+\u0010#J\r\u0010,\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00100R$\u00101\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u00102R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00107"}, d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "", "name", "", "fromIndex", "find", "(Ljava/lang/String;I)I", "", "get", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Lkotlin/sequences/Sequence;", "getAll", "(Ljava/lang/String;)Lkotlin/sequences/Sequence;", "offsets", "()Lkotlin/sequences/Sequence;", "nameHash", "valueHash", "nameStartIndex", "nameEndIndex", "valueStartIndex", "valueEndIndex", "", "put", "(IIIIII)V", "(IIII)V", "p0", "Camera2StreamConfigurationMap", "(I)I", "idx", "nameAt", "(I)Ljava/lang/CharSequence;", "valueAt", "p1", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/CharSequence;I)Z", "headerOffset", "nameAtOffset", "valueAtOffset", "release", "()V", "toString", "()Ljava/lang/String;", "Lio/ktor/http/cio/internals/CharArrayBuilder;", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/http/cio/HeadersData;", "Lio/ktor/http/cio/HeadersData;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpHeadersMap {
    private final io.ktor.http.cio.internals.CharArrayBuilder Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private io.ktor.http.cio.HeadersData getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int size;

    public HttpHeadersMap(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder) {
        io.ktor.utils.io.pool.DefaultPool defaultPool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charArrayBuilder, "");
        this.Camera2StreamConfigurationMap = charArrayBuilder;
        defaultPool = io.ktor.http.cio.HttpHeadersMapKt.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = (io.ktor.http.cio.HeadersData) defaultPool.borrow();
    }

    public final int getSize() {
        return this.size;
    }

    public static /* synthetic */ int find$default(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return httpHeadersMap.find(str, i);
    }

    @kotlin.Deprecated(message = "Use getAll instead", replaceWith = @kotlin.ReplaceWith(expression = "getAll(name)", imports = {}))
    public final int find(java.lang.String name2, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (this.size == 0) {
            return -1;
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(fromIndex);
        while (this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(Camera2StreamConfigurationMap / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[Camera2StreamConfigurationMap % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] != -1) {
            if (getHighSpeedVideoFpsRanges(name2, Camera2StreamConfigurationMap)) {
                return fromIndex;
            }
            fromIndex++;
            Camera2StreamConfigurationMap = (Camera2StreamConfigurationMap / 6) % this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return -1;
    }

    public final java.lang.CharSequence get(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (this.size == 0) {
            return null;
        }
        java.lang.String str = name2;
        int abs = java.lang.Math.abs(io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(str, 0, 0, 3, null));
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        while (true) {
            int i2 = abs % i;
            int i3 = i2 * 6;
            if (this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i3 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i3 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] == -1) {
                return null;
            }
            if (getHighSpeedVideoFpsRanges(str, i3)) {
                return valueAtOffset(i3);
            }
            abs = i2 + 1;
            i = this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public final kotlin.sequences.Sequence<java.lang.CharSequence> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.sequences.SequencesKt.sequence(new io.ktor.http.cio.HttpHeadersMap$getAll$1(this, name2, null));
    }

    public final kotlin.sequences.Sequence<java.lang.Integer> offsets() {
        return kotlin.sequences.SequencesKt.sequence(new io.ktor.http.cio.HeadersData$headersStarts$1(this.getHighSpeedVideoFpsRangesFor, null));
    }

    @kotlin.Deprecated(message = "Use put without `nameHash` and `valueHash` instead", replaceWith = @kotlin.ReplaceWith(expression = "put(nameStartIndex, nameEndIndex, valueStartIndex, valueEndIndex)", imports = {}))
    public final void put(int nameHash, int valueHash, int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        put(nameStartIndex, nameEndIndex, valueStartIndex, valueEndIndex);
    }

    private final int Camera2StreamConfigurationMap(int p0) {
        if (p0 < 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (p0 >= this.size) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return ((java.lang.Number) kotlin.sequences.SequencesKt.last(kotlin.sequences.SequencesKt.take(offsets(), p0 + 1))).intValue();
    }

    @kotlin.Deprecated(message = "Use nameAtOffset instead", replaceWith = @kotlin.ReplaceWith(expression = "nameAtOffset", imports = {}))
    public final java.lang.CharSequence nameAt(int idx) {
        return nameAtOffset(Camera2StreamConfigurationMap(idx));
    }

    @kotlin.Deprecated(message = "Use valueAtOffset instead", replaceWith = @kotlin.ReplaceWith(expression = "valueAtOffset", imports = {}))
    public final java.lang.CharSequence valueAt(int idx) {
        return valueAtOffset(Camera2StreamConfigurationMap(idx));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence p0, int p1) {
        int i = p1 + 1;
        int i2 = p1 + 2;
        return io.ktor.http.cio.internals.CharsKt.equalsLowerCase(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i2 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i2 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], p0);
    }

    public final java.lang.CharSequence nameAtOffset(int headerOffset) {
        int i = headerOffset + 1;
        int i2 = headerOffset + 2;
        return this.Camera2StreamConfigurationMap.subSequence(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i2 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i2 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]);
    }

    public final java.lang.CharSequence valueAtOffset(int headerOffset) {
        int i = headerOffset + 3;
        int i2 = headerOffset + 4;
        return this.Camera2StreamConfigurationMap.subSequence(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i2 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i2 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]);
    }

    public final void release() {
        io.ktor.utils.io.pool.DefaultPool defaultPool;
        io.ktor.utils.io.pool.DefaultPool defaultPool2;
        this.size = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        defaultPool = io.ktor.http.cio.HttpHeadersMapKt.getHighSpeedVideoSizes;
        defaultPool.recycle(this.getHighSpeedVideoFpsRangesFor);
        defaultPool2 = io.ktor.http.cio.HttpHeadersMapKt.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = (io.ktor.http.cio.HeadersData) defaultPool2.borrow();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        io.ktor.http.cio.HttpHeadersMapKt.dumpTo(this, "", sb);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void put(int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        int i;
        int i2;
        int i3;
        io.ktor.utils.io.pool.DefaultPool defaultPool;
        io.ktor.utils.io.pool.DefaultPool defaultPool2;
        io.ktor.utils.io.pool.DefaultPool defaultPool3;
        int i4 = this.size;
        double d = i4;
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (d >= i5 * 0.75d) {
            io.ktor.http.cio.HeadersData headersData = this.getHighSpeedVideoFpsRangesFor;
            this.size = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = (i5 * 2) | 128;
            defaultPool = io.ktor.http.cio.HttpHeadersMapKt.getHighSpeedVideoSizes;
            io.ktor.http.cio.HeadersData headersData2 = (io.ktor.http.cio.HeadersData) defaultPool.borrow();
            int size = (headersData.getHighResolutionOutputSizeshNQ4ISI.size() * 2) | 1;
            for (int i6 = 0; i6 < size; i6++) {
                java.util.List<int[]> list = headersData2.getHighResolutionOutputSizeshNQ4ISI;
                defaultPool3 = io.ktor.http.cio.HttpHeadersMapKt.getHighResolutionOutputSizeshNQ4ISI;
                list.add(defaultPool3.borrow());
            }
            this.getHighSpeedVideoFpsRangesFor = headersData2;
            java.util.Iterator it = kotlin.sequences.SequencesKt.sequence(new io.ktor.http.cio.HeadersData$headersStarts$1(headersData, null)).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                int i7 = intValue + 1;
                int i8 = intValue + 2;
                int i9 = intValue + 3;
                int i10 = intValue + 4;
                put(headersData.getHighResolutionOutputSizeshNQ4ISI.get(i7 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i7 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], headersData.getHighResolutionOutputSizeshNQ4ISI.get(i8 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i8 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], headersData.getHighResolutionOutputSizeshNQ4ISI.get(i9 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i9 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS], headersData.getHighResolutionOutputSizeshNQ4ISI.get(i10 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i10 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]);
            }
            defaultPool2 = io.ktor.http.cio.HttpHeadersMapKt.getHighSpeedVideoSizes;
            defaultPool2.recycle(headersData);
            if (i4 != this.size) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        }
        int abs = java.lang.Math.abs(io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase(this.Camera2StreamConfigurationMap, nameStartIndex, nameEndIndex));
        java.lang.CharSequence subSequence = this.Camera2StreamConfigurationMap.subSequence(nameStartIndex, nameEndIndex);
        int i11 = abs % this.getHighResolutionOutputSizeshNQ4ISI;
        int i12 = -1;
        while (true) {
            i = i11 * 6;
            java.util.List<int[]> list2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            i2 = i / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            int[] iArr = list2.get(i2);
            i3 = i % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            if (iArr[i3] == -1) {
                break;
            }
            if (getHighSpeedVideoFpsRanges(subSequence, i)) {
                i12 = i11;
            }
            i11 = (i11 + 1) % this.getHighResolutionOutputSizeshNQ4ISI;
        }
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i2)[i3] = abs;
        int i13 = i + 1;
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i13 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i13 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] = nameStartIndex;
        int i14 = i + 2;
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i14 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i14 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] = nameEndIndex;
        int i15 = i + 3;
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i15 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i15 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] = valueStartIndex;
        int i16 = i + 4;
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i16 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i16 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] = valueEndIndex;
        int i17 = i + 5;
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i17 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i17 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] = -1;
        if (i12 != -1) {
            int i18 = (i12 * 6) + 5;
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i18 / com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)[i18 % com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] = i11;
        }
        this.size++;
    }
}
