package X0;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class e<K, V, T> implements Iterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<K, V, T>[] f33917a;

    /* renamed from: b, reason: collision with root package name */
    private int f33918b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33919c = true;

    public e(@NotNull t<K, V> tVar, @NotNull u<K, V, T>[] uVarArr) {
        this.f33917a = uVarArr;
        uVarArr[0].n(tVar.g() * 2, 0, tVar.j());
        this.f33918b = 0;
        c();
    }

    private final void c() {
        t tVar;
        int i11 = this.f33918b;
        u<K, V, T>[] uVarArr = this.f33917a;
        if (uVarArr[i11].i()) {
            return;
        }
        for (int i12 = this.f33918b; -1 < i12; i12--) {
            int h11 = h(i12);
            if (h11 == -1 && uVarArr[i12].k()) {
                uVarArr[i12].m();
                h11 = h(i12);
            }
            if (h11 != -1) {
                this.f33918b = h11;
                return;
            }
            if (i12 > 0) {
                uVarArr[i12 - 1].m();
            }
            u<K, V, T> uVar = uVarArr[i12];
            tVar = t.f33937e;
            uVar.n(0, 0, tVar.j());
        }
        this.f33919c = false;
    }

    private final int h(int i11) {
        u<K, V, T>[] uVarArr = this.f33917a;
        if (uVarArr[i11].i()) {
            return i11;
        }
        if (!uVarArr[i11].k()) {
            return -1;
        }
        t<? extends K, ? extends V> c11 = uVarArr[i11].c();
        if (i11 == 6) {
            uVarArr[i11 + 1].n(c11.j().length, 0, c11.j());
        } else {
            uVarArr[i11 + 1].n(c11.g() * 2, 0, c11.j());
        }
        return h(i11 + 1);
    }

    protected final K b() {
        if (this.f33919c) {
            return this.f33917a[this.f33918b].b();
        }
        throw new NoSuchElementException();
    }

    @NotNull
    protected final u<K, V, T>[] e() {
        return this.f33917a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33919c;
    }

    protected final void i(int i11) {
        this.f33918b = i11;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f33919c) {
            throw new NoSuchElementException();
        }
        T next = this.f33917a[this.f33918b].next();
        c();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
