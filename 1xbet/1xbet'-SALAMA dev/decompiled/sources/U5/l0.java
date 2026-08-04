package U5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f6535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f6536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f6537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l0 f6538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0 f6539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l0 f6540i;
    public static final l0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l0 f6541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l0 f6542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l0 f6543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l0 f6544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Z f6545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Z f6546p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f6547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f6549c;

    static {
        TreeMap treeMap = new TreeMap();
        for (k0 k0Var : k0.values()) {
            l0 l0Var = (l0) treeMap.put(Integer.valueOf(k0Var.f6531a), new l0(k0Var, null, null));
            if (l0Var != null) {
                throw new IllegalStateException("Code value duplication between " + l0Var.f6547a.name() + " & " + k0Var.name());
            }
        }
        f6535d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f6536e = k0.OK.a();
        f6537f = k0.CANCELLED.a();
        f6538g = k0.UNKNOWN.a();
        k0.INVALID_ARGUMENT.a();
        f6539h = k0.DEADLINE_EXCEEDED.a();
        k0.NOT_FOUND.a();
        k0.ALREADY_EXISTS.a();
        f6540i = k0.PERMISSION_DENIED.a();
        j = k0.UNAUTHENTICATED.a();
        f6541k = k0.RESOURCE_EXHAUSTED.a();
        f6542l = k0.FAILED_PRECONDITION.a();
        k0.ABORTED.a();
        k0.OUT_OF_RANGE.a();
        k0.UNIMPLEMENTED.a();
        f6543m = k0.INTERNAL.a();
        f6544n = k0.UNAVAILABLE.a();
        k0.DATA_LOSS.a();
        f6545o = new Z("grpc-status", false, new C0443j(10));
        f6546p = new Z("grpc-message", false, new C0443j(1));
    }

    public l0(k0 k0Var, String str, Throwable th) {
        p113p3.f.k(k0Var, "code");
        this.f6547a = k0Var;
        this.f6548b = str;
        this.f6549c = th;
    }

    public static String b(l0 l0Var) {
        String str = l0Var.f6548b;
        k0 k0Var = l0Var.f6547a;
        if (str == null) {
            return k0Var.toString();
        }
        return k0Var + ": " + l0Var.f6548b;
    }

    public static l0 c(int i7) {
        if (i7 >= 0) {
            List list = f6535d;
            if (i7 < list.size()) {
                return (l0) list.get(i7);
            }
        }
        return f6538g.g("Unknown code " + i7);
    }

    public static l0 d(Throwable th) {
        p113p3.f.k(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof m0) {
                return ((m0) cause).f6556a;
            }
            if (cause instanceof n0) {
                return ((n0) cause).f6560a;
            }
        }
        return f6538g.f(th);
    }

    public final l0 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f6549c;
        k0 k0Var = this.f6547a;
        String str2 = this.f6548b;
        if (str2 == null) {
            return new l0(k0Var, str, th);
        }
        return new l0(k0Var, str2 + "\n" + str, th);
    }

    public final boolean e() {
        return k0.OK == this.f6547a;
    }

    public final l0 f(Throwable th) {
        return p097n3.a.t(this.f6549c, th) ? this : new l0(this.f6547a, this.f6548b, th);
    }

    public final l0 g(String str) {
        return p097n3.a.t(this.f6548b, str) ? this : new l0(this.f6547a, str, this.f6549c);
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f6547a.name(), "code");
        jVarU0.a(this.f6548b, "description");
        Throwable th = this.f6549c;
        Object string = th;
        if (th != null) {
            Object obj = D3.r.f1740a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        jVarU0.a(string, "cause");
        return jVarU0.toString();
    }
}
