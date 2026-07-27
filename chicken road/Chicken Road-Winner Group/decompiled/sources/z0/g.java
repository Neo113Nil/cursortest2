package z0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;

/* loaded from: classes.dex */
public final class g implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f10662a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f10663b = C1055c.a("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f10664c = C1055c.a("mobileSubtype");

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        n nVar = (n) ((v) obj);
        interfaceC1057e.a(f10663b, nVar.f10690a);
        interfaceC1057e.a(f10664c, nVar.f10691b);
    }
}
