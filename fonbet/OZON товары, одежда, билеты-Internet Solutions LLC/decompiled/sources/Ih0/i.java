package Ih0;

import Wh0.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f12539b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Wh0.d<Integer> f12540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(n nVar, Wh0.d<Integer> dVar) {
        super(0);
        this.f12539b = nVar;
        this.f12540c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String name = this.f12539b.name();
        Wh0.d<Integer> dVar = this.f12540c;
        d.a aVar = dVar instanceof d.a ? (d.a) dVar : null;
        return "failed to send events from " + name + " because of " + (aVar != null ? aVar.a() : null);
    }
}
