package C10;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class e extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f4324a;

    /* renamed from: b, reason: collision with root package name */
    private A10.d f4325b;

    public abstract int a();

    protected final RecyclerView b() {
        return this.f4324a;
    }

    public abstract int c();

    public abstract void d(int i11);

    protected final void e(RecyclerView recyclerView) {
        if (!Intrinsics.d(this.f4324a, recyclerView)) {
            this.f4325b = recyclerView != null ? A10.e.a(recyclerView) : null;
        }
        this.f4324a = recyclerView;
    }

    public abstract void f(int i11);

    public abstract void g(int i11);

    protected final void invalidateItemDecorations() {
        A10.d dVar = this.f4325b;
        if (dVar != null) {
            dVar.c();
        }
    }
}
