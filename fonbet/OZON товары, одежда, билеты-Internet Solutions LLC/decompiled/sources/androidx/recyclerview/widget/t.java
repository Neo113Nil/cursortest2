package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C5469c;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t<T, VH extends RecyclerView.C> extends RecyclerView.g<VH> {
    final C5470d<T> mDiffer;
    private final C5470d.b<T> mListener;

    final class a implements C5470d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.C5470d.b
        public final void a(@NonNull List<T> list, @NonNull List<T> list2) {
            t.this.onCurrentListChanged(list, list2);
        }
    }

    protected t(@NonNull i.d<T> dVar) {
        a aVar = new a();
        this.mListener = aVar;
        C5470d<T> c5470d = new C5470d<>(new C5468b(this), new C5469c.a(dVar).a());
        this.mDiffer = c5470d;
        c5470d.a(aVar);
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.mDiffer.b();
    }

    protected T getItem(int i11) {
        return this.mDiffer.b().get(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.mDiffer.b().size();
    }

    public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
    }

    public void submitList(List<T> list) {
        this.mDiffer.e(list, null);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.e(list, runnable);
    }
}
