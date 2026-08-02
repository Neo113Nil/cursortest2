package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.wf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4732wf extends Kp {
    @Override // Ve.Kp
    public final Integer a(Object obj) {
        C4548q3 c4548q3 = (C4548q3) obj;
        Intrinsics.checkNotNullParameter(c4548q3, "<this>");
        return Integer.valueOf(c4548q3.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        C4557qc c4557qc = (C4557qc) aVar;
        C4548q3 item = (C4548q3) obj;
        Intrinsics.checkNotNullParameter(c4557qc, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = c4557qc.f31854a.getContext();
        Pq pq = item.f31839a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        c4557qc.f31855b.setText(E.f(pq, context));
        c4557qc.f31856c.setText(E.f(item.f31840b, context));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof C4548q3;
    }
}
