package a90;

import B30.o;
import We.E;
import a90.C4963a;
import android.content.Context;
import android.util.Log;
import b90.C5596c;
import b90.C5597d;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements Jb.e<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f36474a;

    /* renamed from: b, reason: collision with root package name */
    private final j f36475b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f36476c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<C5596c> f36477d;

    public k(Pc.a aVar, j jVar, Jb.f fVar, Pc.a aVar2) {
        this.f36474a = aVar;
        this.f36475b = jVar;
        this.f36476c = fVar;
        this.f36477d = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Context app = (Context) ((C4963a.d) this.f36474a).get();
        Set interceptors = (Set) this.f36475b.get();
        C5597d fintechSingleNetworkClientProvider = (C5597d) this.f36476c.get();
        C5596c fintechFeaturesOkHttpClient = this.f36477d.get();
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(fintechSingleNetworkClientProvider, "fintechSingleNetworkClientProvider");
        Intrinsics.checkNotNullParameter(fintechFeaturesOkHttpClient, "fintechFeaturesOkHttpClient");
        Log.d("ESK_FLOW", " provideOkHttpClient interceptors.size: " + interceptors.size());
        E b11 = fintechSingleNetworkClientProvider.b(app, interceptors, new C4969g(), new o(fintechFeaturesOkHttpClient, 2));
        Jb.j.d(b11);
        return b11;
    }
}
