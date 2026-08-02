package Cd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;
import td.c0;

/* loaded from: classes10.dex */
final class N implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final N f4731a = new N();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int i11 = C2744e.f4754m;
        c0 functionDescriptor = (c0) it;
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Boolean.valueOf(qd.m.V(functionDescriptor) && Zd.e.b(functionDescriptor, new C2743d(functionDescriptor)) != null);
    }
}
