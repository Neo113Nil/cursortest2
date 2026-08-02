package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00060\u0001j\u0002`\u0002:\u0003*+)B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010\u0013\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010#\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010("}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "Lokio/BufferedSource;", "source", "", "boundary", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "Lcom/apollographql/apollo/internal/MultipartReader$Part;", "nextPart", "()Lcom/apollographql/apollo/internal/MultipartReader$Part;", "", "p0", "getHighSpeedVideoFpsRangesFor", "(J)J", "", "close", "()V", "getInputSizeshNQ4ISI", "Lokio/BufferedSource;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lokio/ByteString;", "Lokio/ByteString;", "getHighSpeedVideoFpsRanges", "", "getOutputMinFrameDuration", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "", "Camera2StreamConfigurationMap", "Z", "getInputFormats", "getOutputFormats", "Lcom/apollographql/apollo/internal/MultipartReader$PartSource;", "Lcom/apollographql/apollo/internal/MultipartReader$PartSource;", "Lokio/Options;", "Lokio/Options;", "Companion", "PartSource", "Part"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartReader implements java.io.Closeable {
    private static final com.apollographql.apollo.internal.MultipartReader.Companion Companion = new com.apollographql.apollo.internal.MultipartReader.Companion(null);
    private boolean Camera2StreamConfigurationMap;
    private final java.lang.String boundary;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.apollographql.apollo.internal.MultipartReader.PartSource getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.Options getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    public MultipartReader(okio.BufferedSource bufferedSource, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bufferedSource;
        this.boundary = str;
        this.getHighSpeedVideoFpsRangesFor = new okio.Buffer().writeUtf8("--").writeUtf8(str).readByteString();
        this.getHighSpeedVideoFpsRanges = new okio.Buffer().writeUtf8("\r\n--").writeUtf8(str).readByteString();
        okio.Options.Companion companion = okio.Options.INSTANCE;
        okio.ByteString.Companion companion2 = okio.ByteString.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\r\n--");
        sb.append(str);
        sb.append("--");
        this.getInputFormats = companion.of(companion2.encodeUtf8(sb.toString()), okio.ByteString.INSTANCE.encodeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE), okio.ByteString.INSTANCE.encodeUtf8("--"), okio.ByteString.INSTANCE.encodeUtf8(" "), okio.ByteString.INSTANCE.encodeUtf8("\t"));
    }

    public final java.lang.String getBoundary() {
        return this.boundary;
    }

    public final com.apollographql.apollo.internal.MultipartReader.Part nextPart() {
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (this.getOutputFormats) {
            return null;
        }
        if (this.getHighSpeedVideoSizes == 0 && this.getHighResolutionOutputSizeshNQ4ISI.rangeEquals(0L, this.getHighSpeedVideoFpsRangesFor)) {
            this.getHighResolutionOutputSizeshNQ4ISI.skip(this.getHighSpeedVideoFpsRangesFor.size());
        } else {
            while (true) {
                long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(8192L);
                if (highSpeedVideoFpsRangesFor == 0) {
                    break;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.skip(highSpeedVideoFpsRangesFor);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.skip(this.getHighSpeedVideoFpsRanges.size());
        }
        boolean z = false;
        while (true) {
            int select = this.getHighResolutionOutputSizeshNQ4ISI.select(this.getInputFormats);
            if (select == -1) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.exhausted()) {
                    throw new com.apollographql.apollo.exception.DefaultApolloException("premature end of multipart body", null, 2, null);
                }
                throw new com.apollographql.apollo.exception.DefaultApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (select == 0) {
                if (this.getHighSpeedVideoSizes == 0) {
                    throw new com.apollographql.apollo.exception.DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.getOutputFormats = true;
                return null;
            }
            if (select == 1) {
                this.getHighSpeedVideoSizes++;
                java.util.List highResolutionOutputSizeshNQ4ISI = com.apollographql.apollo.internal.MultipartReader.Companion.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
                com.apollographql.apollo.internal.MultipartReader.PartSource partSource = new com.apollographql.apollo.internal.MultipartReader.PartSource();
                this.getInputSizeshNQ4ISI = partSource;
                return new com.apollographql.apollo.internal.MultipartReader.Part(highResolutionOutputSizeshNQ4ISI, okio.Okio.buffer(partSource));
            }
            if (select == 2) {
                if (z) {
                    throw new com.apollographql.apollo.exception.DefaultApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.getHighSpeedVideoSizes == 0) {
                    throw new com.apollographql.apollo.exception.DefaultApolloException("expected at least 1 part", null, 2, null);
                }
                this.getOutputFormats = true;
                return null;
            }
            if (select == 3 || select == 4) {
                z = true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$PartSource;", "Lokio/Source;", "<init>", "(Lcom/apollographql/apollo/internal/MultipartReader;)V", "", "close", "()V", "Lokio/Buffer;", "p0", "", "p1", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class PartSource implements okio.Source {
        public PartSource() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.apollographql.apollo.internal.MultipartReader.this.getInputSizeshNQ4ISI, this)) {
                com.apollographql.apollo.internal.MultipartReader.this.getInputSizeshNQ4ISI = null;
            }
        }

        @Override // okio.Source
        public final long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p1 >= 0) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(com.apollographql.apollo.internal.MultipartReader.this.getInputSizeshNQ4ISI, this)) {
                    long highSpeedVideoFpsRangesFor = com.apollographql.apollo.internal.MultipartReader.this.getHighSpeedVideoFpsRangesFor(p1);
                    if (highSpeedVideoFpsRangesFor == 0) {
                        return -1L;
                    }
                    return com.apollographql.apollo.internal.MultipartReader.this.getHighResolutionOutputSizeshNQ4ISI.read(p0, highSpeedVideoFpsRangesFor);
                }
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p1)).toString());
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public final okio.Timeout getGetHighSpeedVideoFpsRanges() {
            return com.apollographql.apollo.internal.MultipartReader.this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRanges();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRangesFor(long p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.require(this.getHighSpeedVideoFpsRanges.size());
        long indexOf = this.getHighResolutionOutputSizeshNQ4ISI.getBuffer().indexOf(this.getHighSpeedVideoFpsRanges);
        if (indexOf == -1) {
            return java.lang.Math.min(p0, (this.getHighResolutionOutputSizeshNQ4ISI.getBuffer().size() - this.getHighSpeedVideoFpsRanges.size()) + 1);
        }
        return java.lang.Math.min(p0, indexOf);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.getInputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "Lokio/BufferedSource;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Ljava/util/List;Lokio/BufferedSource;)V", "", "close", "()V", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "Lokio/BufferedSource;", "getBody", "()Lokio/BufferedSource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Part implements java.io.Closeable {
        private final okio.BufferedSource body;
        private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers;

        public Part(java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, okio.BufferedSource bufferedSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
            this.headers = list;
            this.body = bufferedSource;
        }

        public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHeaders() {
            return this.headers;
        }

        public final okio.BufferedSource getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.body.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/apollographql/apollo/internal/MultipartReader$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(okio.BufferedSource bufferedSource) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (true) {
                java.lang.String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                java.lang.String str = readUtf8LineStrict;
                if (str.length() == 0) {
                    return arrayList;
                }
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
                if (indexOf$default == -1) {
                    throw new java.lang.IllegalStateException("Unexpected header: ".concat(java.lang.String.valueOf(readUtf8LineStrict)).toString());
                }
                java.lang.String substring = readUtf8LineStrict.substring(0, indexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                java.lang.String obj = kotlin.text.StringsKt.trim(substring).toString();
                java.lang.String substring2 = readUtf8LineStrict.substring(indexOf$default + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                arrayList.add(new com.apollographql.apollo.api.http.HttpHeader(obj, kotlin.text.StringsKt.trim(substring2).toString()));
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
