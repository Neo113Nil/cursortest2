package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xo1 implements Cloneable {

    /* JADX INFO: renamed from: j */
    public final zo1 f9010j;

    /* JADX INFO: renamed from: k */
    public zo1 f9011k;

    public xo1(zo1 zo1Var) {
        this.f9010j = zo1Var;
        if (zo1Var.m5965g()) {
            C0270h1.m2190f("Default instance must be immutable.");
            throw null;
        }
        this.f9011k = zo1Var.m5967i();
    }

    /* JADX INFO: renamed from: a */
    public static void m5680a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5681b() {
        if (this.f9011k.m5965g()) {
            return;
        }
        zo1 zo1VarM5967i = this.f9010j.m5967i();
        eq1.f2165c.m1495a(zo1VarM5967i.getClass()).mo467d(zo1VarM5967i, this.f9011k);
        this.f9011k = zo1VarM5967i;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xo1 clone() {
        xo1 xo1Var = (xo1) this.f9010j.mo14s(5);
        boolean zM5965g = this.f9011k.m5965g();
        zo1 zo1Var = this.f9011k;
        if (zM5965g) {
            zo1Var.getClass();
            eq1.f2165c.m1495a(zo1Var.getClass()).mo472i(zo1Var);
            zo1Var.m5966h();
            zo1Var = this.f9011k;
        }
        xo1Var.f9011k = zo1Var;
        return xo1Var;
    }

    /* JADX INFO: renamed from: d */
    public final zo1 m5683d() {
        boolean zM5965g = this.f9011k.m5965g();
        zo1 zo1Var = this.f9011k;
        if (zM5965g) {
            zo1Var.getClass();
            eq1.f2165c.m1495a(zo1Var.getClass()).mo472i(zo1Var);
            zo1Var.m5966h();
            zo1Var = this.f9011k;
        }
        zo1Var.getClass();
        if (zo1.m5962q(zo1Var, true)) {
            return zo1Var;
        }
        throw new lq1();
    }

    /* JADX INFO: renamed from: e */
    public final void m5684e(zo1 zo1Var) {
        zo1 zo1Var2 = this.f9010j;
        if (zo1Var2.equals(zo1Var)) {
            return;
        }
        if (!this.f9011k.m5965g()) {
            zo1 zo1VarM5967i = zo1Var2.m5967i();
            eq1.f2165c.m1495a(zo1VarM5967i.getClass()).mo467d(zo1VarM5967i, this.f9011k);
            this.f9011k = zo1VarM5967i;
        }
        zo1 zo1Var3 = this.f9011k;
        eq1.f2165c.m1495a(zo1Var3.getClass()).mo467d(zo1Var3, zo1Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m5685f(byte[] bArr, int i, so1 so1Var) throws mp1 {
        if (!this.f9011k.m5965g()) {
            zo1 zo1VarM5967i = this.f9010j.m5967i();
            eq1.f2165c.m1495a(zo1VarM5967i.getClass()).mo467d(zo1VarM5967i, this.f9011k);
            this.f9011k = zo1VarM5967i;
        }
        try {
            eq1.f2165c.m1495a(this.f9011k.getClass()).mo473j(this.f9011k, bArr, 0, i, new go1(so1Var));
        } catch (mp1 e) {
            throw e;
        } catch (IOException e2) {
            C0270h1.m2189e("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
