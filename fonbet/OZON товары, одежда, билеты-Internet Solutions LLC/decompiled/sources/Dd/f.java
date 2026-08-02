package Dd;

import je.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qd.s;
import td.InterfaceC9815F;
import td.p0;

/* loaded from: classes10.dex */
final class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f6575a = new f();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N type;
        InterfaceC9815F module = (InterfaceC9815F) obj;
        int i11 = g.f6578c;
        Intrinsics.checkNotNullParameter(module, "module");
        p0 b11 = b.b(e.d(), module.n().o(s.a.f81920t));
        return (b11 == null || (type = b11.getType()) == null) ? le.l.c(le.k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
