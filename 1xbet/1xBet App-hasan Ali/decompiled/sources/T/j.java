package T;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: m, reason: collision with root package name */
    public int f5599m;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f5600n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5601o;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i, int i5, int i6) {
        super(i, i5);
        this.f5599m = i6;
        Object[] objArr2 = new Object[i6];
        this.f5600n = objArr2;
        ?? r5 = i == i5 ? 1 : 0;
        this.f5601o = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.f5573k & 31;
        Object obj = this.f5600n[this.f5599m - 1];
        l.d("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>", obj);
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i5) {
        int i6 = (this.f5599m - i5) * 5;
        while (i5 < this.f5599m) {
            Object[] objArr = this.f5600n;
            Object obj = objArr[i5 - 1];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArr[i5] = ((Object[]) obj)[AbstractC2349a.E(i, i6)];
            i6 -= 5;
            i5++;
        }
    }

    public final void c(int i) {
        int i5 = 0;
        while (AbstractC2349a.E(this.f5573k, i5) == i) {
            i5 += 5;
        }
        if (i5 > 0) {
            b(this.f5573k, ((this.f5599m - 1) - (i5 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a5 = a();
        int i = this.f5573k + 1;
        this.f5573k = i;
        if (i == this.f5574l) {
            this.f5601o = true;
            return a5;
        }
        c(0);
        return a5;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f5573k--;
        if (this.f5601o) {
            this.f5601o = false;
            return a();
        }
        c(31);
        return a();
    }
}
