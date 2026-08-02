package P90;

import P90.a;
import We.E;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.network.SettingsNetworkPins;

/* loaded from: classes3.dex */
public final class h implements Jb.e<SettingsNetworkPins> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f22064a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22065b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f22066c;

    public h(Jb.f fVar, Pc.a aVar, Pc.a aVar2) {
        this.f22064a = aVar;
        this.f22065b = aVar2;
        this.f22066c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((a.d) this.f22064a).get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((a.e) this.f22065b).get();
        ExternalFintechSettings externalFintechSettings = (ExternalFintechSettings) this.f22066c.get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        String baseUrl = externalFintechSettings.getPinsUrl(sharedPreferences) + externalFintechSettings.getBasePath();
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build().create(SettingsNetworkPins.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        SettingsNetworkPins settingsNetworkPins = (SettingsNetworkPins) create;
        Jb.j.d(settingsNetworkPins);
        return settingsNetworkPins;
    }
}
