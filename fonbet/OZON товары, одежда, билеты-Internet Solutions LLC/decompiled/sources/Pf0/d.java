package Pf0;

import J0.u3;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qf0.EnumC9053a;
import u0.InterfaceC9895d;
import vf0.C10315a;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22514b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22515c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22516d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22517e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f22518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, InterfaceC3978p0 interfaceC3978p03, InterfaceC3978p0 interfaceC3978p04, InterfaceC3978p0 interfaceC3978p05) {
        super(3);
        this.f22514b = interfaceC3978p0;
        this.f22515c = interfaceC3978p02;
        this.f22516d = interfaceC3978p03;
        this.f22517e = interfaceC3978p04;
        this.f22518f = interfaceC3978p05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d Block = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(Block, "$this$Block");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Sf0.e.a("Whitelisting status monitoring", null, interfaceC3967k2, 6, 2);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            u3.b("isWhitelisting = " + ((Boolean) this.f22514b.getValue()).booleanValue(), a0.e(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 48, 0, 131068);
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            InterfaceC3978p0 interfaceC3978p0 = this.f22515c;
            String f7 = ((C10315a) interfaceC3978p0.getValue()).f();
            InterfaceC3978p0 interfaceC3978p02 = this.f22516d;
            u3.b("White domain: " + f7 + " (" + ((EnumC9053a) interfaceC3978p02.getValue()) + ")", e11, c.b((EnumC9053a) interfaceC3978p02.getValue()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 48, 0, 131064);
            androidx.compose.ui.e e12 = a0.e(aVar, 1.0f);
            String b11 = ((C10315a) interfaceC3978p0.getValue()).b();
            InterfaceC3978p0 interfaceC3978p03 = this.f22517e;
            u3.b("Gray domain: " + b11 + " (" + ((EnumC9053a) interfaceC3978p03.getValue()) + ")", e12, c.b((EnumC9053a) interfaceC3978p03.getValue()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 48, 0, 131064);
            for (qf0.e eVar : (List) this.f22518f.getValue()) {
                u3.b(eVar.a() + ": статус " + eVar.c() + "; тип сети: " + eVar.b(), a0.e(androidx.compose.ui.e.f40358c0, 1.0f), c.b(eVar.c()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k2, 48, 0, 131064);
            }
        }
        return Unit.f71690a;
    }
}
