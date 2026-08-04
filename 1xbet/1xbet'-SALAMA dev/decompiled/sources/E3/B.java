package E3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends AbstractC0162u implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC0167z f1983b;

    public static int B(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            p113p3.f.d("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static B C(int i7, Object... objArr) {
        if (i7 == 0) {
            return S.f2020z;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new Z(obj);
        }
        int iB = B(i7);
        Object[] objArr2 = new Object[iB];
        int i8 = iB - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                throw new NullPointerException(p031e1.k.d(i11, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iK = AbstractC0158p.k(iHashCode);
            while (true) {
                int i12 = iK & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iK++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new Z(obj4);
        }
        if (B(i10) < iB / 2) {
            return C(i10, objArr);
        }
        int length = objArr.length;
        if (i10 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new S(objArr, i9, objArr2, i8, i10);
    }

    public static B D(Collection collection) {
        if ((collection instanceof B) && !(collection instanceof SortedSet)) {
            B b7 = (B) collection;
            if (!b7.A()) {
                return b7;
            }
        }
        Object[] array = collection.toArray();
        return C(array.length, array);
    }

    public AbstractC0167z E() {
        Object[] array = toArray(AbstractC0162u.f2071a);
        C0165x c0165x = AbstractC0167z.f2083b;
        return AbstractC0167z.B(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract a0 iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof B) && (this instanceof S)) {
            B b7 = (B) obj;
            b7.getClass();
            if ((b7 instanceof S) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0158p.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0158p.g(this);
    }

    @Override // E3.AbstractC0162u
    public AbstractC0167z l() {
        AbstractC0167z abstractC0167z = this.f1983b;
        if (abstractC0167z != null) {
            return abstractC0167z;
        }
        AbstractC0167z abstractC0167zE = E();
        this.f1983b = abstractC0167zE;
        return abstractC0167zE;
    }
}
