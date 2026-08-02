package P;

import e2.C1930k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: P.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310p extends AbstractC0321v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4498a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4500c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f4501d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4502e = new LinkedHashSet();
    public final C0305m0 f = new C0305m0(X.i.f6059n, Z.f4432n);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0315s f4503g;

    public C0310p(C0315s c0315s, long j5, boolean z3, boolean z5, C1930k c1930k) {
        this.f4503g = c0315s;
        this.f4498a = j5;
        this.f4499b = z3;
        this.f4500c = z5;
    }

    @Override // P.AbstractC0321v
    public final void a(C0327y c0327y, i4.e eVar) {
        this.f4503g.f4534b.a(c0327y, eVar);
    }

    @Override // P.AbstractC0321v
    public final void b() {
        C0315s c0315s = this.f4503g;
        c0315s.f4514A--;
    }

    @Override // P.AbstractC0321v
    public final boolean c() {
        return this.f4503g.f4534b.c();
    }

    @Override // P.AbstractC0321v
    public final boolean d() {
        return this.f4499b;
    }

    @Override // P.AbstractC0321v
    public final boolean e() {
        return this.f4500c;
    }

    @Override // P.AbstractC0321v
    public final long f() {
        return this.f4498a;
    }

    @Override // P.AbstractC0321v
    public final InterfaceC0319u g() {
        return this.f4503g.f4539h;
    }

    @Override // P.AbstractC0321v
    public final InterfaceC0314r0 h() {
        return (InterfaceC0314r0) this.f.getValue();
    }

    @Override // P.AbstractC0321v
    public final a4.h i() {
        return this.f4503g.f4534b.i();
    }

    @Override // P.AbstractC0321v
    public final void j(C0327y c0327y) {
        C0315s c0315s = this.f4503g;
        c0315s.f4534b.j(c0315s.f4539h);
        c0315s.f4534b.j(c0327y);
    }

    @Override // P.AbstractC0321v
    public final AbstractC0285c0 k(AbstractC0287d0 abstractC0287d0) {
        return this.f4503g.f4534b.k(abstractC0287d0);
    }

    @Override // P.AbstractC0321v
    public final void l(Set set) {
        HashSet hashSet = this.f4501d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4501d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // P.AbstractC0321v
    public final void m(C0315s c0315s) {
        this.f4502e.add(c0315s);
    }

    @Override // P.AbstractC0321v
    public final void n(C0327y c0327y) {
        this.f4503g.f4534b.n(c0327y);
    }

    @Override // P.AbstractC0321v
    public final void o() {
        this.f4503g.f4514A++;
    }

    @Override // P.AbstractC0321v
    public final void p(C0315s c0315s) {
        HashSet hashSet = this.f4501d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl", c0315s);
                set.remove(c0315s.f4535c);
            }
        }
        LinkedHashSet linkedHashSet = this.f4502e;
        if (!(linkedHashSet instanceof j4.a) || (linkedHashSet instanceof j4.b)) {
            linkedHashSet.remove(c0315s);
        } else {
            kotlin.jvm.internal.z.d("kotlin.collections.MutableCollection", linkedHashSet);
            throw null;
        }
    }

    @Override // P.AbstractC0321v
    public final void q(C0327y c0327y) {
        this.f4503g.f4534b.q(c0327y);
    }

    public final void r() {
        LinkedHashSet<C0315s> linkedHashSet = this.f4502e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f4501d;
        if (hashSet != null) {
            for (C0315s c0315s : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0315s.f4535c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
