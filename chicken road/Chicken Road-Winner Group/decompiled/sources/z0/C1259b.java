package z0;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259b implements InterfaceC1056d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1259b f10631a = new C1259b();

    /* renamed from: b, reason: collision with root package name */
    public static final C1055c f10632b = C1055c.a("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final C1055c f10633c = C1055c.a(CommonUrlParts.MODEL);

    /* renamed from: d, reason: collision with root package name */
    public static final C1055c f10634d = C1055c.a("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final C1055c f10635e = C1055c.a("device");
    public static final C1055c f = C1055c.a("product");

    /* renamed from: g, reason: collision with root package name */
    public static final C1055c f10636g = C1055c.a("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final C1055c f10637h = C1055c.a(CommonUrlParts.MANUFACTURER);

    /* renamed from: i, reason: collision with root package name */
    public static final C1055c f10638i = C1055c.a("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final C1055c f10639j = C1055c.a(CommonUrlParts.LOCALE);

    /* renamed from: k, reason: collision with root package name */
    public static final C1055c f10640k = C1055c.a("country");

    /* renamed from: l, reason: collision with root package name */
    public static final C1055c f10641l = C1055c.a("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final C1055c f10642m = C1055c.a("applicationBuild");

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        InterfaceC1057e interfaceC1057e = (InterfaceC1057e) obj2;
        h hVar = (h) ((AbstractC1258a) obj);
        interfaceC1057e.a(f10632b, hVar.f10665a);
        interfaceC1057e.a(f10633c, hVar.f10666b);
        interfaceC1057e.a(f10634d, hVar.f10667c);
        interfaceC1057e.a(f10635e, hVar.f10668d);
        interfaceC1057e.a(f, hVar.f10669e);
        interfaceC1057e.a(f10636g, hVar.f);
        interfaceC1057e.a(f10637h, hVar.f10670g);
        interfaceC1057e.a(f10638i, hVar.f10671h);
        interfaceC1057e.a(f10639j, hVar.f10672i);
        interfaceC1057e.a(f10640k, hVar.f10673j);
        interfaceC1057e.a(f10641l, hVar.f10674k);
        interfaceC1057e.a(f10642m, hVar.f10675l);
    }
}
