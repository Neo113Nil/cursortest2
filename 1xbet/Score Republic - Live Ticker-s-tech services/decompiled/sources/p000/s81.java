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
public final class s81 extends AbstractMap {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f7051p = 0;

    /* JADX INFO: renamed from: j */
    public final int f7052j;

    /* JADX INFO: renamed from: k */
    public List f7053k = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: l */
    public Map f7054l;

    /* JADX INFO: renamed from: m */
    public boolean f7055m;

    /* JADX INFO: renamed from: n */
    public volatile C0867x7 f7056n;

    /* JADX INFO: renamed from: o */
    public Map f7057o;

    public s81(int i) {
        this.f7052j = i;
        Map map = Collections.EMPTY_MAP;
        this.f7054l = map;
        this.f7057o = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m4499a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f7053k.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((w81) this.f7053k.get(i3)).f8458j);
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
            int iCompareTo2 = comparable.compareTo(((w81) this.f7053k.get(i4)).f8458j);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((w81) this.f7053k.get(i3)).f8458j);
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
    public final void m4500b() {
        if (this.f7055m) {
            dd0.m1164i();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m4501c(int i) {
        return (Map.Entry) this.f7053k.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4500b();
        if (!this.f7053k.isEmpty()) {
            this.f7053k.clear();
        }
        if (this.f7054l.isEmpty()) {
            return;
        }
        this.f7054l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m4499a(comparable) >= 0 || this.f7054l.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m4502d() {
        return this.f7054l.isEmpty() ? vk1.f8210c : this.f7054l.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m4503e() {
        m4500b();
        if (this.f7054l.isEmpty() && !(this.f7054l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7054l = treeMap;
            this.f7057o = treeMap.descendingMap();
        }
        return (SortedMap) this.f7054l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7056n == null) {
            this.f7056n = new C0867x7(1, this);
        }
        return this.f7056n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s81)) {
            return super.equals(obj);
        }
        s81 s81Var = (s81) obj;
        int size = size();
        if (size == s81Var.size()) {
            int size2 = this.f7053k.size();
            if (size2 != s81Var.f7053k.size()) {
                return ((AbstractSet) entrySet()).equals(s81Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m4501c(i).equals(s81Var.m4501c(i))) {
                }
            }
            if (size2 != size) {
                return this.f7054l.equals(s81Var.f7054l);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m4500b();
        int iM4499a = m4499a(comparable);
        if (iM4499a >= 0) {
            return ((w81) this.f7053k.get(iM4499a)).setValue(obj);
        }
        m4500b();
        boolean zIsEmpty = this.f7053k.isEmpty();
        int i = this.f7052j;
        if (zIsEmpty && !(this.f7053k instanceof ArrayList)) {
            this.f7053k = new ArrayList(i);
        }
        int i2 = -(iM4499a + 1);
        if (i2 >= i) {
            return m4503e().put(comparable, obj);
        }
        if (this.f7053k.size() == i) {
            w81 w81Var = (w81) this.f7053k.remove(i - 1);
            m4503e().put(w81Var.f8458j, w81Var.f8459k);
        }
        this.f7053k.add(i2, new w81(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4505g(int i) {
        m4500b();
        Object obj = ((w81) this.f7053k.remove(i)).f8459k;
        if (!this.f7054l.isEmpty()) {
            Iterator it = m4503e().entrySet().iterator();
            List list = this.f7053k;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new w81(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM4499a = m4499a(comparable);
        return iM4499a >= 0 ? ((w81) this.f7053k.get(iM4499a)).f8459k : this.f7054l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f7053k.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((w81) this.f7053k.get(i)).hashCode();
        }
        return this.f7054l.size() > 0 ? this.f7054l.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4500b();
        Comparable comparable = (Comparable) obj;
        int iM4499a = m4499a(comparable);
        if (iM4499a >= 0) {
            return m4505g(iM4499a);
        }
        if (this.f7054l.isEmpty()) {
            return null;
        }
        return this.f7054l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7054l.size() + this.f7053k.size();
    }
}
