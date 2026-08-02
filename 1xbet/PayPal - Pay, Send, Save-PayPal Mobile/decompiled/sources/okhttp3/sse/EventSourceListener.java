package okhttp3.sse;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lokhttp3/sse/EventSourceListener;", "", "<init>", "()V", "Lokhttp3/sse/EventSource;", "eventSource", "Lokhttp3/Response;", "response", "", "onOpen", "(Lokhttp3/sse/EventSource;Lokhttp3/Response;)V", "", "id", "type", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onEvent", "(Lokhttp3/sse/EventSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onClosed", "(Lokhttp3/sse/EventSource;)V", "", "t", "onFailure", "(Lokhttp3/sse/EventSource;Ljava/lang/Throwable;Lokhttp3/Response;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventSourceListener {
    public void onOpen(okhttp3.sse.EventSource eventSource, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
    }

    public void onFailure(okhttp3.sse.EventSource eventSource, java.lang.Throwable t, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
    }

    public void onEvent(okhttp3.sse.EventSource eventSource, java.lang.String id, java.lang.String type, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }

    public void onClosed(okhttp3.sse.EventSource eventSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
    }
}
