package okhttp3.internal.http1;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 E2\u00020\u0001:\u0007FGHIJKEB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b1\u00102R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010>\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/connection/BufferedSocket;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;J)Lokio/Sink;", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lokio/Source;", "openResponseBodySource", "(Lokhttp3/Response;)Lokio/Source;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/HttpUrl;", "p0", "p1", "getHighSpeedVideoSizes", "(Lokhttp3/HttpUrl;J)Lokio/Source;", "skipConnectBody", "(Lokhttp3/Response;)V", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket", "()Lokhttp3/internal/connection/BufferedSocket;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Lokhttp3/internal/http1/HeadersReader;", "Camera2StreamConfigurationMap", "Lokhttp3/internal/http1/HeadersReader;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Headers;", "isResponseComplete", "()Z", "Companion", "KnownLengthSink", "ChunkedSink", "AbstractSource", "FixedLengthSource", "ChunkedSource", "UnknownLengthSource"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private static final okhttp3.Headers getHighSpeedVideoFpsRanges = okhttp3.Headers.INSTANCE.of("OkHttp-Response-Body", "Truncated");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okhttp3.internal.http1.HeadersReader getHighSpeedVideoFpsRanges;
    private final okhttp3.internal.http.ExchangeCodec.Carrier carrier;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private okhttp3.Headers Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;
    private final okhttp3.OkHttpClient getHighSpeedVideoSizes;
    private final okhttp3.internal.connection.BufferedSocket socket;

    public Http1ExchangeCodec(okhttp3.OkHttpClient okHttpClient, okhttp3.internal.http.ExchangeCodec.Carrier carrier, okhttp3.internal.connection.BufferedSocket bufferedSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSocket, "");
        this.getHighSpeedVideoSizes = okHttpClient;
        this.carrier = carrier;
        this.socket = bufferedSocket;
        this.getHighSpeedVideoFpsRanges = new okhttp3.internal.http1.HeadersReader(getSocket().getSource());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.internal.http.ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.internal.connection.BufferedSocket getSocket() {
        return this.socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean isResponseComplete() {
        return this.getHighSpeedVideoFpsRangesFor == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okio.Sink createRequestBody(okhttp3.Request request, long contentLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        okhttp3.RequestBody body = request.body();
        if (body != null && body.isDuplex()) {
            throw new java.net.ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (kotlin.text.StringsKt.equals("chunked", request.header(com.google.common.net.HttpHeaders.TRANSFER_ENCODING), true)) {
            if (this.getHighSpeedVideoFpsRangesFor != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            this.getHighSpeedVideoFpsRangesFor = 2;
            return new okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSink();
        }
        if (contentLength == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.getHighSpeedVideoFpsRangesFor != 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("state: ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb2.toString().toString());
        }
        this.getHighSpeedVideoFpsRangesFor = 2;
        return new okhttp3.internal.http1.Http1ExchangeCodec.KnownLengthSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        getCarrier().mo24418cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void writeRequestHeaders(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        okhttp3.internal.http.RequestLine requestLine = okhttp3.internal.http.RequestLine.INSTANCE;
        java.net.Proxy.Type type = getCarrier().getRoute().proxy().type();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/Sink;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "Lokio/Buffer;", "p0", "", "p1", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lokio/ForwardingTimeout;", "getHighSpeedVideoFpsRangesFor", "Lokio/ForwardingTimeout;", "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ChunkedSink implements okio.Sink {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final okio.ForwardingTimeout getHighSpeedVideoFpsRanges;
        private static final byte[] $$a = {86, 123, -90};
        private static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getInputSizeshNQ4ISI = 0;
        private static int getOutputFormats = 1;
        private static int getHighSpeedVideoSizes = 1229026404;
        private static char[] getHighSpeedVideoFpsRanges = {4127, 4163, 4109, 4145, 4104, 4118, 4139, 4190, 4154, 4134, 4108, 4107, 4141, 5091, 4119, 5090, 5093, 4113, 4178, 4159, 4115, 5092, 4102, 4144, 4103, 4121, 4106, 5089, 4151, 4123, 4114, 4112, 4174, 4157, 5095, 4122, 4110, 4117, 4142, 4167, 4120, 4116, 5088, 4125, 4176, 5100, 4124, 5094, 4171};
        private static char getOutputMinFrameDuration = 9699;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(short s, byte b, int i) {
            int i2;
            byte[] bArr = $$a;
            int i3 = s * 3;
            int i4 = 3 - (b * 3);
            int i5 = i + 97;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                int i8 = i6;
                i2 = i4;
                i4 += -i8;
                i2++;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new java.lang.String(bArr2, 0);
                }
                i8 = bArr[i2];
                i4 += -i8;
                i2++;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                }
            } else {
                i2 = i4;
                i4 = i5;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                }
            }
        }

        private static void b(boolean z, int i, char[] cArr, int i2, int i3, java.lang.Object[] objArr) {
            int i4 = 2 % 2;
            o.getOutputStallDurationlomOqCM getoutputstalldurationlomoqcm = new o.getOutputStallDurationlomOqCM();
            char[] cArr2 = new char[i3];
            getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 0;
            while (getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor < i3) {
                int i5 = $11 + 119;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRanges = cArr[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor];
                cArr2[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = (char) (i + getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRanges);
                int i7 = getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7]), java.lang.Integer.valueOf(getHighSpeedVideoSizes)};
                    java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1585789956);
                    if (Camera2StreamConfigurationMap == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.text.TextUtils.getOffsetBefore("", 0) + 17808), 379 - android.view.View.getDefaultSize(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, -1014629116, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, objArr2)).charValue();
                    try {
                        java.lang.Object[] objArr3 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                        if (Camera2StreamConfigurationMap2 == null) {
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.graphics.Color.green(0) + 32158), 90 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (i2 > 0) {
                int i8 = $10 + 47;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI = i2;
                char[] cArr3 = new char[i3];
                java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
                java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI, getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI);
                java.lang.System.arraycopy(cArr3, getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI, cArr2, 0, i3 - getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 0;
                while (getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor < i3) {
                    cArr4[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = cArr2[(i3 - getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor) - 1];
                    try {
                        java.lang.Object[] objArr4 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                        java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                        if (Camera2StreamConfigurationMap3 == null) {
                            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (32157 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.text.TextUtils.getOffsetBefore("", 0) + 90, 11 - android.view.KeyEvent.getDeadChar(0, 0), -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr4);
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i10 = $11 + 113;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 4;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new java.lang.String(cArr2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x012a, code lost:
        
            if (r3.getHighSpeedVideoSizes == r3.getHighSpeedVideoFpsRangesFor) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x015b, code lost:
        
            r7 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), r3};
            r19 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2046312203);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01a0, code lost:
        
            if (r19 != null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01a2, code lost:
        
            r11 = (byte) 0;
            r10 = r11;
            r19 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (49752 - android.view.KeyEvent.getDeadChar(0, 0)), (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 483, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, -453444085, false, $$c(r11, r10, (byte) (r10 + 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x022e, code lost:
        
            if (((java.lang.Integer) ((java.lang.reflect.Method) r19).invoke(null, r7)).intValue() != r3.getInputFormats) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0232, code lost:
        
            r7 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r1), r3, r3, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r1), r3, java.lang.Integer.valueOf(r1), r3};
            r6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1167583195);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x026f, code lost:
        
            if (r6 != null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0271, code lost:
        
            r14 = (byte) 0;
            r8 = r14;
            r6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.widget.ExpandableListView.getPackedPositionChild(0) + 45286), 158 - android.widget.ExpandableListView.getPackedPositionGroup(0), 4 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 661182757, false, $$c(r14, r8, (byte) (r8 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x02e2, code lost:
        
            r6 = ((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r7)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x02ef, code lost:
        
            r7 = (r3.Camera2StreamConfigurationMap * r1) + r3.getInputFormats;
            r2[r3.getHighSpeedVideoFpsRanges] = r4[r6];
            r2[r3.getHighSpeedVideoFpsRanges + 1] = r4[r7];
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0355, code lost:
        
            r3.getHighSpeedVideoFpsRanges += 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0303, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0304, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0308, code lost:
        
            if (r1 != null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x030a, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x030b, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0312, code lost:
        
            if (r3.getHighResolutionOutputSizeshNQ4ISI != r3.Camera2StreamConfigurationMap) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0314, code lost:
        
            r3.getOutputFormats = ((r3.getOutputFormats + r1) - 1) % r1;
            r3.getInputFormats = ((r3.getInputFormats + r1) - 1) % r1;
            r6 = (r3.getHighResolutionOutputSizeshNQ4ISI * r1) + r3.getOutputFormats;
            r7 = (r3.Camera2StreamConfigurationMap * r1) + r3.getInputFormats;
            r2[r3.getHighSpeedVideoFpsRanges] = r4[r6];
            r2[r3.getHighSpeedVideoFpsRanges + 1] = r4[r7];
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x033c, code lost:
        
            r6 = (r3.getHighResolutionOutputSizeshNQ4ISI * r1) + r3.getInputFormats;
            r7 = (r3.Camera2StreamConfigurationMap * r1) + r3.getOutputFormats;
            r2[r3.getHighSpeedVideoFpsRanges] = r4[r6];
            r2[r3.getHighSpeedVideoFpsRanges + 1] = r4[r7];
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
        
            r2[r3.getHighSpeedVideoFpsRanges] = (char) (r3.getHighSpeedVideoSizes - r37);
            r2[r3.getHighSpeedVideoFpsRanges + 1] = (char) (r3.getHighSpeedVideoFpsRangesFor - r37);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x013e, code lost:
        
            if (r3.getHighSpeedVideoSizes == r3.getHighSpeedVideoFpsRangesFor) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, char[] cArr, byte b, java.lang.Object[] objArr) {
            int i2;
            int i3 = 2 % 2;
            o.getValidOutputFormatsForInputhNQ4ISI getvalidoutputformatsforinputhnq4isi = new o.getValidOutputFormatsForInputhNQ4ISI();
            char[] cArr2 = getHighSpeedVideoFpsRanges;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = $11 + 11;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 4;
                }
                int i6 = 0;
                while (i6 < length) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i6])};
                        java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1175707386);
                        if (Camera2StreamConfigurationMap == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (22522 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, 619503622, false, $$c(b2, b3, (byte) (b3 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap).invoke(null, objArr2)).charValue();
                        i6++;
                        j = 0;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getOutputMinFrameDuration)};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1175707386);
            if (Camera2StreamConfigurationMap2 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (22521 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 266 - android.text.TextUtils.getOffsetBefore("", 0), 11 - android.os.Process.getGidForName(""), 619503622, false, $$c(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges = 0;
                while (getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges < i2) {
                    int i11 = $11 + 29;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoSizes = cArr[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges];
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRangesFor = cArr[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges];
                    } else {
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoSizes = cArr[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges];
                        getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRangesFor = cArr[getvalidoutputformatsforinputhnq4isi.getHighSpeedVideoFpsRanges + 1];
                    }
                }
            }
            int i12 = 0;
            while (i12 < i) {
                int i13 = $10 + 11;
                int i14 = i13 % 128;
                $11 = i14;
                int i15 = i13 % 2;
                cArr4[i12] = (char) (cArr4[i12] ^ 13722);
                i12++;
                int i16 = i14 + 109;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            objArr[0] = new java.lang.String(cArr4);
        }

        public ChunkedSink() {
            this.getHighSpeedVideoFpsRanges = new okio.ForwardingTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this.getSocket().getSink().getGetHighResolutionOutputSizeshNQ4ISI());
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public final okio.Timeout getGetHighResolutionOutputSizeshNQ4ISI() {
            int i = 2 % 2;
            int i2 = getOutputFormats + 29;
            int i3 = i2 % 128;
            getInputSizeshNQ4ISI = i3;
            int i4 = i2 % 2;
            okio.ForwardingTimeout forwardingTimeout = this.getHighSpeedVideoFpsRanges;
            int i5 = i3 + 95;
            getOutputFormats = i5 % 128;
            int i6 = i5 % 2;
            return forwardingTimeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        
            r3 = r3 + 45;
            okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSink.getInputSizeshNQ4ISI = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        
            if ((r3 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            r7 = 27 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            r1 = r6.getHighResolutionOutputSizeshNQ4ISI.getSocket().getSink();
            r1.writeHexadecimalUnsignedLong(r8);
            r1.writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            r1.write(r7, r8);
            r1.writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
        
            if (r6.getHighResolutionOutputSizeshNQ4ISI != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
        
            if (r6.getHighResolutionOutputSizeshNQ4ISI == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0065, code lost:
        
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        
            r2 = okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSink.getInputSizeshNQ4ISI + 7;
            r3 = r2 % 128;
            okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSink.getOutputFormats = r3;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
        
            if (r8 != 0) goto L15;
         */
        @Override // okio.Sink
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void write(okio.Buffer p0, long p1) {
            int i = 2 % 2;
            int i2 = getOutputFormats + 21;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 41 / 0;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                okhttp3.internal.http1.Http1ExchangeCodec.this.getSocket().getSink().flush();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                okhttp3.internal.http1.Http1ExchangeCodec.this.getSocket().getSink().writeUtf8("0\r\n\r\n");
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this, this.getHighSpeedVideoFpsRanges);
                okhttp3.internal.http1.Http1ExchangeCodec.this.getHighSpeedVideoFpsRangesFor = 3;
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v108, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v109 */
        /* JADX WARN: Type inference failed for: r6v115 */
        /* JADX WARN: Type inference failed for: r6v116 */
        /* JADX WARN: Type inference failed for: r6v13, types: [int] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v144 */
        /* JADX WARN: Type inference failed for: r6v145, types: [java.io.ByteArrayInputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v151, types: [char[]] */
        /* JADX WARN: Type inference failed for: r6v154, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v179, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v19, types: [int] */
        /* JADX WARN: Type inference failed for: r6v190, types: [int] */
        /* JADX WARN: Type inference failed for: r6v198, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v2, types: [int] */
        /* JADX WARN: Type inference failed for: r6v200 */
        /* JADX WARN: Type inference failed for: r6v204 */
        /* JADX WARN: Type inference failed for: r6v205 */
        /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v37, types: [int] */
        /* JADX WARN: Type inference failed for: r6v63 */
        /* JADX WARN: Type inference failed for: r6v87 */
        public static java.lang.Object[] Camera2StreamConfigurationMap(android.content.Context r35, int r36, int r37) {
            /*
                Method dump skipped, instructions count: 4387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSink.Camera2StreamConfigurationMap(android.content.Context, int, int):java.lang.Object[]");
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long reportedContentLength(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (!okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (kotlin.text.StringsKt.equals("chunked", okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) {
            return -1L;
        }
        return okhttp3.internal._UtilJvmKt.headersContentLength(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okio.Source openResponseBodySource(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (!okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return getHighSpeedVideoSizes(response.request().url(), 0L);
        }
        if (!kotlin.text.StringsKt.equals("chunked", okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) {
            long headersContentLength = okhttp3.internal._UtilJvmKt.headersContentLength(response);
            if (headersContentLength != -1) {
                return getHighSpeedVideoSizes(response.request().url(), headersContentLength);
            }
            okhttp3.HttpUrl url = response.request().url();
            if (this.getHighSpeedVideoFpsRangesFor != 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            this.getHighSpeedVideoFpsRangesFor = 5;
            getCarrier().noNewExchanges();
            return new okhttp3.internal.http1.Http1ExchangeCodec.UnknownLengthSource(this, url);
        }
        okhttp3.HttpUrl url2 = response.request().url();
        if (this.getHighSpeedVideoFpsRangesFor != 4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("state: ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb2.toString().toString());
        }
        this.getHighSpeedVideoFpsRangesFor = 5;
        return new okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource(this, url2);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.Headers peekTrailers() {
        okhttp3.Headers headers = this.Camera2StreamConfigurationMap;
        if (headers == getHighSpeedVideoFpsRanges) {
            throw new java.io.IOException("Trailers cannot be read because the response body was truncated");
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 5 || i == 6) {
            return headers;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Trailers cannot be read because the state is ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        getSocket().getSink().flush();
    }

    public final void writeRequest(okhttp3.Headers headers, java.lang.String requestLine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestLine, "");
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        getSocket().getSink().writeUtf8(requestLine).writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            getSocket().getSink().writeUtf8(headers.name(i)).writeUtf8(": ").writeUtf8(headers.value(i)).writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        }
        getSocket().getSink().writeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        this.getHighSpeedVideoFpsRangesFor = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.Response.Builder readResponseHeaders(boolean expectContinue) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        try {
            okhttp3.internal.http.StatusLine parse = okhttp3.internal.http.StatusLine.INSTANCE.parse(this.getHighSpeedVideoFpsRanges.readLine());
            okhttp3.Response.Builder headers = new okhttp3.Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.getHighSpeedVideoFpsRanges.readHeaders());
            if (expectContinue && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.getHighSpeedVideoFpsRangesFor = 3;
                return headers;
            }
            int i2 = parse.code;
            if (102 <= i2 && i2 < 200) {
                this.getHighSpeedVideoFpsRangesFor = 3;
                return headers;
            }
            this.getHighSpeedVideoFpsRangesFor = 4;
            return headers;
        } catch (java.io.EOFException e) {
            throw new java.io.IOException("unexpected end of stream on ".concat(java.lang.String.valueOf(getCarrier().getRoute().address().url().redact())), e);
        }
    }

    private final okio.Source getHighSpeedVideoSizes(okhttp3.HttpUrl p0, long p1) {
        if (this.getHighSpeedVideoFpsRangesFor != 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoFpsRangesFor = 5;
        return new okhttp3.internal.http1.Http1ExchangeCodec.FixedLengthSource(this, p0, p1);
    }

    public final void skipConnectBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        long headersContentLength = okhttp3.internal._UtilJvmKt.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        okio.Source highSpeedVideoSizes = getHighSpeedVideoSizes(response.request().url(), headersContentLength);
        okhttp3.internal._UtilJvmKt.skipAll(highSpeedVideoSizes, Integer.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
        highSpeedVideoSizes.close();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/Sink;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "Lokio/Buffer;", "p0", "", "p1", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lokio/ForwardingTimeout;", "getHighSpeedVideoFpsRangesFor", "Lokio/ForwardingTimeout;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class KnownLengthSink implements okio.Sink {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final okio.ForwardingTimeout getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;

        public KnownLengthSink() {
            this.getHighResolutionOutputSizeshNQ4ISI = new okio.ForwardingTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this.getSocket().getSink().getGetHighResolutionOutputSizeshNQ4ISI());
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public final okio.Timeout getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // okio.Sink
        public final void write(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            okhttp3.internal._UtilCommonKt.checkOffsetAndCount(p0.size(), 0L, p1);
            okhttp3.internal.http1.Http1ExchangeCodec.this.getSocket().getSink().write(p0, p1);
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            okhttp3.internal.http1.Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this, this.getHighResolutionOutputSizeshNQ4ISI);
            okhttp3.internal.http1.Http1ExchangeCodec.this.getHighSpeedVideoFpsRangesFor = 3;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00168\u0005@\u0005X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/Source;", "Lokhttp3/HttpUrl;", "p0", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "Lokio/Buffer;", "", "p1", "read", "(Lokio/Buffer;J)J", "Lokhttp3/Headers;", "", "getHighSpeedVideoFpsRangesFor", "(Lokhttp3/Headers;)V", "Lokhttp3/HttpUrl;", "Lokio/ForwardingTimeout;", "Camera2StreamConfigurationMap", "Lokio/ForwardingTimeout;", "", "getHighSpeedVideoSizes", "Z", "()Z", "getHighSpeedVideoFpsRanges", "()V", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    abstract class AbstractSource implements okio.Source {
        private final okio.ForwardingTimeout Camera2StreamConfigurationMap;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec getHighResolutionOutputSizeshNQ4ISI;
        private final okhttp3.HttpUrl getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        public AbstractSource(okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec, okhttp3.HttpUrl httpUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
            this.getHighResolutionOutputSizeshNQ4ISI = http1ExchangeCodec;
            this.getHighSpeedVideoFpsRangesFor = httpUrl;
            this.Camera2StreamConfigurationMap = new okio.ForwardingTimeout(http1ExchangeCodec.getSocket().getSource().getGetHighResolutionOutputSizeshNQ4ISI());
        }

        protected final void getHighSpeedVideoFpsRanges() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        protected final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public okio.Timeout getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // okio.Source
        public long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            try {
                return this.getHighResolutionOutputSizeshNQ4ISI.getSocket().getSource().read(p0, p1);
            } catch (java.io.IOException e) {
                this.getHighResolutionOutputSizeshNQ4ISI.getCarrier().noNewExchanges();
                getHighSpeedVideoFpsRangesFor(okhttp3.internal.http1.Http1ExchangeCodec.getHighSpeedVideoFpsRanges);
                throw e;
            }
        }

        public final void getHighSpeedVideoFpsRangesFor(okhttp3.Headers p0) {
            okhttp3.OkHttpClient okHttpClient;
            okhttp3.CookieJar cookieJar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor != 6) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor != 5) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
                    sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap = p0;
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = 6;
                if (p0.size() <= 0 || (okHttpClient = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) == null || (cookieJar = okHttpClient.cookieJar()) == null) {
                    return;
                }
                okhttp3.internal.http.HttpHeaders.receiveHeaders(cookieJar, this.getHighSpeedVideoFpsRangesFor, p0);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "p0", "", "p1", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;J)V", "Lokio/Buffer;", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Camera2StreamConfigurationMap", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private long getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec, okhttp3.HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
            this.getHighSpeedVideoSizes = http1ExchangeCodec;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            if (j == 0) {
                getHighSpeedVideoFpsRangesFor(okhttp3.Headers.EMPTY);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p1 < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p1)).toString());
            }
            if (getGetHighResolutionOutputSizeshNQ4ISI()) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j == 0) {
                return -1L;
            }
            long read = super.read(p0, java.lang.Math.min(j, p1));
            if (read == -1) {
                this.getHighSpeedVideoSizes.getCarrier().noNewExchanges();
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                getHighSpeedVideoFpsRangesFor(okhttp3.internal.http1.Http1ExchangeCodec.getHighSpeedVideoFpsRanges);
                throw protocolException;
            }
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI - read;
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
            if (j2 == 0) {
                getHighSpeedVideoFpsRangesFor(okhttp3.Headers.EMPTY);
            }
            return read;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (getGetHighResolutionOutputSizeshNQ4ISI()) {
                return;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0 && !okhttp3.internal._UtilJvmKt.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                this.getHighSpeedVideoSizes.getCarrier().noNewExchanges();
                getHighSpeedVideoFpsRangesFor(okhttp3.internal.http1.Http1ExchangeCodec.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "p0", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lokio/Buffer;", "", "p1", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private long getHighSpeedVideoFpsRanges;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec, okhttp3.HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
            this.getHighSpeedVideoFpsRanges = http1ExchangeCodec;
            this.getHighSpeedVideoFpsRanges = -1L;
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p1 < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p1)).toString());
            }
            if (getGetHighResolutionOutputSizeshNQ4ISI()) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            if (!this.getHighSpeedVideoFpsRangesFor) {
                return -1L;
            }
            long j = this.getHighSpeedVideoFpsRanges;
            if (j == 0 || j == -1) {
                if (j != -1) {
                    this.getHighSpeedVideoFpsRanges.getSocket().getSource().readUtf8LineStrict();
                }
                try {
                    this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getSocket().getSource().readHexadecimalUnsignedLong();
                    java.lang.String obj = kotlin.text.StringsKt.trim(this.getHighSpeedVideoFpsRanges.getSocket().getSource().readUtf8LineStrict()).toString();
                    if (this.getHighSpeedVideoFpsRanges >= 0 && (obj.length() <= 0 || kotlin.text.StringsKt.startsWith$default(obj, ";", false, 2, (java.lang.Object) null))) {
                        if (this.getHighSpeedVideoFpsRanges == 0) {
                            this.getHighSpeedVideoFpsRangesFor = false;
                            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.readHeaders());
                        }
                        if (!this.getHighSpeedVideoFpsRangesFor) {
                            return -1L;
                        }
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("expected chunk size and optional extensions but was \"");
                        sb.append(this.getHighSpeedVideoFpsRanges);
                        sb.append(obj);
                        sb.append('\"');
                        throw new java.net.ProtocolException(sb.toString());
                    }
                } catch (java.lang.NumberFormatException e) {
                    throw new java.net.ProtocolException(e.getMessage());
                }
            }
            long read = super.read(p0, java.lang.Math.min(p1, this.getHighSpeedVideoFpsRanges));
            if (read == -1) {
                this.getHighSpeedVideoFpsRanges.getCarrier().noNewExchanges();
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                getHighSpeedVideoFpsRangesFor(okhttp3.internal.http1.Http1ExchangeCodec.getHighSpeedVideoFpsRanges);
                throw protocolException;
            }
            this.getHighSpeedVideoFpsRanges -= read;
            return read;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (getGetHighResolutionOutputSizeshNQ4ISI()) {
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor && !okhttp3.internal._UtilJvmKt.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                this.getHighSpeedVideoFpsRanges.getCarrier().noNewExchanges();
                getHighSpeedVideoFpsRangesFor(okhttp3.internal.http1.Http1ExchangeCodec.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "p0", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lokio/Buffer;", "", "p1", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec, okhttp3.HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
            this.getHighSpeedVideoFpsRangesFor = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long read(okio.Buffer p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p1 < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(p1)).toString());
            }
            if (getGetHighResolutionOutputSizeshNQ4ISI()) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED.toString());
            }
            if (this.Camera2StreamConfigurationMap) {
                return -1L;
            }
            long read = super.read(p0, p1);
            if (read != -1) {
                return read;
            }
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoFpsRangesFor(okhttp3.Headers.EMPTY);
            return -1L;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (getGetHighResolutionOutputSizeshNQ4ISI()) {
                return;
            }
            if (!this.Camera2StreamConfigurationMap) {
                getHighSpeedVideoFpsRangesFor(okhttp3.internal.http1.Http1ExchangeCodec.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges();
        }
    }

    public static final /* synthetic */ void access$detachTimeout(okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec, okio.ForwardingTimeout forwardingTimeout) {
        okio.Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(okio.Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }
}
