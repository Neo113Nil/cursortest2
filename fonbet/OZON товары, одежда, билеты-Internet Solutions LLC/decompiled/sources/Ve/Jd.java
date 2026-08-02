package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Jd extends AbstractC4211ed {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        Zb oldItem = (Zb) obj;
        Zb newItem = (Zb) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.f30581b, newItem.f30581b);
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        Zb oldItem = (Zb) obj;
        Zb newItem = (Zb) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.f30581b, newItem.f30581b);
    }
}
