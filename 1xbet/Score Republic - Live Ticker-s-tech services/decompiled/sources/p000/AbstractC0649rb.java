package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: rb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0649rb implements Cloneable {

    /* JADX INFO: renamed from: j */
    public int f6778j;

    /* JADX INFO: renamed from: m */
    public int f6781m;

    /* JADX INFO: renamed from: r */
    public boolean f6786r;

    /* JADX INFO: renamed from: v */
    public boolean f6790v;

    /* JADX INFO: renamed from: w */
    public boolean f6791w;

    /* JADX INFO: renamed from: y */
    public boolean f6793y;

    /* JADX INFO: renamed from: k */
    public C0371jt f6779k = C0371jt.f4090d;

    /* JADX INFO: renamed from: l */
    public ex0 f6780l = ex0.f2200l;

    /* JADX INFO: renamed from: n */
    public boolean f6782n = true;

    /* JADX INFO: renamed from: o */
    public int f6783o = -1;

    /* JADX INFO: renamed from: p */
    public int f6784p = -1;

    /* JADX INFO: renamed from: q */
    public xg0 f6785q = C0522nw.f5558b;

    /* JADX INFO: renamed from: s */
    public uu0 f6787s = new uu0();

    /* JADX INFO: renamed from: t */
    public C0910yd f6788t = new C0910yd(0);

    /* JADX INFO: renamed from: u */
    public Class f6789u = Object.class;

    /* JADX INFO: renamed from: x */
    public boolean f6792x = true;

    /* JADX INFO: renamed from: f */
    public static boolean m4286f(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0649rb mo2514a(AbstractC0649rb abstractC0649rb) {
        if (this.f6791w) {
            return clone().mo2514a(abstractC0649rb);
        }
        int i = abstractC0649rb.f6778j;
        if (m4286f(abstractC0649rb.f6778j, 1048576)) {
            this.f6793y = abstractC0649rb.f6793y;
        }
        if (m4286f(abstractC0649rb.f6778j, 4)) {
            this.f6779k = abstractC0649rb.f6779k;
        }
        if (m4286f(abstractC0649rb.f6778j, 8)) {
            this.f6780l = abstractC0649rb.f6780l;
        }
        if (m4286f(abstractC0649rb.f6778j, 16)) {
            this.f6778j &= -33;
        }
        if (m4286f(abstractC0649rb.f6778j, 32)) {
            this.f6778j &= -17;
        }
        if (m4286f(abstractC0649rb.f6778j, 64)) {
            this.f6781m = 0;
            this.f6778j &= -129;
        }
        if (m4286f(abstractC0649rb.f6778j, 128)) {
            this.f6781m = abstractC0649rb.f6781m;
            this.f6778j &= -65;
        }
        if (m4286f(abstractC0649rb.f6778j, 256)) {
            this.f6782n = abstractC0649rb.f6782n;
        }
        if (m4286f(abstractC0649rb.f6778j, 512)) {
            this.f6784p = abstractC0649rb.f6784p;
            this.f6783o = abstractC0649rb.f6783o;
        }
        if (m4286f(abstractC0649rb.f6778j, 1024)) {
            this.f6785q = abstractC0649rb.f6785q;
        }
        if (m4286f(abstractC0649rb.f6778j, 4096)) {
            this.f6789u = abstractC0649rb.f6789u;
        }
        if (m4286f(abstractC0649rb.f6778j, 8192)) {
            this.f6778j &= -16385;
        }
        if (m4286f(abstractC0649rb.f6778j, 16384)) {
            this.f6778j &= -8193;
        }
        if (m4286f(abstractC0649rb.f6778j, 131072)) {
            this.f6786r = abstractC0649rb.f6786r;
        }
        if (m4286f(abstractC0649rb.f6778j, 2048)) {
            this.f6788t.putAll(abstractC0649rb.f6788t);
            this.f6792x = abstractC0649rb.f6792x;
        }
        this.f6778j |= abstractC0649rb.f6778j;
        this.f6787s.f7909b.mo5300g(abstractC0649rb.f6787s.f7909b);
        m4293j();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0649rb clone() {
        try {
            AbstractC0649rb abstractC0649rb = (AbstractC0649rb) super.clone();
            uu0 uu0Var = new uu0();
            abstractC0649rb.f6787s = uu0Var;
            uu0Var.f7909b.mo5300g(this.f6787s.f7909b);
            C0910yd c0910yd = new C0910yd(0);
            abstractC0649rb.f6788t = c0910yd;
            c0910yd.putAll(this.f6788t);
            abstractC0649rb.f6790v = false;
            abstractC0649rb.f6791w = false;
            return abstractC0649rb;
        } catch (CloneNotSupportedException e) {
            dd0.m1163h(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0649rb m4287c(Class cls) {
        if (this.f6791w) {
            return clone().m4287c(cls);
        }
        this.f6789u = cls;
        this.f6778j |= 4096;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0649rb m4288d(C0371jt c0371jt) {
        if (this.f6791w) {
            return clone().m4288d(c0371jt);
        }
        this.f6779k = c0371jt;
        this.f6778j |= 4;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4289e(AbstractC0649rb abstractC0649rb) {
        abstractC0649rb.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f6781m == abstractC0649rb.f6781m && this.f6782n == abstractC0649rb.f6782n && this.f6783o == abstractC0649rb.f6783o && this.f6784p == abstractC0649rb.f6784p && this.f6786r == abstractC0649rb.f6786r && this.f6779k.equals(abstractC0649rb.f6779k) && this.f6780l == abstractC0649rb.f6780l && this.f6787s.equals(abstractC0649rb.f6787s) && this.f6788t.equals(abstractC0649rb.f6788t) && this.f6789u.equals(abstractC0649rb.f6789u) && this.f6785q.equals(abstractC0649rb.f6785q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0649rb) {
            return m4289e((AbstractC0649rb) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0649rb m4290g(int i, int i2) {
        if (this.f6791w) {
            return clone().m4290g(i, i2);
        }
        this.f6784p = i;
        this.f6783o = i2;
        this.f6778j |= 512;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0649rb m4291h() {
        if (this.f6791w) {
            return clone().m4291h();
        }
        this.f6781m = R.drawable.image_placeholder;
        this.f6778j = (this.f6778j | 128) & (-65);
        m4293j();
        return this;
    }

    public int hashCode() {
        return zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5901l(zg1.m5900k(0, zg1.m5900k(0, zg1.m5900k(1, zg1.m5900k(this.f6786r ? 1 : 0, zg1.m5900k(this.f6784p, zg1.m5900k(this.f6783o, zg1.m5900k(this.f6782n ? 1 : 0, zg1.m5901l(zg1.m5900k(0, zg1.m5901l(zg1.m5900k(this.f6781m, zg1.m5901l(zg1.m5900k(0, zg1.m5900k(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f6779k), this.f6780l), this.f6787s), this.f6788t), this.f6789u), this.f6785q), null);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0649rb m4292i() {
        if (this.f6791w) {
            return clone().m4292i();
        }
        this.f6780l = ex0.f2201m;
        this.f6778j |= 8;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m4293j() {
        if (this.f6790v) {
            C0270h1.m2191g("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC0649rb m4294k(ru0 ru0Var) {
        if (this.f6791w) {
            return clone().m4294k(ru0Var);
        }
        o80.m3646g(ru0Var);
        this.f6787s.f7909b.put(ru0Var, EnumC0034aq.f592j);
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0649rb m4295l(us0 us0Var) {
        if (this.f6791w) {
            return clone().m4295l(us0Var);
        }
        this.f6785q = us0Var;
        this.f6778j |= 1024;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC0649rb m4296m() {
        if (this.f6791w) {
            return clone().m4296m();
        }
        this.f6782n = false;
        this.f6778j |= 256;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0649rb m4297n(ie1 ie1Var) {
        if (this.f6791w) {
            return clone().m4297n(ie1Var);
        }
        C0853wu c0853wu = new C0853wu(ie1Var);
        m4298o(Bitmap.class, ie1Var);
        m4298o(Drawable.class, c0853wu);
        m4298o(BitmapDrawable.class, c0853wu);
        m4298o(b80.class, new d80(ie1Var));
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0649rb m4298o(Class cls, ie1 ie1Var) {
        if (this.f6791w) {
            return clone().m4298o(cls, ie1Var);
        }
        o80.m3646g(ie1Var);
        this.f6788t.put(cls, ie1Var);
        int i = this.f6778j;
        this.f6792x = false;
        this.f6778j = i | 198656;
        this.f6786r = true;
        m4293j();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC0649rb m4299p() {
        if (this.f6791w) {
            return clone().m4299p();
        }
        this.f6793y = true;
        this.f6778j |= 1048576;
        m4293j();
        return this;
    }
}
