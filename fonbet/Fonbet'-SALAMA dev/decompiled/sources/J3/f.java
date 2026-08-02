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
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0876l;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import v0.AbstractC1663a;
import w1.C1759x1;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f3838c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f3839d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f3840e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3841a;

    /* renamed from: b, reason: collision with root package name */
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
        f0 b7;
        synchronized (this) {
            b7 = b(n.e(b0Var), b0Var.C());
        }
        d0 d0Var = (d0) this.f3842b;
        d0Var.e();
        g0.z((g0) d0Var.f11827b, b7);
    }

    public synchronized f0 b(Y y4, r0 r0Var) {
        int a2;
        synchronized (this) {
            a2 = t.a();
            while (d(a2)) {
                a2 = t.a();
            }
        }
        return (f0) r1.b();
        if (r0Var == r0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        e0 H7 = f0.H();
        H7.e();
        f0.y((f0) H7.f11827b, y4);
        H7.e();
        f0.B((f0) H7.f11827b, a2);
        H7.e();
        f0.A((f0) H7.f11827b);
        H7.e();
        f0.z((f0) H7.f11827b, r0Var);
        return (f0) H7.b();
    }

    public synchronized C1759x1 c() {
        return C1759x1.J((g0) ((d0) this.f3842b).b());
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

    public Y e(AbstractC0873i abstractC0873i) {
        Q3.d dVar = (Q3.d) this.f3842b;
        try {
            AbstractC0021h n2 = dVar.n();
            AbstractC0865a m7 = n2.m(abstractC0873i);
            n2.p(m7);
            AbstractC0865a b7 = n2.b(m7);
            W F7 = Y.F();
            String l7 = dVar.l();
            F7.e();
            Y.y((Y) F7.f11827b, l7);
            try {
                int b8 = ((AbstractC0886w) b7).b(null);
                byte[] bArr = new byte[b8];
                C0876l c0876l = new C0876l(bArr, b8);
                b7.f(c0876l);
                if (c0876l.f11802i - c0876l.j != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C0872h c0872h = new C0872h(bArr);
                F7.e();
                Y.z((Y) F7.f11827b, c0872h);
                X o7 = dVar.o();
                F7.e();
                Y.A((Y) F7.f11827b, o7);
                return (Y) F7.b();
            } catch (IOException e7) {
                throw new RuntimeException(b7.c("ByteString"), e7);
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
            throw new IllegalArgumentException(AbstractC1663a.f("Given internalKeyMananger ", dVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f3842b = dVar;
    }
}
