package Qh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function1<Void, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f23449b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f23450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, j jVar) {
        super(1);
        this.f23449b = hVar;
        this.f23450c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Void r22) {
        h.c(this.f23449b, this.f23450c);
        return Unit.f71690a;
    }
}
