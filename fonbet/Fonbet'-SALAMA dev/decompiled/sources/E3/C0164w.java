package E3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: E3.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0164w {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2074a;

    /* renamed from: b, reason: collision with root package name */
    public int f2075b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2076c;

    public C0164w() {
        AbstractC0158p.a(4, "initialCapacity");
        this.f2074a = new Object[4];
        this.f2075b = 0;
    }

    public static int e(int i7, int i8) {
        if (i8 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            i9 = Integer.highestOneBit(i8 - 1) << 1;
        }
        return i9 < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i9;
    }

    public final void a(Object obj) {
        b(obj);
    }

    public final void b(Object obj) {
        obj.getClass();
        f(this.f2075b + 1);
        Object[] objArr = this.f2074a;
        int i7 = this.f2075b;
        this.f2075b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size() + this.f2075b);
            if (collection instanceof AbstractC0162u) {
                this.f2075b = ((AbstractC0162u) collection).m(this.f2075b, this.f2074a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final L d() {
        this.f2076c = true;
        return AbstractC0167z.B(this.f2075b, this.f2074a);
    }

    public final void f(int i7) {
        Object[] objArr = this.f2074a;
        if (objArr.length < i7) {
            this.f2074a = Arrays.copyOf(objArr, e(objArr.length, i7));
            this.f2076c = false;
        } else if (this.f2076c) {
            this.f2074a = (Object[]) objArr.clone();
            this.f2076c = false;
        }
    }
}
