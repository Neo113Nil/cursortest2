package p048g4;

import B1.e;
import C0.A;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f13190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f13191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f13194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f13195g;

    public a(String str, Set set, Set set2, int i7, int i8, d dVar, Set set3) {
        this.f13189a = str;
        this.f13190b = Collections.unmodifiableSet(set);
        this.f13191c = Collections.unmodifiableSet(set2);
        this.f13192d = i7;
        this.f13193e = i8;
        this.f13194f = dVar;
        this.f13195g = Collections.unmodifiableSet(set3);
    }

    public static A a(q qVar) {
        return new A(qVar, new q[0]);
    }

    public static a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            f.l(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f13190b.toArray()) + ">{" + this.f13192d + ", type=" + this.f13193e + ", deps=" + Arrays.toString(this.f13191c.toArray()) + "}";
    }
}
