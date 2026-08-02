package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: S0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3975o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3969l f25493b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3968k0 f25494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3975o(C3969l c3969l, C3968k0 c3968k0) {
        super(0);
        this.f25493b = c3969l;
        this.f25494c = c3968k0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C3968k0 c3968k0 = this.f25494c;
        C3969l.S(this.f25493b, c3968k0.c(), c3968k0.e(), c3968k0.f());
        return Unit.f71690a;
    }
}
