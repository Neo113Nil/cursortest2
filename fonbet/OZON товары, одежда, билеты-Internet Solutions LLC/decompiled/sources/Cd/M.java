package Cd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* loaded from: classes10.dex */
final class M implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M f4730a = new M();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(C2751l.b(Zd.e.l(it)));
    }
}
