package P80;

import Jb.e;
import Jb.f;
import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements e<S80.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f22014a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f22015b;

    /* renamed from: c, reason: collision with root package name */
    private final f f22016c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22017d;

    public d(Pc.a aVar, Pc.a aVar2, f fVar, Pc.a aVar3) {
        this.f22014a = aVar;
        this.f22015b = aVar2;
        this.f22016c = fVar;
        this.f22017d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        Application application = this.f22014a.get();
        ru.ozon.fintech.settings.domain.a settings = this.f22015b.get();
        T80.b externalFintechNavigation = (T80.b) this.f22016c.get();
        SharedPreferences sharedPreferences = this.f22017d.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(externalFintechNavigation, "externalFintechNavigation");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new S80.a(application, externalFintechNavigation, sharedPreferences, settings);
    }
}
