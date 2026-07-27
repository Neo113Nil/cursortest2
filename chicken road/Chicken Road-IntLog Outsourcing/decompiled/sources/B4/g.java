package B4;

import f4.v;
import g4.AbstractC0456a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f307b;

    public /* synthetic */ g(int i2, Object obj) {
        this.f306a = i2;
        this.f307b = obj;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        switch (this.f306a) {
            case 0:
                return ((h) this.f307b).d(((Integer) obj).intValue());
            case 1:
                return obj == ((AbstractC0456a) this.f307b) ? "(this Collection)" : String.valueOf(obj);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                m5.n nVar = (m5.n) this.f307b;
                if (booleanValue) {
                    m5.h hVar = nVar.f11250e;
                    if (hVar != null) {
                        hVar.a();
                    }
                } else {
                    nVar.d();
                }
                return v.f5689a;
        }
    }
}
