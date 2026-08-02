package Vd;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9835a;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
final class f implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9835a f28540a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9835a f28541b;

    public f(InterfaceC9835a interfaceC9835a, InterfaceC9835a interfaceC9835a2) {
        this.f28540a = interfaceC9835a;
        this.f28541b = interfaceC9835a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.d((InterfaceC9845k) obj, this.f28540a) && Intrinsics.d((InterfaceC9845k) obj2, this.f28541b));
    }
}
