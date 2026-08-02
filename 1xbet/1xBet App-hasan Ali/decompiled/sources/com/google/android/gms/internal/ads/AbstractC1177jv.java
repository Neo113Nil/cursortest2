package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.jv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1177jv extends AbstractC0821bv implements Set {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f14189m = 0;

    /* renamed from: l, reason: collision with root package name */
    public transient AbstractC1044gv f14190l;

    public static int j(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            AbstractC1400ot.Y("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static C1132iv l(int i) {
        C1132iv c1132iv = new C1132iv(i);
        c1132iv.f14017d = new Object[j(i)];
        return c1132iv;
    }

    public static AbstractC1177jv m(int i, Object... objArr) {
        if (i == 0) {
            return Dv.f8414t;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new Jv(obj);
        }
        int j5 = j(i);
        Object[] objArr2 = new Object[j5];
        int i5 = j5 - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC2107A.q("at index ", i8));
            }
            int hashCode = obj2.hashCode();
            int a5 = AbstractC1400ot.a(hashCode);
            while (true) {
                int i9 = a5 & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a5++;
                }
            }
        }
        Arrays.fill(objArr, i7, i, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new Jv(obj4);
        }
        if (j(i7) < j5 / 2) {
            return m(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new Dv(i6, i5, i7, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1177jv) && (this instanceof Dv)) {
            AbstractC1177jv abstractC1177jv = (AbstractC1177jv) obj;
            abstractC1177jv.getClass();
            if ((abstractC1177jv instanceof Dv) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0952et.U(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public AbstractC1044gv f() {
        AbstractC1044gv abstractC1044gv = this.f14190l;
        if (abstractC1044gv != null) {
            return abstractC1044gv;
        }
        AbstractC1044gv k5 = k();
        this.f14190l = k5;
        return k5;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0952et.d(this);
    }

    public AbstractC1044gv k() {
        Object[] array = toArray(AbstractC0821bv.f12926k);
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return AbstractC1044gv.k(array.length, array);
    }
}
