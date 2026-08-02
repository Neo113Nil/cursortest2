package C10;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4317a;

    b(c cVar) {
        this.f4317a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        this.f4317a.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeChanged(int i11, int i12) {
        c.i(this.f4317a, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        c.i(this.f4317a, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeMoved(int i11, int i12, int i13) {
        int j11;
        c cVar = this.f4317a;
        j11 = cVar.j();
        if (i11 <= j11 || i12 <= j11) {
            cVar.invalidateItemDecorations();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeRemoved(int i11, int i12) {
        c.i(this.f4317a, i11);
    }
}
