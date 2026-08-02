package okhttp3.sse;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/sse/EventSources;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/sse/EventSource$Factory;", "createFactory", "(Lokhttp3/OkHttpClient;)Lokhttp3/sse/EventSource$Factory;", "Lokhttp3/Call$Factory;", "callFactory", "(Lokhttp3/Call$Factory;)Lokhttp3/sse/EventSource$Factory;", "Lokhttp3/Response;", "response", "Lokhttp3/sse/EventSourceListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "processResponse", "(Lokhttp3/Response;Lokhttp3/sse/EventSourceListener;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventSources {
    public static final okhttp3.sse.EventSources INSTANCE = new okhttp3.sse.EventSources();

    private EventSources() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "required for binary-compatibility!")
    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ okhttp3.sse.EventSource.Factory createFactory(okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        return createFactory((okhttp3.Call.Factory) client);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.sse.EventSource.Factory createFactory(final okhttp3.Call.Factory callFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callFactory, "");
        return new okhttp3.sse.EventSource.Factory() { // from class: okhttp3.sse.EventSources$$ExternalSyntheticLambda0
            @Override // okhttp3.sse.EventSource.Factory
            public final okhttp3.sse.EventSource newEventSource(okhttp3.Request request, okhttp3.sse.EventSourceListener eventSourceListener) {
                return okhttp3.sse.EventSources.$r8$lambda$3QVUUG6ZyJL5WVmBhZGVtazHVoU(okhttp3.Call.Factory.this, request, eventSourceListener);
            }
        };
    }

    @kotlin.jvm.JvmStatic
    public static final void processResponse(okhttp3.Response response, okhttp3.sse.EventSourceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        new okhttp3.sse.internal.RealEventSource(response.request(), listener).processResponse(response);
    }

    public static /* synthetic */ okhttp3.sse.EventSource $r8$lambda$3QVUUG6ZyJL5WVmBhZGVtazHVoU(okhttp3.Call.Factory factory, okhttp3.Request request, okhttp3.sse.EventSourceListener eventSourceListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSourceListener, "");
        if (request.header("Accept") == null) {
            request = request.newBuilder().addHeader("Accept", com.datadog.android.internal.network.HttpSpec.ContentType.TEXT_EVENT_STREAM).build();
        }
        okhttp3.sse.internal.RealEventSource realEventSource = new okhttp3.sse.internal.RealEventSource(request, eventSourceListener);
        realEventSource.connect(factory);
        return realEventSource;
    }
}
