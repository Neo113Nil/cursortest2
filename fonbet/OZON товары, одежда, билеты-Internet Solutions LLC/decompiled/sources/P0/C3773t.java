package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: P0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3773t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f21353a = new C4912a(false, -505750804, a.f21354b);

    /* renamed from: P0.t$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21354b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                E.b(M0.b.a(), Q0.j.a(interfaceC3967k2, R.string.m3c_snackbar_dismiss), null, 0L, interfaceC3967k2, 0, 12);
            }
            return Unit.f71690a;
        }
    }
}
