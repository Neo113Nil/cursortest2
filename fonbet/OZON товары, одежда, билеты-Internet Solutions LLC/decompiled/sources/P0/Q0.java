package P0;

import S0.InterfaceC3967k;
import androidx.recyclerview.widget.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Q0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f20763b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f20764c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t0.q f20765d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ k2 f20766e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l1.J0 f20767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(boolean z11, boolean z12, t0.q qVar, k2 k2Var, l1.J0 j02) {
        super(2);
        this.f20763b = z11;
        this.f20764c = z12;
        this.f20765d = qVar;
        this.f20766e = k2Var;
        this.f20767f = j02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            O0.f20735a.a(this.f20763b, this.f20764c, this.f20765d, null, this.f20766e, this.f20767f, 0.0f, 0.0f, interfaceC3967k2, 100663296, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        }
        return Unit.f71690a;
    }
}
