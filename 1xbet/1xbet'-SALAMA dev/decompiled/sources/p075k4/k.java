package p075k4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p098n4.C0934g;
import v4.c;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14788a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f14790c;

    public k(C0934g c0934g) {
        this.f14790c = c0934g;
        this.f14789b = c0934g.f15423b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14788a) {
            case 0:
                return this.f14789b >= 0;
            default:
                return this.f14789b < ((C0934g) this.f14790c).f15424c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14788a) {
            case 0:
                long j = ((l) this.f14790c).f14791a;
                int i7 = this.f14789b;
                g gVar = new g();
                Math.pow(2.0d, i7);
                this.f14789b--;
                return gVar;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                c[] cVarArr = ((C0934g) this.f14790c).f15422a;
                int i8 = this.f14789b;
                c cVar = cVarArr[i8];
                this.f14789b = i8 + 1;
                return cVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14788a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public k(l lVar) {
        this.f14790c = lVar;
        this.f14789b = lVar.f14792b - 1;
    }

    private final void a() {
    }
}
