package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020 0\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020!H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010'\u001a\u00020\u0002*\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010+\u001a\u00020**\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010/\u001a\u00020\u0002*\u00020-2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u0010/\u001a\u000201*\u00020\u0010H\u0000¢\u0006\u0004\b/\u00102\u001a#\u00104\u001a\u00020\u0002*\u00020-2\u0006\u00103\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u00100\u001a\u001b\u00107\u001a\u00020\u0002*\u0002052\u0006\u00106\u001a\u00020\u0010H\u0000¢\u0006\u0004\b7\u00108\u001a)\u0010;\u001a\u0002012\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010:\u001a\b\u0012\u0004\u0012\u00020109H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010>\u001a\u00020\u0015*\u00020=H\u0000¢\u0006\u0004\b>\u0010?\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\b¢\u0006\u0004\bA\u0010B\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000CH\u0080\b¢\u0006\u0004\bA\u0010D\u001a8\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0080\b¢\u0006\u0004\bA\u0010H\u001a%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0004\bI\u0010B\u001a/\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@2\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0001¢\u0006\u0004\bK\u0010L\u001a)\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0004\bI\u0010L\u001a\u0013\u0010M\u001a\u000201*\u000205H\u0000¢\u0006\u0004\bM\u0010N\u001a\u0013\u0010M\u001a\u000201*\u00020OH\u0000¢\u0006\u0004\bM\u0010P\u001a\u0013\u0010Q\u001a\u00020\u0000*\u00020\u0015H\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010Q\u001a\u00020\u0000*\u00020\u0019H\u0000¢\u0006\u0004\bQ\u0010S\u001a5\u0010X\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010@2\u0006\u0010T\u001a\u00020\r2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000U2\u0006\u0010W\u001a\u00020\u0000H\u0000¢\u0006\u0004\bX\u0010Y\u001a\u0013\u0010[\u001a\u000201*\u00020ZH\u0000¢\u0006\u0004\b[\u0010\\\"\u0014\u0010^\u001a\u00020]8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u0014\u0010`\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"\u0014\u0010b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "readBomAsCharset", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "Lkotlin/time/Duration;", "checkDuration-HG0u8IE", "(Ljava/lang/String;J)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "other", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "Lokio/Source;", "timeUnit", "skipAll", "(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z", "", "(Lokio/BufferedSource;)V", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "discard", "Ljava/net/Socket;", "source", "isHealthy", "(Ljava/net/Socket;Lokio/BufferedSource;)Z", "Lkotlin/Function0;", "block", "threadName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "T", "unmodifiable", "(Ljava/util/List;)Ljava/util/List;", "", "(Ljava/util/Set;)Ljava/util/Set;", "K", "V", "", "(Ljava/util/Map;)Ljava/util/Map;", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "closeQuietly", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Lokhttp3/Dispatcher;", "assertLockNotHeld", "(Lokhttp3/Dispatcher;)V", "Ljava/util/TimeZone;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC, "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _UtilJvmKt {
    public static final java.util.TimeZone UTC;
    public static final boolean assertionsEnabled;
    public static final java.lang.String okHttpName;

    static {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        assertionsEnabled = false;
        java.lang.String name2 = okhttp3.OkHttpClient.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        okHttpName = kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.removePrefix(name2, (java.lang.CharSequence) "okhttp3."), (java.lang.CharSequence) "Client");
    }

    public static final java.util.concurrent.ThreadFactory threadFactory(final java.lang.String str, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new java.util.concurrent.ThreadFactory() { // from class: okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return okhttp3.internal._UtilJvmKt.m24416$r8$lambda$_J6QpgacuLmRBBtfmidf27cGU(str, z, runnable);
            }
        };
    }

    public static /* synthetic */ java.lang.String toHostHeader$default(okhttp3.HttpUrl httpUrl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final java.lang.String toHostHeader(okhttp3.HttpUrl httpUrl, boolean z) {
        java.lang.String host;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) httpUrl.host(), (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.COLON, false, 2, (java.lang.Object) null)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(httpUrl.host());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            host = sb.toString();
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == okhttp3.HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return host;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(host);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb2.append(httpUrl.port());
        return sb2.toString();
    }

    public static final java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        java.lang.String format = java.lang.String.format(locale, str, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final java.nio.charset.Charset readBomAsCharset(okio.BufferedSource bufferedSource, java.nio.charset.Charset charset) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        int select = bufferedSource.select(okhttp3.internal._UtilCommonKt.getUNICODE_BOMS());
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            return kotlin.text.Charsets.UTF_8;
        }
        if (select == 1) {
            return kotlin.text.Charsets.UTF_16BE;
        }
        if (select == 2) {
            return kotlin.text.Charsets.INSTANCE.UTF32_LE();
        }
        if (select == 3) {
            return kotlin.text.Charsets.UTF_16LE;
        }
        if (select == 4) {
            return kotlin.text.Charsets.INSTANCE.UTF32_BE();
        }
        throw new java.lang.AssertionError();
    }

    public static final int checkDuration(java.lang.String str, long j, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" too large");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(" too small");
        throw new java.lang.IllegalArgumentException(sb3.toString().toString());
    }

    /* renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m24417checkDurationHG0u8IE(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.time.Duration.m23963isNegativeimpl(j)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        long m23953getInWholeMillisecondsimpl = kotlin.time.Duration.m23953getInWholeMillisecondsimpl(j);
        if (m23953getInWholeMillisecondsimpl > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" too large");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (m23953getInWholeMillisecondsimpl != 0 || !kotlin.time.Duration.m23964isPositiveimpl(j)) {
            return (int) m23953getInWholeMillisecondsimpl;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(" too small");
        throw new java.lang.IllegalArgumentException(sb3.toString().toString());
    }

    public static final okhttp3.Headers toHeaders(java.util.List<okhttp3.internal.http2.Header> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        for (okhttp3.internal.http2.Header header : list) {
            builder.addLenient$okhttp(header.getName().utf8(), header.getValue().utf8());
        }
        return builder.build();
    }

    public static final java.util.List<okhttp3.internal.http2.Header> toHeaderList(okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, headers.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            arrayList.add(new okhttp3.internal.http2.Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final boolean canReuseConnectionFor(okhttp3.HttpUrl httpUrl, okhttp3.HttpUrl httpUrl2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && kotlin.jvm.internal.Intrinsics.areEqual(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final okhttp3.EventListener.Factory asFactory(final okhttp3.EventListener eventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "");
        return new okhttp3.EventListener.Factory() { // from class: okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda0
            @Override // okhttp3.EventListener.Factory
            public final okhttp3.EventListener create(okhttp3.Call call) {
                return okhttp3.internal._UtilJvmKt.$r8$lambda$K99WxJwzokotbMqA93v0Qgw0Pe0(okhttp3.EventListener.this, call);
            }
        };
    }

    public static final boolean skipAll(okio.Source source, int i, java.util.concurrent.TimeUnit timeUnit) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        long nanoTime = java.lang.System.nanoTime();
        long deadlineNanoTime = source.getGetHighSpeedVideoFpsRanges().getHasDeadline() ? source.getGetHighSpeedVideoFpsRanges().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.getGetHighSpeedVideoFpsRanges().deadlineNanoTime(java.lang.Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            okio.Buffer buffer = new okio.Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.getGetHighSpeedVideoFpsRanges().clearDeadline();
                return true;
            }
            source.getGetHighSpeedVideoFpsRanges().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.getGetHighSpeedVideoFpsRanges().clearDeadline();
                return false;
            }
            source.getGetHighSpeedVideoFpsRanges().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (java.lang.Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.getGetHighSpeedVideoFpsRanges().clearDeadline();
            } else {
                source.getGetHighSpeedVideoFpsRanges().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final void skipAll(okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        while (!bufferedSource.exhausted()) {
            bufferedSource.skip(bufferedSource.getBuffer().size());
        }
    }

    public static final boolean discard(okio.Source source, int i, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            return skipAll(source, i, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static final boolean isHealthy(java.net.Socket socket, okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean exhausted = bufferedSource.exhausted();
                socket.setSoTimeout(soTimeout);
                return !exhausted;
            } catch (java.lang.Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (java.net.SocketTimeoutException unused) {
            return true;
        } catch (java.io.IOException unused2) {
            return false;
        }
    }

    public static final void threadName(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.String name2 = currentThread.getName();
        currentThread.setName(str);
        try {
            function0.invoke();
        } finally {
            currentThread.setName(name2);
        }
    }

    public static final long headersContentLength(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String str = response.headers().get("Content-Length");
        if (str != null) {
            return okhttp3.internal._UtilCommonKt.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final <T> java.util.List<T> unmodifiable(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<T> unmodifiableList = java.util.Collections.unmodifiableList(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "");
        return unmodifiableList;
    }

    public static final <T> java.util.Set<T> unmodifiable(java.util.Set<? extends T> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<T> unmodifiableSet = java.util.Collections.unmodifiableSet(set);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "");
        return unmodifiableSet;
    }

    public static final <K, V> java.util.Map<K, V> unmodifiable(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.Map<K, V> unmodifiableMap = java.util.Collections.unmodifiableMap(map);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "");
        return unmodifiableMap;
    }

    public static final <T> java.util.List<T> toImmutableList(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (list.size() == 1) {
            java.util.List<T> singletonList = java.util.Collections.singletonList(list.get(0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonList, "");
            return singletonList;
        }
        java.lang.Object[] array = list.toArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        java.util.List<T> unmodifiableList = java.util.Collections.unmodifiableList(kotlin.collections.ArraysKt.asList(array));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(unmodifiableList, "");
        return unmodifiableList;
    }

    @java.lang.SafeVarargs
    public static final <T> java.util.List<T> immutableListOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return toImmutableList(tArr);
    }

    public static final <T> java.util.List<T> toImmutableList(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (tArr.length == 1) {
            java.util.List<T> singletonList = java.util.Collections.singletonList(tArr[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonList, "");
            return singletonList;
        }
        java.util.List<T> unmodifiableList = java.util.Collections.unmodifiableList(kotlin.collections.ArraysKt.asList((java.lang.Object[]) tArr.clone()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "");
        return unmodifiableList;
    }

    public static final void closeQuietly(java.net.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        try {
            socket.close();
        } catch (java.lang.AssertionError e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void closeQuietly(java.net.ServerSocket serverSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSocket, "");
        try {
            serverSocket.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final java.lang.String toHexString(long j) {
        java.lang.String hexString = java.lang.Long.toHexString(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    public static final java.lang.String toHexString(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, "delegate") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r5 = readFieldOrNull(r5, java.lang.Object.class, "delegate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T readFieldOrNull(java.lang.Object obj, java.lang.Class<T> cls, java.lang.String str) {
        T t;
        loop0: do {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.Class<?> cls2 = obj.getClass();
            while (true) {
                t = null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.Object.class)) {
                    break;
                }
                try {
                    java.lang.reflect.Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    java.lang.Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break loop0;
                    }
                    t = cls.cast(obj2);
                    break loop0;
                } catch (java.lang.NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls2, "");
                }
            }
            return t;
        } while (obj != null);
        return null;
    }

    public static final void assertLockNotHeld(okhttp3.Dispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        if (assertionsEnabled && java.lang.Thread.holdsLock(dispatcher)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(dispatcher);
            throw new java.lang.AssertionError(sb.toString());
        }
    }

    /* renamed from: $r8$lambda$-_J-6QpgacuLmRBBtfmidf27cGU, reason: not valid java name */
    public static /* synthetic */ java.lang.Thread m24416$r8$lambda$_J6QpgacuLmRBBtfmidf27cGU(java.lang.String str, boolean z, java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static /* synthetic */ okhttp3.EventListener $r8$lambda$K99WxJwzokotbMqA93v0Qgw0Pe0(okhttp3.EventListener eventListener, okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        return eventListener;
    }
}
