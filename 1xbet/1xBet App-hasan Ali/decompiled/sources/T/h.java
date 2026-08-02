package T;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: m, reason: collision with root package name */
    public final f f5593m;

    /* renamed from: n, reason: collision with root package name */
    public int f5594n;

    /* renamed from: o, reason: collision with root package name */
    public j f5595o;

    /* renamed from: p, reason: collision with root package name */
    public int f5596p;

    public h(f fVar, int i) {
        super(i, fVar.f5590r);
        this.f5593m = fVar;
        this.f5594n = fVar.g();
        this.f5596p = -1;
        b();
    }

    public final void a() {
        if (this.f5594n != this.f5593m.g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // T.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.f5573k;
        f fVar = this.f5593m;
        fVar.add(i, obj);
        this.f5573k++;
        this.f5574l = fVar.c();
        this.f5594n = fVar.g();
        this.f5596p = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f5593m;
        Object[] objArr = fVar.f5588p;
        if (objArr == null) {
            this.f5595o = null;
            return;
        }
        int i = (fVar.f5590r - 1) & (-32);
        int i5 = this.f5573k;
        if (i5 > i) {
            i5 = i;
        }
        int i6 = (fVar.f5586n / 5) + 1;
        j jVar = this.f5595o;
        if (jVar == null) {
            this.f5595o = new j(objArr, i5, i, i6);
            return;
        }
        jVar.f5573k = i5;
        jVar.f5574l = i;
        jVar.f5599m = i6;
        if (jVar.f5600n.length < i6) {
            jVar.f5600n = new Object[i6];
        }
        jVar.f5600n[0] = objArr;
        ?? r6 = i5 == i ? 1 : 0;
        jVar.f5601o = r6;
        jVar.b(i5 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5573k;
        this.f5596p = i;
        j jVar = this.f5595o;
        f fVar = this.f5593m;
        if (jVar == null) {
            Object[] objArr = fVar.f5589q;
            this.f5573k = i + 1;
            return objArr[i];
        }
        if (jVar.hasNext()) {
            this.f5573k++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f5589q;
        int i5 = this.f5573k;
        this.f5573k = i5 + 1;
        return objArr2[i5 - jVar.f5574l];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5573k;
        this.f5596p = i - 1;
        j jVar = this.f5595o;
        f fVar = this.f5593m;
        if (jVar == null) {
            Object[] objArr = fVar.f5589q;
            int i5 = i - 1;
            this.f5573k = i5;
            return objArr[i5];
        }
        int i6 = jVar.f5574l;
        if (i <= i6) {
            this.f5573k = i - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f5589q;
        int i7 = i - 1;
        this.f5573k = i7;
        return objArr2[i7 - i6];
    }

    @Override // T.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f5596p;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f5593m;
        fVar.d(i);
        int i5 = this.f5596p;
        if (i5 < this.f5573k) {
            this.f5573k = i5;
        }
        this.f5574l = fVar.c();
        this.f5594n = fVar.g();
        this.f5596p = -1;
        b();
    }

    @Override // T.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f5596p;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f5593m;
        fVar.set(i, obj);
        this.f5594n = fVar.g();
        b();
    }
}
