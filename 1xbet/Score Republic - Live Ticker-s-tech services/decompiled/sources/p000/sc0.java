package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sc0 extends lc0 implements Set {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f7095l = 0;

    /* JADX INFO: renamed from: k */
    public transient qc0 f7096k;

    /* JADX INFO: renamed from: j */
    public static int m4513j(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            a90.m122f("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: l */
    public static sc0 m4514l(int i, Object... objArr) {
        if (i == 0) {
            return w01.f8328s;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new n81(obj);
        }
        int iM4513j = m4513j(i);
        Object[] objArr2 = new Object[iM4513j];
        int i2 = iM4513j - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                C0270h1.m2192h(j11.m2773h("at index ", i5));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM3014n = kd0.m3014n(iHashCode);
            while (true) {
                int i6 = iM3014n & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM3014n++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new n81(obj4);
        }
        if (m4513j(i4) < iM4513j / 2) {
            return m4514l(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new w01(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: p */
    public static sc0 m4515p(Set set) {
        if ((set instanceof sc0) && !(set instanceof SortedSet)) {
            sc0 sc0Var = (sc0) set;
            if (!sc0Var.mo3207g()) {
                return sc0Var;
            }
        }
        Object[] array = set.toArray();
        return m4514l(array.length, array);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: b */
    public qc0 mo3202b() {
        qc0 qc0Var = this.f7096k;
        if (qc0Var != null) {
            return qc0Var;
        }
        qc0 qc0VarMo4467q = mo4467q();
        this.f7096k = qc0VarMo4467q;
        return qc0VarMo4467q;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof sc0) && (this instanceof w01) && (((sc0) obj) instanceof w01) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0959zp.m5981j(this);
    }

    /* JADX INFO: renamed from: q */
    public qc0 mo4467q() {
        Object[] array = toArray(lc0.f4760j);
        nc0 nc0Var = qc0.f6464k;
        return qc0.m4055j(array.length, array);
    }
}
