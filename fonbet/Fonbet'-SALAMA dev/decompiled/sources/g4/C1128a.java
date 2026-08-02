package g4;

import C0.A;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1128a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13183a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f13184b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f13185c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13186d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13187e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1131d f13188f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f13189g;

    public C1128a(String str, Set set, Set set2, int i7, int i8, InterfaceC1131d interfaceC1131d, Set set3) {
        this.f13183a = str;
        this.f13184b = Collections.unmodifiableSet(set);
        this.f13185c = Collections.unmodifiableSet(set2);
        this.f13186d = i7;
        this.f13187e = i8;
        this.f13188f = interfaceC1131d;
        this.f13189g = Collections.unmodifiableSet(set3);
    }

    public static A a(C1144q c1144q) {
        return new A(c1144q, new C1144q[0]);
    }

    public static C1128a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1144q.a(cls));
        for (Class cls2 : clsArr) {
            p3.f.l(cls2, "Null interface");
            hashSet.add(C1144q.a(cls2));
        }
        return new C1128a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new B1.e(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f13184b.toArray()) + ">{" + this.f13186d + ", type=" + this.f13187e + ", deps=" + Arrays.toString(this.f13185c.toArray()) + "}";
    }
}
