package B0;

import Q1.C3839h;
import Q1.InterfaceC3841j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.w1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2521w1 extends AbstractC7737t implements Function1<I0.T0, InterfaceC3841j> {

    /* renamed from: b, reason: collision with root package name */
    public static final C2521w1 f1997b = new C2521w1(1);

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC3841j invoke(I0.T0 t02) {
        I0.T0 t03 = t02;
        Integer k11 = t03.k();
        if (k11 == null) {
            return null;
        }
        int intValue = k11.intValue();
        long l11 = t03.l();
        int i11 = K1.Q.f15010c;
        return new C3839h(((int) (l11 & 4294967295L)) - intValue, 0);
    }
}
