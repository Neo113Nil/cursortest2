package Y3;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import l3.C2054a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: k, reason: collision with root package name */
    public int f6155k;

    /* renamed from: l, reason: collision with root package name */
    public int f6156l;

    /* renamed from: m, reason: collision with root package name */
    public int f6157m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6158n;

    public f() {
        if (C2054a.f17771l == null) {
            C2054a.f17771l = new C2054a(15);
        }
    }

    public int a(int i) {
        if (i < this.f6157m) {
            return ((ByteBuffer) this.f6158n).getShort(this.f6156l + i);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f6158n).f6167r != this.f6157m) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.f6155k;
            g gVar = (g) this.f6158n;
            if (i >= gVar.f6165p || gVar.f6162m[i] >= 0) {
                return;
            } else {
                this.f6155k = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f6155k < ((g) this.f6158n).f6165p;
    }

    public void remove() {
        b();
        if (this.f6156l == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        g gVar = (g) this.f6158n;
        gVar.b();
        gVar.k(this.f6156l);
        this.f6156l = -1;
        this.f6157m = gVar.f6167r;
    }
}
