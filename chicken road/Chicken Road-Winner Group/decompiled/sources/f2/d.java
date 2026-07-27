package f2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f4900a;

    /* renamed from: b, reason: collision with root package name */
    public int f4901b;

    /* renamed from: c, reason: collision with root package name */
    public int f4902c;

    /* renamed from: d, reason: collision with root package name */
    public int f4903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4904e;

    public d(f map, int i3) {
        this.f4904e = i3;
        j.e(map, "map");
        this.f4900a = map;
        this.f4902c = -1;
        this.f4903d = map.f4915h;
        b();
    }

    public final void a() {
        if (this.f4900a.f4915h != this.f4903d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i3 = this.f4901b;
            f fVar = this.f4900a;
            if (i3 >= fVar.f || fVar.f4911c[i3] >= 0) {
                return;
            } else {
                this.f4901b = i3 + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4901b < this.f4900a.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4904e) {
            case 0:
                a();
                int i3 = this.f4901b;
                f fVar = this.f4900a;
                if (i3 >= fVar.f) {
                    throw new NoSuchElementException();
                }
                this.f4901b = i3 + 1;
                this.f4902c = i3;
                e eVar = new e(fVar, i3);
                b();
                return eVar;
            case 1:
                a();
                int i4 = this.f4901b;
                f fVar2 = this.f4900a;
                if (i4 >= fVar2.f) {
                    throw new NoSuchElementException();
                }
                this.f4901b = i4 + 1;
                this.f4902c = i4;
                Object obj = fVar2.f4909a[i4];
                b();
                return obj;
            default:
                a();
                int i5 = this.f4901b;
                f fVar3 = this.f4900a;
                if (i5 >= fVar3.f) {
                    throw new NoSuchElementException();
                }
                this.f4901b = i5 + 1;
                this.f4902c = i5;
                Object[] objArr = fVar3.f4910b;
                j.b(objArr);
                Object obj2 = objArr[this.f4902c];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.f4902c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        f fVar = this.f4900a;
        fVar.b();
        fVar.k(this.f4902c);
        this.f4902c = -1;
        this.f4903d = fVar.f4915h;
    }
}
