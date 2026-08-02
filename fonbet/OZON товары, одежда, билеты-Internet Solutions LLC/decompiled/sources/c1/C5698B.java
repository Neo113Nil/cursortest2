package c1;

import gd.InterfaceC6712a;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5698B<T> implements ListIterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u<T> f56177a;

    /* renamed from: b, reason: collision with root package name */
    private int f56178b;

    /* renamed from: c, reason: collision with root package name */
    private int f56179c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f56180d;

    public C5698B(@NotNull u<T> uVar, int i11) {
        this.f56177a = uVar;
        this.f56178b = i11 - 1;
        this.f56180d = uVar.e();
    }

    private final void b() {
        if (this.f56177a.e() != this.f56180d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t2) {
        b();
        int i11 = this.f56178b + 1;
        u<T> uVar = this.f56177a;
        uVar.add(i11, t2);
        this.f56179c = -1;
        this.f56178b++;
        this.f56180d = uVar.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f56178b < this.f56177a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f56178b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        b();
        int i11 = this.f56178b + 1;
        this.f56179c = i11;
        u<T> uVar = this.f56177a;
        v.b(i11, uVar.size());
        T t2 = uVar.get(i11);
        this.f56178b = i11;
        return t2;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f56178b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        b();
        int i11 = this.f56178b;
        u<T> uVar = this.f56177a;
        v.b(i11, uVar.size());
        int i12 = this.f56178b;
        this.f56179c = i12;
        this.f56178b--;
        return uVar.get(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f56178b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i11 = this.f56178b;
        u<T> uVar = this.f56177a;
        uVar.remove(i11);
        this.f56178b--;
        this.f56179c = -1;
        this.f56180d = uVar.e();
    }

    @Override // java.util.ListIterator
    public final void set(T t2) {
        b();
        int i11 = this.f56179c;
        if (i11 < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        u<T> uVar = this.f56177a;
        uVar.set(i11, t2);
        this.f56180d = uVar.e();
    }
}
