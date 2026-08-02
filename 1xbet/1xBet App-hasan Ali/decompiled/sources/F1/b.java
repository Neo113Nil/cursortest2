package F1;

import a3.AbstractC0467k;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import m4.InterfaceC2100c;

/* loaded from: classes.dex */
public final class b implements U {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1522a = new b();

    @Override // androidx.lifecycle.U
    public final S create(Class cls) {
        l.f("modelClass", cls);
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.U
    public final /* synthetic */ S create(Class cls, D1.b bVar) {
        return AbstractC0467k.a(this, cls, bVar);
    }

    @Override // androidx.lifecycle.U
    public final S create(InterfaceC2100c interfaceC2100c, D1.b bVar) {
        return N4.b.q(AbstractC2036a.z(interfaceC2100c));
    }
}
