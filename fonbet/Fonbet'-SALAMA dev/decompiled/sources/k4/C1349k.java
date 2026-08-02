package k4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n4.C1473g;

/* renamed from: k4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1349k implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14782a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f14783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f14784c;

    public C1349k(C1473g c1473g) {
        this.f14784c = c1473g;
        this.f14783b = c1473g.f15417b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14782a) {
            case 0:
                if (this.f14783b >= 0) {
                }
                break;
            default:
                if (this.f14783b < ((C1473g) this.f14784c).f15418c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14782a) {
            case 0:
                long j = ((C1350l) this.f14784c).f14785a;
                int i7 = this.f14783b;
                C1345g c1345g = new C1345g();
                Math.pow(2.0d, i7);
                this.f14783b--;
                return c1345g;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                v4.c[] cVarArr = ((C1473g) this.f14784c).f15416a;
                int i8 = this.f14783b;
                v4.c cVar = cVarArr[i8];
                this.f14783b = i8 + 1;
                return cVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14782a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public C1349k(C1350l c1350l) {
        this.f14784c = c1350l;
        this.f14783b = c1350l.f14786b - 1;
    }

    private final void a() {
    }
}
