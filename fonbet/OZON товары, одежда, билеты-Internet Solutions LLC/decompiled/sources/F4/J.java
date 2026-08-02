package F4;

import Sc.InterfaceC3999a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public abstract class J<T, VH extends RecyclerView.C> extends RecyclerView.g<VH> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3021a<T> f8812a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<F<T>, F<T>, Unit> f8813b;

    protected J(@NotNull Vi.a diffCallback) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        I i11 = new I(this);
        this.f8813b = i11;
        C3021a<T> c3021a = new C3021a<>(this, diffCallback);
        this.f8812a = c3021a;
        c3021a.a(i11);
    }

    public final F<T> f() {
        return this.f8812a.c();
    }

    public final void g(F f7, Ui.n nVar) {
        this.f8812a.k(f7, nVar);
    }

    protected final T getItem(int i11) {
        return this.f8812a.d(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        F<T> c11 = this.f8812a.c();
        if (c11 == null) {
            return 0;
        }
        return c11.size();
    }
}
