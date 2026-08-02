package androidx.collection;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.collection.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5139h<T> implements Iterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f38705a;

    /* renamed from: b, reason: collision with root package name */
    private int f38706b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38707c;

    public AbstractC5139h(int i11) {
        this.f38705a = i11;
    }

    protected abstract T b(int i11);

    protected abstract void c(int i11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38706b < this.f38705a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T b11 = b(this.f38706b);
        this.f38706b++;
        this.f38707c = true;
        return b11;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f38707c) {
            Intrinsics.checkNotNullParameter("Call next() before removing an element.", "message");
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i11 = this.f38706b - 1;
        this.f38706b = i11;
        c(i11);
        this.f38705a--;
        this.f38707c = false;
    }
}
