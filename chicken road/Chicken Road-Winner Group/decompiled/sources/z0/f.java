package z0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;

/* loaded from: classes.dex */
public final class f implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10655a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f10656b = C1055c.a("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f10657c = C1055c.a("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final C1055c f10658d = C1055c.a("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final C1055c f10659e = C1055c.a("logSource");
    public static final C1055c f = C1055c.a("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final C1055c f10660g = C1055c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final C1055c f10661h = C1055c.a("qosTier");

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        l lVar = (l) ((s) obj);
        interfaceC1057e.d(f10656b, lVar.f10684a);
        interfaceC1057e.d(f10657c, lVar.f10685b);
        interfaceC1057e.a(f10658d, lVar.f10686c);
        interfaceC1057e.a(f10659e, lVar.f10687d);
        interfaceC1057e.a(f, lVar.f10688e);
        interfaceC1057e.a(f10660g, lVar.f);
        interfaceC1057e.a(f10661h, w.f10698a);
    }
}
