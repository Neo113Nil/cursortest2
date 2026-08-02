package A10;

import a20.C4923b;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {
    public static final boolean a(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.g adapter = recyclerView.getAdapter();
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return false;
        }
        return c8042d.b(0) instanceof C4923b;
    }
}
