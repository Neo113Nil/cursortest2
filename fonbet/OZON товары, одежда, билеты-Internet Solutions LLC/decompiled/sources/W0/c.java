package W0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T[] f33163c;

    public c(@NotNull T[] tArr, int i11, int i12) {
        super(i11, i12);
        this.f33163c = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int b11 = b();
        e(b11 + 1);
        return this.f33163c[b11];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        e(b() - 1);
        return this.f33163c[b()];
    }
}
