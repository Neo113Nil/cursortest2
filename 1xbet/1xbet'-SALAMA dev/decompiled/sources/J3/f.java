package J3;

import A1.AbstractC0021h;
import Q3.t;
import V3.W;
import V3.X;
import V3.Y;
import V3.b0;
import V3.d0;
import V3.e0;
import V3.f0;
import V3.g0;
import V3.r0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0832l;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f3838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f3840e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3842b;

    static {
        int i7 = 0;
        f3838c = new f("ENABLED", i7);
        f3839d = new f("DISABLED", i7);
        f3840e = new f("DESTROYED", i7);
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.f3841a = i7;
        this.f3842b = obj;
    }

    public synchronized void a(b0 b0Var) {
        f0 f0VarB;
        synchronized (this) {
            f0VarB = b(n.e(b0Var), b0Var.C());
        }
        d0 d0Var = (d0) this.f3842b;
        d0Var.e();
        g0.z((g0) d0Var.f11827b, f0VarB);
    }

    public synchronized f0 b(Y y4, r0 r0Var) {
        int iA;
        synchronized (this) {
            iA = t.a();
            while (d(iA)) {
                iA = t.a();
            }
        }
        return (f0) e0VarH.b();
        if (r0Var == r0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        e0 e0VarH = f0.H();
        e0VarH.e();
        f0.y((f0) e0VarH.f11827b, y4);
        e0VarH.e();
        f0.B((f0) e0VarH.f11827b, iA);
        e0VarH.e();
        f0.A((f0) e0VarH.f11827b);
        e0VarH.e();
        f0.z((f0) e0VarH.f11827b, r0Var);
        return (f0) e0VarH.b();
    }

    public synchronized C1050x1 c() {
        return C1050x1.J((g0) ((d0) this.f3842b).b());
    }

    public synchronized boolean d(int i7) {
        Iterator it = Collections.unmodifiableList(((g0) ((d0) this.f3842b).f11827b).C()).iterator();
        while (it.hasNext()) {
            if (((f0) it.next()).D() == i7) {
                return true;
            }
        }
        return false;
    }

    public Y e(AbstractC0829i abstractC0829i) throws GeneralSecurityException {
        Q3.d dVar = (Q3.d) this.f3842b;
        try {
            AbstractC0021h abstractC0021hN = dVar.n();
            AbstractC0821a abstractC0821aM = abstractC0021hN.m(abstractC0829i);
            abstractC0021hN.p(abstractC0821aM);
            AbstractC0821a abstractC0821aB = abstractC0021hN.b(abstractC0821aM);
            W wF = Y.F();
            String strL = dVar.l();
            wF.e();
            Y.y((Y) wF.f11827b, strL);
            try {
                int iB = ((AbstractC0842w) abstractC0821aB).b(null);
                byte[] bArr = new byte[iB];
                C0832l c0832l = new C0832l(bArr, iB);
                abstractC0821aB.f(c0832l);
                if (c0832l.f11802i - c0832l.j != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C0828h c0828h = new C0828h(bArr);
                wF.e();
                Y.z((Y) wF.f11827b, c0828h);
                X xO = dVar.o();
                wF.e();
                Y.A((Y) wF.f11827b, xO);
                return (Y) wF.b();
            } catch (IOException e7) {
                throw new RuntimeException(abstractC0821aB.c("ByteString"), e7);
            }
        } catch (C e8) {
            throw new GeneralSecurityException("Unexpected proto", e8);
        }
    }

    public String toString() {
        switch (this.f3841a) {
            case 0:
                return (String) this.f3842b;
            default:
                return super.toString();
        }
    }

    public f(Q3.d dVar, Class cls) {
        this.f3841a = 2;
        if (!((Map) dVar.f5806c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(p150v0.a.f("Given internalKeyMananger ", dVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f3842b = dVar;
    }
}
