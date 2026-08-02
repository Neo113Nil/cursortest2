package B70;

import B70.a;
import Jb.j;
import We.E;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.features.operations.network.OperationsApi;

/* loaded from: classes3.dex */
public final class f implements Jb.e<OperationsApi> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f3014a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f3015b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Moshi> f3016c;

    public f(Pc.a<E> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2, Pc.a<Moshi> aVar3) {
        this.f3014a = aVar;
        this.f3015b = aVar2;
        this.f3016c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((a.b) this.f3014a).get();
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((a.C0074a) this.f3015b).get();
        Moshi moshi = this.f3016c.get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        String baseUrl = fintechSettings.e() + "/";
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(OperationsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        OperationsApi operationsApi = (OperationsApi) create;
        j.d(operationsApi);
        return operationsApi;
    }
}
