package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3765q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f21304a = new C4912a(false, -91331245, a.f21305b);

    /* renamed from: P0.q$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21305b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            }
            return Unit.f71690a;
        }
    }
}
