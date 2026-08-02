package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class I extends AbstractC7737t implements Function0<Bf0.o> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(J j11) {
        super(0);
        this.f4843b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bf0.o invoke() {
        wf0.a a11 = wf0.c.a();
        J j11 = this.f4843b;
        return new Bf0.o(J.d(j11), a11, J.a(j11), j11.j());
    }
}
