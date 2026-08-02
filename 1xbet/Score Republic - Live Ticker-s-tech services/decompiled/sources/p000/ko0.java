package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 implements Closeable {

    /* JADX INFO: renamed from: A */
    public volatile boolean f4468A;

    /* JADX INFO: renamed from: j */
    public kt0 f4469j;

    /* JADX INFO: renamed from: k */
    public int f4470k;

    /* JADX INFO: renamed from: l */
    public final ha1 f4471l;

    /* JADX INFO: renamed from: m */
    public final C0312i6 f4472m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0951zh f4473n;

    /* JADX INFO: renamed from: o */
    public byte[] f4474o;

    /* JADX INFO: renamed from: p */
    public int f4475p;

    /* JADX INFO: renamed from: q */
    public int f4476q;

    /* JADX INFO: renamed from: r */
    public int f4477r;

    /* JADX INFO: renamed from: s */
    public boolean f4478s;

    /* JADX INFO: renamed from: t */
    public C0769uk f4479t;

    /* JADX INFO: renamed from: u */
    public C0769uk f4480u;

    /* JADX INFO: renamed from: v */
    public long f4481v;

    /* JADX INFO: renamed from: w */
    public boolean f4482w;

    /* JADX INFO: renamed from: x */
    public int f4483x;

    /* JADX INFO: renamed from: y */
    public int f4484y;

    /* JADX INFO: renamed from: z */
    public boolean f4485z;

    public ko0(kt0 kt0Var, int i, ha1 ha1Var, C0312i6 c0312i6) {
        wa0 wa0Var = wa0.f8471k;
        this.f4476q = 1;
        this.f4477r = 5;
        this.f4480u = new C0769uk();
        this.f4482w = false;
        this.f4483x = -1;
        this.f4485z = false;
        this.f4468A = false;
        this.f4469j = kt0Var;
        this.f4473n = wa0Var;
        this.f4470k = i;
        this.f4471l = ha1Var;
        a90.m127k(c0312i6, "transportTracer");
        this.f4472m = c0312i6;
    }

    /* JADX INFO: renamed from: a */
    public final void m3059a() {
        String str;
        if (this.f4482w) {
            return;
        }
        boolean z = true;
        this.f4482w = true;
        while (!this.f4468A && this.f4481v > 0 && m3062j()) {
            try {
                int iM292o = AbstractC0024an.m292o(this.f4476q);
                if (iM292o == 0) {
                    m3061i();
                } else {
                    if (iM292o != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i = this.f4476q;
                        if (i != 1) {
                            str = i != 2 ? "null" : "BODY";
                        } else {
                            str = "HEADER";
                        }
                        sb.append(str);
                        throw new AssertionError(sb.toString());
                    }
                    m3060e();
                    this.f4481v--;
                }
            } catch (Throwable th) {
                this.f4482w = false;
                throw th;
            }
        }
        if (this.f4468A) {
            close();
            this.f4482w = false;
            return;
        }
        if (this.f4485z) {
            if (this.f4480u.f7836l != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.f4482w = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        C0769uk c0769uk = this.f4479t;
        boolean z = c0769uk != null && c0769uk.f7836l > 0;
        try {
            C0769uk c0769uk2 = this.f4480u;
            if (c0769uk2 != null) {
                c0769uk2.close();
            }
            C0769uk c0769uk3 = this.f4479t;
            if (c0769uk3 != null) {
                c0769uk3.close();
            }
            this.f4480u = null;
            this.f4479t = null;
            kt0 kt0Var = this.f4469j;
            EnumC0544oh enumC0544oh = EnumC0544oh.f5731j;
            boolean z2 = kt0Var.f4537n;
            ot0 ot0Var = kt0Var.f4518F;
            int i = kt0Var.f4522J;
            if (z2) {
                ot0Var.m3774h(i, null, enumC0544oh, false, null, null);
            } else {
                ot0Var.m3774h(i, null, enumC0544oh, false, EnumC0227fx.f2521r, null);
            }
            a90.m132p("status should have been reported on deframer closed", kt0Var.f4538o);
            kt0Var.f4535l = true;
            if (kt0Var.f4539p && z) {
                kt0Var.m3087m(ja1.f3882l.m2840h("Encountered end-of-stream mid-frame"), true, new np0());
            }
            RunnableC0452m runnableC0452m = kt0Var.f4536m;
            if (runnableC0452m != null) {
                runnableC0452m.run();
                kt0Var.f4536m = null;
            }
        } catch (Throwable th) {
            this.f4480u = null;
            this.f4479t = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3060e() {
        Object jo0Var;
        int i = this.f4483x;
        long j = this.f4484y;
        ha1 ha1Var = this.f4471l;
        boolean z = false;
        for (o80 o80Var : ha1Var.f3140a) {
            o80Var.mo1313o(i, j);
        }
        this.f4484y = 0;
        if (this.f4478s) {
            InterfaceC0951zh interfaceC0951zh = this.f4473n;
            if (interfaceC0951zh == wa0.f8471k) {
                throw ja1.f3882l.m2840h("Can't decode compressed gRPC message as compression not configured").m2836a();
            }
            try {
                C0769uk c0769uk = this.f4479t;
                c01 c01Var = d01.f1505a;
                b01 b01Var = new b01();
                a90.m127k(c0769uk, "buffer");
                b01Var.f666j = c0769uk;
                jo0Var = new jo0(interfaceC0951zh.mo3516F(b01Var), this.f4470k, ha1Var);
            } catch (IOException e) {
                dd0.m1163h(e);
                return;
            }
        } else {
            long j2 = this.f4479t.f7836l;
            o80[] o80VarArr = ha1Var.f3140a;
            for (o80 o80Var2 : o80VarArr) {
                o80Var2.mo1315q(j2);
            }
            C0769uk c0769uk2 = this.f4479t;
            c01 c01Var2 = d01.f1505a;
            b01 b01Var2 = new b01();
            a90.m127k(c0769uk2, "buffer");
            b01Var2.f666j = c0769uk2;
            jo0Var = b01Var2;
        }
        this.f4479t.getClass();
        this.f4479t = null;
        kt0 kt0Var = this.f4469j;
        an0 an0Var = new an0(2, z);
        an0Var.f254k = jo0Var;
        kt0Var.f4533j.mo1036i(an0Var);
        this.f4476q = 1;
        this.f4477r = 5;
    }

    /* JADX INFO: renamed from: i */
    public final void m3061i() {
        int iMo829p = this.f4479t.mo829p();
        if ((iMo829p & 254) != 0) {
            throw ja1.f3882l.m2840h("gRPC frame header malformed: reserved bits not zero").m2836a();
        }
        this.f4478s = (iMo829p & 1) != 0;
        C0769uk c0769uk = this.f4479t;
        c0769uk.m3608a(4);
        int iMo829p2 = c0769uk.mo829p() | (c0769uk.mo829p() << 24) | (c0769uk.mo829p() << 16) | (c0769uk.mo829p() << 8);
        this.f4477r = iMo829p2;
        if (iMo829p2 < 0 || iMo829p2 > this.f4470k) {
            ja1 ja1Var = ja1.f3880j;
            Locale locale = Locale.US;
            throw ja1Var.m2840h("gRPC message exceeds maximum size " + this.f4470k + ": " + iMo829p2).m2836a();
        }
        int i = this.f4483x + 1;
        this.f4483x = i;
        for (o80 o80Var : this.f4471l.f3140a) {
            o80Var.mo1312n(i);
        }
        C0312i6 c0312i6 = this.f4472m;
        ((jk0) c0312i6.f3448l).mo614j();
        ((nc1) c0312i6.f3447k).m3517H();
        this.f4476q = 2;
    }

    public final boolean isClosed() {
        return this.f4480u == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8.f4476q == 2) goto L17;
     */
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
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3062j() throws Throwable {
        ha1 ha1Var = this.f4471l;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        try {
            if (this.f4479t == null) {
                this.f4479t = new C0769uk();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f4477r - this.f4479t.f7836l;
                    if (i3 <= 0) {
                        z = true;
                        if (i2 > 0) {
                            this.f4469j.m3078c(i2);
                        }
                        return true;
                    }
                    int i4 = this.f4480u.f7836l;
                    if (i4 == 0) {
                        if (i2 > 0) {
                            this.f4469j.m3078c(i2);
                            if (this.f4476q == 2) {
                                break;
                            }
                        }
                        return z;
                    }
                    int iMin = Math.min(i3, i4);
                    i2 += iMin;
                    this.f4479t.m4929t(this.f4480u.mo825j(iMin));
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.f4469j.m3078c(i);
                        if (this.f4476q == 2) {
                            ha1Var.m2244a(i);
                            this.f4484y += i;
                        }
                    }
                    throw th;
                }
            }
            ha1Var.m2244a(i2);
            this.f4484y += i2;
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
