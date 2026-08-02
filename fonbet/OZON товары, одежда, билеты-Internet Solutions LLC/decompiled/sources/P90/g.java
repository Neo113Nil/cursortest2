package P90;

import P90.a;
import android.content.SharedPreferences;
import b90.C5596c;
import c90.InterfaceC5773a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.network.FeaturesNetwork;

/* loaded from: classes3.dex */
public final class g implements Jb.e<FeaturesNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C5596c> f22060a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22061b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f22062c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC5773a> f22063d;

    public g(Pc.a aVar, Pc.a aVar2, Jb.f fVar, Pc.a aVar3) {
        this.f22060a = aVar;
        this.f22061b = aVar2;
        this.f22062c = fVar;
        this.f22063d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        String bankApiUrl;
        C5596c okHttpClient = (C5596c) ((a.c) this.f22060a).get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((a.e) this.f22061b).get();
        ExternalFintechSettings externalFintechSettings = (ExternalFintechSettings) this.f22062c.get();
        Ib.a testEnvironmentManager = Jb.d.a(this.f22063d);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(testEnvironmentManager, "testEnvironmentManager");
        if (externalFintechSettings.isQa()) {
            bankApiUrl = ((InterfaceC5773a) testEnvironmentManager.get()).i();
            if (bankApiUrl == null) {
                bankApiUrl = externalFintechSettings.getBankApiUrl(sharedPreferences);
            }
        } else {
            bankApiUrl = externalFintechSettings.getBankApiUrl(sharedPreferences);
        }
        String baseUrl = bankApiUrl + "/";
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient.b()).addConverterFactory(MoshiConverterFactory.create()).build().create(FeaturesNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        FeaturesNetwork featuresNetwork = (FeaturesNetwork) create;
        Jb.j.d(featuresNetwork);
        return featuresNetwork;
    }
}
