package P4;

import java.util.Iterator;

/* renamed from: P4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0134m extends AbstractC0122a {

    /* renamed from: a, reason: collision with root package name */
    public final M4.a f2384a;

    public AbstractC0134m(M4.a aVar) {
        this.f2384a = aVar;
    }

    @Override // M4.a
    public void b(R4.s sVar, Object obj) {
        int g6 = g(obj);
        N4.e descriptor = c();
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        R4.s a6 = sVar.a(descriptor);
        Iterator f3 = f(obj);
        for (int i2 = 0; i2 < g6; i2++) {
            a6.l(c(), i2, this.f2384a, f3.next());
        }
        a6.p(descriptor);
    }

    @Override // P4.AbstractC0122a
    public void i(O4.a aVar, int i2, Object obj, boolean z) {
        l(obj, i2, aVar.b(c(), i2, this.f2384a, null));
    }

    public abstract void l(Object obj, int i2, Object obj2);
}
