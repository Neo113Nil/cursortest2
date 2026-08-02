package H30;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r {
    public static final void a(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.C c11 = itemAnimator instanceof androidx.recyclerview.widget.C ? (androidx.recyclerview.widget.C) itemAnimator : null;
        if (c11 != null) {
            c11.setSupportsChangeAnimations(false);
        }
    }
}
