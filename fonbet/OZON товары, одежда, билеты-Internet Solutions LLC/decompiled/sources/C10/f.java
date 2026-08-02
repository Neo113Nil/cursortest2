package C10;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class f extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f4326a;

    f(g gVar) {
        this.f4326a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        g.a(this.f4326a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeChanged(int i11, int i12) {
        g.a(this.f4326a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        g.a(this.f4326a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeMoved(int i11, int i12, int i13) {
        g.a(this.f4326a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeRemoved(int i11, int i12) {
        g.a(this.f4326a);
    }
}
