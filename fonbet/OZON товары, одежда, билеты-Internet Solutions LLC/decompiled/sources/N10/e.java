package N10;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class e extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d<RecyclerView.C> f18434a;

    e(d<RecyclerView.C> dVar) {
        this.f18434a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        d.f(this.f18434a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeChanged(int i11, int i12) {
        IntRange intRange = new IntRange(i11, i12 + i11, 1);
        d<RecyclerView.C> dVar = this.f18434a;
        HashSet d11 = ((d) dVar).f18410d.d();
        if (d11 == null || !d11.isEmpty()) {
            Iterator it = d11.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                int f71842a = intRange.getF71842a();
                if (intValue <= intRange.getF71843b() && f71842a <= intValue) {
                    d.f(dVar);
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        d.f(this.f18434a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeMoved(int i11, int i12, int i13) {
        d.f(this.f18434a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeRemoved(int i11, int i12) {
        d.f(this.f18434a);
    }
}
