package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import nm0.C8610E;
import nm0.C8613c;

/* loaded from: classes10.dex */
public final class F0 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(Object obj, int i11) {
        super(0);
        this.f28955b = i11;
        this.f28956c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28955b) {
            case 0:
                ((Z2) this.f28956c).f30543l.setValue(-1L);
                return Unit.f71690a;
            default:
                C8613c c8613c = (C8613c) this.f28956c;
                return new nm0.p((nm0.u) c8613c.f77390c.getValue(), (C8610E) c8613c.f77393f.getValue());
        }
    }
}
