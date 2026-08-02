package okhttp3.sse.internal;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010(\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Lokhttp3/sse/internal/RealEventSource;", "Lokhttp3/sse/EventSource;", "Lokhttp3/sse/internal/ServerSentEventReader$Callback;", "Lokhttp3/Callback;", "Lokhttp3/Request;", "request", "Lokhttp3/sse/EventSourceListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lokhttp3/Request;Lokhttp3/sse/EventSourceListener;)V", "Lokhttp3/Call$Factory;", "callFactory", "", "connect", "(Lokhttp3/Call$Factory;)V", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "processResponse", "(Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "()Lokhttp3/Request;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "id", "type", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "timeMs", "onRetryChange", "(J)V", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Request;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lokhttp3/sse/EventSourceListener;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/Call;", "", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealEventSource implements okhttp3.sse.EventSource, okhttp3.sse.internal.ServerSentEventReader.Callback, okhttp3.Callback {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final okhttp3.Request getHighSpeedVideoFpsRanges;
    private okhttp3.Call getHighSpeedVideoFpsRangesFor;
    private final okhttp3.sse.EventSourceListener getHighSpeedVideoSizes;

    @Override // okhttp3.sse.internal.ServerSentEventReader.Callback
    public final void onRetryChange(long timeMs) {
    }

    public RealEventSource(okhttp3.Request request, okhttp3.sse.EventSourceListener eventSourceListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSourceListener, "");
        this.getHighSpeedVideoFpsRanges = request;
        this.getHighSpeedVideoSizes = eventSourceListener;
    }

    public final void connect(okhttp3.Call.Factory callFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callFactory, "");
        okhttp3.Call newCall = callFactory.newCall(this.getHighSpeedVideoFpsRanges);
        newCall.enqueue(this);
        this.getHighSpeedVideoFpsRangesFor = newCall;
    }

    @Override // okhttp3.Callback
    public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        processResponse(response);
    }

    public final void processResponse(okhttp3.Response response) {
        okio.Timeout timeout;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        okhttp3.Response response2 = response;
        try {
            okhttp3.Response response3 = response2;
            if (!response.getIsSuccessful()) {
                this.getHighSpeedVideoSizes.onFailure(this, null, response);
                kotlin.io.CloseableKt.closeFinally(response2, null);
                return;
            }
            okhttp3.ResponseBody body = response.body();
            okhttp3.MediaType getHighSpeedVideoFpsRangesFor = body.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor == null || !kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor.type(), "text") || !kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor.subtype(), "event-stream")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid content-type: ");
                sb.append(body.getGetHighSpeedVideoFpsRangesFor());
                this.getHighSpeedVideoSizes.onFailure(this, new java.lang.IllegalStateException(sb.toString()), response);
                kotlin.io.CloseableKt.closeFinally(response2, null);
                return;
            }
            okhttp3.Call call = this.getHighSpeedVideoFpsRangesFor;
            if (call != null && (timeout = call.timeout()) != null) {
                timeout.cancel();
            }
            okhttp3.Response stripBody = okhttp3.internal.UnreadableResponseBodyKt.stripBody(response);
            okhttp3.sse.internal.ServerSentEventReader serverSentEventReader = new okhttp3.sse.internal.ServerSentEventReader(body.getGetHighResolutionOutputSizeshNQ4ISI(), this);
            try {
                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoSizes.onOpen(this, stripBody);
                    while (!this.getHighResolutionOutputSizeshNQ4ISI && serverSentEventReader.processNextEvent()) {
                    }
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoSizes.onFailure(this, new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED), stripBody);
                } else {
                    this.getHighSpeedVideoSizes.onClosed(this);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(response2, null);
            } catch (java.lang.Exception e) {
                e = e;
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    e = new java.io.IOException(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED, e);
                }
                this.getHighSpeedVideoSizes.onFailure(this, e, stripBody);
                kotlin.io.CloseableKt.closeFinally(response2, null);
            }
        } finally {
        }
    }

    @Override // okhttp3.Callback
    public final void onFailure(okhttp3.Call call, java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        this.getHighSpeedVideoSizes.onFailure(this, e, null);
    }

    @Override // okhttp3.sse.EventSource
    /* renamed from: request, reason: from getter */
    public final okhttp3.Request getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // okhttp3.sse.EventSource
    public final void cancel() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        okhttp3.Call call = this.getHighSpeedVideoFpsRangesFor;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // okhttp3.sse.internal.ServerSentEventReader.Callback
    public final void onEvent(java.lang.String id, java.lang.String type, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        this.getHighSpeedVideoSizes.onEvent(this, id, type, data);
    }
}
