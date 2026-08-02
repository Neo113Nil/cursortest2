package androidx.compose.ui.platform;

import java.util.Comparator;

/* loaded from: classes8.dex */
public final class C<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B f40610a;

    public C(B b11) {
        this.f40610a = b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        int compare = this.f40610a.compare(t2, t11);
        return compare != 0 ? compare : Vc.a.b(Integer.valueOf(((I1.r) t2).l()), Integer.valueOf(((I1.r) t11).l()));
    }
}
