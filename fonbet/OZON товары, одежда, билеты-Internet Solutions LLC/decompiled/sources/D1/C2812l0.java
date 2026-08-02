package D1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7802U;

/* renamed from: D1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2812l0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0 f5522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7802U f5523c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o1.d f5524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2812l0(AbstractC2810k0 abstractC2810k0, InterfaceC7802U interfaceC7802U, o1.d dVar) {
        super(0);
        this.f5522b = abstractC2810k0;
        this.f5523c = interfaceC7802U;
        this.f5524d = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f5522b.U1(this.f5523c, this.f5524d);
        return Unit.f71690a;
    }
}
