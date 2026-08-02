package Nc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Hb0.f;
import Sc.InterfaceC4008j;
import We.A;
import We.G;
import We.L;
import gf.t;
import id0.C7050a;
import id0.C7051b;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import jd0.AbstractC7348a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ob0.D;
import ob0.r;
import ob0.w;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.id.nativeauth.main.b;
import spay.sdk.api.ErrorCode;

/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f18999a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7051b> f19000b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f19001c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.id.nativeauth.main.b> f19002d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<ru.ozon.id.nativeauth.main.b> f19003e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f19004f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f19005g;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f19006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f19007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, l lVar) {
            super(0);
            this.f19006b = th2;
            this.f19007c = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            L raw;
            G L11;
            A j11;
            Throwable th2 = this.f19006b;
            boolean z11 = th2 instanceof HttpException;
            l lVar = this.f19007c;
            if (!z11) {
                return th2 instanceof AbstractC7348a.b ? C7051b.g((C7051b) lVar.f19000b.getValue(), Integer.valueOf(((AbstractC7348a.b) th2).a()), th2.getMessage(), 12) : th2 instanceof Lb0.b ? ((C7051b) lVar.f19000b.getValue()).f(((Lb0.b) th2).a(), "auth.vk.onFail", -1, td0.j.b(th2)) : C7051b.g((C7051b) lVar.f19000b.getValue(), null, th2.getMessage(), 13);
            }
            Response<?> response = ((HttpException) th2).response();
            if (response == null || response.code() != 403) {
                return ((C7051b) lVar.f19000b.getValue()).f(response != null ? response.message() : null, (response == null || (raw = response.raw()) == null || (L11 = raw.L()) == null || (j11 = L11.j()) == null) ? null : j11.c(), response != null ? Integer.valueOf(response.code()) : null, td0.j.b(th2));
            }
            C7051b manager = (C7051b) lVar.f19000b.getValue();
            String url = response.raw().L().j().c();
            Intrinsics.checkNotNullParameter(response, "<this>");
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(url, "url");
            Object i11 = response.raw().L().i(Object.class);
            if (i11 instanceof D) {
                D d11 = (D) i11;
                return manager.f(w.a(d11.c()) ? "svc403" : "plain403", url, Integer.valueOf(response.code()), d11.c());
            }
            Integer valueOf = Integer.valueOf(response.code());
            String message = response.message();
            L raw2 = response.raw();
            Intrinsics.checkNotNullExpressionValue(raw2, "raw(...)");
            return manager.f(message, url, valueOf, td0.j.a(raw2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull InterfaceC4008j<C7050a> trackingRepository, @NotNull InterfaceC4008j<C7051b> pageExceptionTrackingManager, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        Intrinsics.checkNotNullParameter(pageExceptionTrackingManager, "pageExceptionTrackingManager");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f18999a = trackingRepository;
        this.f19000b = pageExceptionTrackingManager;
        this.f19001c = featureFlagsStore;
        x0<ru.ozon.id.nativeauth.main.b> a11 = O0.a(b.C2136b.f97312a);
        this.f19002d = a11;
        this.f19003e = C2399j.b(a11);
        x0<Boolean> a12 = O0.a(Boolean.FALSE);
        this.f19004f = a12;
        this.f19005g = C2399j.b(a12);
    }

    private final void b(Throwable th2) {
        if (((Boolean) this.f19001c.getValue().b(f.r.f10816a)).booleanValue()) {
            this.f18999a.getValue().c(new a(th2, this));
        }
    }

    @Override // Nc0.k
    public final void g() {
        this.f19002d.tryEmit(b.C2136b.f97312a);
        p();
    }

    @Override // Nc0.k
    public final void hideLoader() {
        this.f19004f.tryEmit(Boolean.FALSE);
    }

    @Override // Nc0.k
    public final void j() {
        this.f19002d.tryEmit(b.a.f97311a);
        hideLoader();
    }

    @Override // Nc0.k
    @NotNull
    public final InterfaceC2395h<Boolean> k() {
        return this.f19005g;
    }

    @Override // Nc0.k
    public final void p() {
        this.f19004f.tryEmit(Boolean.TRUE);
    }

    @Override // Nc0.k
    @NotNull
    public final InterfaceC2395h<ru.ozon.id.nativeauth.main.b> u() {
        return this.f19003e;
    }

    @Override // Nc0.k
    public final void v(@NotNull Throwable throwable) {
        ru.ozon.id.nativeauth.main.b bVar;
        L raw;
        G L11;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof r) {
            r rVar = (r) throwable;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            String b11 = rVar.b();
            if (b11 == null) {
                b11 = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
            }
            bVar = new b.c.a(b11, rVar.a());
        } else if (throwable instanceof HttpException) {
            b(throwable);
            Response<?> response = ((HttpException) throwable).response();
            Object i11 = (response == null || (raw = response.raw()) == null || (L11 = raw.L()) == null) ? null : L11.i(Object.class);
            String c11 = i11 instanceof D ? ((D) i11).c() : null;
            bVar = new b.c.e(c11 != null ? c11 : null);
        } else if ((throwable instanceof UnknownHostException) || (throwable instanceof ConnectException) || (throwable instanceof SocketTimeoutException) || (throwable instanceof SSLException) || (throwable instanceof ProtocolException) || (throwable instanceof InterruptedIOException) || (throwable instanceof t) || (throwable instanceof ClosedChannelException) || (throwable instanceof UnknownServiceException)) {
            bVar = b.c.C2138c.f97323a;
        } else {
            b(throwable);
            bVar = new b.c.e(td0.j.b(throwable), 2);
        }
        this.f19002d.tryEmit(bVar);
        hideLoader();
    }
}
