package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.zd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4814zd extends AbstractC4211ed {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        Vc oldItem = (Vc) obj;
        Vc newItem = (Vc) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.f30192a == newItem.f30192a;
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        Vc oldItem = (Vc) obj;
        Vc newItem = (Vc) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.f30192a == newItem.f30192a;
    }
}
