package z0;

import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;

/* loaded from: classes.dex */
public final class e implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10648a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f10649b = C1055c.a("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f10650c = C1055c.a("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final C1055c f10651d = C1055c.a("eventUptimeMs");

    /* renamed from: e, reason: collision with root package name */
    public static final C1055c f10652e = C1055c.a("sourceExtension");
    public static final C1055c f = C1055c.a("sourceExtensionJsonProto3");

    /* renamed from: g, reason: collision with root package name */
    public static final C1055c f10653g = C1055c.a("timezoneOffsetSeconds");

    /* renamed from: h, reason: collision with root package name */
    public static final C1055c f10654h = C1055c.a("networkConnectionInfo");

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        k kVar = (k) ((r) obj);
        interfaceC1057e.d(f10649b, kVar.f10678a);
        interfaceC1057e.a(f10650c, kVar.f10679b);
        interfaceC1057e.d(f10651d, kVar.f10680c);
        interfaceC1057e.a(f10652e, kVar.f10681d);
        interfaceC1057e.a(f, kVar.f10682e);
        interfaceC1057e.d(f10653g, kVar.f);
        interfaceC1057e.a(f10654h, kVar.f10683g);
    }
}
