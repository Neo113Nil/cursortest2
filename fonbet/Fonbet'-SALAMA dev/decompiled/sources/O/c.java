package O;

import t6.h;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4826a;

    /* renamed from: b, reason: collision with root package name */
    public int f4827b;

    public c(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f4826a = new Object[i7];
    }

    public Object a() {
        int i7 = this.f4827b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = this.f4826a;
        Object obj = objArr[i8];
        h.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i8] = null;
        this.f4827b--;
        return obj;
    }

    public void b(t.b bVar) {
        int i7 = this.f4827b;
        Object[] objArr = this.f4826a;
        if (i7 < objArr.length) {
            objArr[i7] = bVar;
            this.f4827b = i7 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z4;
        h.e(obj, "instance");
        int i7 = this.f4827b;
        int i8 = 0;
        while (true) {
            objArr = this.f4826a;
            if (i8 >= i7) {
                z4 = false;
                break;
            }
            if (objArr[i8] == obj) {
                z4 = true;
                break;
            }
            i8++;
        }
        if (z4) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i9 = this.f4827b;
        if (i9 >= objArr.length) {
            return false;
        }
        objArr[i9] = obj;
        this.f4827b = i9 + 1;
        return true;
    }

    public c() {
        this.f4826a = new Object[256];
    }
}
