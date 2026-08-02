package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Ed extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ed(Object obj, int i11) {
        super(0);
        this.f28923b = i11;
        this.f28924c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28923b) {
            case 0:
                C4531pf c4531pf = (C4531pf) this.f28924c;
                c4531pf.getClass();
                C10727i.c(androidx.lifecycle.x0.a(c4531pf), null, null, new Me(c4531pf, null), 3);
                return Unit.f71690a;
            default:
                return ((C4654tn) ((Vm) this.f28924c)).f32129F;
        }
    }
}
