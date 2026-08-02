package S0;

import Hj0.C3156m;
import gd.InterfaceC6712a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class U implements Iterator<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25314a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25315b;

    /* renamed from: c, reason: collision with root package name */
    private int f25316c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25317d;

    public U(@NotNull C3947c1 c3947c1, int i11, int i12) {
        this.f25314a = c3947c1;
        this.f25315b = i12;
        this.f25316c = i11;
        this.f25317d = c3947c1.u();
        if (c3947c1.v()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25316c < this.f25315b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3947c1 c3947c1 = this.f25314a;
        int u11 = c3947c1.u();
        int i11 = this.f25317d;
        if (u11 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f25316c;
        this.f25316c = C3156m.d(c3947c1.o(), i12) + i12;
        return new C3950d1(c3947c1, i12, i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
