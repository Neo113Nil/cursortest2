package Df0;

import De.C2862e;
import Ja.j;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.G;
import We.L;
import Ya.a;
import Ya.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.r;
import org.jetbrains.annotations.NotNull;
import q20.InterfaceC8979b;
import ru.ozon.android.ozonLogger.core.h;
import xe.AbstractC10711a;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class e implements B, Ya.b, Ya.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ga.a f6692a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC8979b f6693b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pf0.i f6694c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f6695d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f6696e;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.ozonLogger.core.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6697b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.ozonLogger.core.h invoke() {
            return Xf0.a.a(new sj.a("Network", "cronet", Boolean.TRUE));
        }
    }

    public e(@NotNull Ga.a knet, @NotNull InterfaceC8979b debugFeaturesAccessLevelApi, @NotNull pf0.i ozonNetworkConfig) {
        Intrinsics.checkNotNullParameter(knet, "knet");
        Intrinsics.checkNotNullParameter(debugFeaturesAccessLevelApi, "debugFeaturesAccessLevelApi");
        Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
        this.f6692a = knet;
        this.f6693b = debugFeaturesAccessLevelApi;
        this.f6694c = ozonNetworkConfig;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f6695d = N.a(He.b.f10879b.plus(X0.b()));
        this.f6696e = k.b(a.f6697b);
    }

    private static IOException b(IOException iOException) {
        if (!(iOException.getCause() instanceof r)) {
            return iOException instanceof Ha.b ? new ConnectException(iOException.getMessage()) : ((iOException instanceof Ha.c) || (iOException instanceof Ha.a)) ? new ProtocolException(iOException.getMessage()) : iOException;
        }
        Throwable cause = iOException.getCause();
        Intrinsics.g(cause, "null cannot be cast to non-null type org.chromium.net.NetworkException");
        r rVar = (r) cause;
        switch (rVar.a()) {
        }
        return new InterruptedIOException(rVar.getMessage());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(7:(16:9|11|12|13|14|15|16|17|18|19|20|22|23|(1:46)(1:27)|28|(7:30|(1:32)(1:43)|(1:36)|37|38|(1:40)|41)(2:44|45))|22|23|(1:25)|46|28|(0)(0))|84|11|12|13|14|15|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0163, code lost:
    
        if (r7 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0165, code lost:
    
        r5 = r7.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
    
        ru.ozon.android.ozonLogger.core.h.a.a(r2, "Ошибка выполнения запроса с Cronet " + r5 + ": " + r0.getMessage(), null, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0129, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012e, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012c, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[Catch: all -> 0x0098, IOException -> 0x009c, TryCatch #10 {IOException -> 0x009c, all -> 0x0098, blocks: (B:23:0x007e, B:25:0x0090, B:28:0x00a1, B:30:0x00a7, B:34:0x00b4, B:36:0x00bc, B:37:0x00ef, B:44:0x010b, B:45:0x0120), top: B:22:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b A[Catch: all -> 0x0098, IOException -> 0x009c, TRY_ENTER, TryCatch #10 {IOException -> 0x009c, all -> 0x0098, blocks: (B:23:0x007e, B:25:0x0090, B:28:0x00a1, B:30:0x00a7, B:34:0x00b4, B:36:0x00bc, B:37:0x00ef, B:44:0x010b, B:45:0x0120), top: B:22:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b A[Catch: all -> 0x016a, TryCatch #6 {all -> 0x016a, blocks: (B:50:0x014e, B:54:0x015b, B:57:0x0165, B:58:0x016d, B:60:0x0188, B:61:0x018c), top: B:49:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165 A[Catch: all -> 0x016a, TryCatch #6 {all -> 0x016a, blocks: (B:50:0x014e, B:54:0x015b, B:57:0x0165, B:58:0x016d, B:60:0x0188, B:61:0x018c), top: B:49:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    @Override // We.B
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L intercept(@NotNull B.a chain) {
        CoroutineContext.Element element;
        InterfaceC4008j interfaceC4008j;
        InterfaceC8979b interfaceC8979b;
        Ja.i iVar;
        boolean z11;
        CoroutineContext.Element c11;
        L b11;
        ru.ozon.android.ozonLogger.core.h hVar;
        InterfaceC4008j interfaceC4008j2 = this.f6696e;
        InterfaceC8979b interfaceC8979b2 = this.f6693b;
        pf0.i iVar2 = this.f6694c;
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            try {
                G request = chain.request();
                uf0.b bVar = (uf0.b) request.i(uf0.b.class);
                G.a aVar = new G.a(request);
                aVar.h("accept-encoding");
                aVar.a("cronet-enabled", "true");
                Ja.i knetRequest = toKnetRequest(aVar.b(), false);
                if (knetRequest == null) {
                    interfaceC4008j = interfaceC4008j2;
                    interfaceC8979b = interfaceC8979b2;
                    try {
                        throw new Ha.c("Failed okhttp-to-quic request mapping for: " + request.j());
                    } catch (IOException e11) {
                        e = e11;
                        element = null;
                        iVar = null;
                        if (interfaceC8979b.c() != q20.c.QA_BUILDS_OR_AUTOTEST) {
                        }
                        if (z11) {
                        }
                        throw b(e);
                    }
                }
                try {
                    if (iVar2.getIsPerfMetricsEnabled() && bVar != null) {
                        iVar = knetRequest.n(eg0.e.f62328a, bVar);
                        long currentTimeMillis = System.currentTimeMillis();
                        interfaceC4008j = interfaceC4008j2;
                        interfaceC8979b = interfaceC8979b2;
                        c11 = C10727i.c(this.f6695d, X0.b(), null, new f(chain.call(), this, iVar, null), 2);
                        j a11 = this.f6692a.a(iVar);
                        H0 h02 = (H0) c11;
                        h02.j(null);
                        b11 = a.C0644a.b(a11, request, currentTimeMillis, !iVar2.getIsPerfMetricsEnabled() && iVar2.getShouldReadResponseBodyBeforeResponse());
                        if (b11 != null) {
                            throw new Ha.c("Failed quic-to-okhttp response mapping for: " + request.j());
                        }
                        if ((interfaceC8979b.c() == q20.c.QA_BUILDS_OR_AUTOTEST) && (hVar = (ru.ozon.android.ozonLogger.core.h) interfaceC4008j.getValue()) != null) {
                            h.a.b(hVar, "Запрос выполнен с Cronet " + b11.B() + " " + iVar.k() + ": " + b11.m() + " " + b11.w(), null, 6);
                        }
                        L.a aVar2 = new L.a(b11);
                        aVar2.q("content-encoding");
                        L c12 = aVar2.c();
                        if (((AbstractC10711a) c11).isActive()) {
                            h02.j(null);
                        }
                        return c12;
                    }
                    j a112 = this.f6692a.a(iVar);
                    H0 h022 = (H0) c11;
                    h022.j(null);
                    b11 = a.C0644a.b(a112, request, currentTimeMillis, !iVar2.getIsPerfMetricsEnabled() && iVar2.getShouldReadResponseBodyBeforeResponse());
                    if (b11 != null) {
                    }
                } catch (IOException e12) {
                    e = e12;
                    element = c11;
                    try {
                        if (interfaceC8979b.c() != q20.c.QA_BUILDS_OR_AUTOTEST) {
                        }
                        if (z11) {
                        }
                        throw b(e);
                    } catch (Throwable th2) {
                        th = th2;
                        if (element != null && ((AbstractC10711a) element).isActive()) {
                            ((H0) element).j(null);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    element = c11;
                    if (element != null) {
                        ((H0) element).j(null);
                    }
                    throw th;
                }
                iVar = knetRequest;
                long currentTimeMillis2 = System.currentTimeMillis();
                interfaceC4008j = interfaceC4008j2;
                interfaceC8979b = interfaceC8979b2;
                c11 = C10727i.c(this.f6695d, X0.b(), null, new f(chain.call(), this, iVar, null), 2);
            } catch (IOException e13) {
                e = e13;
                interfaceC4008j = interfaceC4008j2;
                interfaceC8979b = interfaceC8979b2;
            }
        } catch (Throwable th4) {
            th = th4;
            element = null;
        }
    }

    @Override // Ya.b
    public final Ja.i toKnetRequest(@NotNull G g10, boolean z11) {
        return b.a.a(g10, false);
    }

    @Override // Ya.a
    public final L toOkResponse(@NotNull j jVar, @NotNull G g10, long j11, boolean z11) {
        throw null;
    }
}
