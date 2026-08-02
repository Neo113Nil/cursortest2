package Kd;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sd.C9661c;
import td.InterfaceC9842h;

/* loaded from: classes10.dex */
final class d0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f15887a = new d0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9842h p11 = ((K0) obj).H0().p();
        if (p11 == null) {
            return Boolean.FALSE;
        }
        Sd.f name = p11.getName();
        int i11 = C9661c.f98575o;
        return Boolean.valueOf(Intrinsics.d(name, C9661c.e().g()) && Intrinsics.d(Zd.e.c(p11), C9661c.e()));
    }
}
