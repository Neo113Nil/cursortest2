package I10;

import A00.a;
import h10.AbstractC6779a;
import i10.C6997c;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class a extends AbstractC6779a<l, c> {
    public a() {
        super(c.a(0));
    }

    @Override // h10.AbstractC6779a
    public final c d(A00.a event, C6997c<l> state, c cVar) {
        int b11 = cVar.b();
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        a.F f7 = event instanceof a.F ? (a.F) event : null;
        if (f7 != null) {
            b11 = f7.e() > 0 ? f7.e() : 0;
        }
        return c.a(b11);
    }
}
