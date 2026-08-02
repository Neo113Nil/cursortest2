package K1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7786D;

/* renamed from: K1.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3432l extends AbstractC7737t implements Function1<C3437q, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7786D f15062b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f15063c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f15064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3432l(C7786D c7786d, int i11, int i12) {
        super(1);
        this.f15062b = c7786d;
        this.f15063c = i11;
        this.f15064d = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3437q c3437q) {
        C3437q c3437q2 = c3437q;
        C7786D x11 = ((C3421a) c3437q2.e()).x(c3437q2.q(this.f15063c), c3437q2.q(this.f15064d));
        c3437q2.j(x11);
        this.f15062b.v(x11, 0L);
        return Unit.f71690a;
    }
}
