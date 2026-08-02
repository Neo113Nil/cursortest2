package P90;

import P90.a;
import We.E;
import android.content.SharedPreferences;
import c90.InterfaceC5773a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.network.AuthPinpadNetwork;

/* loaded from: classes3.dex */
public final class d implements Jb.e<AuthPinpadNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f22051a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22052b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f22053c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC5773a> f22054d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<R90.a> f22055e;

    public d(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f22051a = aVar;
        this.f22052b = aVar2;
        this.f22053c = fVar;
        this.f22054d = aVar3;
        this.f22055e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        String bankApiUrl;
        E okHttpClient = (E) ((a.d) this.f22051a).get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((a.e) this.f22052b).get();
        ExternalFintechSettings externalFintechSettings = (ExternalFintechSettings) this.f22053c.get();
        Ib.a testEnvironmentManager = Jb.d.a(this.f22054d);
        R90.a fastEntryInterceptor = this.f22055e.get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(testEnvironmentManager, "testEnvironmentManager");
        Intrinsics.checkNotNullParameter(fastEntryInterceptor, "fastEntryInterceptor");
        if (externalFintechSettings.isQa()) {
            bankApiUrl = ((InterfaceC5773a) testEnvironmentManager.get()).i();
            if (bankApiUrl == null) {
                bankApiUrl = externalFintechSettings.getBankApiUrl(sharedPreferences);
            }
        } else {
            bankApiUrl = externalFintechSettings.getBankApiUrl(sharedPreferences);
        }
        String baseUrl = bankApiUrl + "/";
        okHttpClient.getClass();
        E.a aVar = new E.a(okHttpClient);
        aVar.a(fastEntryInterceptor);
        E okHttpClient2 = new E(aVar);
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient2).addConverterFactory(MoshiConverterFactory.create()).build().create(AuthPinpadNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        AuthPinpadNetwork authPinpadNetwork = (AuthPinpadNetwork) create;
        Jb.j.d(authPinpadNetwork);
        return authPinpadNetwork;
    }
}
