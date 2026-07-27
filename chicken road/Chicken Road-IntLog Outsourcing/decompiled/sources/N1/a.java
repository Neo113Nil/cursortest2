package N1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f1997b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1998c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1999d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2000e;

    /* renamed from: f, reason: collision with root package name */
    public final d f2001f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2002g;

    public a(String str, Set set, Set set2, int i2, int i3, d dVar, Set set3) {
        this.f1996a = str;
        this.f1997b = Collections.unmodifiableSet(set);
        this.f1998c = Collections.unmodifiableSet(set2);
        this.f1999d = i2;
        this.f2000e = i3;
        this.f2001f = dVar;
        this.f2002g = Collections.unmodifiableSet(set3);
    }

    public static G2.d a(q qVar) {
        return new G2.d(qVar, new q[0]);
    }

    public static a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            B0.f.g(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new D3.g(11, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f1997b.toArray()) + ">{" + this.f1999d + ", type=" + this.f2000e + ", deps=" + Arrays.toString(this.f1998c.toArray()) + "}";
    }
}
