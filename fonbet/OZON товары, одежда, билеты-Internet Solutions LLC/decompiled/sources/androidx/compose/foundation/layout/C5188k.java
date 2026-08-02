package androidx.compose.foundation.layout;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5188k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f39516b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5192o f39517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5188k(C4912a c4912a, C5192o c5192o) {
        super(2);
        this.f39516b = c4912a;
        this.f39517c = c5192o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f39516b.invoke(this.f39517c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
