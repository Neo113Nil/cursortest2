package Hj0;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.tracker.network.NewTrackerApi;
import ru.ozon.tracker.network.OldTrackerApi;

/* loaded from: classes7.dex */
public final class J implements Jb.e<Mj0.h> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Retrofit> f11089a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<bk0.e> f11090b;

    public J(G g10, Pc.a<Retrofit> aVar, Pc.a<bk0.e> aVar2) {
        this.f11089a = aVar;
        this.f11090b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Retrofit retrofit = this.f11089a.get();
        bk0.e generalNetworkEnabledStateProvider = this.f11090b.get();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(generalNetworkEnabledStateProvider, "generalNetworkEnabledStateProvider");
        Object create = retrofit.create(generalNetworkEnabledStateProvider.c() ? NewTrackerApi.class : OldTrackerApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        Mj0.h hVar = (Mj0.h) create;
        Jb.j.d(hVar);
        return hVar;
    }
}
