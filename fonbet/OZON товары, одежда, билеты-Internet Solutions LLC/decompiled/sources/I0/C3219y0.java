package I0;

import java.util.Comparator;

/* renamed from: I0.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3219y0<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.collection.E f11664a;

    public C3219y0(androidx.collection.E e11) {
        this.f11664a = e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        long longValue = ((Number) t2).longValue();
        androidx.collection.E e11 = this.f11664a;
        return Vc.a.b(Integer.valueOf(e11.a(longValue)), Integer.valueOf(e11.a(((Number) t11).longValue())));
    }
}
