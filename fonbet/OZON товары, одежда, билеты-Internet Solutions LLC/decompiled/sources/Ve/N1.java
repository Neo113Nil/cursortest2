package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class N1 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4599rq f29515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N1(AbstractC4599rq abstractC4599rq, int i11) {
        super(1);
        this.f29514b = i11;
        this.f29515c = abstractC4599rq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29514b) {
            case 0:
                ((R5) this.f29515c).f29825e = ((Number) obj).longValue();
                break;
            default:
                ((Z2) this.f29515c).f30547p.invoke(Long.valueOf(((Number) obj).longValue()));
                break;
        }
        return Unit.f71690a;
    }
}
