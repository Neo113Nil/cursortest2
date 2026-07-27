package Q4;

import P4.C0124c;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class g implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2508a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f2509b = f.f2505b;

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        AbstractC1341c.c(decoder);
        p pVar = p.f2552a;
        return new e((List) new C0124c().a(decoder));
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC1341c.a(sVar);
        p pVar = p.f2552a;
        new C0124c().b(sVar, value);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2509b;
    }
}
