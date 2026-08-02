package W0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T[] f33178c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final k<T> f33179d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Object[] objArr, int i11, @NotNull Object[] objArr2, int i12, int i13) {
        super(i11, i12);
        this.f33178c = objArr2;
        int i14 = (i12 - 1) & (-32);
        this.f33179d = new k<>(objArr, i11 > i14 ? i14 : i11, i14, i13);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k<T> kVar = this.f33179d;
        if (kVar.hasNext()) {
            e(b() + 1);
            return kVar.next();
        }
        int b11 = b();
        e(b11 + 1);
        return this.f33178c[b11 - kVar.c()];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int b11 = b();
        k<T> kVar = this.f33179d;
        if (b11 <= kVar.c()) {
            e(b() - 1);
            return kVar.previous();
        }
        e(b() - 1);
        return this.f33178c[b() - kVar.c()];
    }
}
