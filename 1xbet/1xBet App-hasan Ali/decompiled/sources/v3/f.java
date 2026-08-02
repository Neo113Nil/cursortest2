package v3;

import D3.o;
import Q1.j;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import g3.InterfaceC1983a;
import k3.InterfaceC2034b;
import l3.C2054a;

/* loaded from: classes.dex */
public final class f extends k3.f implements InterfaceC1983a {

    /* renamed from: u, reason: collision with root package name */
    public static final g f20435u = new g("AppSet.API", new B3.b(3), new j(29));

    /* renamed from: s, reason: collision with root package name */
    public final Context f20436s;

    /* renamed from: t, reason: collision with root package name */
    public final j3.f f20437t;

    public f(Context context, j3.f fVar) {
        super(context, f20435u, InterfaceC2034b.f17586a, k3.e.f17588b);
        this.f20436s = context;
        this.f20437t = fVar;
    }

    @Override // g3.InterfaceC1983a
    public final o d() {
        if (this.f20437t.c(this.f20436s, 212800000) != 0) {
            k3.d dVar = new k3.d(new Status(17, null, null, null));
            o oVar = new o();
            oVar.e(dVar);
            return oVar;
        }
        l3.j jVar = new l3.j();
        jVar.f17801b = new j3.d[]{g3.d.f17161a};
        jVar.f17804e = new C2054a(this);
        jVar.f17802c = false;
        jVar.f17803d = 27601;
        return b(0, jVar.a());
    }
}
