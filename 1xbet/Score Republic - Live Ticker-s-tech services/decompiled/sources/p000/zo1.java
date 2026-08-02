package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zo1 extends do1 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected oq1 zzc;

    public zo1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = oq1.f5843f;
    }

    /* JADX INFO: renamed from: e */
    public static zo1 m5958e(zo1 zo1Var, byte[] bArr, so1 so1Var) throws mp1 {
        int length = bArr.length;
        if (length != 0) {
            zo1 zo1VarM5967i = zo1Var.m5967i();
            try {
                hq1 hq1VarM1495a = eq1.f2165c.m1495a(zo1VarM5967i.getClass());
                hq1VarM1495a.mo473j(zo1VarM5967i, bArr, 0, length, new go1(so1Var));
                hq1VarM1495a.mo472i(zo1VarM5967i);
                zo1Var = zo1VarM5967i;
            } catch (IOException e) {
                if (e.getCause() instanceof mp1) {
                    throw ((mp1) e.getCause());
                }
                throw new mp1(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (lq1 e2) {
                throw e2.m3275a();
            } catch (mp1 e3) {
                if (e3.f5126j) {
                    throw new mp1(e3.getMessage(), e3);
                }
                throw e3;
            }
        }
        m5963r(zo1Var);
        return zo1Var;
    }

    /* JADX INFO: renamed from: n */
    public static zo1 m5959n(Class cls) {
        Map map = zze;
        zo1 zo1Var = (zo1) map.get(cls);
        if (zo1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zo1Var = (zo1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zo1Var != null) {
            return zo1Var;
        }
        zo1 zo1Var2 = (zo1) ((zo1) tq1.m4828d(cls)).mo14s(6);
        if (zo1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zo1Var2);
        return zo1Var2;
    }

    /* JADX INFO: renamed from: o */
    public static void m5960o(Class cls, zo1 zo1Var) {
        zo1Var.m5966h();
        zze.put(cls, zo1Var);
    }

    /* JADX INFO: renamed from: p */
    public static Object m5961p(Method method, zo1 zo1Var, Object... objArr) {
        try {
            return method.invoke(zo1Var, objArr);
        } catch (IllegalAccessException e) {
            C0270h1.m2189e("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C0270h1.m2189e("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m5962q(zo1 zo1Var, boolean z) {
        byte bByteValue = ((Byte) zo1Var.mo14s(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo469f = eq1.f2165c.m1495a(zo1Var.getClass()).mo469f(zo1Var);
        if (z) {
            zo1Var.mo14s(2);
        }
        return zMo469f;
    }

    /* JADX INFO: renamed from: r */
    public static void m5963r(zo1 zo1Var) {
        if (zo1Var != null && !m5962q(zo1Var, true)) {
            throw new lq1().m3275a();
        }
    }

    @Override // p000.do1
    /* JADX INFO: renamed from: c */
    public final int mo1276c(hq1 hq1Var) {
        if (m5965g()) {
            int iMo468e = hq1Var.mo468e(this);
            if (iMo468e >= 0) {
                return iMo468e;
            }
            re1.m4348c(String.valueOf(iMo468e).length() + 42, iMo468e);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo468e2 = hq1Var.mo468e(this);
        if (iMo468e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo468e2;
            return iMo468e2;
        }
        re1.m4348c(String.valueOf(iMo468e2).length() + 42, iMo468e2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return eq1.f2165c.m1495a(getClass()).mo471h(this, (zo1) obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m5964f(ro1 ro1Var) {
        hq1 hq1VarM1495a = eq1.f2165c.m1495a(getClass());
        jg0 jg0Var = ro1Var.f6927a;
        if (jg0Var == null) {
            jg0Var = new jg0(ro1Var);
        }
        hq1VarM1495a.mo466c(this, jg0Var);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5965g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m5966h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m5965g()) {
            return eq1.f2165c.m1495a(getClass()).mo465b(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo465b = eq1.f2165c.m1495a(getClass()).mo465b(this);
        this.zza = iMo465b;
        return iMo465b;
    }

    /* JADX INFO: renamed from: i */
    public final zo1 m5967i() {
        return (zo1) mo14s(4);
    }

    /* JADX INFO: renamed from: j */
    public final xo1 m5968j() {
        return (xo1) mo14s(5);
    }

    /* JADX INFO: renamed from: k */
    public final xo1 m5969k() {
        xo1 xo1Var = (xo1) mo14s(5);
        xo1Var.m5684e(this);
        return xo1Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m5970l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: m */
    public final int m5971m() {
        if (m5965g()) {
            int iMo468e = eq1.f2165c.m1495a(getClass()).mo468e(this);
            if (iMo468e >= 0) {
                return iMo468e;
            }
            re1.m4348c(String.valueOf(iMo468e).length() + 42, iMo468e);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo468e2 = eq1.f2165c.m1495a(getClass()).mo468e(this);
        if (iMo468e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo468e2;
            return iMo468e2;
        }
        re1.m4348c(String.valueOf(iMo468e2).length() + 42, iMo468e2);
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public abstract Object mo14s(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = yp1.f9427a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        yp1.m5828b(this, sb, 0);
        return sb.toString();
    }
}
