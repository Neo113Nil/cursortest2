package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3792z0 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f21441b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3792z0(String str, Function0<Unit> function0) {
        super(1);
        this.f21441b = str;
        this.f21442c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.y(d12, 1.0f);
        I1.z.i(d12, this.f21441b);
        I1.z.e(d12, new C3789y0(this.f21442c));
        return Unit.f71690a;
    }
}
