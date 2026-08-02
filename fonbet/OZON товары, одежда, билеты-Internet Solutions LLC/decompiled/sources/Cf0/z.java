package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class z extends AbstractC7737t implements Function0<Yf0.h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(J j11) {
        super(0);
        this.f4951b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Yf0.h invoke() {
        Ld0.c cVar;
        cVar = this.f4951b.f4844a;
        return new Yf0.h(cVar.c().a());
    }
}
