package E3;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class D extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1990b;

    public D(Object obj) {
        this.f1990b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f1989a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1989a) {
            throw new NoSuchElementException();
        }
        this.f1989a = true;
        return this.f1990b;
    }
}
