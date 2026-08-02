package n4;

import S3.C0416t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, j4.a {

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f18478l;

    /* renamed from: n, reason: collision with root package name */
    public Object f18480n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f18481o;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18477k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f18479m = -1;

    public e(f fVar) {
        this.f18481o = fVar;
        this.f18478l = new m((l) fVar.f18483b);
    }

    public void a() {
        Object next;
        do {
            Iterator it = this.f18478l;
            if (!it.hasNext()) {
                this.f18479m = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((C0416t) ((f) this.f18481o).f18484c).c(next)).booleanValue());
        this.f18480n = next;
        this.f18479m = 1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i4.c, kotlin.jvm.internal.m] */
    public void b() {
        Iterator it = this.f18478l;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((l) this.f18481o).f18491c.c(next)).booleanValue()) {
                this.f18479m = 1;
                this.f18480n = next;
                return;
            }
        }
        this.f18479m = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18477k) {
            case 0:
                if (this.f18479m == -1) {
                    a();
                }
                if (this.f18479m == 1) {
                }
                break;
            default:
                if (this.f18479m == -1) {
                    b();
                }
                if (this.f18479m == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18477k) {
            case 0:
                if (this.f18479m == -1) {
                    a();
                }
                if (this.f18479m == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f18480n;
                this.f18480n = null;
                this.f18479m = -1;
                return obj;
            default:
                if (this.f18479m == -1) {
                    b();
                }
                if (this.f18479m == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f18480n;
                this.f18480n = null;
                this.f18479m = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18477k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(l lVar) {
        this.f18481o = lVar;
        this.f18478l = lVar.f18490b.iterator();
    }
}
