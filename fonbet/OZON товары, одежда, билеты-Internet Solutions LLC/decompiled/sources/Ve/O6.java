package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class O6 extends Kp {
    @Override // Ve.Kp
    public final Integer a(Object obj) {
        Cl cl = (Cl) obj;
        Intrinsics.checkNotNullParameter(cl, "<this>");
        return Integer.valueOf(cl.f28774a.hashCode());
    }

    @Override // Ve.Kp
    public final void b(X4.a aVar, Object obj) {
        C4730wd c4730wd = (C4730wd) aVar;
        Cl item = (Cl) obj;
        Intrinsics.checkNotNullParameter(c4730wd, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = c4730wd.f32364c.getContext();
        Pq pq = item.f28774a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        c4730wd.f32363b.setText(E.f(pq, context));
    }

    @Override // Ve.Kp
    public final boolean c(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item instanceof Cl;
    }
}
