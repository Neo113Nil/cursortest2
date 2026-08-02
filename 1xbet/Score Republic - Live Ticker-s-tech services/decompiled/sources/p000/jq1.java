package p000;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jq1 extends AbstractMap {

    /* JADX INFO: renamed from: j */
    public Object[] f4065j;

    /* JADX INFO: renamed from: k */
    public int f4066k;

    /* JADX INFO: renamed from: l */
    public Map f4067l;

    /* JADX INFO: renamed from: m */
    public boolean f4068m;

    /* JADX INFO: renamed from: n */
    public volatile C0867x7 f4069n;

    /* JADX INFO: renamed from: o */
    public Map f4070o;

    public jq1() {
        Map map = Collections.EMPTY_MAP;
        this.f4067l = map;
        this.f4070o = map;
    }

    /* JADX INFO: renamed from: a */
    public final kq1 m2954a(int i) {
        if (i < this.f4066k) {
            return (kq1) this.f4065j[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: b */
    public final Set m2955b() {
        return this.f4067l.isEmpty() ? Collections.EMPTY_SET : this.f4067l.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m2959f();
        int iM2958e = m2958e(comparable);
        if (iM2958e >= 0) {
            return ((kq1) this.f4065j[iM2958e]).setValue(obj);
        }
        m2959f();
        if (this.f4065j == null) {
            this.f4065j = new Object[16];
        }
        int i = -(iM2958e + 1);
        if (i >= 16) {
            return m2960g().put(comparable, obj);
        }
        if (this.f4066k == 16) {
            kq1 kq1Var = (kq1) this.f4065j[15];
            this.f4066k = 15;
            m2960g().put(kq1Var.f4500j, kq1Var.f4501k);
        }
        Object[] objArr = this.f4065j;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f4065j[i] = new kq1(this, comparable, obj);
        this.f4066k++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2959f();
        if (this.f4066k != 0) {
            this.f4065j = null;
            this.f4066k = 0;
        }
        if (this.f4067l.isEmpty()) {
            return;
        }
        this.f4067l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m2958e(comparable) >= 0 || this.f4067l.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Object m2957d(int i) {
        m2959f();
        Object[] objArr = this.f4065j;
        Object obj = ((kq1) objArr[i]).f4501k;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f4066k - i) - 1);
        this.f4066k--;
        if (!this.f4067l.isEmpty()) {
            Iterator it = m2960g().entrySet().iterator();
            Object[] objArr2 = this.f4065j;
            int i2 = this.f4066k;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new kq1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f4066k++;
            it.remove();
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final int m2958e(Comparable comparable) {
        int i = this.f4066k;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((kq1) this.f4065j[i2]).f4500j);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((kq1) this.f4065j[i4]).f4500j);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4069n == null) {
            this.f4069n = new C0867x7(3, this);
        }
        return this.f4069n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq1)) {
            return super.equals(obj);
        }
        jq1 jq1Var = (jq1) obj;
        int size = size();
        if (size == jq1Var.size()) {
            int i = this.f4066k;
            if (i != jq1Var.f4066k) {
                return entrySet().equals(jq1Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m2954a(i2).equals(jq1Var.m2954a(i2))) {
                }
            }
            if (i != size) {
                return this.f4067l.equals(jq1Var.f4067l);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2959f() {
        if (this.f4068m) {
            dd0.m1164i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final SortedMap m2960g() {
        m2959f();
        if (this.f4067l.isEmpty() && !(this.f4067l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4067l = treeMap;
            this.f4070o = treeMap.descendingMap();
        }
        return (SortedMap) this.f4067l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM2958e = m2958e(comparable);
        return iM2958e >= 0 ? ((kq1) this.f4065j[iM2958e]).f4501k : this.f4067l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f4066k;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f4065j[i2].hashCode();
        }
        return this.f4067l.size() > 0 ? this.f4067l.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m2959f();
        Comparable comparable = (Comparable) obj;
        int iM2958e = m2958e(comparable);
        if (iM2958e >= 0) {
            return m2957d(iM2958e);
        }
        if (this.f4067l.isEmpty()) {
            return null;
        }
        return this.f4067l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4067l.size() + this.f4066k;
    }
}
