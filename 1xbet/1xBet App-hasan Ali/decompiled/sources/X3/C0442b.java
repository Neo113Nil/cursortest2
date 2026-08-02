package X3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n4.C2190b;
import r.S;

/* renamed from: X3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0442b implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6074k;

    /* renamed from: l, reason: collision with root package name */
    public int f6075l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f6076m;

    public /* synthetic */ C0442b(int i, Object obj) {
        this.f6074k = i;
        this.f6076m = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f6074k) {
            case 0:
                return this.f6075l < ((e) this.f6076m).c();
            case 1:
                return this.f6075l < ((Object[]) this.f6076m).length;
            case 2:
                break;
            default:
                return this.f6075l < ((S) this.f6076m).j();
        }
        while (true) {
            int i = this.f6075l;
            it = (Iterator) this.f6076m;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f6075l--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f6074k) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f6075l;
                this.f6075l = i + 1;
                return ((e) this.f6076m).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f6076m;
                    int i5 = this.f6075l;
                    this.f6075l = i5 + 1;
                    return objArr[i5];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f6075l--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            case 2:
                break;
            default:
                int i6 = this.f6075l;
                this.f6075l = i6 + 1;
                return ((S) this.f6076m).k(i6);
        }
        while (true) {
            int i7 = this.f6075l;
            it = (Iterator) this.f6076m;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f6075l--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6074k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0442b(Object[] objArr) {
        this.f6074k = 1;
        kotlin.jvm.internal.l.f("array", objArr);
        this.f6076m = objArr;
    }

    public C0442b(C2190b c2190b) {
        this.f6074k = 2;
        this.f6076m = c2190b.f18474a.iterator();
        this.f6075l = c2190b.f18475b;
    }
}
