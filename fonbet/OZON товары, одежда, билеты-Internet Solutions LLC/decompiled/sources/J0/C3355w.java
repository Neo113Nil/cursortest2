package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3355w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f13457a = new C4912a(false, 996639038, a.f13458b);

    /* renamed from: J0.w$a */
    static final class a extends AbstractC7737t implements InterfaceC6511n<InterfaceC3295g2, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13458b = new a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC3295g2 interfaceC3295g2, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3295g2 interfaceC3295g22 = interfaceC3295g2;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= (intValue & 8) == 0 ? interfaceC3967k2.n(interfaceC3295g22) : interfaceC3967k2.F(interfaceC3295g22) ? 4 : 2;
            }
            if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                J2.b(interfaceC3295g22, null, null, 0L, 0L, 0L, 0.0f, interfaceC3967k2, intValue & 14);
            }
            return Unit.f71690a;
        }
    }
}
