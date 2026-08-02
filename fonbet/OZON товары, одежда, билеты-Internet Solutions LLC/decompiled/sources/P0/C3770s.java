package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3770s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f21342a = new C4912a(false, 818736383, a.f21343b);

    /* renamed from: P0.s$a */
    static final class a extends AbstractC7737t implements InterfaceC6511n<InterfaceC3793z1, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21343b = new a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC3793z1 interfaceC3793z1, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3793z1 interfaceC3793z12 = interfaceC3793z1;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= interfaceC3967k2.n(interfaceC3793z12) ? 4 : 2;
            }
            if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                b2.b(interfaceC3793z12, null, null, 0L, 0L, 0L, 0L, 0L, interfaceC3967k2, intValue & 14);
            }
            return Unit.f71690a;
        }
    }
}
