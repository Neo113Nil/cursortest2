package P90;

import P90.a;
import Q90.o;
import We.E;
import android.app.Application;
import android.content.SharedPreferences;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes3.dex */
public final class j implements Jb.e<ru.ozon.fintech.settings.domain.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f22073a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<O30.b> f22074b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<T90.g> f22075c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22076d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f22077e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f22078f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<E> f22079g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<o> f22080h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<Q90.c> f22081i;

    public j(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8) {
        this.f22073a = aVar;
        this.f22074b = aVar2;
        this.f22075c = aVar3;
        this.f22076d = aVar4;
        this.f22077e = fVar;
        this.f22078f = aVar5;
        this.f22079g = aVar6;
        this.f22080h = aVar7;
        this.f22081i = aVar8;
    }

    @Override // Pc.a
    public final Object get() {
        Application application = (Application) ((a.g) this.f22073a).get();
        O30.b fintechLibType = (O30.b) ((a.i) this.f22074b).get();
        T90.g settingsRepository = this.f22075c.get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((a.e) this.f22076d).get();
        ExternalFintechSettings externalFintechSettings = (ExternalFintechSettings) this.f22077e.get();
        InterfaceC6618a fintechAnalyticInteractor = (InterfaceC6618a) ((a.b) this.f22078f).get();
        E okHttpClient = (E) ((a.d) this.f22079g).get();
        o sessionIdProvider = this.f22080h.get();
        Q90.c featureToggles = this.f22081i.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        return new ru.ozon.fintech.settings.domain.a(application, fintechLibType, sessionIdProvider, settingsRepository, sharedPreferences, externalFintechSettings, featureToggles, okHttpClient, fintechAnalyticInteractor);
    }
}
