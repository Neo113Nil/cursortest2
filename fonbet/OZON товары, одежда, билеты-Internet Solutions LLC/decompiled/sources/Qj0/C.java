package Qj0;

import We.InterfaceC4865g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ServerTimingsParser;

/* loaded from: classes7.dex */
public final class C extends We.v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U f23502a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ServerTimingsParser f23503b;

    /* renamed from: c, reason: collision with root package name */
    private long f23504c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23505d;

    public C(@NotNull U trace, @NotNull ServerTimingsParser serverTimingsParser) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(serverTimingsParser, "serverTimingsParser");
        this.f23502a = trace;
        this.f23503b = serverTimingsParser;
    }

    @Override // We.v
    public final void cacheHit(@NotNull InterfaceC4865g call, @NotNull We.L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        super.cacheHit(call, response);
        Q q11 = new Q(999);
        int i11 = U.f23535i;
        U u11 = this.f23502a;
        u11.n(q11, true);
        U.p(u11, MetricType.DNS_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.DNS_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.TCP_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.TCP_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.TLS_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.TLS_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.SERVER_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.SERVER_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.RESPONSE_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.RESPONSE_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.TIME_TO_FIRST_BYTE_START, 0L, false, 4);
        U.p(u11, MetricType.TIME_TO_FIRST_BYTE_END, 0L, false, 4);
        U.p(u11, MetricType.TIME_TO_LAST_BYTE_START, 0L, false, 4);
        U.p(u11, MetricType.TIME_TO_LAST_BYTE_END, 0L, false, 4);
        U.p(u11, MetricType.NETWORK_LB_REDIRECT_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.NETWORK_LB_REDIRECT_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.NETWORK_ANTIBOT_TIME_START, 0L, false, 4);
        U.p(u11, MetricType.NETWORK_ANTIBOT_TIME_END, 0L, false, 4);
        U.p(u11, MetricType.REQUEST_PREPARE_TIME_END, 0L, false, 2);
        this.f23503b.c(response, u11);
    }

    @Override // We.v
    public final void callFailed(@NotNull InterfaceC4865g call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    @Override // We.v
    public final void callStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        U.p(this.f23502a, MetricType.TOTAL_TIME_START, 0L, false, 6);
        U.p(this.f23502a, MetricType.REQUEST_PREPARE_TIME_START, 0L, false, 6);
        U.p(this.f23502a, MetricType.TIME_TO_FIRST_BYTE_START, 0L, false, 6);
        U.p(this.f23502a, MetricType.TIME_TO_LAST_BYTE_START, 0L, false, 6);
    }

    @Override // We.v
    public final void connectEnd(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, We.F f7) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        if (this.f23505d) {
            return;
        }
        U.p(this.f23502a, MetricType.TCP_TIME_END, 0L, false, 6);
    }

    @Override // We.v
    public final void connectFailed(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, We.F f7, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    @Override // We.v
    public final void connectStart(@NotNull InterfaceC4865g call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.f23505d = false;
        U.p(this.f23502a, MetricType.TCP_TIME_START, 0L, false, 6);
    }

    @Override // We.v
    public final void dnsEnd(@NotNull InterfaceC4865g call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        super.dnsEnd(call, domainName, inetAddressList);
        U.p(this.f23502a, MetricType.DNS_TIME_END, 0L, false, 6);
    }

    @Override // We.v
    public final void dnsStart(@NotNull InterfaceC4865g call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        U.p(this.f23502a, MetricType.DNS_TIME_START, 0L, false, 6);
    }

    @Override // We.v
    public final void requestBodyEnd(@NotNull InterfaceC4865g call, long j11) {
        Intrinsics.checkNotNullParameter(call, "call");
        U.p(this.f23502a, MetricType.SERVER_TIME_START, 0L, false, 6);
    }

    @Override // We.v
    public final void requestHeadersEnd(@NotNull InterfaceC4865g call, @NotNull We.G request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        U.p(this.f23502a, MetricType.SERVER_TIME_START, 0L, false, 6);
    }

    @Override // We.v
    public final void responseBodyEnd(@NotNull InterfaceC4865g call, long j11) {
        Intrinsics.checkNotNullParameter(call, "call");
        U.p(this.f23502a, MetricType.RESPONSE_TIME_END, 0L, false, 6);
        U.p(this.f23502a, MetricType.TIME_TO_LAST_BYTE_END, 0L, false, 6);
        if (j11 > 0) {
            U.p(this.f23502a, MetricType.ENCODED_SIZE, j11, false, 4);
            U.p(this.f23502a, MetricType.TRANSFER_SIZE, this.f23504c + j11, false, 4);
        }
    }

    @Override // We.v
    public final void responseHeadersEnd(@NotNull InterfaceC4865g call, @NotNull We.L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f23504c = response.r().b();
        int m11 = response.m();
        String q11 = We.L.q(response, "content-type");
        Q q12 = new Q(m11);
        int i11 = U.f23535i;
        U u11 = this.f23502a;
        u11.n(q12, true);
        if (q11 != null) {
            u11.n(new C3883c(q11), true);
        }
        this.f23503b.c(response, u11);
    }

    @Override // We.v
    public final void responseHeadersStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        U.p(this.f23502a, MetricType.TIME_TO_FIRST_BYTE_END, 0L, false, 6);
        U.p(this.f23502a, MetricType.SERVER_TIME_END, 0L, false, 6);
        U.p(this.f23502a, MetricType.RESPONSE_TIME_START, 0L, false, 6);
    }

    @Override // We.v
    public final void secureConnectEnd(@NotNull InterfaceC4865g call, We.y yVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        U.p(this.f23502a, MetricType.TLS_TIME_END, 0L, false, 6);
    }

    @Override // We.v
    public final void secureConnectStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f23505d = true;
        U.p(this.f23502a, MetricType.TCP_TIME_END, 0L, false, 6);
        U.p(this.f23502a, MetricType.TLS_TIME_START, 0L, false, 6);
    }
}
