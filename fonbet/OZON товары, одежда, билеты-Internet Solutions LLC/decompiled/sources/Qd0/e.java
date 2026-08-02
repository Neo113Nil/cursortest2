package Qd0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class e extends AbstractC7737t implements Function0<Pd0.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f23321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar) {
        super(0);
        this.f23321b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pd0.b invoke() {
        g gVar = this.f23321b;
        return new Pd0.b(gVar.e(), g.c(gVar), g.a(gVar));
    }
}
