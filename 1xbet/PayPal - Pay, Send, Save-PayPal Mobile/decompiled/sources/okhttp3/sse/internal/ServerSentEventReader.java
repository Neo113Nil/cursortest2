package okhttp3.sse.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011"}, d2 = {"Lokhttp3/sse/internal/ServerSentEventReader;", "", "Lokio/BufferedSource;", "source", "Lokhttp3/sse/internal/ServerSentEventReader$Callback;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lokio/BufferedSource;Lokhttp3/sse/internal/ServerSentEventReader$Callback;)V", "", "processNextEvent", "()Z", "getHighSpeedVideoSizes", "Lokio/BufferedSource;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/sse/internal/ServerSentEventReader$Callback;", "", "Ljava/lang/String;", "Companion", "Callback"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServerSentEventReader {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizes;
    private final okhttp3.sse.internal.ServerSentEventReader.Callback getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.BufferedSource Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.sse.internal.ServerSentEventReader.Companion INSTANCE = new okhttp3.sse.internal.ServerSentEventReader.Companion(null);
    private static final okio.Options options = okio.Options.INSTANCE.of(okio.ByteString.INSTANCE.encodeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE), okio.ByteString.INSTANCE.encodeUtf8("\r"), okio.ByteString.INSTANCE.encodeUtf8(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE), okio.ByteString.INSTANCE.encodeUtf8(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA), okio.ByteString.INSTANCE.encodeUtf8("data:"), okio.ByteString.INSTANCE.encodeUtf8("data\r\n"), okio.ByteString.INSTANCE.encodeUtf8("data\r"), okio.ByteString.INSTANCE.encodeUtf8("data\n"), okio.ByteString.INSTANCE.encodeUtf8("id: "), okio.ByteString.INSTANCE.encodeUtf8("id:"), okio.ByteString.INSTANCE.encodeUtf8("id\r\n"), okio.ByteString.INSTANCE.encodeUtf8("id\r"), okio.ByteString.INSTANCE.encodeUtf8("id\n"), okio.ByteString.INSTANCE.encodeUtf8("event: "), okio.ByteString.INSTANCE.encodeUtf8("event:"), okio.ByteString.INSTANCE.encodeUtf8("event\r\n"), okio.ByteString.INSTANCE.encodeUtf8("event\r"), okio.ByteString.INSTANCE.encodeUtf8("event\n"), okio.ByteString.INSTANCE.encodeUtf8("retry: "), okio.ByteString.INSTANCE.encodeUtf8("retry:"));
    private static final okio.ByteString getHighSpeedVideoFpsRangesFor = okio.ByteString.INSTANCE.encodeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lokhttp3/sse/internal/ServerSentEventReader$Callback;", "", "", "id", "type", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "timeMs", "onRetryChange", "(J)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Callback {
        void onEvent(java.lang.String id, java.lang.String type, java.lang.String data);

        void onRetryChange(long timeMs);
    }

    public ServerSentEventReader(okio.BufferedSource bufferedSource, okhttp3.sse.internal.ServerSentEventReader.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.Camera2StreamConfigurationMap = bufferedSource;
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
    }

    public final boolean processNextEvent() throws java.io.IOException {
        java.lang.String str = this.getHighSpeedVideoSizes;
        okio.Buffer buffer = new okio.Buffer();
        while (true) {
            java.lang.String str2 = null;
            while (true) {
                okio.BufferedSource bufferedSource = this.Camera2StreamConfigurationMap;
                okio.Options options2 = options;
                int select = bufferedSource.select(options2);
                if (select >= 0 && select < 3) {
                    if (buffer.size() == 0) {
                        return true;
                    }
                    this.getHighSpeedVideoSizes = str;
                    buffer.skip(1L);
                    this.getHighResolutionOutputSizeshNQ4ISI.onEvent(str, str2, buffer.readUtf8());
                    return true;
                }
                if (3 <= select && select < 5) {
                    okhttp3.sse.internal.ServerSentEventReader.Companion.access$readData(INSTANCE, this.Camera2StreamConfigurationMap, buffer);
                } else if (5 <= select && select < 8) {
                    buffer.writeByte(10);
                } else if (8 <= select && select < 10) {
                    str = this.Camera2StreamConfigurationMap.readUtf8LineStrict();
                    if (str.length() <= 0) {
                        str = null;
                    }
                } else if (10 <= select && select < 13) {
                    str = null;
                } else if (13 <= select && select < 15) {
                    str2 = this.Camera2StreamConfigurationMap.readUtf8LineStrict();
                    if (str2.length() > 0) {
                    }
                } else if (15 > select || select >= 18) {
                    if (18 <= select && select < 20) {
                        long access$readRetryMs = okhttp3.sse.internal.ServerSentEventReader.Companion.access$readRetryMs(INSTANCE, this.Camera2StreamConfigurationMap);
                        if (access$readRetryMs != -1) {
                            this.getHighResolutionOutputSizeshNQ4ISI.onRetryChange(access$readRetryMs);
                        }
                    } else if (select == -1) {
                        long indexOfElement = this.Camera2StreamConfigurationMap.indexOfElement(getHighSpeedVideoFpsRangesFor);
                        if (indexOfElement == -1) {
                            return false;
                        }
                        this.Camera2StreamConfigurationMap.skip(indexOfElement);
                        this.Camera2StreamConfigurationMap.select(options2);
                    } else {
                        throw new java.lang.AssertionError();
                    }
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/sse/internal/ServerSentEventReader$Companion;", "", "<init>", "()V", "Lokio/Options;", "options", "Lokio/Options;", "getOptions", "()Lokio/Options;", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "Lokio/ByteString;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okio.Options getOptions() {
            return okhttp3.sse.internal.ServerSentEventReader.options;
        }

        public static final /* synthetic */ void access$readData(okhttp3.sse.internal.ServerSentEventReader.Companion companion, okio.BufferedSource bufferedSource, okio.Buffer buffer) {
            buffer.writeByte(10);
            bufferedSource.readFully(buffer, bufferedSource.indexOfElement(okhttp3.sse.internal.ServerSentEventReader.getHighSpeedVideoFpsRangesFor));
            bufferedSource.select(companion.getOptions());
        }

        public static final /* synthetic */ long access$readRetryMs(okhttp3.sse.internal.ServerSentEventReader.Companion companion, okio.BufferedSource bufferedSource) {
            return okhttp3.internal._UtilCommonKt.toLongOrDefault(bufferedSource.readUtf8LineStrict(), -1L);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
