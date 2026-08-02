package P30;

import android.app.Application;
import android.content.SharedPreferences;
import d90.C6115c;
import ij0.InterfaceC7087b;
import kotlin.jvm.internal.Intrinsics;
import l90.C7901a;
import p40.i;
import pi0.h;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21799a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f21800b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f21801c;

    public /* synthetic */ e(Pc.a aVar, Jb.f fVar, int i11) {
        this.f21799a = i11;
        this.f21800b = aVar;
        this.f21801c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f21799a) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21800b.get();
                Application application = (Application) this.f21801c.get();
                Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
                Intrinsics.checkNotNullParameter(application, "application");
                return new S30.c(sharedPreferences, application);
            case 1:
                return new C6115c((SharedPreferences) this.f21800b.get(), (ExternalNetworkSettings) this.f21801c.get());
            case 2:
                return new i((Q90.c) this.f21800b.get(), (C7901a) this.f21801c.get());
            default:
                return new xi0.d((InterfaceC7087b) this.f21800b.get(), (h) this.f21801c.get());
        }
    }
}
