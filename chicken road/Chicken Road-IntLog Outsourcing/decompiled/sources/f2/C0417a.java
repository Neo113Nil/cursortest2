package f2;

import g2.C0452d;
import g2.EnumC0449a;
import g2.EnumC0451c;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417a implements R1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0417a f5578a = new C0417a();

    /* renamed from: b, reason: collision with root package name */
    public static final R1.c f5579b = new R1.c("projectNumber", B0.o.n(B0.o.m(U1.e.class, new U1.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R1.c f5580c = new R1.c("messageId", B0.o.n(B0.o.m(U1.e.class, new U1.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final R1.c f5581d = new R1.c("instanceId", B0.o.n(B0.o.m(U1.e.class, new U1.a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final R1.c f5582e = new R1.c("messageType", B0.o.n(B0.o.m(U1.e.class, new U1.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final R1.c f5583f = new R1.c("sdkPlatform", B0.o.n(B0.o.m(U1.e.class, new U1.a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final R1.c f5584g = new R1.c("packageName", B0.o.n(B0.o.m(U1.e.class, new U1.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final R1.c f5585h = new R1.c("collapseKey", B0.o.n(B0.o.m(U1.e.class, new U1.a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final R1.c f5586i = new R1.c("priority", B0.o.n(B0.o.m(U1.e.class, new U1.a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final R1.c f5587j = new R1.c("ttl", B0.o.n(B0.o.m(U1.e.class, new U1.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final R1.c f5588k = new R1.c("topic", B0.o.n(B0.o.m(U1.e.class, new U1.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final R1.c f5589l = new R1.c("bulkId", B0.o.n(B0.o.m(U1.e.class, new U1.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final R1.c f5590m = new R1.c("event", B0.o.n(B0.o.m(U1.e.class, new U1.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final R1.c f5591n = new R1.c("analyticsLabel", B0.o.n(B0.o.m(U1.e.class, new U1.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final R1.c f5592o = new R1.c("campaignId", B0.o.n(B0.o.m(U1.e.class, new U1.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final R1.c f5593p = new R1.c("composerLabel", B0.o.n(B0.o.m(U1.e.class, new U1.a(15))));

    @Override // R1.a
    public final void a(Object obj, Object obj2) {
        C0452d c0452d = (C0452d) obj;
        R1.e eVar = (R1.e) obj2;
        eVar.e(f5579b, c0452d.f5727a);
        eVar.a(f5580c, c0452d.f5728b);
        eVar.a(f5581d, c0452d.f5729c);
        eVar.a(f5582e, c0452d.f5730d);
        eVar.a(f5583f, EnumC0451c.ANDROID);
        eVar.a(f5584g, c0452d.f5731e);
        eVar.a(f5585h, c0452d.f5732f);
        eVar.d(f5586i, 0);
        eVar.d(f5587j, c0452d.f5733g);
        eVar.a(f5588k, c0452d.f5734h);
        eVar.e(f5589l, 0L);
        eVar.a(f5590m, EnumC0449a.MESSAGE_DELIVERED);
        eVar.a(f5591n, c0452d.f5735i);
        eVar.e(f5592o, 0L);
        eVar.a(f5593p, c0452d.f5736j);
    }
}
