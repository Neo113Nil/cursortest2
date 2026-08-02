package W0;

import Bl0.D;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k<E> extends a<E> {

    /* renamed from: c, reason: collision with root package name */
    private int f33187c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Object[] f33188d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33189e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(@NotNull Object[] objArr, int i11, int i12, int i13) {
        super(i11, i12);
        this.f33187c = i13;
        Object[] objArr2 = new Object[i13];
        this.f33188d = objArr2;
        ?? r52 = i11 == i12 ? 1 : 0;
        this.f33189e = r52;
        objArr2[0] = objArr;
        k(i11 - r52, 1);
    }

    private final E i() {
        int b11 = b() & 31;
        Object obj = this.f33188d[this.f33187c - 1];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[b11];
    }

    private final void k(int i11, int i12) {
        int i13 = (this.f33187c - i12) * 5;
        while (i12 < this.f33187c) {
            Object[] objArr = this.f33188d;
            Object obj = objArr[i12 - 1];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i12] = ((Object[]) obj)[D.c(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    private final void l(int i11) {
        int i12 = 0;
        while (D.c(b(), i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            k(b(), ((this.f33187c - 1) - (i12 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void m(@NotNull Object[] objArr, int i11, int i12, int i13) {
        e(i11);
        h(i12);
        this.f33187c = i13;
        if (this.f33188d.length < i13) {
            this.f33188d = new Object[i13];
        }
        this.f33188d[0] = objArr;
        ?? r02 = i11 == i12 ? 1 : 0;
        this.f33189e = r02;
        k(i11 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E i11 = i();
        e(b() + 1);
        if (b() == c()) {
            this.f33189e = true;
            return i11;
        }
        l(0);
        return i11;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        e(b() - 1);
        if (this.f33189e) {
            this.f33189e = false;
            return i();
        }
        l(31);
        return i();
    }
}
