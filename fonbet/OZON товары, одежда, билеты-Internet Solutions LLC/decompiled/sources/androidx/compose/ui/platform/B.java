package androidx.compose.ui.platform;

import java.util.Comparator;

/* loaded from: classes8.dex */
public final class B<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f40606a;

    public B(Comparator comparator, D1.G g10) {
        this.f40606a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        int compare = this.f40606a.compare(t2, t11);
        return compare != 0 ? compare : D1.H.k(((I1.r) t2).n(), ((I1.r) t11).n());
    }
}
