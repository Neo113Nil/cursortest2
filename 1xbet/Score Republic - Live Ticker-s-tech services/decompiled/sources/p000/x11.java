package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x11 implements xg0 {

    /* JADX INFO: renamed from: j */
    public static final qk0 f8741j = new qk0(50);

    /* JADX INFO: renamed from: b */
    public final nk0 f8742b;

    /* JADX INFO: renamed from: c */
    public final xg0 f8743c;

    /* JADX INFO: renamed from: d */
    public final xg0 f8744d;

    /* JADX INFO: renamed from: e */
    public final int f8745e;

    /* JADX INFO: renamed from: f */
    public final int f8746f;

    /* JADX INFO: renamed from: g */
    public final Class f8747g;

    /* JADX INFO: renamed from: h */
    public final uu0 f8748h;

    /* JADX INFO: renamed from: i */
    public final ie1 f8749i;

    public x11(nk0 nk0Var, xg0 xg0Var, xg0 xg0Var2, int i, int i2, ie1 ie1Var, Class cls, uu0 uu0Var) {
        this.f8742b = nk0Var;
        this.f8743c = xg0Var;
        this.f8744d = xg0Var2;
        this.f8745e = i;
        this.f8746f = i2;
        this.f8749i = ie1Var;
        this.f8747g = cls;
        this.f8748h = uu0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        Object objM3545e;
        nk0 nk0Var = this.f8742b;
        synchronized (nk0Var) {
            mk0 mk0Var = nk0Var.f5447b;
            jw0 jw0VarM3399B = (jw0) ((ArrayDeque) mk0Var.f7192j).poll();
            if (jw0VarM3399B == null) {
                jw0VarM3399B = mk0Var.m3399B();
            }
            lk0 lk0Var = (lk0) jw0VarM3399B;
            lk0Var.f4817b = 8;
            lk0Var.f4818c = byte[].class;
            objM3545e = nk0Var.m3545e(lk0Var, byte[].class);
        }
        byte[] bArr = (byte[]) objM3545e;
        ByteBuffer.wrap(bArr).putInt(this.f8745e).putInt(this.f8746f).array();
        this.f8744d.mo1038b(messageDigest);
        this.f8743c.mo1038b(messageDigest);
        messageDigest.update(bArr);
        ie1 ie1Var = this.f8749i;
        if (ie1Var != null) {
            ie1Var.mo1038b(messageDigest);
        }
        this.f8748h.mo1038b(messageDigest);
        qk0 qk0Var = f8741j;
        Class cls = this.f8747g;
        byte[] bytes = (byte[]) qk0Var.m4106a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(xg0.f8961a);
            qk0Var.m4108d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f8742b.m3547g(bArr);
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof x11) {
            x11 x11Var = (x11) obj;
            if (this.f8746f == x11Var.f8746f && this.f8745e == x11Var.f8745e && zg1.m5892c(this.f8749i, x11Var.f8749i) && this.f8747g.equals(x11Var.f8747g) && this.f8743c.equals(x11Var.f8743c) && this.f8744d.equals(x11Var.f8744d) && this.f8748h.equals(x11Var.f8748h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        int iHashCode = ((((this.f8744d.hashCode() + (this.f8743c.hashCode() * 31)) * 31) + this.f8745e) * 31) + this.f8746f;
        ie1 ie1Var = this.f8749i;
        if (ie1Var != null) {
            iHashCode = (iHashCode * 31) + ie1Var.hashCode();
        }
        int iHashCode2 = this.f8747g.hashCode();
        return this.f8748h.f7909b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8743c + ", signature=" + this.f8744d + ", width=" + this.f8745e + ", height=" + this.f8746f + ", decodedResourceClass=" + this.f8747g + ", transformation='" + this.f8749i + "', options=" + this.f8748h + '}';
    }
}
