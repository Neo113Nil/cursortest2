package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Lokio/ByteString;", "name", "checkLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "", "", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "Reader", "Writer"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Hpack {
    private static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX;
    public static final okhttp3.internal.http2.Hpack INSTANCE = new okhttp3.internal.http2.Hpack();
    private static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE = {new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_AUTHORITY, ""), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, "GET"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, "POST"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/index.html"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "http"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "https"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "200"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "204"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "206"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "304"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "400"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "404"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "500"), new okhttp3.internal.http2.Header("accept-charset", ""), new okhttp3.internal.http2.Header("accept-encoding", "gzip, deflate"), new okhttp3.internal.http2.Header("accept-language", ""), new okhttp3.internal.http2.Header("accept-ranges", ""), new okhttp3.internal.http2.Header("accept", ""), new okhttp3.internal.http2.Header("access-control-allow-origin", ""), new okhttp3.internal.http2.Header("age", ""), new okhttp3.internal.http2.Header("allow", ""), new okhttp3.internal.http2.Header("authorization", ""), new okhttp3.internal.http2.Header("cache-control", ""), new okhttp3.internal.http2.Header("content-disposition", ""), new okhttp3.internal.http2.Header("content-encoding", ""), new okhttp3.internal.http2.Header("content-language", ""), new okhttp3.internal.http2.Header("content-length", ""), new okhttp3.internal.http2.Header("content-location", ""), new okhttp3.internal.http2.Header("content-range", ""), new okhttp3.internal.http2.Header("content-type", ""), new okhttp3.internal.http2.Header("cookie", ""), new okhttp3.internal.http2.Header("date", ""), new okhttp3.internal.http2.Header("etag", ""), new okhttp3.internal.http2.Header("expect", ""), new okhttp3.internal.http2.Header("expires", ""), new okhttp3.internal.http2.Header("from", ""), new okhttp3.internal.http2.Header(com.datadog.android.log.LogAttributes.HOST, ""), new okhttp3.internal.http2.Header("if-match", ""), new okhttp3.internal.http2.Header("if-modified-since", ""), new okhttp3.internal.http2.Header("if-none-match", ""), new okhttp3.internal.http2.Header("if-range", ""), new okhttp3.internal.http2.Header("if-unmodified-since", ""), new okhttp3.internal.http2.Header("last-modified", ""), new okhttp3.internal.http2.Header("link", ""), new okhttp3.internal.http2.Header("location", ""), new okhttp3.internal.http2.Header("max-forwards", ""), new okhttp3.internal.http2.Header("proxy-authenticate", ""), new okhttp3.internal.http2.Header("proxy-authorization", ""), new okhttp3.internal.http2.Header("range", ""), new okhttp3.internal.http2.Header("referer", ""), new okhttp3.internal.http2.Header(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, ""), new okhttp3.internal.http2.Header("retry-after", ""), new okhttp3.internal.http2.Header("server", ""), new okhttp3.internal.http2.Header("set-cookie", ""), new okhttp3.internal.http2.Header("strict-transport-security", ""), new okhttp3.internal.http2.Header("transfer-encoding", ""), new okhttp3.internal.http2.Header("user-agent", ""), new okhttp3.internal.http2.Header("vary", ""), new okhttp3.internal.http2.Header("via", ""), new okhttp3.internal.http2.Header("www-authenticate", "")};

    private Hpack() {
    }

    public final okhttp3.internal.http2.Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            okhttp3.internal.http2.Header[] headerArr = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(headerArr[i].name, java.lang.Integer.valueOf(i));
            }
        }
        java.util.Map<okio.ByteString, java.lang.Integer> unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "");
        NAME_TO_FIRST_INDEX = unmodifiableMap;
    }

    public final java.util.Map<okio.ByteString, java.lang.Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b+\u0010 "}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lokio/Source;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lokio/Source;II)V", "", "Lokhttp3/internal/http2/Header;", "getAndResetHeaderList", "()Ljava/util/List;", "()I", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "p0", "getHighSpeedVideoFpsRanges", "(I)I", "readHeaders", "Lokio/ByteString;", "Camera2StreamConfigurationMap", "(I)Lokio/ByteString;", "p1", "(Lokhttp3/internal/http2/Header;)V", "firstByte", "prefixMask", "readInt", "(II)I", "readByteString", "()Lokio/ByteString;", com.visa.cbp.getEncExpo.warmup, "", "headerList", "Ljava/util/List;", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reader {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.BufferedSource source;

        public Reader(okio.Source source, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new java.util.ArrayList();
            this.source = okio.Okio.buffer(source);
            this.dynamicTable = new okhttp3.internal.http2.Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Reader(okio.Source source, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }

        public final java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
            java.util.List<okhttp3.internal.http2.Header> list = kotlin.collections.CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        /* renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private final void getHighResolutionOutputSizeshNQ4ISI() {
            kotlin.collections.ArraysKt.fill$default(this.dynamicTable, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int getHighSpeedVideoFpsRanges(int p0) {
            int i;
            int i2 = 0;
            if (p0 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || p0 <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.Header header = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    p0 -= header.hpackSize;
                    this.dynamicTableByteCount -= header.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                int i3 = i + 1;
                java.lang.System.arraycopy(headerArr, i3, headerArr, i3 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void readHeaders() throws java.io.IOException {
            while (!this.source.exhausted()) {
                int and = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new java.io.IOException("index == 0");
                }
                if ((and & 128) == 128) {
                    int readInt = readInt(and, 127);
                    int i = readInt - 1;
                    if (i >= 0 && i <= okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                        this.headerList.add(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                    } else {
                        int length = this.nextHeaderIndex + 1 + (i - okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                        if (length >= 0) {
                            okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                            if (length < headerArr.length) {
                                java.util.List<okhttp3.internal.http2.Header> list = this.headerList;
                                okhttp3.internal.http2.Header header = headerArr[length];
                                kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                                list.add(header);
                            }
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Header index too large ");
                        sb.append(readInt);
                        throw new java.io.IOException(sb.toString());
                    }
                } else if (and == 64) {
                    Camera2StreamConfigurationMap(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                } else if ((and & 64) == 64) {
                    Camera2StreamConfigurationMap(new okhttp3.internal.http2.Header(Camera2StreamConfigurationMap(readInt(and, 63) - 1), readByteString()));
                } else if ((and & 32) == 32) {
                    int readInt2 = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt2;
                    if (readInt2 < 0 || readInt2 > this.headerTableSizeSetting) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.maxDynamicTableByteCount);
                        throw new java.io.IOException(sb2.toString());
                    }
                    int i2 = this.dynamicTableByteCount;
                    if (readInt2 < i2) {
                        if (readInt2 == 0) {
                            getHighResolutionOutputSizeshNQ4ISI();
                        } else {
                            getHighSpeedVideoFpsRanges(i2 - readInt2);
                        }
                    }
                } else if (and != 16 && and != 0) {
                    this.headerList.add(new okhttp3.internal.http2.Header(Camera2StreamConfigurationMap(readInt(and, 15) - 1), readByteString()));
                } else {
                    this.headerList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                }
            }
        }

        private final void Camera2StreamConfigurationMap(okhttp3.internal.http2.Header header) {
            this.headerList.add(header);
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
            getHighSpeedVideoFpsRanges((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
            if (i3 + 1 > headerArr.length) {
                okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        private final okio.ByteString Camera2StreamConfigurationMap(int p0) throws java.io.IOException {
            if (p0 >= 0 && p0 <= okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                return okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[p0].name;
            }
            int length = this.nextHeaderIndex + 1 + (p0 - okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (length >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (length < headerArr.length) {
                    okhttp3.internal.http2.Header header = headerArr[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Header index too large ");
            sb.append(p0 + 1);
            throw new java.io.IOException(sb.toString());
        }

        public final okio.ByteString readByteString() throws java.io.IOException {
            int and = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
            boolean z = (and & 128) == 128;
            long readInt = readInt(and, 127);
            if (z) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.INSTANCE.decode(this.source, readInt, buffer);
                return buffer.readByteString();
            }
            return this.source.readByteString(readInt);
        }

        public final int readInt(int firstByte, int prefixMask) throws java.io.IOException {
            int i = firstByte & prefixMask;
            if (i < prefixMask) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int and = okhttp3.internal._UtilCommonKt.and(this.source.readByte(), 255);
                if ((and & 128) == 0) {
                    return prefixMask + (and << i2);
                }
                prefixMask += (and & 127) << i2;
                i2 += 7;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(okio.Source source, int i) {
            this(source, i, 0, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b+\u0010 "}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "headerTableSizeSetting", "", "useCompression", "Lokio/Buffer;", "out", "<init>", "(IZLokio/Buffer;)V", "", "getHighSpeedVideoSizes", "()V", "p0", "(I)I", "Lokhttp3/internal/http2/Header;", "(Lokhttp3/internal/http2/Header;)V", "", "headerBlock", "writeHeaders", "(Ljava/util/List;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "prefixMask", "bits", "writeInt", "(III)V", "Lokio/ByteString;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "writeByteString", "(Lokio/ByteString;)V", "resizeHeaderTable", "(I)V", com.visa.cbp.getEncExpo.warmup, "Z", "Lokio/Buffer;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Writer {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, boolean z, okio.Buffer buffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = buffer;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new okhttp3.internal.http2.Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Writer(int i, boolean z, okio.Buffer buffer, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }

        private final void getHighSpeedVideoSizes() {
            kotlin.collections.ArraysKt.fill$default(this.dynamicTable, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int getHighSpeedVideoSizes(int p0) {
            int i;
            int i2 = 0;
            if (p0 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || p0 <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.Header header = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    p0 -= header.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    okhttp3.internal.http2.Header header2 = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i3 - header2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                int i4 = i + 1;
                java.lang.System.arraycopy(headerArr, i4, headerArr, i4 + i2, this.headerCount);
                okhttp3.internal.http2.Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex + 1;
                java.util.Arrays.fill(headerArr2, i5, i5 + i2, (java.lang.Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void getHighSpeedVideoSizes(okhttp3.internal.http2.Header p0) {
            int i = p0.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                getHighSpeedVideoSizes();
                return;
            }
            getHighSpeedVideoSizes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
            if (i3 + 1 > headerArr.length) {
                okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = p0;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> headerBlock) throws java.io.IOException {
            int i;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "");
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i4 = 0; i4 < size; i4++) {
                okhttp3.internal.http2.Header header = headerBlock.get(i4);
                okio.ByteString asciiLowercase = header.name.toAsciiLowercase();
                okio.ByteString byteString = header.value;
                java.lang.Integer num = okhttp3.internal.http2.Hpack.INSTANCE.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[intValue].value, byteString)) {
                            i = i2;
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i2].value, byteString)) {
                            i = intValue + 2;
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        okhttp3.internal.http2.Header header2 = this.dynamicTable[i5];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(header2.name, asciiLowercase)) {
                            okhttp3.internal.http2.Header header3 = this.dynamicTable[i5];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(header3);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(header3.value, byteString)) {
                                i = okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i5 - this.nextHeaderIndex);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.nextHeaderIndex) + okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    writeInt(i, 127, 128);
                } else if (i2 == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    getHighSpeedVideoSizes(header);
                } else if (asciiLowercase.startsWith(okhttp3.internal.http2.Header.PSEUDO_PREFIX) && !kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Header.TARGET_AUTHORITY, asciiLowercase)) {
                    writeInt(i2, 15, 0);
                    writeByteString(byteString);
                } else {
                    writeInt(i2, 63, 64);
                    writeByteString(byteString);
                    getHighSpeedVideoSizes(header);
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i = value - prefixMask;
            while (i >= 128) {
                this.out.writeByte(128 | (i & 127));
                i >>>= 7;
            }
            this.out.writeByte(i);
        }

        public final void writeByteString(okio.ByteString data) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            if (this.useCompression && okhttp3.internal.http2.Huffman.INSTANCE.encodedLength(data) < data.size()) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.INSTANCE.encode(data, buffer);
                okio.ByteString readByteString = buffer.readByteString();
                writeInt(readByteString.size(), 127, 128);
                this.out.write(readByteString);
                return;
            }
            writeInt(data.size(), 127, 0);
            this.out.write(data);
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int min = java.lang.Math.min(headerTableSizeSetting, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == min) {
                return;
            }
            if (min < i) {
                this.smallestHeaderTableSizeSetting = java.lang.Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            int i2 = this.dynamicTableByteCount;
            if (min < i2) {
                if (min == 0) {
                    getHighSpeedVideoSizes();
                } else {
                    getHighSpeedVideoSizes(i2 - min);
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(okio.Buffer buffer) {
            this(0, false, buffer, 3, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, okio.Buffer buffer) {
            this(i, false, buffer, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        }
    }

    public final okio.ByteString checkLowercase(okio.ByteString name2) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        int size = name2.size();
        for (int i = 0; i < size; i++) {
            byte b = name2.getByte(i);
            if (65 <= b && b < 91) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(name2.utf8());
                throw new java.io.IOException(sb.toString());
            }
        }
        return name2;
    }
}
