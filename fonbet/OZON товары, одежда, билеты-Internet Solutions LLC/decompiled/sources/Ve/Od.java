package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Od extends Kp {
    @Override // Ve.Kp
    public final Integer a(Object obj) {
        C4789yg c4789yg = (C4789yg) obj;
        Intrinsics.checkNotNullParameter(c4789yg, "<this>");
        return Integer.valueOf(c4789yg.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        String str;
        Cif cif = (Cif) aVar;
        C4789yg item = (C4789yg) obj;
        Intrinsics.checkNotNullParameter(cif, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        SPayTextView sPayTextView = cif.f31292b;
        Sr sr = item.f32571a;
        Context context = cif.f31291a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "root.context");
        sPayTextView.setText(E.f(sr, context));
        SPayTextView spaySloTvOldAmount = cif.f31293c;
        Intrinsics.checkNotNullExpressionValue(spaySloTvOldAmount, "spaySloTvOldAmount");
        Intrinsics.checkNotNullParameter(spaySloTvOldAmount, "<this>");
        Sr sr2 = item.f32573c;
        if (sr2 != null) {
            Context context2 = spaySloTvOldAmount.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            str = E.f(sr2, context2);
        } else {
            str = null;
        }
        spaySloTvOldAmount.setVisibility(str != null ? 0 : 8);
        spaySloTvOldAmount.setText(str);
        spaySloTvOldAmount.setPaintFlags(16);
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof C4789yg;
    }
}
