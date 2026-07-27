package H4;

import a.AbstractC0169a;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: e, reason: collision with root package name */
    public final G4.o f1196e;

    public n(G4.o oVar, G4.d dVar, InterfaceC1223i interfaceC1223i, int i2, int i3) {
        super(dVar, interfaceC1223i, i2, i3);
        this.f1196e = oVar;
    }

    @Override // H4.f
    public final f c(InterfaceC1223i interfaceC1223i, int i2, int i3) {
        return new n(this.f1196e, this.f1178d, interfaceC1223i, i2, i3);
    }

    @Override // H4.h
    public final Object d(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        m mVar = new m(this, eVar, null);
        I4.t tVar = new I4.t(interfaceC1218d, interfaceC1218d.getContext());
        Object G5 = AbstractC0169a.G(tVar, tVar, mVar);
        return G5 == EnumC1260a.f11058a ? G5 : f4.v.f5689a;
    }
}
