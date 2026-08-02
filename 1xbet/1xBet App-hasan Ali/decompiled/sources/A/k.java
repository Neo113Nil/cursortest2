package A;

import B.C0077f;
import B.C0079h;
import B.K;
import P.C0315s;
import P.C0326x0;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final E f58a;

    /* renamed from: b, reason: collision with root package name */
    public final C0008h f59b;

    /* renamed from: c, reason: collision with root package name */
    public final C0003c f60c;

    /* renamed from: d, reason: collision with root package name */
    public final K f61d;

    public k(E e3, C0008h c0008h, C0003c c0003c, K k5) {
        this.f58a = e3;
        this.f59b = c0008h;
        this.f60c = c0003c;
        this.f61d = k5;
    }

    public final void a(int i, Object obj, C0315s c0315s, int i5) {
        int i6;
        Object obj2;
        C0315s c0315s2;
        c0315s.Z(-462424778);
        int i7 = (c0315s.d(i) ? 4 : 2) | i5 | (c0315s.h(obj) ? 32 : 16) | (c0315s.f(this) ? 256 : 128);
        if ((i7 & 147) == 146 && c0315s.B()) {
            c0315s.S();
            i6 = i;
            obj2 = obj;
            c0315s2 = c0315s;
        } else {
            i6 = i;
            obj2 = obj;
            c0315s2 = c0315s;
            AbstractC2349a.d(obj2, i6, this.f58a.f23q, X.e.d(-824725566, new i(this, i), c0315s), c0315s2, ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112));
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new j(this, i6, obj2, i5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [i4.c, kotlin.jvm.internal.m] */
    public final Object b(int i) {
        C0008h c0008h = this.f59b;
        c0008h.getClass();
        C0079h f = c0008h.f51a.f(i);
        return ((kotlin.jvm.internal.m) f.f677c.f20433m).c(Integer.valueOf(i - f.f675a));
    }

    public final int c() {
        C0008h c0008h = this.f59b;
        c0008h.getClass();
        return c0008h.f51a.f637b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v8, types: [i4.c, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i) {
        Object obj;
        Object c5;
        K k5 = this.f61d;
        int i5 = i - k5.f637b;
        if (i5 >= 0) {
            Object[] objArr = (Object[]) k5.f639d;
            kotlin.jvm.internal.l.f("<this>", objArr);
            if (i5 <= objArr.length - 1) {
                obj = objArr[i5];
                if (obj == null) {
                    return obj;
                }
                C0008h c0008h = this.f59b;
                c0008h.getClass();
                C0079h f = c0008h.f51a.f(i);
                int i6 = i - f.f675a;
                ?? r02 = (kotlin.jvm.internal.m) f.f677c.f20432l;
                return (r02 == 0 || (c5 = r02.c(Integer.valueOf(i6))) == null) ? new C0077f(i) : c5;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f59b, ((k) obj).f59b);
    }

    public final int hashCode() {
        return this.f59b.hashCode();
    }
}
