package Ql0;

import De.C2862e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;
import yl0.C10923h;

/* loaded from: classes4.dex */
public final class g extends AbstractC7737t implements Function1<C10923h<Unit>.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2862e f23809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f23810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C2862e c2862e, j jVar) {
        super(1);
        this.f23809b = c2862e;
        this.f23810c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10923h<Unit>.a aVar) {
        C10923h<Unit>.a create = aVar;
        Intrinsics.checkNotNullParameter(create, "$this$create");
        C10727i.c(this.f23809b, null, null, new k(create, null, this.f23810c), 3);
        return Unit.f71690a;
    }
}
