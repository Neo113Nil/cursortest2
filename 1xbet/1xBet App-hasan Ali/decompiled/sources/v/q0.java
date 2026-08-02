package v;

import P.C0302l;
import P.C0315s;
import b4.EnumC0510a;
import i4.InterfaceC2015a;
import java.io.Serializable;
import p4.AbstractC2282w;
import p4.C2275o;

/* loaded from: classes.dex */
public abstract class q0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static long[] a(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static y4.D b(String str) {
        kotlin.jvm.internal.l.f("javaName", str);
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return y4.D.f21287n;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return y4.D.f21286m;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return y4.D.f21285l;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return y4.D.f21288o;
            }
        } else if (str.equals("SSLv3")) {
            return y4.D.f21289p;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final v0 c(C0315s c0315s) {
        int i = 0;
        Object[] objArr = new Object[0];
        v3.g gVar = v0.i;
        boolean d5 = c0315s.d(0);
        Object M5 = c0315s.M();
        if (d5 || M5 == C0302l.f4480a) {
            M5 = new V(i, 2);
            c0315s.i0(M5);
        }
        return (v0) Y.k.b(objArr, gVar, (InterfaceC2015a) M5, c0315s, 0, 4);
    }

    public static final Object d(u4.p pVar, u4.p pVar2, i4.e eVar) {
        Object c2275o;
        Object R4;
        try {
            kotlin.jvm.internal.z.b(2, eVar);
            c2275o = eVar.invoke(pVar2, pVar);
        } catch (Throwable th) {
            c2275o = new C2275o(th, false);
        }
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        if (c2275o == enumC0510a || (R4 = pVar.R(c2275o)) == AbstractC2282w.f18830e) {
            return enumC0510a;
        }
        if (R4 instanceof C2275o) {
            throw ((C2275o) R4).f18812a;
        }
        return AbstractC2282w.u(R4);
    }

    public static b0.p e(b0.p pVar, v0 v0Var) {
        return b0.a.a(pVar, new androidx.compose.foundation.f(v0Var));
    }
}
