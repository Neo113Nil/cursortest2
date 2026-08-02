package Ve;

import B0.C2454a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4757xc extends AbstractC4425lp {

    /* renamed from: f, reason: collision with root package name */
    public final Fh f32483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4757xc(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib spayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(spayStorage, "spayStorage");
        this.f32483f = ((C4673ud) spayStorage).a();
    }

    @Override // Ve.AbstractC4425lp
    public final Unit e0(E event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof Gm)) {
            return super.e0(event);
        }
        AbstractC4245fi abstractC4245fi = this.f32483f.f29004a;
        Sm sm2 = abstractC4245fi instanceof Sm ? (Sm) abstractC4245fi : null;
        String str = sm2 != null ? sm2.f29991a : null;
        Yl action = Yl.LC_STATUS_ERROR_VIEW_APPEARED;
        Intrinsics.checkNotNullParameter(action, "action");
        Bi event2 = new Bi(action, Ur.STATUS_VIEW, Pe.LC, str != null ? C2454a.b("Error", str) : null, null, null, null, 112);
        Intrinsics.checkNotNullParameter(event2, "event");
        this.f30497a.b(event2);
        return Unit.f71690a;
    }
}
