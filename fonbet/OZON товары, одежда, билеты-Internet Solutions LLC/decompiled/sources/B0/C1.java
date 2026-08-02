package B0;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class C1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1348b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1349c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.K f1350d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f1351e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f1352f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.D f1353g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ f2 f1354h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<Q1.K, Unit> f1355i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f1356j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C1(O0 o02, I0.W0 w02, Q1.K k11, boolean z11, boolean z12, Q1.D d11, f2 f2Var, Function1<? super Q1.K, Unit> function1, int i11) {
        super(3);
        this.f1348b = o02;
        this.f1349c = w02;
        this.f1350d = k11;
        this.f1351e = z11;
        this.f1352f = z12;
        this.f1353g = d11;
        this.f1354h = f2Var;
        this.f1355i = function1;
        this.f1356j = i11;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(851809892);
        Object C11 = interfaceC3967k2.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new I0.i1();
            interfaceC3967k2.x(C11);
        }
        I0.i1 i1Var = (I0.i1) C11;
        Object C12 = interfaceC3967k2.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new C2520w0();
            interfaceC3967k2.x(C12);
        }
        Function1<Q1.K, Unit> function1 = this.f1355i;
        O0 o02 = this.f1348b;
        I0.W0 w02 = this.f1349c;
        f2 f2Var = this.f1354h;
        A1 a12 = new A1(o02, w02, this.f1350d, this.f1351e, this.f1352f, i1Var, this.f1353g, f2Var, (C2520w0) C12, function1, this.f1356j);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        boolean F11 = interfaceC3967k2.F(a12);
        Object C13 = interfaceC3967k2.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            B1 b12 = new B1(1, a12, A1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            interfaceC3967k2.x(b12);
            C13 = b12;
        }
        androidx.compose.ui.e a11 = androidx.compose.ui.input.key.a.a(aVar, (Function1) ((kotlin.reflect.h) C13));
        interfaceC3967k2.k();
        return a11;
    }
}
