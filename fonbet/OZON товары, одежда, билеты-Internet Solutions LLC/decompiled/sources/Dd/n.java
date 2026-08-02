package Dd;

import Jd.InterfaceC3392b;
import Xd.C4885b;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;

/* loaded from: classes10.dex */
final class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final o f6587a;

    public n(o oVar) {
        this.f6587a = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4885b c4885b;
        o oVar = this.f6587a;
        InterfaceC3392b f7 = oVar.f();
        if (f7 instanceof Jd.e) {
            int i11 = g.f6578c;
            c4885b = g.b(((Jd.e) oVar.f()).b());
        } else if (f7 instanceof Jd.m) {
            int i12 = g.f6578c;
            c4885b = g.b(C7714v.a0(oVar.f()));
        } else {
            c4885b = null;
        }
        Map i13 = c4885b != null ? U.i(new Pair(e.d(), c4885b)) : null;
        return i13 == null ? U.c() : i13;
    }
}
