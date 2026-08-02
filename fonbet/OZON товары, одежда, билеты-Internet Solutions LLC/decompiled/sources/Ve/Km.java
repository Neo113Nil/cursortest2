package Ve;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Km extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4394kn f29364a;

    public Km(C4394kn c4394kn) {
        this.f29364a = c4394kn;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        Jl jl;
        View b11;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i11);
        C4394kn c4394kn = this.f29364a;
        c4394kn.getClass();
        if (i11 == 0 && (jl = c4394kn.f31466j) != null && c4394kn.f31460d) {
            int i12 = c4394kn.f31459c;
            if (i12 != -1) {
                jl.a(i12);
            } else {
                RecyclerView recyclerView2 = c4394kn.f31467k;
                Intrinsics.f(recyclerView2);
                RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null && (b11 = c4394kn.b(layoutManager, false)) != null) {
                    RecyclerView recyclerView3 = c4394kn.f31467k;
                    Intrinsics.f(recyclerView3);
                    int childAdapterPosition = recyclerView3.getChildAdapterPosition(b11);
                    if (childAdapterPosition != -1) {
                        Intrinsics.f(jl);
                        jl.a(childAdapterPosition);
                    }
                }
            }
        }
        c4394kn.f31460d = i11 != 0;
    }
}
