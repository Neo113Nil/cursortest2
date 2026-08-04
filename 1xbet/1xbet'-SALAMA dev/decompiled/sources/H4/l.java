package H4;

import Y4.D;
import Y4.H0;
import Y4.I;
import Y4.I0;
import Y4.K;
import com.google.protobuf.A;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I0 f3329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3330b;

    public l(I0 i7) {
        this.f3330b = new HashMap();
        p113p3.f.O("ObjectValues should be backed by a MapValue", i7.R() == 11, new Object[0]);
        p113p3.f.O("ServerTimestamps should not be used as an ObjectValue", !D.A(i7), new Object[0]);
        this.f3329a = i7;
    }

    public static I4.f c(K k7) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : k7.y().entrySet()) {
            j jVar = new j(Collections.singletonList((String) entry.getKey()));
            I0 i7 = (I0) entry.getValue();
            I0 i8 = o.f3334a;
            if (i7 == null || i7.R() != 11) {
                hashSet.add(jVar);
            } else {
                HashSet hashSet2 = c(((I0) entry.getValue()).N()).f3667a;
                if (hashSet2.isEmpty()) {
                    hashSet.add(jVar);
                } else {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        hashSet.add((j) jVar.a((j) it.next()));
                    }
                }
            }
        }
        return new I4.f(hashSet);
    }

    public static I0 d(j jVar, I0 i7) {
        if (jVar.isEmpty()) {
            return i7;
        }
        for (int i8 = 0; i8 < jVar.f3312a.size() - 1; i8++) {
            i7 = i7.N().z(jVar.l(i8));
            I0 i9 = o.f3334a;
            if (i7 == null || i7.R() != 11) {
                return null;
            }
        }
        return i7.N().z(jVar.h());
    }

    public static l e(Map map) {
        H0 h0S = I0.S();
        I iB = K.B();
        iB.d();
        K.v((K) iB.f12096b).putAll(map);
        h0S.i(iB);
        return new l((I0) h0S.b());
    }

    public final K a(j jVar, Map map) {
        I iB;
        I0 i0D = d(jVar, this.f3329a);
        I0 i7 = o.f3334a;
        if (i0D == null || i0D.R() != 11) {
            iB = K.B();
        } else {
            K kN = i0D.N();
            A a2 = (A) kN.j(5);
            if (!a2.f12095a.equals(kN)) {
                a2.d();
                A.e(a2.f12096b, kN);
            }
            iB = (I) a2;
        }
        boolean z4 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                K kA = a((j) jVar.b(str), (Map) value);
                if (kA != null) {
                    H0 h0S = I0.S();
                    h0S.j(kA);
                    iB.f((I0) h0S.b(), str);
                    z4 = true;
                }
            } else {
                if (value instanceof I0) {
                    iB.f((I0) value, str);
                } else {
                    iB.getClass();
                    str.getClass();
                    if (((K) iB.f12096b).y().containsKey(str)) {
                        p113p3.f.O("Expected entry to be a Map, a Value or null", value == null, new Object[0]);
                        iB.d();
                        K.v((K) iB.f12096b).remove(str);
                    }
                }
                z4 = true;
            }
        }
        if (z4) {
            return (K) iB.b();
        }
        return null;
    }

    public final I0 b() {
        synchronized (this.f3330b) {
            try {
                K kA = a(j.f3322c, this.f3330b);
                if (kA != null) {
                    H0 h0S = I0.S();
                    h0S.j(kA);
                    this.f3329a = (I0) h0S.b();
                    this.f3330b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f3329a;
    }

    public final Object clone() {
        return new l(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return o.e(b(), ((l) obj).b());
        }
        return false;
    }

    public final I0 f(j jVar) {
        return d(jVar, b());
    }

    public final void g(j jVar, I0 i7) {
        p113p3.f.O("Cannot set field for empty path on ObjectValue", !jVar.isEmpty(), new Object[0]);
        i(jVar, i7);
    }

    public final void h(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            j jVar = (j) entry.getKey();
            if (entry.getValue() == null) {
                p113p3.f.O("Cannot delete field for empty path on ObjectValue", !jVar.isEmpty(), new Object[0]);
                i(jVar, null);
            } else {
                g(jVar, (I0) entry.getValue());
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(j jVar, I0 i7) {
        Map map;
        Map map2 = this.f3330b;
        for (int i8 = 0; i8 < jVar.f3312a.size() - 1; i8++) {
            String strL = jVar.l(i8);
            Object obj = map2.get(strL);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof I0) {
                    I0 i9 = (I0) obj;
                    if (i9.R() == 11) {
                        HashMap map3 = new HashMap(i9.N().y());
                        map2.put(strL, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strL, map);
            }
            map2 = map;
        }
        map2.put(jVar.h(), i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectValue{internalValue=");
        I0 i0B = b();
        I0 i7 = o.f3334a;
        StringBuilder sb2 = new StringBuilder();
        o.a(sb2, i0B);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        H0 h0S = I0.S();
        h0S.j(K.w());
        this((I0) h0S.b());
    }
}
