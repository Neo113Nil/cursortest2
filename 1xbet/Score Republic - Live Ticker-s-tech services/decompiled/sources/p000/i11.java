package p000;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i11 extends AbstractC0649rb {

    /* JADX INFO: renamed from: A */
    public final n11 f3380A;

    /* JADX INFO: renamed from: B */
    public final Class f3381B;

    /* JADX INFO: renamed from: C */
    public final q80 f3382C;

    /* JADX INFO: renamed from: D */
    public w70 f3383D;

    /* JADX INFO: renamed from: E */
    public Object f3384E;

    /* JADX INFO: renamed from: F */
    public ArrayList f3385F;

    /* JADX INFO: renamed from: G */
    public i11 f3386G;

    /* JADX INFO: renamed from: H */
    public i11 f3387H;

    /* JADX INFO: renamed from: I */
    public final boolean f3388I = true;

    /* JADX INFO: renamed from: J */
    public boolean f3389J;

    /* JADX INFO: renamed from: K */
    public boolean f3390K;

    /* JADX INFO: renamed from: z */
    public final Context f3391z;

    static {
    }

    public i11(ComponentCallbacks2C0106a componentCallbacks2C0106a, n11 n11Var, Class cls, Context context) {
        p11 p11Var;
        this.f3380A = n11Var;
        this.f3381B = cls;
        this.f3391z = context;
        C0089c8 c0089c8 = n11Var.f5240j.f1309l.f6409e;
        w70 w70Var = (w70) c0089c8.get(cls);
        if (w70Var == null) {
            for (Map.Entry entry : (C0867x7) c0089c8.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    w70Var = (w70) entry.getValue();
                }
            }
        }
        this.f3383D = w70Var == null ? q80.f6404j : w70Var;
        this.f3382C = componentCallbacks2C0106a.f1309l;
        Iterator it = n11Var.f5248r.iterator();
        while (it.hasNext()) {
            m2516q((r80) it.next());
        }
        synchronized (n11Var) {
            p11Var = n11Var.f5249s;
        }
        mo2514a(p11Var);
    }

    @Override // p000.AbstractC0649rb
    public final boolean equals(Object obj) {
        if (!(obj instanceof i11)) {
            return false;
        }
        i11 i11Var = (i11) obj;
        return super.equals(i11Var) && Objects.equals(this.f3381B, i11Var.f3381B) && this.f3383D.equals(i11Var.f3383D) && Objects.equals(this.f3384E, i11Var.f3384E) && Objects.equals(this.f3385F, i11Var.f3385F) && Objects.equals(this.f3386G, i11Var.f3386G) && Objects.equals(this.f3387H, i11Var.f3387H) && this.f3388I == i11Var.f3388I && this.f3389J == i11Var.f3389J;
    }

    @Override // p000.AbstractC0649rb
    public final int hashCode() {
        return zg1.m5900k(this.f3389J ? 1 : 0, zg1.m5900k(this.f3388I ? 1 : 0, zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(super.hashCode(), this.f3381B), this.f3383D), this.f3384E), this.f3385F), this.f3386G), this.f3387H), null)));
    }

    /* JADX INFO: renamed from: q */
    public final i11 m2516q(r80 r80Var) {
        if (this.f6791w) {
            return clone().m2516q(r80Var);
        }
        if (r80Var != null) {
            if (this.f3385F == null) {
                this.f3385F = new ArrayList();
            }
            this.f3385F.add(r80Var);
        }
        m4293j();
        return this;
    }

    @Override // p000.AbstractC0649rb
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final i11 mo2514a(AbstractC0649rb abstractC0649rb) {
        o80.m3646g(abstractC0649rb);
        return (i11) super.mo2514a(abstractC0649rb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public final h11 m2518s(Object obj, AbstractC0846wn abstractC0846wn, k11 k11Var, w70 w70Var, ex0 ex0Var, int i, int i2, AbstractC0649rb abstractC0649rb) {
        k11 k11Var2;
        k11 c0302hx;
        AbstractC0649rb abstractC0649rb2;
        h11 h81Var;
        ex0 ex0Var2;
        if (this.f3387H != null) {
            c0302hx = new C0302hx(obj, k11Var);
            k11Var2 = c0302hx;
        } else {
            k11Var2 = null;
            c0302hx = k11Var;
        }
        i11 i11Var = this.f3386G;
        if (i11Var == null) {
            Context context = this.f3391z;
            q80 q80Var = this.f3382C;
            abstractC0649rb2 = abstractC0649rb;
            h81Var = new h81(context, q80Var, obj, this.f3384E, this.f3381B, abstractC0649rb2, i, i2, ex0Var, abstractC0846wn, this.f3385F, c0302hx, q80Var.f6410f, w70Var.f8450j);
        } else {
            if (this.f3390K) {
                C0270h1.m2191g("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            w70 w70Var2 = i11Var.f3388I ? w70Var : i11Var.f3383D;
            if (AbstractC0649rb.m4286f(i11Var.f6778j, 8)) {
                ex0Var2 = this.f3386G.f6780l;
            } else {
                int iOrdinal = ex0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    ex0Var2 = ex0.f2198j;
                } else if (iOrdinal == 2) {
                    ex0Var2 = ex0.f2199k;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f6780l);
                    }
                    ex0Var2 = ex0.f2200l;
                }
            }
            ex0 ex0Var3 = ex0Var2;
            i11 i11Var2 = this.f3386G;
            int i3 = i11Var2.f6784p;
            int i4 = i11Var2.f6783o;
            if (zg1.m5903n(i, i2)) {
                i11 i11Var3 = this.f3386G;
                if (!zg1.m5903n(i11Var3.f6784p, i11Var3.f6783o)) {
                    i3 = abstractC0649rb.f6784p;
                    i4 = abstractC0649rb.f6783o;
                }
            }
            int i5 = i4;
            id1 id1Var = new id1(obj, c0302hx);
            Context context2 = this.f3391z;
            q80 q80Var2 = this.f3382C;
            h81 h81Var2 = new h81(context2, q80Var2, obj, this.f3384E, this.f3381B, abstractC0649rb, i, i2, ex0Var, abstractC0846wn, this.f3385F, id1Var, q80Var2.f6410f, w70Var.f8450j);
            this.f3390K = true;
            i11 i11Var4 = this.f3386G;
            h11 h11VarM2518s = i11Var4.m2518s(obj, abstractC0846wn, id1Var, w70Var2, ex0Var3, i3, i5, i11Var4);
            this.f3390K = false;
            id1Var.f3551c = h81Var2;
            id1Var.f3552d = h11VarM2518s;
            abstractC0649rb2 = abstractC0649rb;
            h81Var = id1Var;
        }
        if (k11Var2 == null) {
            return h81Var;
        }
        i11 i11Var5 = this.f3387H;
        int i6 = i11Var5.f6784p;
        int i7 = i11Var5.f6783o;
        if (zg1.m5903n(i, i2)) {
            i11 i11Var6 = this.f3387H;
            if (!zg1.m5903n(i11Var6.f6784p, i11Var6.f6783o)) {
                i6 = abstractC0649rb2.f6784p;
                i7 = abstractC0649rb2.f6783o;
            }
        }
        i11 i11Var7 = this.f3387H;
        C0302hx c0302hx2 = k11Var2;
        h11 h11VarM2518s2 = i11Var7.m2518s(obj, abstractC0846wn, c0302hx2, i11Var7.f3383D, i11Var7.f6780l, i6, i7, i11Var7);
        c0302hx2.f3354c = h81Var;
        c0302hx2.f3355d = h11VarM2518s2;
        return c0302hx2;
    }

    @Override // p000.AbstractC0649rb
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final i11 clone() {
        i11 i11Var = (i11) super.clone();
        i11Var.f3383D = i11Var.f3383D.clone();
        if (i11Var.f3385F != null) {
            i11Var.f3385F = new ArrayList(i11Var.f3385F);
        }
        i11 i11Var2 = i11Var.f3386G;
        if (i11Var2 != null) {
            i11Var.f3386G = i11Var2.clone();
        }
        i11 i11Var3 = i11Var.f3387H;
        if (i11Var3 != null) {
            i11Var.f3387H = i11Var3.clone();
        }
        return i11Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m2520u(AbstractC0846wn abstractC0846wn) {
        o80.m3646g(abstractC0846wn);
        if (!this.f3389J) {
            C0270h1.m2190f("You must call #load() before calling #into()");
            return;
        }
        h11 h11VarM2518s = m2518s(new Object(), abstractC0846wn, null, this.f3383D, this.f6780l, this.f6784p, this.f6783o, this);
        h11 h11Var = abstractC0846wn.f8591l;
        if (h11VarM2518s.mo2195b(h11Var) && (this.f6782n || !h11Var.mo2199k())) {
            o80.m3647h(h11Var, "Argument must not be null");
            if (h11Var.isRunning()) {
                return;
            }
            h11Var.mo2198j();
            return;
        }
        this.f3380A.m3461d(abstractC0846wn);
        abstractC0846wn.f8591l = h11VarM2518s;
        n11 n11Var = this.f3380A;
        synchronized (n11Var) {
            n11Var.f5245o.f5700j.add(abstractC0846wn);
            m81 m81Var = n11Var.f5243m;
            ((Set) m81Var.f5010l).add(h11VarM2518s);
            if (m81Var.f5009k) {
                h11VarM2518s.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) m81Var.f5011m).add(h11VarM2518s);
            } else {
                h11VarM2518s.mo2198j();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final i11 m2521v(Object obj) {
        if (this.f6791w) {
            return clone().m2521v(obj);
        }
        this.f3384E = obj;
        this.f3389J = true;
        m4293j();
        return this;
    }
}
