package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;
import xe.C10727i;

/* loaded from: classes8.dex */
final class W extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f20878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f20879c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f20880d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(C3787x1 c3787x1, xe.M m11, C7980b<Float, C8008p> c7980b, Function0<Unit> function0) {
        super(0);
        this.f20878b = c3787x1;
        this.f20879c = m11;
        this.f20880d = c7980b;
        this.f20881e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C3787x1 c3787x1 = this.f20878b;
        EnumC3790y1 d11 = c3787x1.d();
        EnumC3790y1 enumC3790y1 = EnumC3790y1.Expanded;
        xe.M m11 = this.f20879c;
        if (d11 == enumC3790y1 && c3787x1.f()) {
            C10727i.c(m11, null, null, new S(this.f20880d, null), 3);
            C10727i.c(m11, null, null, new T(c3787x1, null), 3);
        } else {
            ((xe.H0) C10727i.c(m11, null, null, new U(c3787x1, null), 3)).y(new V(this.f20881e));
        }
        return Unit.f71690a;
    }
}
