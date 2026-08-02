package Ve;

import We.E;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* loaded from: classes6.dex */
public final class Ln implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Mm f29436a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f29437b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f29438c;

    public Ln(Mm mm, Pc.a aVar, Pc.a aVar2) {
        this.f29436a = mm;
        this.f29437b = aVar;
        this.f29438c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        We.B interceptor = (We.B) this.f29436a.get();
        C8588a loggingInterceptor = (C8588a) this.f29437b.get();
        Be sslInteractor = (Be) this.f29438c.get();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(sslInteractor, "sslInteractor");
        E.a aVar = new E.a(new We.E());
        aVar.b(loggingInterceptor);
        aVar.a(interceptor);
        aVar.X(20000L, TimeUnit.MILLISECONDS);
        SSLSocketFactory socketFactory = sslInteractor.b().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslInteractor.customSSLContext.socketFactory");
        aVar.a0(socketFactory, sslInteractor.a());
        aVar.R(sslInteractor.c());
        return aVar;
    }
}
