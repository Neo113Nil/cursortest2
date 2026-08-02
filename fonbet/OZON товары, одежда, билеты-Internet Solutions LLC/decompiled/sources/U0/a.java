package U0;

import S0.A0;
import android.util.SparseArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a<E> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SparseArray<E> f27241a = new SparseArray<>(10);

    public a(int i11) {
    }

    public final E a(int i11) {
        return this.f27241a.get(i11);
    }

    public final void b(int i11, A0 a02) {
        this.f27241a.put(i11, a02);
    }
}
