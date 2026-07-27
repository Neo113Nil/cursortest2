package N4;

import f4.C0436m;
import f4.C0438o;
import f4.C0440q;
import f4.C0443t;
import g4.AbstractC0459d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public class g implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2184a;

    /* renamed from: b, reason: collision with root package name */
    public int f2185b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2186c;

    public /* synthetic */ g(int i2, Object obj) {
        this.f2184a = i2;
        this.f2186c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2184a) {
            case 0:
                if (this.f2185b > 0) {
                }
                break;
            case 1:
                if (this.f2185b < ((byte[]) this.f2186c).length) {
                }
                break;
            case 2:
                if (this.f2185b < ((int[]) this.f2186c).length) {
                }
                break;
            case 3:
                if (this.f2185b < ((long[]) this.f2186c).length) {
                }
                break;
            case 4:
                if (this.f2185b < ((short[]) this.f2186c).length) {
                }
                break;
            case 5:
                if (this.f2185b < ((AbstractC0459d) this.f2186c).c()) {
                }
                break;
            default:
                if (this.f2185b < ((Object[]) this.f2186c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2184a) {
            case 0:
                e eVar = (e) this.f2186c;
                int d6 = eVar.d();
                int i2 = this.f2185b;
                this.f2185b = i2 - 1;
                return eVar.h(d6 - i2);
            case 1:
                int i3 = this.f2185b;
                byte[] bArr = (byte[]) this.f2186c;
                if (i3 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2185b));
                }
                this.f2185b = i3 + 1;
                return new C0436m(bArr[i3]);
            case 2:
                int i6 = this.f2185b;
                int[] iArr = (int[]) this.f2186c;
                if (i6 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2185b));
                }
                this.f2185b = i6 + 1;
                return new C0438o(iArr[i6]);
            case 3:
                int i7 = this.f2185b;
                long[] jArr = (long[]) this.f2186c;
                if (i7 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2185b));
                }
                this.f2185b = i7 + 1;
                return new C0440q(jArr[i7]);
            case 4:
                int i8 = this.f2185b;
                short[] sArr = (short[]) this.f2186c;
                if (i8 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2185b));
                }
                this.f2185b = i8 + 1;
                return new C0443t(sArr[i8]);
            case 5:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i9 = this.f2185b;
                this.f2185b = i9 + 1;
                return ((AbstractC0459d) this.f2186c).get(i9);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2186c;
                    int i10 = this.f2185b;
                    this.f2185b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f2185b--;
                    throw new NoSuchElementException(e3.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2184a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Object[] array) {
        this.f2184a = 6;
        kotlin.jvm.internal.i.e(array, "array");
        this.f2186c = array;
    }

    public g(e eVar) {
        this.f2184a = 0;
        this.f2186c = eVar;
        this.f2185b = eVar.d();
    }
}
