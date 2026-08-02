package g4;

import A1.W;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g4.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1145r implements InterfaceC1129b {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13223a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f13224b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f13225c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f13226d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f13227e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f13228f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1129b f13229g;

    public C1145r(C1128a c1128a, InterfaceC1129b interfaceC1129b) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C1136i c1136i : c1128a.f13185c) {
            int i7 = c1136i.f13208c;
            boolean z4 = i7 == 0;
            int i8 = c1136i.f13207b;
            C1144q c1144q = c1136i.f13206a;
            if (z4) {
                if (i8 == 2) {
                    hashSet4.add(c1144q);
                } else {
                    hashSet.add(c1144q);
                }
            } else if (i7 == 2) {
                hashSet3.add(c1144q);
            } else if (i8 == 2) {
                hashSet5.add(c1144q);
            } else {
                hashSet2.add(c1144q);
            }
        }
        Set set = c1128a.f13189g;
        if (!set.isEmpty()) {
            hashSet.add(C1144q.a(A4.b.class));
        }
        this.f13223a = Collections.unmodifiableSet(hashSet);
        this.f13224b = Collections.unmodifiableSet(hashSet2);
        this.f13225c = Collections.unmodifiableSet(hashSet3);
        this.f13226d = Collections.unmodifiableSet(hashSet4);
        this.f13227e = Collections.unmodifiableSet(hashSet5);
        this.f13228f = set;
        this.f13229g = interfaceC1129b;
    }

    @Override // g4.InterfaceC1129b
    public final Object a(Class cls) {
        if (this.f13223a.contains(C1144q.a(cls))) {
            Object a2 = this.f13229g.a(cls);
            return !cls.equals(A4.b.class) ? a2 : new C1138k(this.f13228f, (A4.b) a2);
        }
        throw new W("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // g4.InterfaceC1129b
    public final Set b(C1144q c1144q) {
        if (this.f13226d.contains(c1144q)) {
            return this.f13229g.b(c1144q);
        }
        throw new W("Attempting to request an undeclared dependency Set<" + c1144q + ">.");
    }

    @Override // g4.InterfaceC1129b
    public final N4.b c(C1144q c1144q) {
        if (this.f13224b.contains(c1144q)) {
            return this.f13229g.c(c1144q);
        }
        throw new W("Attempting to request an undeclared dependency Provider<" + c1144q + ">.");
    }

    @Override // g4.InterfaceC1129b
    public final N4.b d(Class cls) {
        return c(C1144q.a(cls));
    }

    @Override // g4.InterfaceC1129b
    public final C1142o e(C1144q c1144q) {
        if (this.f13225c.contains(c1144q)) {
            return this.f13229g.e(c1144q);
        }
        throw new W("Attempting to request an undeclared dependency Deferred<" + c1144q + ">.");
    }

    @Override // g4.InterfaceC1129b
    public final Object f(C1144q c1144q) {
        if (this.f13223a.contains(c1144q)) {
            return this.f13229g.f(c1144q);
        }
        throw new W("Attempting to request an undeclared dependency " + c1144q + ".");
    }

    @Override // g4.InterfaceC1129b
    public final N4.b g(C1144q c1144q) {
        if (this.f13227e.contains(c1144q)) {
            return this.f13229g.g(c1144q);
        }
        throw new W("Attempting to request an undeclared dependency Provider<Set<" + c1144q + ">>.");
    }

    @Override // g4.InterfaceC1129b
    public final C1142o h(Class cls) {
        return e(C1144q.a(cls));
    }
}
