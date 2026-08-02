package w;

import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public int f17236m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f17229e = 2;
        } else {
            this.f17229e = 3;
        }
    }

    @Override // w.e
    public final void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f17231g = i7;
        Iterator it = this.f17234k.iterator();
        while (it.hasNext()) {
            InterfaceC1671d interfaceC1671d = (InterfaceC1671d) it.next();
            interfaceC1671d.a(interfaceC1671d);
        }
    }
}
