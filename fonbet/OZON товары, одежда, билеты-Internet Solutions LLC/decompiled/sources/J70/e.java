package J70;

import J70.a;
import Jb.j;
import We.E;
import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.features.otp.sms.network.OtpSmsNetworkApi;

/* loaded from: classes3.dex */
public final class e implements Jb.e<OtpSmsNetworkApi> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f14196a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<E> f14197b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Moshi> f14198c;

    public e(Pc.a<ru.ozon.fintech.settings.domain.a> aVar, Pc.a<E> aVar2, Pc.a<Moshi> aVar3) {
        this.f14196a = aVar;
        this.f14197b = aVar2;
        this.f14198c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((a.e) this.f14196a).get();
        E okHttpClient = (E) ((a.f) this.f14197b).get();
        Moshi moshi = this.f14198c.get();
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        String baseUrl = fintechSettings.e() + "/";
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(moshi)).build().create(OtpSmsNetworkApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        OtpSmsNetworkApi otpSmsNetworkApi = (OtpSmsNetworkApi) create;
        j.d(otpSmsNetworkApi);
        return otpSmsNetworkApi;
    }
}
