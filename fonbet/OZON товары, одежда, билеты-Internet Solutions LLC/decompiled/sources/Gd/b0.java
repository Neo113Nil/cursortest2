package Gd;

import kotlin.jvm.functions.Function1;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* loaded from: classes10.dex */
final class b0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f10011a = new b0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = d0.f10016p;
        InterfaceC9842h p11 = ((je.N) obj).H0().p();
        if (p11 instanceof InterfaceC9839e) {
            return (InterfaceC9839e) p11;
        }
        return null;
    }
}
