package p000;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t81 extends AbstractMap {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f7349o = 0;

    /* JADX INFO: renamed from: j */
    public List f7350j;

    /* JADX INFO: renamed from: k */
    public Map f7351k;

    /* JADX INFO: renamed from: l */
    public boolean f7352l;

    /* JADX INFO: renamed from: m */
    public volatile C0867x7 f7353m;

    /* JADX INFO: renamed from: n */
    public Map f7354n;

    /* JADX INFO: renamed from: f */
    public static t81 m4764f() {
        t81 t81Var = new t81();
        t81Var.f7350j = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        t81Var.f7351k = map;
        t81Var.f7354n = map;
        return t81Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m4765a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f7350j.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((x81) this.f7350j.get(i3)).f8863j);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((x81) this.f7350j.get(i4)).f8863j);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((x81) this.f7350j.get(i3)).f8863j);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4766b() {
        if (this.f7352l) {
            dd0.m1164i();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m4767c(int i) {
        return (Map.Entry) this.f7350j.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4766b();
        if (!this.f7350j.isEmpty()) {
            this.f7350j.clear();
        }
        if (this.f7351k.isEmpty()) {
            return;
        }
        this.f7351k.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m4765a(comparable) >= 0 || this.f7351k.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Set m4768d() {
        return this.f7351k.isEmpty() ? Collections.EMPTY_SET : this.f7351k.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m4769e() {
        m4766b();
        if (this.f7351k.isEmpty() && !(this.f7351k instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7351k = treeMap;
            this.f7354n = treeMap.descendingMap();
        }
        return (SortedMap) this.f7351k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7353m == null) {
            this.f7353m = new C0867x7(2, this);
        }
        return this.f7353m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t81)) {
            return super.equals(obj);
        }
        t81 t81Var = (t81) obj;
        int size = size();
        if (size == t81Var.size()) {
            int size2 = this.f7350j.size();
            if (size2 != t81Var.f7350j.size()) {
                return ((AbstractSet) entrySet()).equals(t81Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m4767c(i).equals(t81Var.m4767c(i))) {
                }
            }
            if (size2 != size) {
                return this.f7351k.equals(t81Var.f7351k);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m4766b();
        int iM4765a = m4765a(comparable);
        if (iM4765a >= 0) {
            return ((x81) this.f7350j.get(iM4765a)).setValue(obj);
        }
        m4766b();
        if (this.f7350j.isEmpty() && !(this.f7350j instanceof ArrayList)) {
            this.f7350j = new ArrayList(16);
        }
        int i = -(iM4765a + 1);
        if (i >= 16) {
            return m4769e().put(comparable, obj);
        }
        if (this.f7350j.size() == 16) {
            x81 x81Var = (x81) this.f7350j.remove(15);
            m4769e().put(x81Var.f8863j, x81Var.f8864k);
        }
        this.f7350j.add(i, new x81(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM4765a = m4765a(comparable);
        return iM4765a >= 0 ? ((x81) this.f7350j.get(iM4765a)).f8864k : this.f7351k.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final Object m4771h(int i) {
        m4766b();
        Object obj = ((x81) this.f7350j.remove(i)).f8864k;
        if (!this.f7351k.isEmpty()) {
            Iterator it = m4769e().entrySet().iterator();
            List list = this.f7350j;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x81(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f7350j.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((x81) this.f7350j.get(i)).hashCode();
        }
        return this.f7351k.size() > 0 ? this.f7351k.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4766b();
        Comparable comparable = (Comparable) obj;
        int iM4765a = m4765a(comparable);
        if (iM4765a >= 0) {
            return m4771h(iM4765a);
        }
        if (this.f7351k.isEmpty()) {
            return null;
        }
        return this.f7351k.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7351k.size() + this.f7350j.size();
    }
}
