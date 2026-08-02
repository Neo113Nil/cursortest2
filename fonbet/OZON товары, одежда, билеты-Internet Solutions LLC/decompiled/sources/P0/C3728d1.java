package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9892a;

/* renamed from: P0.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3728d1 extends AbstractC7737t implements Function1<u0.J, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q0.g f21001b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9892a f21002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3728d1(Q0.g gVar, C9892a c9892a) {
        super(1);
        this.f21001b = gVar;
        this.f21002c = c9892a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(u0.J j11) {
        this.f21001b.e(u0.N.d(this.f21002c, j11));
        return Unit.f71690a;
    }
}
