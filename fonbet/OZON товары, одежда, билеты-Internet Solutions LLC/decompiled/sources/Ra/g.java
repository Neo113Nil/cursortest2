package Ra;

import B0.A0;
import C.o0;
import E0.C2942q;
import J0.P;
import Ja.i;
import N3.C3660k;
import Pa.C3819a;
import Sa.C3998a;
import Ve.C4598rp;
import Xa.b;
import android.os.SystemClock;
import com.vk.knet.cornet.b;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.A;
import org.chromium.net.B;
import org.chromium.net.C;
import org.chromium.net.D;
import org.chromium.net.impl.a0;
import org.chromium.net.impl.b0;
import org.chromium.net.k;
import org.chromium.net.r;
import org.chromium.net.y;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ra.c f24942a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Xa.b f24943b;

    /* renamed from: c, reason: collision with root package name */
    private final C3932a f24944c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e f24945d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f24946e;

    /* renamed from: f, reason: collision with root package name */
    private volatile k f24947f;

    /* renamed from: g, reason: collision with root package name */
    private volatile D f24948g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f24949h;

    /* renamed from: i, reason: collision with root package name */
    private volatile long f24950i;

    /* renamed from: j, reason: collision with root package name */
    private volatile long f24951j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private volatile AtomicReference<Throwable> f24952k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f24953l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Wa.d f24954m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Wa.d f24955n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Wa.d f24956o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Wa.d f24957p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final f f24958q;

    private final class a extends C.b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final i f24959a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Xa.b f24960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f24961c;

        public a(@NotNull g gVar, @NotNull i httpRequest, Xa.b redirect) {
            Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
            Intrinsics.checkNotNullParameter(redirect, "redirect");
            this.f24961c = gVar;
            this.f24959a = httpRequest;
            this.f24960b = redirect;
        }

        @Override // org.chromium.net.C.b
        public final void a(@NotNull C request, D d11) {
            Intrinsics.checkNotNullParameter(request, "request");
            Wa.e.d("Cronet", A0.b("[cronet] Request callback of ", this.f24959a.k(), " canceled!"));
            g gVar = this.f24961c;
            AtomicReference atomicReference = gVar.f24952k;
            InterruptedException interruptedException = new InterruptedException("Request cancelled via manual call of #cancel");
            while (!atomicReference.compareAndSet(null, interruptedException) && atomicReference.get() == null) {
            }
            gVar.s(5);
        }

        @Override // org.chromium.net.C.b
        public final void b(C c11, D d11, @NotNull org.chromium.net.f err) {
            Throwable iOException;
            Intrinsics.checkNotNullParameter(err, "err");
            String k11 = this.f24959a.k();
            Throwable cause = err.getCause();
            String c12 = o0.c(C3660k.d("[cronet] Request callback of ", k11, " failed: Class: ", cause != null ? cause.getClass().getSimpleName() : null, " | Message: "), err.getMessage(), "!");
            boolean z11 = err instanceof r;
            if (z11) {
                c12 = C4598rp.c(((r) err).a(), c12, " | Code: ");
            }
            Wa.e.b("Cronet", c12);
            g gVar = this.f24961c;
            AtomicReference atomicReference = gVar.f24952k;
            Intrinsics.checkNotNullParameter(err, "<this>");
            if (z11) {
                switch (((r) err).a()) {
                    case 1:
                        String message = err.getMessage();
                        if (message == null) {
                            message = "ERROR_HOSTNAME_NOT_RESOLVED";
                        }
                        iOException = new UnknownHostException(message);
                        break;
                    case 2:
                        String message2 = err.getMessage();
                        if (message2 == null) {
                            message2 = "ERROR_INTERNET_DISCONNECTED";
                        }
                        iOException = new Ha.b(message2);
                        break;
                    case 3:
                        String message3 = err.getMessage();
                        if (message3 == null) {
                            message3 = "ERROR_NETWORK_CHANGED";
                        }
                        iOException = new ConnectException(message3);
                        break;
                    case 4:
                        String message4 = err.getMessage();
                        if (message4 == null) {
                            message4 = "ERROR_TIMED_OUT";
                        }
                        iOException = new SocketTimeoutException(message4);
                        break;
                    case 5:
                        String message5 = err.getMessage();
                        if (message5 == null) {
                            message5 = "ERROR_CONNECTION_CLOSED";
                        }
                        iOException = new ConnectException(message5);
                        break;
                    case 6:
                        String message6 = err.getMessage();
                        if (message6 == null) {
                            message6 = "ERROR_CONNECTION_TIMED_OUT";
                        }
                        iOException = new SocketTimeoutException(message6);
                        break;
                    case 7:
                        String message7 = err.getMessage();
                        if (message7 == null) {
                            message7 = "ERROR_CONNECTION_REFUSED";
                        }
                        iOException = new ConnectException(message7);
                        break;
                    case 8:
                        String message8 = err.getMessage();
                        if (message8 == null) {
                            message8 = "ERROR_CONNECTION_RESET";
                        }
                        iOException = new ConnectException(message8);
                        break;
                    case 9:
                        String message9 = err.getMessage();
                        if (message9 == null) {
                            message9 = "ERROR_ADDRESS_UNREACHABLE";
                        }
                        iOException = new ConnectException(message9);
                        break;
                    case 10:
                        String message10 = err.getMessage();
                        if (message10 == null) {
                            message10 = "ERROR_QUIC_PROTOCOL_FAILED";
                        }
                        iOException = new Ha.c(message10);
                        break;
                    case 11:
                        iOException = new IOException("CRONET_ERROR_OTHER", err);
                        break;
                    default:
                        iOException = new IOException(err);
                        break;
                }
            } else if (err instanceof org.chromium.net.impl.C) {
                iOException = err.getCause();
                if (iOException == null) {
                    iOException = err;
                }
            } else {
                iOException = new IOException(err);
            }
            if (!Intrinsics.d(iOException.getCause(), err)) {
                Ia.b.a(iOException, err);
            }
            atomicReference.set(iOException);
            gVar.s(6);
        }

        @Override // org.chromium.net.C.b
        public final void c(@NotNull C request, @NotNull D info, @NotNull ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            buffer.flip();
            this.f24961c.s(3);
        }

        @Override // org.chromium.net.C.b
        public final void d(@NotNull C request, @NotNull D info, @NotNull String newLocationUrl) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(newLocationUrl, "newLocationUrl");
            b.a a11 = this.f24960b.a(newLocationUrl, this.f24959a);
            if (a11 instanceof b.a.C0610a) {
                request.b();
            } else if (Intrinsics.d(a11, b.a.C0611b.f34234a)) {
                e(request, info);
            } else if (a11 instanceof b.a.c) {
                ((b.a.c) a11).getClass();
                throw null;
            }
        }

        @Override // org.chromium.net.C.b
        public final void e(@NotNull C request, @NotNull D info) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(info, "info");
            Wa.e.a(b.a.CLIENT_CALLBACK, A0.b("[cronet] Request callback of ", this.f24959a.k(), " started!"));
            long f7 = info.f();
            g gVar = this.f24961c;
            gVar.f24949h = f7;
            gVar.f24948g = info;
            gVar.s(2);
        }

        @Override // org.chromium.net.C.b
        public final void f(@NotNull C request, D d11) {
            Intrinsics.checkNotNullParameter(request, "request");
            b.a aVar = b.a.CLIENT_CALLBACK;
            Wa.e.a(aVar, A0.b("[cronet] Request callback of ", this.f24959a.k(), " succeeded!"));
            String g10 = d11 != null ? d11.g() : null;
            Integer valueOf = d11 != null ? Integer.valueOf(d11.b()) : null;
            Map<String, List<String>> a11 = d11 != null ? d11.a() : null;
            StringBuilder b11 = P.b("[cronet] onSucceeded ", g10, valueOf, " | ", " | ");
            b11.append(a11);
            Wa.e.a(aVar, b11.toString());
            this.f24961c.s(4);
        }
    }

    /* loaded from: classes9.dex */
    private static final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Ka.a f24962a;

        public b(@NotNull Ka.a httpRequestBody) {
            Intrinsics.checkNotNullParameter(httpRequestBody, "httpRequestBody");
            this.f24962a = httpRequestBody;
        }

        @Override // org.chromium.net.A
        public final long c() {
            return -1L;
        }

        @Override // org.chromium.net.A
        public final void d(org.chromium.net.h hVar, @NotNull ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.f24962a.a();
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // org.chromium.net.A
        public final void j(org.chromium.net.h hVar) {
            hVar.b(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }

    /* loaded from: classes9.dex */
    private final class c extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final A f24963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f24964b;

        public c(@NotNull g gVar, A provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f24964b = gVar;
            this.f24963a = provider;
        }

        @Override // org.chromium.net.A
        public final long c() {
            return this.f24963a.c();
        }

        @Override // org.chromium.net.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f24963a.close();
        }

        @Override // org.chromium.net.A
        public final void d(@NotNull org.chromium.net.h uploadDataSink, @NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(uploadDataSink, "uploadDataSink");
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            this.f24964b.s(1);
            this.f24963a.d(uploadDataSink, byteBuffer);
        }

        @Override // org.chromium.net.A
        public final void j(@NotNull org.chromium.net.h uploadDataSink) {
            Intrinsics.checkNotNullParameter(uploadDataSink, "uploadDataSink");
            this.f24964b.s(1);
            this.f24963a.j(uploadDataSink);
        }
    }

    public static final class d extends y.a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f24966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i iVar, f fVar) {
            super(fVar);
            this.f24966c = iVar;
        }

        public final void b(@NotNull a0 requestInfo) {
            String d11;
            Long y02;
            Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
            g gVar = g.this;
            if (gVar.f24944c != null) {
                D d12 = requestInfo.d();
                Ja.h hVar = null;
                i iVar = this.f24966c;
                if (d12 == null) {
                    ((C3932a) gVar.f24944c).onMetricsCollected(C3998a.a(requestInfo, gVar.f24950i, gVar.f24951j, null), iVar, null);
                    return;
                }
                Map<String, List<String>> a11 = d12.a();
                Intrinsics.f(a11);
                String e11 = h.e("Content-Type", a11);
                String e12 = h.e("Content-Length", a11);
                long f7 = (e12 == null || (y02 = kotlin.text.h.y0(e12)) == null) ? d12.f() - gVar.f24949h : y02.longValue();
                int b11 = d12.b();
                String c11 = d12.c();
                Intrinsics.checkNotNullExpressionValue(c11, "getHttpStatusText(...)");
                Long valueOf = Long.valueOf(f7);
                D d13 = requestInfo.d();
                if (d13 != null && (d11 = d13.d()) != null) {
                    hVar = C3998a.b(d11);
                }
                long f11 = d12.f();
                d12.h();
                Ma.d dVar = new Ma.d(b11, c11, e11, valueOf, hVar, a11, f11);
                ((C3932a) gVar.f24944c).onMetricsCollected(C3998a.a(requestInfo, gVar.f24950i, gVar.f24951j, dVar), iVar, dVar);
            }
        }
    }

    public g(@NotNull Ra.c delegate, @NotNull Xa.b redirect, C3932a c3932a, @NotNull e builder) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f24942a = delegate;
        this.f24943b = redirect;
        this.f24944c = c3932a;
        this.f24945d = builder;
        this.f24952k = new AtomicReference<>(null);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f24953l = reentrantLock;
        this.f24954m = new Wa.d(reentrantLock);
        this.f24955n = new Wa.d(reentrantLock);
        this.f24956o = new Wa.d(reentrantLock);
        this.f24957p = new Wa.d(reentrantLock);
        this.f24958q = new f();
    }

    private final void l() {
        ReentrantLock reentrantLock = this.f24953l;
        reentrantLock.lock();
        try {
            int i11 = this.f24946e;
            if (i11 >= 3) {
                return;
            }
            throw new IllegalStateException("Actual state " + i11 + " should be more than 3!");
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void m() {
        Throwable th2 = this.f24952k.get();
        if (th2 != null) {
            throw th2;
        }
    }

    private final void r() {
        ReentrantLock reentrantLock = this.f24953l;
        reentrantLock.lock();
        try {
            this.f24957p.c(true);
            this.f24956o.c(true);
            this.f24955n.c(true);
            this.f24954m.c(true);
            Unit unit = Unit.f71690a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i11) {
        ReentrantLock reentrantLock = this.f24953l;
        reentrantLock.lock();
        try {
            if (i11 != this.f24946e) {
                Wa.e.a(b.a.CLIENT_STATE, "[cronet] Old state " + this.f24946e + ", action " + i11);
            }
            switch (i11) {
                case 0:
                    this.f24946e = 1;
                    break;
                case 1:
                    this.f24946e = 2;
                    this.f24954m.c(true);
                    this.f24955n.d();
                    break;
                case 2:
                    this.f24946e = 3;
                    this.f24954m.c(true);
                    this.f24955n.c(true);
                    this.f24956o.c(true);
                    break;
                case 3:
                    this.f24946e = 3;
                    this.f24957p.c(true);
                    break;
                case 4:
                    this.f24946e = 4;
                    r();
                    Ra.c cVar = this.f24942a;
                    this.f24952k.get();
                    cVar.a();
                    break;
                case 5:
                    this.f24946e = 5;
                    r();
                    Ra.c cVar2 = this.f24942a;
                    this.f24952k.get();
                    cVar2.a();
                    break;
                case 6:
                    this.f24946e = 6;
                    r();
                    Ra.c cVar3 = this.f24942a;
                    this.f24952k.get();
                    cVar3.a();
                    break;
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final ByteBuffer i(@NotNull ByteBuffer buffer, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f24956o.a();
        m();
        this.f24957p.c(false);
        buffer.clear();
        try {
            k kVar = this.f24947f;
            if (kVar != null) {
                kVar.d(buffer);
            }
            boolean b11 = this.f24957p.b(j11);
            m();
            if (!b11) {
                throw new SocketTimeoutException(Sh.b.b(j11, "Unable to read response's body in ", "ms"));
            }
            ReentrantLock reentrantLock = this.f24953l;
            reentrantLock.lock();
            try {
                m();
                l();
                if (this.f24946e >= 4) {
                    return null;
                }
                return buffer;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Exception e11) {
            Wa.e.b(e11);
            return null;
        }
    }

    public final void j(@NotNull i request, long j11) {
        Intrinsics.checkNotNullParameter(request, "request");
        C3819a c3819a = new C3819a(j11);
        while (true) {
            long longValue = c3819a.b().longValue();
            b.a aVar = b.a.CLIENT_TIMEOUTS;
            StringBuilder d11 = C2942q.d(longValue, "[cronet] Start awaiting of ", request.k(), " connection for ");
            d11.append(" ms");
            Wa.e.a(aVar, d11.toString());
            if (this.f24954m.b(longValue)) {
                Wa.e.a(aVar, A0.b("[cronet] Connection to ", request.k(), " has been established!"));
                break;
            }
            k kVar = this.f24947f;
            if (kVar != null && kVar.c()) {
                Wa.e.a(aVar, A0.b("[cronet] Url ", request.k(), " is already done!"));
            }
            if (c3819a.a()) {
                break;
            }
        }
        if (c3819a.a()) {
            Wa.e.b("Cronet", A0.b("[cronet] Url ", request.k(), " is canceled by timeout"));
            throw new SocketTimeoutException("Unable to establish connection to server!");
        }
    }

    @NotNull
    public final D k() {
        ReentrantLock reentrantLock = this.f24953l;
        reentrantLock.lock();
        try {
            this.f24954m.a();
            m();
            this.f24955n.a();
            m();
            this.f24956o.a();
            m();
            l();
            D d11 = this.f24948g;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalStateException("Expect response to be not null at this stage");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n() {
        k kVar = this.f24947f;
        if (kVar != null) {
            kVar.a();
        }
    }

    public final void o(@NotNull Throwable err) {
        Intrinsics.checkNotNullParameter(err, "err");
        ReentrantLock reentrantLock = this.f24953l;
        reentrantLock.lock();
        try {
            this.f24952k.set(err);
            k kVar = this.f24947f;
            if (kVar != null) {
                kVar.a();
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(@NotNull i request, @NotNull Va.a executor) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        a aVar = new a(this, request, this.f24943b);
        Ja.d g10 = request.g();
        Ka.b a11 = request.a();
        g10.getClass();
        A bVar = (g10 == Ja.d.GET || a11 == 0) ? null : a11 instanceof Ka.a ? new b((Ka.a) a11) : new c(this, B.a(a11.a()));
        this.f24950i = SystemClock.elapsedRealtime();
        this.f24951j = System.currentTimeMillis();
        b0 a12 = this.f24945d.a(request, executor, aVar, bVar);
        a12.f(new d(request, this.f24958q));
        this.f24947f = a12.e();
    }

    public final void q() {
        Unit unit;
        s(0);
        k kVar = this.f24947f;
        if (kVar != null) {
            kVar.e();
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("You have to create connection, before start it!");
        }
    }
}
