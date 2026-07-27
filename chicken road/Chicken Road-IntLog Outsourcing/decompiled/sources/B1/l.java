package B1;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import m1.InterfaceC1276c;
import n1.C1322i;
import o1.u;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LocationRequest f233n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E1.b f234o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(GoogleApiClient googleApiClient, LocationRequest locationRequest, E1.b bVar) {
        super(googleApiClient);
        this.f233n = locationRequest;
        this.f234o = bVar;
    }

    @Override // B1.n
    public final void K(InterfaceC1276c interfaceC1276c) {
        i iVar = (i) interfaceC1276c;
        o oVar = new o(this);
        LocationRequest locationRequest = this.f233n;
        E1.b bVar = this.f234o;
        u.i("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
        Looper myLooper = Looper.myLooper();
        String simpleName = E1.b.class.getSimpleName();
        u.h(bVar, "Listener must not be null");
        u.h(myLooper, "Looper must not be null");
        C1322i c1322i = new C1322i(myLooper, bVar, simpleName);
        synchronized (iVar.f219E) {
            iVar.f219E.e(locationRequest, c1322i, oVar);
        }
    }
}
