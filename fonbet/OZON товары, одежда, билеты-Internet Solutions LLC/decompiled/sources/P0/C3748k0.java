package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3748k0 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f21136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3748k0(String str) {
        super(1);
        this.f21136b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.o(d12, this.f21136b);
        I1.z.y(d12, 0.0f);
        return Unit.f71690a;
    }
}
