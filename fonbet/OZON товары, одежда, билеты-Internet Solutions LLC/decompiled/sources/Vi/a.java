package Vi;

import Si.InterfaceC4010a;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a extends i.d<InterfaceC4010a> {
    @Override // androidx.recyclerview.widget.i.d
    public final boolean areContentsTheSame(InterfaceC4010a interfaceC4010a, InterfaceC4010a interfaceC4010a2) {
        InterfaceC4010a oldItem = interfaceC4010a;
        InterfaceC4010a newItem = interfaceC4010a2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public final boolean areItemsTheSame(InterfaceC4010a interfaceC4010a, InterfaceC4010a interfaceC4010a2) {
        InterfaceC4010a oldItem = interfaceC4010a;
        InterfaceC4010a newItem = interfaceC4010a2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }

    @Override // androidx.recyclerview.widget.i.d
    public final Object getChangePayload(InterfaceC4010a interfaceC4010a, InterfaceC4010a interfaceC4010a2) {
        InterfaceC4010a oldItem = interfaceC4010a;
        InterfaceC4010a newItem = interfaceC4010a2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.b(newItem);
    }
}
