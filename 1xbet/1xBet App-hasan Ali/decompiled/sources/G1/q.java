package G1;

import a3.AbstractC0467k;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import k4.AbstractC2036a;
import m4.InterfaceC2100c;

/* loaded from: classes.dex */
public class q implements U {

    /* renamed from: b, reason: collision with root package name */
    public static q f1930b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1931a;

    public /* synthetic */ q(int i) {
        this.f1931a = i;
    }

    @Override // androidx.lifecycle.U
    public S create(Class cls) {
        switch (this.f1931a) {
            case 0:
                kotlin.jvm.internal.l.f("modelClass", cls);
                return new r();
            case 1:
                kotlin.jvm.internal.l.f("modelClass", cls);
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                kotlin.jvm.internal.l.f("modelClass", cls);
                return N4.b.q(cls);
        }
    }

    @Override // androidx.lifecycle.U
    public S create(Class cls, D1.b bVar) {
        switch (this.f1931a) {
            case 0:
                return AbstractC0467k.a(this, cls, bVar);
            case 1:
                return AbstractC0467k.a(this, cls, bVar);
            default:
                kotlin.jvm.internal.l.f("extras", bVar);
                return create(cls);
        }
    }

    @Override // androidx.lifecycle.U
    public final S create(InterfaceC2100c interfaceC2100c, D1.b bVar) {
        switch (this.f1931a) {
            case 0:
                return AbstractC0467k.b(this, interfaceC2100c, bVar);
            case 1:
                return new androidx.lifecycle.N();
            default:
                return create(AbstractC2036a.z(interfaceC2100c), bVar);
        }
    }
}
