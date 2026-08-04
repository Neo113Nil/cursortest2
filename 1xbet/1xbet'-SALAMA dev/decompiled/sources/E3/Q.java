package E3;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Q implements Map, Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Q f2012x = new Q(null, new Object[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient N f2013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient O f2014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient P f2015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f2016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f2017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f2018f;

    public Q(Object obj, Object[] objArr, int i7) {
        this.f2016d = obj;
        this.f2017e = objArr;
        this.f2018f = i7;
    }

    public static Q a(Map map) {
        if ((map instanceof Q) && !(map instanceof SortedMap)) {
            Q q7 = (Q) map;
            q7.getClass();
            return q7;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        B1.m mVar = new B1.m(setEntrySet != null ? setEntrySet.size() : 4, 3);
        if (setEntrySet != null) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) mVar.f1015c;
            if (size > objArr.length) {
                mVar.f1015c = Arrays.copyOf(objArr, C0164w.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            mVar.o(entry.getKey(), entry.getValue());
        }
        return mVar.i();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B entrySet() {
        N n2 = this.f2013a;
        if (n2 != null) {
            return n2;
        }
        N n7 = new N(this, this.f2017e, this.f2018f);
        this.f2013a = n7;
        return n7;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        P p5 = this.f2015c;
        if (p5 == null) {
            p5 = new P(this.f2017e, 1, this.f2018f);
            this.f2015c = p5;
        }
        return p5.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0158p.b(this, obj);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f2017e;
            if (this.f2018f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f2016d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iK = AbstractC0158p.k(obj.hashCode());
                    while (true) {
                        int i7 = iK & length;
                        int i8 = bArr[i7] & 255;
                        if (i8 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            obj2 = objArr[i8 ^ 1];
                        } else {
                            iK = i7 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iK2 = AbstractC0158p.k(obj.hashCode());
                    while (true) {
                        int i9 = iK2 & length2;
                        int i10 = sArr[i9] & 65535;
                        if (i10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            obj2 = objArr[i10 ^ 1];
                        } else {
                            iK2 = i9 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iK3 = AbstractC0158p.k(obj.hashCode());
                    while (true) {
                        int i11 = iK3 & length3;
                        int i12 = iArr[i11];
                        if (i12 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iK3 = i11 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0158p.g(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        O o7 = this.f2014b;
        if (o7 != null) {
            return o7;
        }
        O o8 = new O(this, new P(this.f2017e, 0, this.f2018f));
        this.f2014b = o8;
        return o8;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2018f;
    }

    public final String toString() {
        int i7 = this.f2018f;
        AbstractC0158p.a(i7, RRWebVideoEvent.JsonKeys.SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i7) * 8, 1073741824L));
        sb.append('{');
        a0 it = ((N) entrySet()).iterator();
        boolean z4 = true;
        while (true) {
            C0165x c0165x = (C0165x) it;
            if (!c0165x.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c0165x.next();
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        P p5 = this.f2015c;
        if (p5 != null) {
            return p5;
        }
        P p7 = new P(this.f2017e, 1, this.f2018f);
        this.f2015c = p7;
        return p7;
    }
}
