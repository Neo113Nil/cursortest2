package r;

import a.AbstractC0444a;
import java.util.List;
import l4.C2062d;
import n.AbstractC2107A;
import s.AbstractC2351a;

/* renamed from: r.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2316B {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f18904a;

    /* renamed from: b, reason: collision with root package name */
    public int f18905b;

    public C2316B(int i) {
        this.f18904a = i == 0 ? L.f18953a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.f18905b + 1;
        Object[] objArr = this.f18904a;
        if (objArr.length < i) {
            l(i, objArr);
        }
        Object[] objArr2 = this.f18904a;
        int i5 = this.f18905b;
        objArr2[i5] = obj;
        this.f18905b = i5 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f18905b;
        int size = list.size() + i;
        Object[] objArr = this.f18904a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f18904a;
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            objArr2[i5 + i] = list.get(i5);
        }
        this.f18905b = list.size() + this.f18905b;
    }

    public final void c() {
        X3.l.B0(this.f18904a, 0, this.f18905b);
        this.f18905b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f18904a[0];
        }
        AbstractC2351a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i) {
        if (i >= 0 && i < this.f18905b) {
            return this.f18904a[i];
        }
        m(i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2316B) {
            C2316B c2316b = (C2316B) obj;
            int i = c2316b.f18905b;
            int i5 = this.f18905b;
            if (i == i5) {
                Object[] objArr = this.f18904a;
                Object[] objArr2 = c2316b.f18904a;
                C2062d f02 = AbstractC0444a.f0(0, i5);
                int i6 = f02.f17851k;
                int i7 = f02.f17852l;
                if (i6 > i7) {
                    return true;
                }
                while (kotlin.jvm.internal.l.a(objArr[i6], objArr2[i6])) {
                    if (i6 == i7) {
                        return true;
                    }
                    i6++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.f18904a;
            int i5 = this.f18905b;
            while (i < i5) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f18904a;
        int i6 = this.f18905b;
        while (i < i6) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f18905b == 0;
    }

    public final boolean h() {
        return this.f18905b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f18904a;
        int i = this.f18905b;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            i5 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i5;
    }

    public final boolean i(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return false;
        }
        j(f);
        return true;
    }

    public final Object j(int i) {
        int i5;
        if (i < 0 || i >= (i5 = this.f18905b)) {
            m(i);
            throw null;
        }
        Object[] objArr = this.f18904a;
        Object obj = objArr[i];
        if (i != i5 - 1) {
            X3.l.t0(i, i + 1, i5, objArr, objArr);
        }
        int i6 = this.f18905b - 1;
        this.f18905b = i6;
        objArr[i6] = null;
        return obj;
    }

    public final void k(int i, int i5) {
        int i6;
        if (i < 0 || i > (i6 = this.f18905b) || i5 < 0 || i5 > i6) {
            StringBuilder w5 = AbstractC2107A.w("Start (", i, ") and end (", i5, ") must be in 0..");
            w5.append(this.f18905b);
            AbstractC2351a.d(w5.toString());
            throw null;
        }
        if (i5 < i) {
            AbstractC2351a.c("Start (" + i + ") is more than end (" + i5 + ')');
            throw null;
        }
        if (i5 != i) {
            if (i5 < i6) {
                Object[] objArr = this.f18904a;
                X3.l.t0(i, i5, i6, objArr, objArr);
            }
            int i7 = this.f18905b;
            int i8 = i7 - (i5 - i);
            X3.l.B0(this.f18904a, i8, i7);
            this.f18905b = i8;
        }
    }

    public final void l(int i, Object[] objArr) {
        kotlin.jvm.internal.l.f("oldContent", objArr);
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        X3.l.t0(0, 0, length, objArr, objArr2);
        this.f18904a = objArr2;
    }

    public final void m(int i) {
        StringBuilder v4 = AbstractC2107A.v(i, "Index ", " must be in 0..");
        v4.append(this.f18905b - 1);
        AbstractC2351a.d(v4.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f18904a;
        int i = this.f18905b;
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i5];
            if (i5 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i5++;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public /* synthetic */ C2316B() {
        this(16);
    }
}
