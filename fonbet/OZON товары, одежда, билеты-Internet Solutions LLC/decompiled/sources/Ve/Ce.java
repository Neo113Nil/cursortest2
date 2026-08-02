package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ce extends AbstractC4425lp {
    @Override // Ve.AbstractC4425lp
    public final Unit e0(E event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof Gm)) {
            return super.e0(event);
        }
        AbstractC4425lp.f0(this, Yl.LC_STATUS_ERROR_VIEW_APPEARED);
        return Unit.f71690a;
    }
}
