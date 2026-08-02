package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/client/plugins/api/HookHandler;", "T", "", "Lio/ktor/client/plugins/api/ClientHook;", "hook", "handler", "<init>", "(Lio/ktor/client/plugins/api/ClientHook;Ljava/lang/Object;)V", "Lio/ktor/client/HttpClient;", "client", "", "install", "(Lio/ktor/client/HttpClient;)V", "Camera2StreamConfigurationMap", "Lio/ktor/client/plugins/api/ClientHook;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HookHandler<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.client.plugins.api.ClientHook<T> getHighSpeedVideoFpsRangesFor;
    private final T getHighSpeedVideoFpsRanges;

    public HookHandler(io.ktor.client.plugins.api.ClientHook<T> clientHook, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientHook, "");
        this.getHighSpeedVideoFpsRangesFor = clientHook;
        this.getHighSpeedVideoFpsRanges = t;
    }

    public final void install(io.ktor.client.HttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        this.getHighSpeedVideoFpsRangesFor.install(client, this.getHighSpeedVideoFpsRanges);
    }
}
