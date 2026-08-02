package J10;

import A00.a;
import androidx.core.view.C5353y0;
import h10.AbstractC6779a;
import i10.C6997c;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class b extends AbstractC6779a<l, a> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b() {
        super(a.a(insets));
        C5353y0 insets = C5353y0.f42353b;
        Intrinsics.checkNotNullExpressionValue(insets, "CONSUMED");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }

    @Override // h10.AbstractC6779a
    public final a d(A00.a event, C6997c<l> state, a aVar) {
        C5353y0 insets = aVar.b();
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(insets, "additionalState");
        if (event instanceof a.C2363d) {
            insets = ((a.C2363d) event).d();
            Intrinsics.checkNotNullParameter(insets, "insets");
        }
        return a.a(insets);
    }
}
