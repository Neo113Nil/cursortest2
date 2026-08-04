package p048g4;

import A1.W;
import A4.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f13229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f13230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f13231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f13232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f13233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f13234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f13235g;

    public r(a aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (i iVar : aVar.f13191c) {
            int i7 = iVar.f13214c;
            boolean z4 = i7 == 0;
            int i8 = iVar.f13213b;
            q qVar = iVar.f13212a;
            if (z4) {
                if (i8 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(qVar);
            } else if (i8 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        Set set = aVar.f13195g;
        if (!set.isEmpty()) {
            hashSet.add(q.a(b.class));
        }
        this.f13229a = Collections.unmodifiableSet(hashSet);
        this.f13230b = Collections.unmodifiableSet(hashSet2);
        this.f13231c = Collections.unmodifiableSet(hashSet3);
        this.f13232d = Collections.unmodifiableSet(hashSet4);
        this.f13233e = Collections.unmodifiableSet(hashSet5);
        this.f13234f = set;
        this.f13235g = bVar;
    }

    @Override // p048g4.b
    public final Object a(Class cls) {
        if (this.f13229a.contains(q.a(cls))) {
            Object objA = this.f13235g.a(cls);
            return !cls.equals(b.class) ? objA : new k(this.f13234f, (b) objA);
        }
        throw new W("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // p048g4.b
    public final Set b(q qVar) {
        if (this.f13232d.contains(qVar)) {
            return this.f13235g.b(qVar);
        }
        throw new W("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // p048g4.b
    public final N4.b c(q qVar) {
        if (this.f13230b.contains(qVar)) {
            return this.f13235g.c(qVar);
        }
        throw new W("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // p048g4.b
    public final N4.b d(Class cls) {
        return c(q.a(cls));
    }

    @Override // p048g4.b
    public final o e(q qVar) {
        if (this.f13231c.contains(qVar)) {
            return this.f13235g.e(qVar);
        }
        throw new W("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override // p048g4.b
    public final Object f(q qVar) {
        if (this.f13229a.contains(qVar)) {
            return this.f13235g.f(qVar);
        }
        throw new W("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // p048g4.b
    public final N4.b g(q qVar) {
        if (this.f13233e.contains(qVar)) {
            return this.f13235g.g(qVar);
        }
        throw new W("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // p048g4.b
    public final o h(Class cls) {
        return e(q.a(cls));
    }
}
