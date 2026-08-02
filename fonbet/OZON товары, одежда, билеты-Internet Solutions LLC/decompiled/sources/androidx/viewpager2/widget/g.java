package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
final class g implements RecyclerView.q {
    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void onChildViewAttachedToWindow(@NonNull View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) pVar).width != -1 || ((ViewGroup.MarginLayoutParams) pVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void onChildViewDetachedFromWindow(@NonNull View view) {
    }
}
