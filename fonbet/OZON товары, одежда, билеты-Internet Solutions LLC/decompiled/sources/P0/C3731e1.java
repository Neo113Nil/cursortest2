package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3731e1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f21012b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f21013c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f21014d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f21015e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f21016f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q0.g f21017g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f21018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3731e1(int i11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, Q0.g gVar, C4912a c4912a5) {
        super(2);
        this.f21012b = i11;
        this.f21013c = c4912a;
        this.f21014d = c4912a2;
        this.f21015e = c4912a3;
        this.f21016f = c4912a4;
        this.f21017g = gVar;
        this.f21018h = c4912a5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3752l1.b(this.f21012b, this.f21013c, this.f21014d, this.f21015e, this.f21016f, this.f21017g, this.f21018h, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
