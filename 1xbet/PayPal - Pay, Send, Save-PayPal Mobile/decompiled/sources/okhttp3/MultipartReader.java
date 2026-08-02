package okhttp3;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0003()'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u001c\u0010\u001e\u001a\b\u0018\u00010%R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010&"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lokio/BufferedSource;", "source", "", "boundary", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", "p0", "getHighSpeedVideoFpsRanges", "(J)J", "", "close", "()V", "getInputSizeshNQ4ISI", "Lokio/BufferedSource;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "()Ljava/lang/String;", "Lokio/ByteString;", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "", "getOutputMinFrameDuration", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Lokhttp3/MultipartReader$PartSource;", "Lokhttp3/MultipartReader$PartSource;", "Companion", "PartSource", "Part"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MultipartReader implements java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.MultipartReader.Companion INSTANCE = new okhttp3.MultipartReader.Companion(null);
    private static final okio.Options afterBoundaryOptions = okio.Options.INSTANCE.of(okio.ByteString.INSTANCE.encodeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE), okio.ByteString.INSTANCE.encodeUtf8("--"), okio.ByteString.INSTANCE.encodeUtf8(" "), okio.ByteString.INSTANCE.encodeUtf8("\t"));

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private okhttp3.MultipartReader.PartSource getOutputMinFrameDuration;
    private final java.lang.String boundary;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRangesFor;
    private final okio.ByteString getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    public MultipartReader(okio.BufferedSource bufferedSource, java.lang.String str) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bufferedSource;
        this.boundary = str;
        this.getHighSpeedVideoFpsRanges = new okio.Buffer().writeUtf8("--").writeUtf8(str).readByteString();
        this.getHighSpeedVideoFpsRangesFor = new okio.Buffer().writeUtf8("\r\n--").writeUtf8(str).readByteString();
    }

    /* renamed from: boundary, reason: from getter */
    public final java.lang.String getBoundary() {
        return this.boundary;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipartReader(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        this(r0, r3);
        java.lang.String parameter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBody, "");
        okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = responseBody.getGetHighResolutionOutputSizeshNQ4ISI();
        okhttp3.MediaType getHighSpeedVideoFpsRangesFor = responseBody.getGetHighSpeedVideoFpsRangesFor();
        if (getHighSpeedVideoFpsRangesFor != null && (parameter = getHighSpeedVideoFpsRangesFor.parameter("boundary")) != null) {
            return;
        }
        throw new java.net.ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    public final okhttp3.MultipartReader.Part nextPart() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
        }
        if (this.getHighSpeedVideoSizesFor) {
            return null;
        }
        if (this.getHighSpeedVideoSizes == 0 && this.getHighResolutionOutputSizeshNQ4ISI.rangeEquals(0L, this.getHighSpeedVideoFpsRanges)) {
            this.getHighResolutionOutputSizeshNQ4ISI.skip(this.getHighSpeedVideoFpsRanges.size());
        } else {
            while (true) {
                long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(8192L);
                if (highSpeedVideoFpsRanges == 0) {
                    break;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.skip(highSpeedVideoFpsRanges);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.skip(this.getHighSpeedVideoFpsRangesFor.size());
        }
        boolean z = false;
        while (true) {
            int select = this.getHighResolutionOutputSizeshNQ4ISI.select(afterBoundaryOptions);
            if (select == -1) {
                throw new java.net.ProtocolException("unexpected characters after boundary");
            }
            if (select == 0) {
                this.getHighSpeedVideoSizes++;
                okhttp3.Headers readHeaders = new okhttp3.internal.http1.HeadersReader(this.getHighResolutionOutputSizeshNQ4ISI).readHeaders();
                okhttp3.MultipartReader.PartSource partSource = new okhttp3.MultipartReader.PartSource();
                this.getOutputMinFrameDuration = partSource;
                return new okhttp3.MultipartReader.Part(readHeaders, okio.Okio.buffer(partSource));
            }
            if (select == 1) {
                if (z) {
                    throw new java.net.ProtocolException("unexpected characters after boundary");
                }
                if (this.getHighSpeedVideoSizes == 0) {
                    throw new java.net.ProtocolException("expected at least 1 part");
                }
                this.getHighSpeedVideoSizesFor = true;
                return null;
            }
            if (select == 2 || select == 3) {
                z = true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "<init>", "(Lokhttp3/MultipartReader;)V", "", "close", "()V", "Lokio/Buffer;", "p0", "", "p1", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "Camera2StreamConfigurationMap", "Lokio/Timeout;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class PartSource implements okio.Source {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final okio.Timeout getHighSpeedVideoFpsRangesFor = new okio.Timeout();

        public PartSource() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.MultipartReader.this.getOutputMinFrameDuration, this)) {
                okhttp3.MultipartReader.this.getOutputMinFrameDuration = null;
            }
        }

        @Override // okio.Source
        public final long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p1 >= 0) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.MultipartReader.this.getOutputMinFrameDuration, this)) {
                    okio.Timeout timeout = okhttp3.MultipartReader.this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRangesFor();
                    okio.Timeout timeout2 = this.getHighSpeedVideoFpsRangesFor;
                    okhttp3.MultipartReader multipartReader = okhttp3.MultipartReader.this;
                    long timeoutNanos = timeout.getTimeoutNanos();
                    timeout.timeout(okio.Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
                    if (timeout.getHasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(java.lang.Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            long highSpeedVideoFpsRanges = multipartReader.getHighSpeedVideoFpsRanges(p1);
                            return highSpeedVideoFpsRanges == 0 ? -1L : multipartReader.getHighResolutionOutputSizeshNQ4ISI.read(p0, highSpeedVideoFpsRanges);
                        } finally {
                            timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                        }
                    }
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        long highSpeedVideoFpsRanges2 = multipartReader.getHighSpeedVideoFpsRanges(p1);
                        return highSpeedVideoFpsRanges2 == 0 ? -1L : multipartReader.getHighResolutionOutputSizeshNQ4ISI.read(p0, highSpeedVideoFpsRanges2);
                    } finally {
                        timeout.timeout(timeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.clearDeadline();
                        }
                    }
                }
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p1)).toString());
        }

        @Override // okio.Source
        /* renamed from: timeout, reason: from getter */
        public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRanges(long p0) {
        long min = java.lang.Math.min(this.getHighResolutionOutputSizeshNQ4ISI.getBuffer().size(), p0) + 1;
        long indexOf = this.getHighResolutionOutputSizeshNQ4ISI.indexOf(this.getHighSpeedVideoFpsRangesFor, 0L, min);
        if (indexOf != -1) {
            return indexOf;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getBuffer().size() >= min) {
            return java.lang.Math.min(min, p0);
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.getOutputMinFrameDuration = null;
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lokio/BufferedSource;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lokio/BufferedSource;", "()Lokio/BufferedSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Part implements java.io.Closeable {
        private final okio.BufferedSource body;
        private final okhttp3.Headers headers;

        public Part(okhttp3.Headers headers, okio.BufferedSource bufferedSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
            this.headers = headers;
            this.body = bufferedSource;
        }

        /* renamed from: headers, reason: from getter */
        public final okhttp3.Headers getHeaders() {
            return this.headers;
        }

        /* renamed from: body, reason: from getter */
        public final okio.BufferedSource getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.body.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lokio/Options;", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okio.Options getAfterBoundaryOptions() {
            return okhttp3.MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
