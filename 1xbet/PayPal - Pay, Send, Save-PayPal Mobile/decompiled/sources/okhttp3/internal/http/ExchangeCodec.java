package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 )2\u00020\u0001:\u0002*)J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\rR\u0014\u0010\"\u001a\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "Lokhttp3/Request;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;J)Lokio/Sink;", "", "writeRequestHeaders", "(Lokhttp3/Request;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lokio/Source;", "openResponseBodySource", "(Lokhttp3/Response;)Lokio/Source;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "isResponseComplete", "()Z", "Lokio/Socket;", "getSocket", "()Lokio/Socket;", "socket", "Companion", "Carrier"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ExchangeCodec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http.ExchangeCodec.Companion INSTANCE = okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Carrier;", "", "Lokhttp3/internal/connection/RealCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Ljava/io/IOException;", "e", "", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "noNewExchanges", "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "route"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Carrier {
        /* renamed from: cancel */
        void mo24418cancel();

        okhttp3.Route getRoute();

        void noNewExchanges();

        void trackFailure(okhttp3.internal.connection.RealCall call, java.io.IOException e);
    }

    void cancel();

    okio.Sink createRequestBody(okhttp3.Request request, long contentLength) throws java.io.IOException;

    void finishRequest() throws java.io.IOException;

    void flushRequest() throws java.io.IOException;

    okhttp3.internal.http.ExchangeCodec.Carrier getCarrier();

    okio.Socket getSocket();

    boolean isResponseComplete();

    okio.Source openResponseBodySource(okhttp3.Response response) throws java.io.IOException;

    okhttp3.Headers peekTrailers() throws java.io.IOException;

    okhttp3.Response.Builder readResponseHeaders(boolean expectContinue) throws java.io.IOException;

    long reportedContentLength(okhttp3.Response response) throws java.io.IOException;

    void writeRequestHeaders(okhttp3.Request request) throws java.io.IOException;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "<init>", "()V", "", "DISCARD_STREAM_TIMEOUT_MILLIS", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.http.ExchangeCodec.Companion $$INSTANCE = new okhttp3.internal.http.ExchangeCodec.Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }
}
