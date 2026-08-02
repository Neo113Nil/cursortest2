package Ve;

import E0.C2942q;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.oe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4501oe extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f31726a;

    public C4501oe(int i11) {
        this.f31726a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.g a12 = C2942q.a(recyclerView, "parent", a11, "s");
        if (a12 != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            rect.right = (childAdapterPosition == -1 || childAdapterPosition == a12.getItemCount() + (-1)) ? 0 : this.f31726a;
        }
    }
}
