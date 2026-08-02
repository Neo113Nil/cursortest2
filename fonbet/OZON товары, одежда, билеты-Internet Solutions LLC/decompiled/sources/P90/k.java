package P90;

import P90.a;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.network.SettingsNetworkPins;

/* loaded from: classes3.dex */
public final class k implements Jb.e<T90.f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<SettingsNetworkPins> f22082a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f22083b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f22084c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Moshi> f22085d;

    public k(Pc.a<SettingsNetworkPins> aVar, Pc.a<SharedPreferences> aVar2, Pc.a<InterfaceC6618a> aVar3, Pc.a<Moshi> aVar4) {
        this.f22082a = aVar;
        this.f22083b = aVar2;
        this.f22084c = aVar3;
        this.f22085d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        SettingsNetworkPins settingsNetworkPins = this.f22082a.get();
        Ib.a sharedPreferences = Jb.d.a(this.f22083b);
        InterfaceC6618a analyticInteractor = (InterfaceC6618a) ((a.b) this.f22084c).get();
        Moshi moshi = this.f22085d.get();
        Intrinsics.checkNotNullParameter(settingsNetworkPins, "settingsNetworkPins");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new T90.f(settingsNetworkPins, analyticInteractor, sharedPreferences, moshi);
    }
}
