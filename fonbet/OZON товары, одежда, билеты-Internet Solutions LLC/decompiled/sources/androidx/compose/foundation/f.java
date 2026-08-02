package androidx.compose.foundation;

import D1.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;
import l1.AbstractC7839p0;
import l1.J0;

/* loaded from: classes.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<AbstractC7839p0> f38928b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f38929c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ J f38930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(M m11, g gVar, J j11) {
        super(0);
        this.f38928b = m11;
        this.f38929c = gVar;
        this.f38930d = j11;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, l1.p0] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        J0 shape = this.f38929c.getShape();
        J j11 = this.f38930d;
        this.f38928b.f71787a = shape.mo1createOutlinePq9zytI(j11.i(), j11.getLayoutDirection(), j11);
        return Unit.f71690a;
    }
}
