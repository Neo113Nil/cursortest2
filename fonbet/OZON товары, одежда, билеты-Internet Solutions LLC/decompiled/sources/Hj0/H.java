package Hj0;

import We.E;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes7.dex */
public final class H implements Jb.e<Retrofit> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<bk0.e> f11080a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f11081b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<pf0.i> f11082c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<MoshiConverterFactory> f11083d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Retrofit.Builder> f11084e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<Nj0.a> f11085f;

    public H(G g10, Pc.a aVar, Jb.f fVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5) {
        this.f11080a = aVar;
        this.f11081b = fVar;
        this.f11082c = aVar2;
        this.f11083d = aVar3;
        this.f11084e = aVar4;
        this.f11085f = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        Retrofit.Builder builder;
        bk0.e generalNetworkEnabledStateProvider = this.f11080a.get();
        fi0.x settings = (fi0.x) this.f11081b.get();
        pf0.i networkConfig = this.f11082c.get();
        MoshiConverterFactory moshiConverterFactory = this.f11083d.get();
        Ib.a oldRetrofitBuilderLazy = Jb.d.a(this.f11084e);
        Nj0.a curlLogger = this.f11085f.get();
        Intrinsics.checkNotNullParameter(generalNetworkEnabledStateProvider, "generalNetworkEnabledStateProvider");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(moshiConverterFactory, "moshiConverterFactory");
        Intrinsics.checkNotNullParameter(oldRetrofitBuilderLazy, "oldRetrofitBuilderLazy");
        Intrinsics.checkNotNullParameter(curlLogger, "curlLogger");
        if (generalNetworkEnabledStateProvider.c()) {
            Ld0.c v11 = settings.v();
            pf0.h hVar = v11 != null ? (pf0.h) v11.e(pf0.h.class) : null;
            if (hVar == null) {
                throw new IllegalStateException("OzonLimbDiStore должен быть передан в настройки трекера");
            }
            We.E y11 = hVar.y(networkConfig);
            y11.getClass();
            E.a aVar = new E.a(y11);
            aVar.a(curlLogger);
            builder = hVar.j(networkConfig).newBuilder().client(new We.E(aVar));
        } else {
            builder = (Retrofit.Builder) oldRetrofitBuilderLazy.get();
        }
        Retrofit build = builder.addConverterFactory(moshiConverterFactory).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        Jb.j.d(build);
        return build;
    }
}
