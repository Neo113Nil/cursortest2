package Qd0;

import Pd0.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function0<i> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f23320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar) {
        super(0);
        this.f23320b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final i invoke() {
        g gVar = this.f23320b;
        return new i(gVar.e(), g.b(gVar).c(), new Rd0.c(gVar));
    }
}
