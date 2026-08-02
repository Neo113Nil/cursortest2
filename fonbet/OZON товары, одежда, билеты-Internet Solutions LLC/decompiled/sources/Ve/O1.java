package Ve;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class O1 extends RecyclerView.y {
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e11, "e");
        return rv.getScrollState() == 1;
    }
}
