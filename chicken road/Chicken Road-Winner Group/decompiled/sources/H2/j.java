package H2;

import d2.C0279i;
import g2.InterfaceC0319c;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class j extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ InterfaceC1241u f524e;
    public final /* synthetic */ l f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I2.d f527i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, l lVar2, I2.d dVar, long j3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = lVar;
        this.f525g = str;
        this.f526h = lVar2;
        this.f527i = dVar;
        this.f528j = j3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        j jVar = new j(this.f, this.f525g, this.f526h, this.f527i, this.f528j, interfaceC0319c);
        jVar.f524e = (InterfaceC1241u) obj;
        return jVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        InterfaceC1241u interfaceC1241u = this.f524e;
        l lVar = this.f;
        p pVar = lVar.f532a;
        String str = this.f525g;
        pVar.c("Now loading ".concat(str));
        int load = lVar.f537g.f539a.load(str, 1);
        lVar.f537g.f540b.put(new Integer(load), this.f526h);
        lVar.f535d = new Integer(load);
        lVar.f532a.c("time to call load() for " + this.f527i + ": " + (System.currentTimeMillis() - this.f528j) + " player=" + interfaceC1241u);
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj);
        C0279i c0279i = C0279i.f4852a;
        jVar.g(c0279i);
        return c0279i;
    }
}
