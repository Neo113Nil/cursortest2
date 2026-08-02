package O4;

import game.betting133.sports1xbet.aqua_network.AquaSportsApiService;
import java.util.Map;
import p4.C2268h;

/* renamed from: O4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275v implements InterfaceC0262h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4234k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2268h f4235l;

    public /* synthetic */ C0275v(C2268h c2268h, int i) {
        this.f4234k = i;
        this.f4235l = c2268h;
    }

    @Override // O4.InterfaceC0262h
    public final void a(InterfaceC0259e interfaceC0259e, S s2) {
        switch (this.f4234k) {
            case 0:
                kotlin.jvm.internal.l.f("call", interfaceC0259e);
                boolean d5 = s2.f4188a.d();
                C2268h c2268h = this.f4235l;
                if (!d5) {
                    c2268h.resumeWith(G4.l.p(new D2.e(s2)));
                    break;
                } else {
                    Object obj = s2.f4189b;
                    if (obj != null) {
                        c2268h.resumeWith(obj);
                        break;
                    } else {
                        C0.c f = interfaceC0259e.f();
                        f.getClass();
                        Object cast = C0273t.class.cast(((Map) f.f).get(C0273t.class));
                        kotlin.jvm.internal.l.c(cast);
                        c2268h.resumeWith(G4.l.p(new W3.d("Response from " + AquaSportsApiService.class.getName() + '.' + ((C0273t) cast).f4230b.getName() + " was null but response body type was declared as non-null")));
                        break;
                    }
                }
            default:
                kotlin.jvm.internal.l.f("call", interfaceC0259e);
                this.f4235l.resumeWith(s2);
                break;
        }
    }

    @Override // O4.InterfaceC0262h
    public final void h(InterfaceC0259e interfaceC0259e, Throwable th) {
        switch (this.f4234k) {
            case 0:
                kotlin.jvm.internal.l.f("call", interfaceC0259e);
                this.f4235l.resumeWith(G4.l.p(th));
                break;
            default:
                kotlin.jvm.internal.l.f("call", interfaceC0259e);
                this.f4235l.resumeWith(G4.l.p(th));
                break;
        }
    }
}
