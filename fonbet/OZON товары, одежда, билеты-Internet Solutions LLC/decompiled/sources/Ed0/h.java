package Ed0;

import Jd0.c;
import Sc.o;
import We.E;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import zd0.f;

/* loaded from: classes7.dex */
public final class h implements Jb.e<i> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f7854a;

    /* renamed from: b, reason: collision with root package name */
    private final g f7855b;

    /* renamed from: c, reason: collision with root package name */
    private final f f7856c;

    /* renamed from: d, reason: collision with root package name */
    private final e f7857d;

    public h(c cVar, Jb.f fVar, g gVar, f fVar2, e eVar) {
        this.f7854a = fVar;
        this.f7855b = gVar;
        this.f7856c = fVar2;
        this.f7857d = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        Fb0.e eVar;
        Retrofit.Builder client;
        pf0.h hVar;
        zd0.b config = (zd0.b) this.f7854a.get();
        pf0.i ozonNetworkConfig = (pf0.i) this.f7855b.get();
        E okHttpClient = (E) this.f7856c.get();
        Moshi moshi = (Moshi) this.f7857d.get();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Ld0.c b11 = config.b();
        Retrofit H11 = (b11 == null || (hVar = (pf0.h) b11.d(pf0.h.class)) == null) ? null : hVar.H(ozonNetworkConfig);
        if (H11 == null || (client = H11.newBuilder()) == null) {
            Retrofit.Builder builder = new Retrofit.Builder();
            f.a a11 = config.g().a();
            Intrinsics.checkNotNullParameter(a11, "<this>");
            int i11 = c.a.f14622a[a11.ordinal()];
            if (i11 == 1) {
                eVar = Fb0.e.OZON_RU;
            } else if (i11 == 2) {
                eVar = Fb0.e.OZONRU_CN;
            } else if (i11 == 3) {
                eVar = Fb0.e.OZONRU_ME;
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                eVar = Fb0.e.OZONRUCN_ME;
            }
            client = builder.baseUrl(eVar.e()).client(okHttpClient);
        }
        Retrofit build = client.addConverterFactory(MoshiConverterFactory.create(moshi)).build();
        Intrinsics.f(build);
        return new i(build, H11 != null);
    }
}
