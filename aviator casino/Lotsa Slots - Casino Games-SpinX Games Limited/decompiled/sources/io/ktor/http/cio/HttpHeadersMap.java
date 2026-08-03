package io.ktor.http.cio;

/* compiled from: HttpHeadersMap.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000b¢\u0006\u0004\b,\u0010%J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000b¢\u0006\u0004\b-\u0010%J\r\u0010.\u001a\u00020\u001d¢\u0006\u0004\b.\u0010(J\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R$\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "", "thresholdReached", "()Z", "", "name", "", "fromIndex", "find", "(Ljava/lang/String;I)I", "", "get", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Lkotlin/sequences/Sequence;", "getAll", "(Ljava/lang/String;)Lkotlin/sequences/Sequence;", "offsets", "()Lkotlin/sequences/Sequence;", "nameHash", "valueHash", "nameStartIndex", "nameEndIndex", "valueStartIndex", "valueEndIndex", "", "put", "(IIIIII)V", "(IIII)V", "idx", "idxToOffset", "(I)I", "nameAt", "(I)Ljava/lang/CharSequence;", "valueAt", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "()V", "headerOffset", "headerHasName", "(Ljava/lang/CharSequence;I)Z", "nameAtOffset", "valueAtOffset", "release", "toString", "()Ljava/lang/String;", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "value", "size", "I", "getSize", "()I", "headerCapacity", "Lio/ktor/http/cio/HeadersData;", "headersData", "Lio/ktor/http/cio/HeadersData;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpHeadersMap {
    private final io.ktor.http.cio.internals.CharArrayBuilder builder;
    private int headerCapacity;
    private io.ktor.http.cio.HeadersData headersData;
    private int size;

    public HttpHeadersMap(io.ktor.http.cio.internals.CharArrayBuilder builder) {
        io.ktor.utils.io.pool.DefaultPool defaultPool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        defaultPool = io.ktor.http.cio.HttpHeadersMapKt.HeadersDataPool;
        this.headersData = (io.ktor.http.cio.HeadersData) defaultPool.borrow();
    }

    public final int getSize() {
        return this.size;
    }

    private final boolean thresholdReached() {
        return ((double) this.size) >= ((double) this.headerCapacity) * 0.75d;
    }

    public static /* synthetic */ int find$default(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return httpHeadersMap.find(str, i);
    }

    @kotlin.Deprecated(message = "Use getAll instead", replaceWith = @kotlin.ReplaceWith(expression = "getAll(name)", imports = {}))
    public final int find(java.lang.String name, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (this.size == 0) {
            return -1;
        }
        int idxToOffset = idxToOffset(fromIndex);
        while (this.headersData.at(idxToOffset) != -1) {
            if (headerHasName(name, idxToOffset)) {
                return fromIndex;
            }
            fromIndex++;
            idxToOffset = (idxToOffset / 6) % this.headerCapacity;
        }
        return -1;
    }

    public final java.lang.CharSequence get(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (this.size == 0) {
            return null;
        }
        java.lang.String str = name;
        int abs = java.lang.Math.abs(io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(str, 0, 0, 3, null));
        int i = this.headerCapacity;
        while (true) {
            int i2 = abs % i;
            int i3 = i2 * 6;
            if (this.headersData.at(i3) == -1) {
                return null;
            }
            if (headerHasName(str, i3)) {
                return valueAtOffset(i3);
            }
            abs = i2 + 1;
            i = this.headerCapacity;
        }
    }

    public final kotlin.sequences.Sequence<java.lang.CharSequence> getAll(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return kotlin.sequences.SequencesKt.sequence(new io.ktor.http.cio.HttpHeadersMap$getAll$1(this, name, null));
    }

    public final kotlin.sequences.Sequence<java.lang.Integer> offsets() {
        return this.headersData.headersStarts();
    }

    @kotlin.Deprecated(message = "Use put without `nameHash` and `valueHash` instead", replaceWith = @kotlin.ReplaceWith(expression = "put(nameStartIndex, nameEndIndex, valueStartIndex, valueEndIndex)", imports = {}))
    public final void put(int nameHash, int valueHash, int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        put(nameStartIndex, nameEndIndex, valueStartIndex, valueEndIndex);
    }

    public final void put(int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        int i;
        if (thresholdReached()) {
            resize();
        }
        int abs = java.lang.Math.abs(io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase(this.builder, nameStartIndex, nameEndIndex));
        java.lang.CharSequence subSequence = this.builder.subSequence(nameStartIndex, nameEndIndex);
        int i2 = abs % this.headerCapacity;
        int i3 = -1;
        while (true) {
            i = i2 * 6;
            if (this.headersData.at(i) == -1) {
                break;
            }
            if (headerHasName(subSequence, i)) {
                i3 = i2;
            }
            i2 = (i2 + 1) % this.headerCapacity;
        }
        this.headersData.set(i, abs);
        this.headersData.set(i + 1, nameStartIndex);
        this.headersData.set(i + 2, nameEndIndex);
        this.headersData.set(i + 3, valueStartIndex);
        this.headersData.set(i + 4, valueEndIndex);
        this.headersData.set(i + 5, -1);
        if (i3 != -1) {
            this.headersData.set((i3 * 6) + 5, i2);
        }
        this.size++;
    }

    private final int idxToOffset(int idx) {
        if (idx < 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (idx >= this.size) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return ((java.lang.Number) kotlin.sequences.SequencesKt.last(kotlin.sequences.SequencesKt.take(offsets(), idx + 1))).intValue();
    }

    @kotlin.Deprecated(message = "Use nameAtOffset instead", replaceWith = @kotlin.ReplaceWith(expression = "nameAtOffset", imports = {}))
    public final java.lang.CharSequence nameAt(int idx) {
        return nameAtOffset(idxToOffset(idx));
    }

    @kotlin.Deprecated(message = "Use valueAtOffset instead", replaceWith = @kotlin.ReplaceWith(expression = "valueAtOffset", imports = {}))
    public final java.lang.CharSequence valueAt(int idx) {
        return valueAtOffset(idxToOffset(idx));
    }

    private final void resize() {
        io.ktor.utils.io.pool.DefaultPool defaultPool;
        io.ktor.utils.io.pool.DefaultPool defaultPool2;
        int i = this.size;
        io.ktor.http.cio.HeadersData headersData = this.headersData;
        this.size = 0;
        this.headerCapacity = (this.headerCapacity * 2) | 128;
        defaultPool = io.ktor.http.cio.HttpHeadersMapKt.HeadersDataPool;
        io.ktor.http.cio.HeadersData headersData2 = (io.ktor.http.cio.HeadersData) defaultPool.borrow();
        headersData2.prepare((headersData.arraysCount() * 2) | 1);
        this.headersData = headersData2;
        java.util.Iterator<java.lang.Integer> it = headersData.headersStarts().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            put(headersData.at(intValue + 1), headersData.at(intValue + 2), headersData.at(intValue + 3), headersData.at(intValue + 4));
        }
        defaultPool2 = io.ktor.http.cio.HttpHeadersMapKt.HeadersDataPool;
        defaultPool2.recycle(headersData);
        if (i != this.size) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean headerHasName(java.lang.CharSequence name, int headerOffset) {
        return io.ktor.http.cio.internals.CharsKt.equalsLowerCase(this.builder, this.headersData.at(headerOffset + 1), this.headersData.at(headerOffset + 2), name);
    }

    public final java.lang.CharSequence nameAtOffset(int headerOffset) {
        return this.builder.subSequence(this.headersData.at(headerOffset + 1), this.headersData.at(headerOffset + 2));
    }

    public final java.lang.CharSequence valueAtOffset(int headerOffset) {
        return this.builder.subSequence(this.headersData.at(headerOffset + 3), this.headersData.at(headerOffset + 4));
    }

    public final void release() {
        io.ktor.utils.io.pool.DefaultPool defaultPool;
        io.ktor.utils.io.pool.DefaultPool defaultPool2;
        this.size = 0;
        this.headerCapacity = 0;
        defaultPool = io.ktor.http.cio.HttpHeadersMapKt.HeadersDataPool;
        defaultPool.recycle(this.headersData);
        defaultPool2 = io.ktor.http.cio.HttpHeadersMapKt.HeadersDataPool;
        this.headersData = (io.ktor.http.cio.HeadersData) defaultPool2.borrow();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        io.ktor.http.cio.HttpHeadersMapKt.dumpTo(this, "", sb);
        return sb.toString();
    }
}
