package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: P0.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3736g0 extends AbstractC7737t implements Function1<Float, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xe.M f21042b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21043c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3736g0(C3787x1 c3787x1, Function0 function0, xe.M m11) {
        super(1);
        this.f21042b = m11;
        this.f21043c = c3787x1;
        this.f21044d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f7) {
        float floatValue = f7.floatValue();
        C3787x1 c3787x1 = this.f21043c;
        ((xe.H0) C10727i.c(this.f21042b, null, null, new C3730e0(c3787x1, floatValue, null), 3)).y(new C3733f0(c3787x1, this.f21044d));
        return Unit.f71690a;
    }
}
