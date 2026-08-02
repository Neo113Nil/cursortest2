package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u0000 _2\u00020\u0001:\u0003`_aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\u001d\u001a\r\u0012\t\u0012\u00070\u001c¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\bJ!\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J1\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J9\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\bJ\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010\bJ\u001f\u0010?\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\bJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bI\u0010@J\u001f\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010\bJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bL\u0010BJ\u0017\u0010M\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010\bJ\u001f\u0010N\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bN\u0010GJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bO\u0010GJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010\bJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020DH\u0016¢\u0006\u0004\bR\u0010GJ'\u0010V\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010S\u001a\u00020.2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ)\u0010Z\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010X\u001a\u00020D2\b\u0010Y\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\bZ\u0010[J\u0018\u0010]\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b]\u0010^"}, d2 = {"Lokhttp3/EventListener;", "", "<init>", "()V", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/Dispatcher;", "dispatcher", "dispatcherQueueStart", "(Lokhttp3/Call;Lokhttp3/Dispatcher;)V", "dispatcherQueueEnd", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "Lkotlin/jvm/JvmSuppressWildcards;", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED, "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "exception", "", "retry", "retryDecision", "(Lokhttp3/Call;Ljava/io/IOException;Z)V", "networkResponse", "nextRequest", "followUpDecision", "(Lokhttp3/Call;Lokhttp3/Response;Lokhttp3/Request;)V", "other", "plus", "(Lokhttp3/EventListener;)Lokhttp3/EventListener;", "Companion", "Factory", "AggregateEventListener"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventListener {
    public static final okhttp3.EventListener NONE = new okhttp3.EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        okhttp3.EventListener create(okhttp3.Call call);
    }

    public final okhttp3.EventListener plus(okhttp3.EventListener other) {
        okhttp3.EventListener[] eventListenerArr;
        okhttp3.EventListener[] eventListenerArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        okhttp3.EventListener eventListener = NONE;
        if (this == eventListener) {
            return other;
        }
        if (!(this instanceof okhttp3.EventListener.AggregateEventListener)) {
            eventListenerArr = new okhttp3.EventListener[]{this};
        } else {
            eventListenerArr = ((okhttp3.EventListener.AggregateEventListener) this).getHighSpeedVideoSizes;
        }
        if (other == eventListener) {
            return this;
        }
        if (!(other instanceof okhttp3.EventListener.AggregateEventListener)) {
            eventListenerArr2 = new okhttp3.EventListener[]{other};
        } else {
            eventListenerArr2 = ((okhttp3.EventListener.AggregateEventListener) other).getHighSpeedVideoSizes;
        }
        return new okhttp3.EventListener.AggregateEventListener((okhttp3.EventListener[]) kotlin.collections.ArraysKt.plus((java.lang.Object[]) eventListenerArr, (java.lang.Object[]) eventListenerArr2));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000f2\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00182\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\tJ!\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\tJ\u001f\u00103\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\tJ\u001f\u00107\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010\tJ\u001f\u0010=\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\tJ\u001f\u0010@\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u000206H\u0016¢\u0006\u0004\b@\u00108J\u001f\u0010A\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)H\u0016¢\u0006\u0004\bA\u0010:J\u0017\u0010B\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\tJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)H\u0016¢\u0006\u0004\bC\u0010:J\u0017\u0010D\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\tJ\u001f\u0010E\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020<H\u0016¢\u0006\u0004\bE\u0010>J\u001f\u0010F\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020<H\u0016¢\u0006\u0004\bF\u0010>J\u0017\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bG\u0010\tJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020<H\u0016¢\u0006\u0004\bH\u0010>J'\u0010J\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ)\u0010L\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020<2\b\u0010\u0015\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\bL\u0010MR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\u0006\n\u0004\bN\u0010O"}, d2 = {"Lokhttp3/EventListener$AggregateEventListener;", "Lokhttp3/EventListener;", "", "p0", "<init>", "([Lokhttp3/EventListener;)V", "Lokhttp3/Call;", "", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/Dispatcher;", "p1", "dispatcherQueueStart", "(Lokhttp3/Call;Lokhttp3/Dispatcher;)V", "dispatcherQueueEnd", "Lokhttp3/HttpUrl;", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "p3", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "p4", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", "", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED, "satisfactionFailure", "cacheHit", "cacheMiss", "cacheConditionalHit", "", "retryDecision", "(Lokhttp3/Call;Ljava/io/IOException;Z)V", "followUpDecision", "(Lokhttp3/Call;Lokhttp3/Response;Lokhttp3/Request;)V", "getHighSpeedVideoSizes", "[Lokhttp3/EventListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class AggregateEventListener extends okhttp3.EventListener {
        final okhttp3.EventListener[] getHighSpeedVideoSizes;

        public AggregateEventListener(okhttp3.EventListener[] eventListenerArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListenerArr, "");
            this.getHighSpeedVideoSizes = eventListenerArr;
        }

        @Override // okhttp3.EventListener
        public final void callStart(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.callStart(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void dispatcherQueueStart(okhttp3.Call p0, okhttp3.Dispatcher p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.dispatcherQueueStart(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void dispatcherQueueEnd(okhttp3.Call p0, okhttp3.Dispatcher p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.dispatcherQueueEnd(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void proxySelectStart(okhttp3.Call p0, okhttp3.HttpUrl p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.proxySelectStart(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void proxySelectEnd(okhttp3.Call p0, okhttp3.HttpUrl p1, java.util.List<java.net.Proxy> p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.proxySelectEnd(p0, p1, p2);
            }
        }

        @Override // okhttp3.EventListener
        public final void dnsStart(okhttp3.Call p0, java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.dnsStart(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void dnsEnd(okhttp3.Call p0, java.lang.String p1, java.util.List<java.net.InetAddress> p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.dnsEnd(p0, p1, p2);
            }
        }

        @Override // okhttp3.EventListener
        public final void connectStart(okhttp3.Call p0, java.net.InetSocketAddress p1, java.net.Proxy p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.connectStart(p0, p1, p2);
            }
        }

        @Override // okhttp3.EventListener
        public final void secureConnectStart(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.secureConnectStart(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void secureConnectEnd(okhttp3.Call p0, okhttp3.Handshake p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.secureConnectEnd(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void connectEnd(okhttp3.Call p0, java.net.InetSocketAddress p1, java.net.Proxy p2, okhttp3.Protocol p3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.connectEnd(p0, p1, p2, p3);
            }
        }

        @Override // okhttp3.EventListener
        public final void connectFailed(okhttp3.Call p0, java.net.InetSocketAddress p1, java.net.Proxy p2, okhttp3.Protocol p3, java.io.IOException p4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.connectFailed(p0, p1, p2, p3, p4);
            }
        }

        @Override // okhttp3.EventListener
        public final void connectionAcquired(okhttp3.Call p0, okhttp3.Connection p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.connectionAcquired(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void connectionReleased(okhttp3.Call p0, okhttp3.Connection p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.connectionReleased(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestHeadersStart(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.requestHeadersStart(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestHeadersEnd(okhttp3.Call p0, okhttp3.Request p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.requestHeadersEnd(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestBodyStart(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.requestBodyStart(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestBodyEnd(okhttp3.Call p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.requestBodyEnd(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void requestFailed(okhttp3.Call p0, java.io.IOException p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.requestFailed(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void responseHeadersStart(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.responseHeadersStart(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void responseHeadersEnd(okhttp3.Call p0, okhttp3.Response p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.responseHeadersEnd(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void responseBodyStart(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.responseBodyStart(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void responseBodyEnd(okhttp3.Call p0, long p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.responseBodyEnd(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void responseFailed(okhttp3.Call p0, java.io.IOException p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.responseFailed(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void callEnd(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.callEnd(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void callFailed(okhttp3.Call p0, java.io.IOException p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.callFailed(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void canceled(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.canceled(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void satisfactionFailure(okhttp3.Call p0, okhttp3.Response p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.satisfactionFailure(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void cacheHit(okhttp3.Call p0, okhttp3.Response p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.cacheHit(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void cacheMiss(okhttp3.Call p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.cacheMiss(p0);
            }
        }

        @Override // okhttp3.EventListener
        public final void cacheConditionalHit(okhttp3.Call p0, okhttp3.Response p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.cacheConditionalHit(p0, p1);
            }
        }

        @Override // okhttp3.EventListener
        public final void retryDecision(okhttp3.Call p0, java.io.IOException p1, boolean p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.retryDecision(p0, p1, p2);
            }
        }

        @Override // okhttp3.EventListener
        public final void followUpDecision(okhttp3.Call p0, okhttp3.Response p1, okhttp3.Request p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            for (okhttp3.EventListener eventListener : this.getHighSpeedVideoSizes) {
                eventListener.followUpDecision(p0, p1, p2);
            }
        }
    }

    public void secureConnectStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void secureConnectEnd(okhttp3.Call call, okhttp3.Handshake handshake) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void satisfactionFailure(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
    }

    public void retryDecision(okhttp3.Call call, java.io.IOException exception, boolean retry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
    }

    public void responseHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void responseHeadersEnd(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
    }

    public void responseFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
    }

    public void responseBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void responseBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void requestHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void requestHeadersEnd(okhttp3.Call call, okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
    }

    public void requestFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
    }

    public void requestBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void requestBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void proxySelectStart(okhttp3.Call call, okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
    }

    public void proxySelectEnd(okhttp3.Call call, okhttp3.HttpUrl url, java.util.List<java.net.Proxy> proxies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxies, "");
    }

    public void followUpDecision(okhttp3.Call call, okhttp3.Response networkResponse, okhttp3.Request nextRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkResponse, "");
    }

    public void dnsStart(okhttp3.Call call, java.lang.String domainName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "");
    }

    public void dnsEnd(okhttp3.Call call, java.lang.String domainName, java.util.List<java.net.InetAddress> inetAddressList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetAddressList, "");
    }

    public void dispatcherQueueStart(okhttp3.Call call, okhttp3.Dispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
    }

    public void dispatcherQueueEnd(okhttp3.Call call, okhttp3.Dispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
    }

    public void connectionReleased(okhttp3.Call call, okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
    }

    public void connectionAcquired(okhttp3.Call call, okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
    }

    public void connectStart(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
    }

    public void connectFailed(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
    }

    public void connectEnd(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
    }

    public void canceled(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void callStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void callFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "");
    }

    public void callEnd(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void cacheMiss(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
    }

    public void cacheHit(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
    }

    public void cacheConditionalHit(okhttp3.Call call, okhttp3.Response cachedResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedResponse, "");
    }
}
