package A10;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes7.dex */
public final class e {
    @NotNull
    public static final d a(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Object tag = recyclerView.getTag(R.id.tag_recycler_invalidate_decoration_helper);
        d dVar = tag instanceof d ? (d) tag : null;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(recyclerView);
        recyclerView.setTag(R.id.tag_recycler_invalidate_decoration_helper, dVar2);
        return dVar2;
    }
}
