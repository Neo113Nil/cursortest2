package Zc0;

import Yc0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f35845b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.b f35846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, a.b bVar) {
        super(0);
        this.f35845b = nVar;
        this.f35846c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        q A11;
        A11 = this.f35845b.A();
        a.b bVar = this.f35846c;
        A11.y0(bVar.c(), bVar.a());
        return Unit.f71690a;
    }
}
