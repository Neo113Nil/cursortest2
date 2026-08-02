package Me;

import gd.InterfaceC6712a;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class i implements Iterator<f>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f17929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f17930b;

    i(f fVar) {
        this.f17930b = fVar;
        this.f17929a = fVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17929a > 0;
    }

    @Override // java.util.Iterator
    public final f next() {
        f fVar = this.f17930b;
        int d11 = fVar.d();
        int i11 = this.f17929a;
        this.f17929a = i11 - 1;
        return fVar.c(d11 - i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
