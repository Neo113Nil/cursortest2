package androidx.compose.ui.tooling;

import S0.InterfaceC3972m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3972m0 f41123b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object[] f41124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(InterfaceC3972m0 interfaceC3972m0, Object[] objArr) {
        super(0);
        this.f41123b = interfaceC3972m0;
        this.f41124c = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC3972m0 interfaceC3972m0 = this.f41123b;
        interfaceC3972m0.d((interfaceC3972m0.getIntValue() + 1) % this.f41124c.length);
        return Unit.f71690a;
    }
}
