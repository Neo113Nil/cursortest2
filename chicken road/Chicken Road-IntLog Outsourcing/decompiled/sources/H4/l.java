package H4;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import D4.X;
import D4.g0;
import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class l implements G4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f1188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0022w f1189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f1190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G4.e f1191d;

    public l(kotlin.jvm.internal.s sVar, InterfaceC0022w interfaceC0022w, n nVar, G4.e eVar) {
        this.f1188a = sVar;
        this.f1189b = interfaceC0022w;
        this.f1190c = nVar;
        this.f1191d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // G4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        k kVar;
        int i2;
        l lVar;
        if (interfaceC1218d instanceof k) {
            kVar = (k) interfaceC1218d;
            int i3 = kVar.f1187e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.f1187e = i3 - Integer.MIN_VALUE;
                Object obj2 = kVar.f1185c;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = kVar.f1187e;
                if (i2 != 0) {
                    e5.g.y(obj2);
                    X x5 = (X) this.f1188a.f10741a;
                    if (x5 != null) {
                        x5.b(new o("Child of the scoped flow was cancelled"));
                        kVar.f1183a = this;
                        kVar.f1184b = obj;
                        kVar.f1187e = 1;
                        if (((g0) x5).K(kVar) == enumC1260a) {
                            return enumC1260a;
                        }
                    }
                    lVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = kVar.f1184b;
                    lVar = kVar.f1183a;
                    e5.g.y(obj2);
                }
                lVar.f1188a.f10741a = AbstractC0024y.n(lVar.f1189b, null, 4, new j(lVar.f1190c, lVar.f1191d, obj, null), 1);
                return f4.v.f5689a;
            }
        }
        kVar = new k(this, interfaceC1218d);
        Object obj22 = kVar.f1185c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = kVar.f1187e;
        if (i2 != 0) {
        }
        lVar.f1188a.f10741a = AbstractC0024y.n(lVar.f1189b, null, 4, new j(lVar.f1190c, lVar.f1191d, obj, null), 1);
        return f4.v.f5689a;
    }
}
