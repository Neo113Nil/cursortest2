package Gh;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: Gh.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3121a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f10245a = new C4912a(false, -149834475, C0209a.f10246b);

    /* renamed from: Gh.a$a, reason: collision with other inner class name */
    static final class C0209a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0209a f10246b = new C0209a(2);

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
