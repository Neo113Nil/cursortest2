package G2;

import N1.q;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f935b;

    /* renamed from: c, reason: collision with root package name */
    public Object f936c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f937d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f938e;

    /* renamed from: f, reason: collision with root package name */
    public Object f939f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f940g;

    public d(Class cls, Class[] clsArr) {
        this.f936c = null;
        HashSet hashSet = new HashSet();
        this.f937d = hashSet;
        this.f938e = new HashSet();
        this.f934a = 0;
        this.f935b = 0;
        this.f940g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            B0.f.g(cls2, "Null interface");
            ((HashSet) this.f937d).add(q.a(cls2));
        }
    }

    public void a(N1.i iVar) {
        if (((HashSet) this.f937d).contains(iVar.f2019a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f938e).add(iVar);
    }

    public N1.a b() {
        if (((N1.d) this.f939f) != null) {
            return new N1.a((String) this.f936c, new HashSet((HashSet) this.f937d), new HashSet((HashSet) this.f938e), this.f934a, this.f935b, (N1.d) this.f939f, (HashSet) this.f940g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public d(q qVar, q[] qVarArr) {
        this.f936c = null;
        HashSet hashSet = new HashSet();
        this.f937d = hashSet;
        this.f938e = new HashSet();
        this.f934a = 0;
        this.f935b = 0;
        this.f940g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            B0.f.g(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f937d, qVarArr);
    }

    public d(Integer num, int i2, Boolean bool, Integer num2, int i3, Integer num3, Boolean bool2) {
        this.f936c = num;
        this.f934a = i2;
        this.f939f = bool;
        this.f937d = num2;
        this.f935b = i3;
        this.f938e = num3;
        this.f940g = bool2;
    }
}
