package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5468b implements u {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final RecyclerView.g f44838a;

    public C5468b(@NonNull RecyclerView.g gVar) {
        this.f44838a = gVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void onChanged(int i11, int i12, Object obj) {
        this.f44838a.notifyItemRangeChanged(i11, i12, obj);
    }

    @Override // androidx.recyclerview.widget.u
    public final void onInserted(int i11, int i12) {
        this.f44838a.notifyItemRangeInserted(i11, i12);
    }

    @Override // androidx.recyclerview.widget.u
    public final void onMoved(int i11, int i12) {
        this.f44838a.notifyItemMoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.u
    public final void onRemoved(int i11, int i12) {
        this.f44838a.notifyItemRangeRemoved(i11, i12);
    }
}
