package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 {

    /* JADX INFO: renamed from: d */
    public static final List f3874d;

    /* JADX INFO: renamed from: e */
    public static final ja1 f3875e;

    /* JADX INFO: renamed from: f */
    public static final ja1 f3876f;

    /* JADX INFO: renamed from: g */
    public static final ja1 f3877g;

    /* JADX INFO: renamed from: h */
    public static final ja1 f3878h;

    /* JADX INFO: renamed from: i */
    public static final ja1 f3879i;

    /* JADX INFO: renamed from: j */
    public static final ja1 f3880j;

    /* JADX INFO: renamed from: k */
    public static final ja1 f3881k;

    /* JADX INFO: renamed from: l */
    public static final ja1 f3882l;

    /* JADX INFO: renamed from: m */
    public static final ja1 f3883m;

    /* JADX INFO: renamed from: n */
    public static final lp0 f3884n;

    /* JADX INFO: renamed from: o */
    public static final lp0 f3885o;

    /* JADX INFO: renamed from: a */
    public final ia1 f3886a;

    /* JADX INFO: renamed from: b */
    public final String f3887b;

    /* JADX INFO: renamed from: c */
    public final Throwable f3888c;

    static {
        TreeMap treeMap = new TreeMap();
        for (ia1 ia1Var : ia1.values()) {
            ja1 ja1Var = (ja1) treeMap.put(Integer.valueOf(ia1Var.f3521j), new ja1(ia1Var, null, null));
            if (ja1Var != null) {
                throw new IllegalStateException("Code value duplication between " + ja1Var.f3886a.name() + " & " + ia1Var.name());
            }
        }
        f3874d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f3875e = ia1.f3506l.m2581a();
        f3876f = ia1.f3507m.m2581a();
        f3877g = ia1.f3508n.m2581a();
        ia1.f3509o.m2581a();
        f3878h = ia1.f3510p.m2581a();
        ia1.f3511q.m2581a();
        ia1.f3512r.m2581a();
        f3879i = ia1.f3513s.m2581a();
        ia1.f3504B.m2581a();
        f3880j = ia1.f3514t.m2581a();
        f3881k = ia1.f3515u.m2581a();
        ia1.f3516v.m2581a();
        ia1.f3517w.m2581a();
        ia1.f3518x.m2581a();
        f3882l = ia1.f3519y.m2581a();
        f3883m = ia1.f3520z.m2581a();
        ia1.f3503A.m2581a();
        f3884n = new lp0("grpc-status", false, new u90(15));
        f3885o = new lp0("grpc-message", false, new o31(5));
    }

    public ja1(ia1 ia1Var, String str, Throwable th) {
        a90.m127k(ia1Var, "code");
        this.f3886a = ia1Var;
        this.f3887b = str;
        this.f3888c = th;
    }

    /* JADX INFO: renamed from: c */
    public static String m2833c(ja1 ja1Var) {
        String str = ja1Var.f3887b;
        ia1 ia1Var = ja1Var.f3886a;
        if (str == null) {
            return ia1Var.toString();
        }
        return ia1Var + ": " + ja1Var.f3887b;
    }

    /* JADX INFO: renamed from: d */
    public static ja1 m2834d(int i) {
        if (i >= 0) {
            List list = f3874d;
            if (i < list.size()) {
                return (ja1) list.get(i);
            }
        }
        return f3877g.m2840h("Unknown code " + i);
    }

    /* JADX INFO: renamed from: e */
    public static ja1 m2835e(Throwable th) {
        a90.m127k(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof ka1) {
                return ((ka1) cause).f4331j;
            }
            if (cause instanceof la1) {
                return ((la1) cause).f4744j;
            }
        }
        return f3877g.m2839g(th);
    }

    /* JADX INFO: renamed from: a */
    public final la1 m2836a() {
        return new la1(this, null);
    }

    /* JADX INFO: renamed from: b */
    public final ja1 m2837b(String str) {
        Throwable th = this.f3888c;
        String str2 = this.f3887b;
        ia1 ia1Var = this.f3886a;
        if (str2 == null) {
            return new ja1(ia1Var, str, th);
        }
        return new ja1(ia1Var, str2 + "\n" + str, th);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2838f() {
        return ia1.f3506l == this.f3886a;
    }

    /* JADX INFO: renamed from: g */
    public final ja1 m2839g(Throwable th) {
        return AbstractC0875xf.m5649f(this.f3888c, th) ? this : new ja1(this.f3886a, this.f3887b, th);
    }

    /* JADX INFO: renamed from: h */
    public final ja1 m2840h(String str) {
        return AbstractC0875xf.m5649f(this.f3887b, str) ? this : new ja1(this.f3886a, str, this.f3888c);
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f3886a.name(), "code");
        c0809vnM5362k.m5172c(this.f3887b, "description");
        Throwable th = this.f3888c;
        Object string = th;
        if (th != null) {
            Object obj = fd1.f2380a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        c0809vnM5362k.m5172c(string, "cause");
        return c0809vnM5362k.toString();
    }
}
