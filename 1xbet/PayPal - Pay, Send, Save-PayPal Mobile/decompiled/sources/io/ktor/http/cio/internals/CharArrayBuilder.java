package io.ktor.http.cio.internals;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001=B\u0017\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001d\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u001d\u0010\u001d\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001d\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J/\u0010&\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u00100R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u0018\u0010,\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u00108R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u00109R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010:R$\u0010;\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\b<\u0010\u001b"}, d2 = {"Lio/ktor/http/cio/internals/CharArrayBuilder;", "", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "Lio/ktor/utils/io/pool/ObjectPool;", "", "pool", "<init>", "(Lio/ktor/utils/io/pool/ObjectPool;)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "append", "(C)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "release", "()V", "p0", "p1", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "(I)[C", "", "getHighSpeedVideoSizes", "(I)Ljava/lang/Void;", "Camera2StreamConfigurationMap", "()[C", "p2", "p3", "(ILjava/lang/CharSequence;II)Z", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "", "Ljava/util/List;", "[C", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Z", com.visa.cbp.getEncExpo.warmup, "length", "getLength", "SubSequenceImpl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CharArrayBuilder implements java.lang.CharSequence, java.lang.Appendable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;
    private java.util.List<char[]> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private char[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;
    private int length;
    private final io.ktor.utils.io.pool.ObjectPool<char[]> pool;

    public CharArrayBuilder(io.ktor.utils.io.pool.ObjectPool<char[]> objectPool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        this.pool = objectPool;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    public /* synthetic */ CharArrayBuilder(io.ktor.utils.io.pool.ObjectPool objectPool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? io.ktor.http.cio.internals.CharArrayPoolKt.getCharArrayPool() : objectPool);
    }

    public final io.ktor.utils.io.pool.ObjectPool<char[]> getPool() {
        return this.pool;
    }

    public final int getLength() {
        return this.length;
    }

    public final char get(int index) {
        if (index < 0) {
            throw new java.lang.IllegalArgumentException("index is negative: ".concat(java.lang.String.valueOf(index)).toString());
        }
        if (index >= length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("index ");
            sb.append(index);
            sb.append(" is not in range [0, ");
            sb.append(length());
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        char[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(index);
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
        return highResolutionOutputSizeshNQ4ISI[index % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("startIndex (");
            sb.append(startIndex);
            sb.append(") should be less or equal to endIndex (");
            sb.append(endIndex);
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (startIndex < 0) {
            throw new java.lang.IllegalArgumentException("startIndex is negative: ".concat(java.lang.String.valueOf(startIndex)).toString());
        }
        if (endIndex > length()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex (");
            sb2.append(endIndex);
            sb2.append(") is greater than length (");
            sb2.append(length());
            sb2.append(')');
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        return new io.ktor.http.cio.internals.CharArrayBuilder.SubSequenceImpl(startIndex, endIndex);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str != null) {
            return str;
        }
        java.lang.String obj = getHighSpeedVideoFpsRanges(0, length()).toString();
        this.Camera2StreamConfigurationMap = obj;
        return obj;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof java.lang.CharSequence)) {
            return false;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) other;
        if (length() != charSequence.length()) {
            return false;
        }
        return getHighSpeedVideoFpsRanges(0, charSequence, 0, length());
    }

    public final int hashCode() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str != null) {
            return str.hashCode();
        }
        int length = length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
            i = (i * 31) + highResolutionOutputSizeshNQ4ISI[i2 % cArr.length];
        }
        return i;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char value) {
        char[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
        int length = cArr.length;
        int i = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap[length - i] = value;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = i - 1;
        this.length = length() + 1;
        return this;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence value, int startIndex, int endIndex) {
        if (value == null) {
            return this;
        }
        int i = startIndex;
        while (i < endIndex) {
            char[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            int length = Camera2StreamConfigurationMap.length;
            int i2 = this.getHighSpeedVideoSizes;
            int min = java.lang.Math.min(endIndex - i, i2);
            for (int i3 = 0; i3 < min; i3++) {
                Camera2StreamConfigurationMap[(length - i2) + i3] = value.charAt(i + i3);
            }
            i += min;
            this.getHighSpeedVideoSizes -= min;
        }
        this.Camera2StreamConfigurationMap = null;
        this.length = length() + (endIndex - startIndex);
        return this;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence value) {
        if (value == null) {
            return this;
        }
        return append(value, 0, value.length());
    }

    public final void release() {
        java.util.List<char[]> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list != null) {
            this.getHighSpeedVideoFpsRangesFor = null;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.pool.recycle(list.get(i));
            }
        } else {
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            if (cArr != null) {
                this.pool.recycle(cArr);
            }
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = null;
        this.length = 0;
        this.getHighSpeedVideoSizes = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.CharSequence getHighSpeedVideoFpsRanges(int p0, int p1) {
        if (p0 == p1) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(p1 - p0);
        for (int i = p0 - (p0 % 2048); i < p1; i += 2048) {
            char[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
            int min = java.lang.Math.min(p1 - i, 2048);
            for (int max = java.lang.Math.max(0, p0 - i); max < min; max++) {
                sb.append(highResolutionOutputSizeshNQ4ISI[max]);
            }
        }
        return sb;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/http/cio/internals/CharArrayBuilder$SubSequenceImpl;", "", "", "p0", "p1", "<init>", "(Lio/ktor/http/cio/internals/CharArrayBuilder;II)V", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    final class SubSequenceImpl implements java.lang.CharSequence {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        public SubSequenceImpl(int i, int i2) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
        }

        @Override // java.lang.CharSequence
        public final java.lang.CharSequence subSequence(int p0, int p1) {
            if (p0 < 0) {
                throw new java.lang.IllegalArgumentException("start is negative: ".concat(java.lang.String.valueOf(p0)).toString());
            }
            if (p0 > p1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("start (");
                sb.append(p0);
                sb.append(") should be less or equal to end (");
                sb.append(p1);
                sb.append(')');
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.Camera2StreamConfigurationMap;
            if (p1 <= i - i2) {
                if (p0 == p1) {
                    return "";
                }
                return io.ktor.http.cio.internals.CharArrayBuilder.this.new SubSequenceImpl(p0 + i2, i2 + p1);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("end should be less than length (");
            sb2.append(length());
            sb2.append(')');
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }

        @Override // java.lang.CharSequence
        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str != null) {
                return str;
            }
            java.lang.String obj = io.ktor.http.cio.internals.CharArrayBuilder.this.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI).toString();
            this.getHighSpeedVideoFpsRangesFor = obj;
            return obj;
        }

        public final boolean equals(java.lang.Object p0) {
            if (!(p0 instanceof java.lang.CharSequence)) {
                return false;
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) p0;
            if (charSequence.length() != length()) {
                return false;
            }
            return io.ktor.http.cio.internals.CharArrayBuilder.this.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, charSequence, 0, length());
        }

        public final int hashCode() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            return str != null ? str.hashCode() : io.ktor.http.cio.internals.CharArrayBuilder.access$hashCodeImpl(io.ktor.http.cio.internals.CharArrayBuilder.this, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            int i2 = this.Camera2StreamConfigurationMap + i;
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("index is negative: ".concat(java.lang.String.valueOf(i)).toString());
            }
            if (i2 >= this.getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("index (");
                sb.append(i);
                sb.append(") should be less than length (");
                sb.append(length());
                sb.append(')');
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            return io.ktor.http.cio.internals.CharArrayBuilder.access$getImpl(io.ktor.http.cio.internals.CharArrayBuilder.this, i2);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return this.getHighResolutionOutputSizeshNQ4ISI - this.Camera2StreamConfigurationMap;
        }
    }

    private final char[] getHighResolutionOutputSizeshNQ4ISI(int p0) {
        java.util.List<char[]> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list != null) {
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
            return list.get(p0 / cArr.length);
        }
        if (p0 >= 2048) {
            getHighSpeedVideoSizes(p0);
            throw new kotlin.KotlinNothingValueException();
        }
        char[] cArr2 = this.getHighSpeedVideoFpsRangesFor;
        if (cArr2 != null) {
            return cArr2;
        }
        getHighSpeedVideoSizes(p0);
        throw new kotlin.KotlinNothingValueException();
    }

    private final java.lang.Void getHighSpeedVideoSizes(int p0) {
        if (this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("Buffer is already released");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append(" is not in range [0; ");
        char[] cArr = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
        sb.append(cArr.length - this.getHighSpeedVideoSizes);
        sb.append(')');
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private final char[] Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoSizes != 0) {
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
            return cArr;
        }
        char[] borrow = this.pool.borrow();
        char[] cArr2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = borrow;
        this.getHighSpeedVideoSizes = borrow.length;
        this.getHighSpeedVideoFpsRanges = false;
        if (cArr2 != null) {
            java.util.List<char[]> list = this.getHighResolutionOutputSizeshNQ4ISI;
            if (list == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = arrayList;
                this.getHighResolutionOutputSizeshNQ4ISI = arrayList2;
                arrayList.add(cArr2);
                list = arrayList2;
            }
            list.add(borrow);
        }
        return borrow;
    }

    public static final /* synthetic */ char access$getImpl(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, int i) {
        char[] highResolutionOutputSizeshNQ4ISI = charArrayBuilder.getHighResolutionOutputSizeshNQ4ISI(i);
        char[] cArr = charArrayBuilder.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
        return highResolutionOutputSizeshNQ4ISI[i % cArr.length];
    }

    public static final /* synthetic */ int access$hashCodeImpl(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char[] highResolutionOutputSizeshNQ4ISI = charArrayBuilder.getHighResolutionOutputSizeshNQ4ISI(i);
            char[] cArr = charArrayBuilder.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
            i3 = (i3 * 31) + highResolutionOutputSizeshNQ4ISI[i % cArr.length];
            i++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(int p0, java.lang.CharSequence p1, int p2, int p3) {
        for (int i = 0; i < p3; i++) {
            int i2 = p0 + i;
            char[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cArr);
            if (highResolutionOutputSizeshNQ4ISI[i2 % cArr.length] != p1.charAt(p2 + i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharArrayBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
