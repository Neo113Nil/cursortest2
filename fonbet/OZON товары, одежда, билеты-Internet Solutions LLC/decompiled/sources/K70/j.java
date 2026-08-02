package K70;

import We.E;
import a50.C4951c;
import android.app.Application;
import android.content.SharedPreferences;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.otp.sms.network.OtpSmsNetworkApi;

/* loaded from: classes3.dex */
public final class j implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15361a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f15362b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f15363c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f15364d;

    public /* synthetic */ j(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, int i11) {
        this.f15361a = i11;
        this.f15362b = aVar;
        this.f15363c = aVar2;
        this.f15364d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f15361a) {
            case 0:
                return new i((R30.a) this.f15362b.get(), (SharedPreferences) this.f15363c.get(), (OtpSmsNetworkApi) ((J70.e) this.f15364d).get());
            default:
                return new C4951c((Application) this.f15362b.get(), (InterfaceC6618a) this.f15363c.get(), (E) this.f15364d.get());
        }
    }
}
