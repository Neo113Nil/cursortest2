package Hj0;

import We.E;
import We.InterfaceC4875q;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class I implements Jb.e<Retrofit.Builder> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C8588a> f11086a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Nj0.a> f11087b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f11088c;

    public I(G g10, Pc.a aVar, Pc.a aVar2, Jb.f fVar) {
        this.f11086a = aVar;
        this.f11087b = aVar2;
        this.f11088c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        C8588a logger = this.f11086a.get();
        Nj0.a curlLogger = this.f11087b.get();
        fi0.x settings = (fi0.x) this.f11088c.get();
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(curlLogger, "curlLogger");
        Intrinsics.checkNotNullParameter(settings, "settings");
        E.a aVar = new E.a();
        InterfaceC4875q r11 = settings.r();
        if (r11 == null) {
            r11 = InterfaceC4875q.f33801a;
        }
        aVar.h(r11);
        aVar.a(new Mj0.a(settings));
        aVar.a(new Mj0.f(settings));
        aVar.a(logger);
        aVar.a(curlLogger);
        aVar.a(Mj0.e.f18152a);
        aVar.a(new fi0.d(settings.z()));
        Retrofit.Builder client = new Retrofit.Builder().baseUrl(new Uri.Builder().scheme("https").authority(settings.k().m()).build().toString()).client(new We.E(aVar));
        Intrinsics.checkNotNullExpressionValue(client, "client(...)");
        Jb.j.d(client);
        return client;
    }
}
