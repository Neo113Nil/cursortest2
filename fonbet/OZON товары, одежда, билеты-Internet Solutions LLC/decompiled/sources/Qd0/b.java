package Qd0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function0<Pd0.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f23318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(g gVar) {
        super(0);
        this.f23318b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pd0.e invoke() {
        g gVar = this.f23318b;
        return new Pd0.e(g.a(gVar), gVar.f());
    }
}
