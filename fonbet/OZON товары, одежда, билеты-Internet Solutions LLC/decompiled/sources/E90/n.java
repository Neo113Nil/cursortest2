package E90;

import android.content.SharedPreferences;
import c90.C5777e;
import com.squareup.moshi.Moshi;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class n implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7673a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f7674b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f7675c;

    public /* synthetic */ n(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f7673a = i11;
        this.f7674b = aVar;
        this.f7675c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f7673a) {
            case 0:
                return new m((S80.b) this.f7674b.get(), (Moshi) this.f7675c.get());
            default:
                return new C5777e((SharedPreferences) this.f7674b.get(), (ExternalNetworkSettings) ((Jb.f) this.f7675c).get());
        }
    }
}
