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

/* loaded from: classes2.dex */
public final class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public I0 f3329a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3330b;

    public l(I0 i02) {
        this.f3330b = new HashMap();
        p3.f.O("ObjectValues should be backed by a MapValue", i02.R() == 11, new Object[0]);
        p3.f.O("ServerTimestamps should not be used as an ObjectValue", !D.A(i02), new Object[0]);
        this.f3329a = i02;
    }

    public static I4.f c(K k7) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : k7.y().entrySet()) {
            j jVar = new j(Collections.singletonList((String) entry.getKey()));
            I0 i02 = (I0) entry.getValue();
            I0 i03 = o.f3334a;
            if (i02 == null || i02.R() != 11) {
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

    public static I0 d(j jVar, I0 i02) {
        if (jVar.isEmpty()) {
            return i02;
        }
        for (int i7 = 0; i7 < jVar.f3312a.size() - 1; i7++) {
            i02 = i02.N().z(jVar.l(i7));
            I0 i03 = o.f3334a;
            if (i02 == null || i02.R() != 11) {
                return null;
            }
        }
        return i02.N().z(jVar.h());
    }

    public static l e(Map map) {
        H0 S6 = I0.S();
        I B7 = K.B();
        B7.d();
        K.v((K) B7.f12096b).putAll(map);
        S6.i(B7);
        return new l((I0) S6.b());
    }

    public final K a(j jVar, Map map) {
        I B7;
        I0 d7 = d(jVar, this.f3329a);
        I0 i02 = o.f3334a;
        if (d7 == null || d7.R() != 11) {
            B7 = K.B();
        } else {
            K N7 = d7.N();
            A a2 = (A) N7.j(5);
            if (!a2.f12095a.equals(N7)) {
                a2.d();
                A.e(a2.f12096b, N7);
            }
            B7 = (I) a2;
        }
        boolean z4 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                K a4 = a((j) jVar.b(str), (Map) value);
                if (a4 != null) {
                    H0 S6 = I0.S();
                    S6.j(a4);
                    B7.f((I0) S6.b(), str);
                    z4 = true;
                }
            } else {
                if (value instanceof I0) {
                    B7.f((I0) value, str);
                } else {
                    B7.getClass();
                    str.getClass();
                    if (((K) B7.f12096b).y().containsKey(str)) {
                        p3.f.O("Expected entry to be a Map, a Value or null", value == null, new Object[0]);
                        B7.d();
                        K.v((K) B7.f12096b).remove(str);
                    }
                }
                z4 = true;
            }
        }
        if (z4) {
            return (K) B7.b();
        }
        return null;
    }

    public final I0 b() {
        synchronized (this.f3330b) {
            try {
                K a2 = a(j.f3322c, this.f3330b);
                if (a2 != null) {
                    H0 S6 = I0.S();
                    S6.j(a2);
                    this.f3329a = (I0) S6.b();
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

    public final void g(j jVar, I0 i02) {
        p3.f.O("Cannot set field for empty path on ObjectValue", !jVar.isEmpty(), new Object[0]);
        i(jVar, i02);
    }

    public final void h(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            j jVar = (j) entry.getKey();
            if (entry.getValue() == null) {
                p3.f.O("Cannot delete field for empty path on ObjectValue", !jVar.isEmpty(), new Object[0]);
                i(jVar, null);
            } else {
                g(jVar, (I0) entry.getValue());
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(j jVar, I0 i02) {
        Map hashMap;
        Map map = this.f3330b;
        for (int i7 = 0; i7 < jVar.f3312a.size() - 1; i7++) {
            String l7 = jVar.l(i7);
            Object obj = map.get(l7);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof I0) {
                    I0 i03 = (I0) obj;
                    if (i03.R() == 11) {
                        HashMap hashMap2 = new HashMap(i03.N().y());
                        map.put(l7, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap();
                map.put(l7, hashMap);
            }
            map = hashMap;
        }
        map.put(jVar.h(), i02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectValue{internalValue=");
        I0 b7 = b();
        I0 i02 = o.f3334a;
        StringBuilder sb2 = new StringBuilder();
        o.a(sb2, b7);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l() {
        this((I0) r0.b());
        H0 S6 = I0.S();
        S6.j(K.w());
    }
}
