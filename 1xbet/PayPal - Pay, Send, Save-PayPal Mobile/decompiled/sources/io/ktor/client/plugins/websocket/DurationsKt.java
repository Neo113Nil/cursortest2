package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\".\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00008Ç\u0002@Ç\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/time/Duration;", "pingInterval", "", "maxFrameSize", "Lio/ktor/client/plugins/websocket/WebSockets;", "WebSockets-dnQKTGw", "(Lkotlin/time/Duration;J)Lio/ktor/client/plugins/websocket/WebSockets;", "WebSockets", "getPingInterval", "(Lio/ktor/client/plugins/websocket/WebSockets;)Lkotlin/time/Duration;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "new", "(Lio/ktor/client/plugins/websocket/WebSockets$Config;)Lkotlin/time/Duration;", "setPingInterval-6Au4x4Y", "(Lio/ktor/client/plugins/websocket/WebSockets$Config;Lkotlin/time/Duration;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DurationsKt {
    /* renamed from: WebSockets-dnQKTGw$default, reason: not valid java name */
    public static /* synthetic */ io.ktor.client.plugins.websocket.WebSockets m23337WebSocketsdnQKTGw$default(kotlin.time.Duration duration, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.collection.SieveCacheKt.NodeLinkMask;
        }
        return m23336WebSocketsdnQKTGw(duration, j);
    }

    /* renamed from: WebSockets-dnQKTGw, reason: not valid java name */
    public static final io.ktor.client.plugins.websocket.WebSockets m23336WebSocketsdnQKTGw(kotlin.time.Duration duration, long j) {
        return new io.ktor.client.plugins.websocket.WebSockets(duration != null ? kotlin.time.Duration.m23953getInWholeMillisecondsimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI()) : 0L, j, new io.ktor.websocket.WebSocketExtensionsConfig(), null, 8, null);
    }

    public static final kotlin.time.Duration getPingInterval(io.ktor.client.plugins.websocket.WebSockets webSockets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSockets, "");
        java.lang.Long valueOf = java.lang.Long.valueOf(webSockets.getPingIntervalMillis());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m23940boximpl(kotlin.time.DurationKt.toDuration(valueOf.longValue(), kotlin.time.DurationUnit.MILLISECONDS));
    }

    public static final kotlin.time.Duration getPingInterval(io.ktor.client.plugins.websocket.WebSockets.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        java.lang.Long valueOf = java.lang.Long.valueOf(config.getPingIntervalMillis());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m23940boximpl(kotlin.time.DurationKt.toDuration(valueOf.longValue(), kotlin.time.DurationUnit.MILLISECONDS));
    }

    /* renamed from: setPingInterval-6Au4x4Y, reason: not valid java name */
    public static final void m23338setPingInterval6Au4x4Y(io.ktor.client.plugins.websocket.WebSockets.Config config, kotlin.time.Duration duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        config.setPingIntervalMillis(duration != null ? kotlin.time.Duration.m23953getInWholeMillisecondsimpl(duration.getGetHighResolutionOutputSizeshNQ4ISI()) : 0L);
    }
}
