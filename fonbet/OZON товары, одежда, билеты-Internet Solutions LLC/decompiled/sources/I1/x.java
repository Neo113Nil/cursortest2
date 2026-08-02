package I1;

import Sc.InterfaceC4003e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
public final class x extends AbstractC7737t implements Function2<C3222a<InterfaceC4003e<? extends Boolean>>, C3222a<InterfaceC4003e<? extends Boolean>>, C3222a<InterfaceC4003e<? extends Boolean>>> {

    /* renamed from: b, reason: collision with root package name */
    public static final x f11790b = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final C3222a<InterfaceC4003e<? extends Boolean>> invoke(C3222a<InterfaceC4003e<? extends Boolean>> c3222a, C3222a<InterfaceC4003e<? extends Boolean>> c3222a2) {
        String b11;
        InterfaceC4003e<? extends Boolean> a11;
        C3222a<InterfaceC4003e<? extends Boolean>> c3222a3 = c3222a;
        C3222a<InterfaceC4003e<? extends Boolean>> c3222a4 = c3222a2;
        if (c3222a3 == null || (b11 = c3222a3.b()) == null) {
            b11 = c3222a4.b();
        }
        if (c3222a3 == null || (a11 = c3222a3.a()) == null) {
            a11 = c3222a4.a();
        }
        return new C3222a<>(b11, a11);
    }
}
