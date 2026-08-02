package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import xe.L0;

/* loaded from: classes8.dex */
final class F0 extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L0 f43200b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f43201c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ G0 f43202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F0(L0 l02, AbstractC5434v abstractC5434v, G0 g02) {
        super(1);
        this.f43200b = l02;
        this.f43201c = abstractC5434v;
        this.f43202d = g02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        L0 l02 = this.f43200b;
        boolean t2 = l02.t(gVar);
        G0 g02 = this.f43202d;
        AbstractC5434v abstractC5434v = this.f43201c;
        if (t2) {
            l02.q(gVar, new E0(abstractC5434v, g02));
        } else {
            abstractC5434v.e(g02);
        }
        return Unit.f71690a;
    }
}
