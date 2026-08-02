package QZ;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;
import n20.k;
import ru.ozon.composer.ui.widget.o;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function0<I00.c<C7854a>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a<C7854a> f23180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(a<C7854a> aVar) {
        super(0);
        this.f23180b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final I00.c<C7854a> invoke() {
        k kVar;
        K00.a aVar;
        k kVar2;
        f10.b bVar;
        a<C7854a> aVar2 = this.f23180b;
        kVar = ((a) aVar2).f23141c;
        aVar = ((a) aVar2).f23140b;
        kVar2 = ((a) aVar2).f23141c;
        P00.d c11 = aVar.c(kVar2);
        bVar = ((a) aVar2).f23142d;
        return new I00.c<>(kVar, c11, ((o) bVar).a(null));
    }
}
