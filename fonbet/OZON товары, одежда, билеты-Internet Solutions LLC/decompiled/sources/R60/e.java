package R60;

import Jb.j;
import R60.a;
import We.E;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.features.metrix.network.FintechMetrixNetwork;

/* loaded from: classes3.dex */
public final class e implements Jb.e<FintechMetrixNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f24771a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f24772b;

    public e(Pc.a<E> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2) {
        this.f24771a = aVar;
        this.f24772b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((a.f) this.f24771a).get();
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((a.e) this.f24772b).get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        String baseUrl = fintechSettings.e() + "/";
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(baseUrl + "metrixa/").client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build().create(FintechMetrixNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        FintechMetrixNetwork fintechMetrixNetwork = (FintechMetrixNetwork) create;
        j.d(fintechMetrixNetwork);
        return fintechMetrixNetwork;
    }
}
