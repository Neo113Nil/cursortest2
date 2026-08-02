package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class T1 extends AbstractC7737t implements Function1<u0.J, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3341s1 f13008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u0.J f13009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T1(C3341s1 c3341s1, u0.J j11) {
        super(1);
        this.f13008b = c3341s1;
        this.f13009c = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(u0.J j11) {
        this.f13008b.e(u0.N.d(this.f13009c, j11));
        return Unit.f71690a;
    }
}
