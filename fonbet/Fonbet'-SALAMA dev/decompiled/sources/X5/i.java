package X5;

import U5.AbstractC0442i;
import U5.G;
import U5.H;
import U5.W;
import U5.Z;
import U5.b0;
import U5.l0;
import W5.AbstractC0486a1;
import W5.AbstractC0487b;
import W5.AbstractC0494d0;
import W5.AbstractC0503g0;
import W5.AbstractC0551w1;
import W5.C0489b1;
import W5.C0548v1;
import W5.C0556y0;
import W5.EnumC0543u;
import W5.d2;
import W5.g2;
import e6.AbstractC1053b;
import e6.C1052a;
import e6.C1054c;
import io.sentry.protocol.SentryStackFrame;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class i extends AbstractC0503g0 implements u {

    /* renamed from: A, reason: collision with root package name */
    public boolean f7534A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7535B;

    /* renamed from: C, reason: collision with root package name */
    public int f7536C;

    /* renamed from: D, reason: collision with root package name */
    public int f7537D;

    /* renamed from: E, reason: collision with root package name */
    public final d f7538E;

    /* renamed from: F, reason: collision with root package name */
    public final v2.n f7539F;

    /* renamed from: G, reason: collision with root package name */
    public final m f7540G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7541H;

    /* renamed from: I, reason: collision with root package name */
    public final C1054c f7542I;

    /* renamed from: J, reason: collision with root package name */
    public v f7543J;

    /* renamed from: K, reason: collision with root package name */
    public int f7544K;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ j f7545L;

    /* renamed from: v, reason: collision with root package name */
    public final int f7546v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f7547w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f7548x;

    /* renamed from: y, reason: collision with root package name */
    public final N6.d f7549y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7550z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, int i7, d2 d2Var, Object obj, d dVar, v2.n nVar, m mVar, int i8) {
        super(i7, d2Var, jVar.f7124c);
        this.f7545L = jVar;
        this.f7221s = D3.f.f1719c;
        this.f7549y = new N6.d();
        this.f7550z = false;
        this.f7534A = false;
        this.f7535B = false;
        this.f7541H = true;
        this.f7544K = -1;
        p3.f.k(obj, SentryStackFrame.JsonKeys.LOCK);
        this.f7547w = obj;
        this.f7538E = dVar;
        this.f7539F = nVar;
        this.f7540G = mVar;
        this.f7536C = i8;
        this.f7537D = i8;
        this.f7546v = i8;
        AbstractC1053b.f12736a.getClass();
        this.f7542I = C1052a.f12734a;
    }

    public static void j(i iVar, b0 b0Var, String str) {
        j jVar = iVar.f7545L;
        String str2 = jVar.f7554m;
        boolean z4 = jVar.f7558q;
        m mVar = iVar.f7540G;
        boolean z7 = mVar.f7566B == null;
        Z5.b bVar = e.f7500a;
        p3.f.k(b0Var, "headers");
        p3.f.k(str, "defaultPath");
        p3.f.k(str2, "authority");
        b0Var.a(AbstractC0494d0.f7171i);
        b0Var.a(AbstractC0494d0.j);
        W w7 = AbstractC0494d0.f7172k;
        b0Var.a(w7);
        ArrayList arrayList = new ArrayList(b0Var.f6460b + 7);
        if (z7) {
            arrayList.add(e.f7501b);
        } else {
            arrayList.add(e.f7500a);
        }
        if (z4) {
            arrayList.add(e.f7503d);
        } else {
            arrayList.add(e.f7502c);
        }
        arrayList.add(new Z5.b(Z5.b.f7885h, str2));
        arrayList.add(new Z5.b(Z5.b.f7883f, str));
        arrayList.add(new Z5.b(w7.f6449a, jVar.f7552k));
        arrayList.add(e.f7504e);
        arrayList.add(e.f7505f);
        Logger logger = g2.f7224a;
        Charset charset = G.f6421a;
        int i7 = b0Var.f6460b * 2;
        byte[][] bArr = new byte[i7][];
        Object[] objArr = b0Var.f6459a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i7);
        } else {
            for (int i8 = 0; i8 < b0Var.f6460b; i8++) {
                int i9 = i8 * 2;
                bArr[i9] = b0Var.e(i8);
                int i10 = i9 + 1;
                Object obj = b0Var.f6459a[i10];
                if (!(obj instanceof byte[])) {
                    AbstractC0486a1.n(obj);
                    throw null;
                }
                bArr[i10] = (byte[]) obj;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i7; i12 += 2) {
            byte[] bArr2 = bArr[i12];
            byte[] bArr3 = bArr[i12 + 1];
            if (g2.a(bArr2, g2.f7225b)) {
                bArr[i11] = bArr2;
                bArr[i11 + 1] = G.f6422b.c(bArr3).getBytes(D3.f.f1717a);
            } else {
                for (byte b7 : bArr3) {
                    if (b7 < 32 || b7 > 126) {
                        StringBuilder k7 = e1.k.k("Metadata key=", new String(bArr2, D3.f.f1717a), ", value=");
                        k7.append(Arrays.toString(bArr3));
                        k7.append(" contains invalid ASCII characters");
                        g2.f7224a.warning(k7.toString());
                        break;
                    }
                }
                bArr[i11] = bArr2;
                bArr[i11 + 1] = bArr3;
            }
            i11 += 2;
        }
        if (i11 != i7) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i11);
        }
        for (int i13 = 0; i13 < bArr.length; i13 += 2) {
            N6.f h6 = N6.f.h(bArr[i13]);
            byte[] bArr4 = h6.f4799a;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new Z5.b(h6, N6.f.h(bArr[i13 + 1])));
            }
        }
        iVar.f7548x = arrayList;
        l0 l0Var = mVar.f7600v;
        if (l0Var != null) {
            jVar.f7555n.f(l0Var, EnumC0543u.f7375d, true, new b0());
            return;
        }
        if (mVar.f7592n.size() < mVar.f7567C) {
            mVar.u(jVar);
            return;
        }
        mVar.f7568D.add(jVar);
        if (!mVar.f7604z) {
            mVar.f7604z = true;
            C0556y0 c0556y0 = mVar.f7570F;
            if (c0556y0 != null) {
                c0556y0.b();
            }
        }
        if (jVar.f7126e) {
            mVar.f7577M.o(jVar, true);
        }
    }

    public static void k(i iVar, N6.d dVar, boolean z4, boolean z7) {
        if (iVar.f7535B) {
            return;
        }
        if (!iVar.f7541H) {
            p3.f.q("streamId should be set", iVar.f7544K != -1);
            iVar.f7539F.d(z4, iVar.f7543J, dVar, z7);
        } else {
            iVar.f7549y.m(dVar, (int) dVar.f4797b);
            iVar.f7550z |= z4;
            iVar.f7534A |= z7;
        }
    }

    @Override // W5.AbstractC0484a
    public final void a(int i7) {
        int i8 = this.f7537D - i7;
        this.f7537D = i8;
        float f7 = i8;
        int i9 = this.f7546v;
        if (f7 <= i9 * 0.5f) {
            int i10 = i9 - i8;
            this.f7536C += i10;
            this.f7537D = i8 + i10;
            this.f7538E.e(this.f7544K, i10);
        }
    }

    @Override // W5.AbstractC0484a
    public final void c(boolean z4) {
        boolean z7 = this.f7117n;
        EnumC0543u enumC0543u = EnumC0543u.f7372a;
        if (z7) {
            this.f7540G.j(this.f7544K, null, enumC0543u, false, null, null);
        } else {
            this.f7540G.j(this.f7544K, null, enumC0543u, false, Z5.a.CANCEL, null);
        }
        p3.f.q("status should have been reported on deframer closed", this.f7118o);
        this.f7115l = true;
        if (this.f7119p && z4) {
            g(l0.f6543m.g("Encountered end-of-stream mid-frame"), true, new b0());
        }
        A2.c cVar = this.f7116m;
        if (cVar != null) {
            cVar.run();
            this.f7116m = null;
        }
    }

    public final void l(l0 l0Var, boolean z4, b0 b0Var) {
        if (this.f7535B) {
            return;
        }
        this.f7535B = true;
        if (!this.f7541H) {
            this.f7540G.j(this.f7544K, l0Var, EnumC0543u.f7372a, z4, Z5.a.CANCEL, b0Var);
            return;
        }
        m mVar = this.f7540G;
        LinkedList linkedList = mVar.f7568D;
        j jVar = this.f7545L;
        linkedList.remove(jVar);
        mVar.o(jVar);
        this.f7548x = null;
        N6.d dVar = this.f7549y;
        dVar.g(dVar.f4797b);
        this.f7541H = false;
        if (b0Var == null) {
            b0Var = new b0();
        }
        g(l0Var, true, b0Var);
    }

    public final void m(Throwable th) {
        l(l0.d(th), true, new b0());
    }

    public final void n(int i7, N6.d dVar, boolean z4) {
        boolean z7;
        Throwable th;
        boolean z8 = true;
        long j = dVar.f4797b;
        int i8 = this.f7536C - (((int) j) + i7);
        this.f7536C = i8;
        this.f7537D -= i7;
        if (i8 < 0) {
            this.f7538E.d(this.f7544K, Z5.a.FLOW_CONTROL_ERROR);
            this.f7540G.j(this.f7544K, l0.f6543m.g("Received data size exceeded our receiving window size"), EnumC0543u.f7372a, false, null, null);
            return;
        }
        q qVar = new q(dVar);
        l0 l0Var = this.f7219q;
        if (l0Var != null) {
            Charset charset = this.f7221s;
            C0548v1 c0548v1 = AbstractC0551w1.f7386a;
            p3.f.k(charset, "charset");
            int i9 = (int) dVar.f4797b;
            byte[] bArr = new byte[i9];
            qVar.g(bArr, 0, i9);
            this.f7219q = l0Var.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            qVar.close();
            if (this.f7219q.f6548b.length() > 1000 || z4) {
                l(this.f7219q, false, this.f7220r);
                return;
            }
            return;
        }
        if (!this.f7222t) {
            l(l0.f6543m.g("headers not received before payload"), false, new b0());
            return;
        }
        int i10 = (int) j;
        try {
            if (this.f7118o) {
                AbstractC0487b.f7123i.log(Level.INFO, "Received data on closed stream");
                qVar.close();
            } else {
                try {
                    C0489b1 c0489b1 = this.f7105a;
                    c0489b1.getClass();
                    try {
                        if (!c0489b1.b() && !c0489b1.f7137H) {
                            c0489b1.f7132C.k(qVar);
                            try {
                                c0489b1.a();
                            } catch (Throwable th2) {
                                th = th2;
                                z7 = false;
                                if (z7) {
                                    qVar.close();
                                }
                                throw th;
                            }
                        }
                        qVar.close();
                    } catch (Throwable th3) {
                        z7 = true;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        m(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        z8 = false;
                        if (z8) {
                            qVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z4) {
                if (i10 > 0) {
                    this.f7219q = l0.f6543m.g("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f7219q = l0.f6543m.g("Received unexpected EOS on empty DATA frame from server");
                }
                b0 b0Var = new b0();
                this.f7220r = b0Var;
                g(this.f7219q, false, b0Var);
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void o(ArrayList arrayList, boolean z4) {
        l0 i7;
        StringBuilder sb;
        l0 a2;
        Z z7 = AbstractC0503g0.f7218u;
        if (z4) {
            byte[][] a4 = w.a(arrayList);
            int length = a4.length / 2;
            b0 b0Var = new b0();
            b0Var.f6460b = length;
            b0Var.f6459a = a4;
            if (this.f7219q == null && !this.f7222t) {
                l0 i8 = AbstractC0503g0.i(b0Var);
                this.f7219q = i8;
                if (i8 != null) {
                    this.f7220r = b0Var;
                }
            }
            l0 l0Var = this.f7219q;
            if (l0Var != null) {
                l0 a7 = l0Var.a("trailers: " + b0Var);
                this.f7219q = a7;
                l(a7, false, this.f7220r);
                return;
            }
            Z z8 = H.f6424b;
            l0 l0Var2 = (l0) b0Var.c(z8);
            if (l0Var2 != null) {
                a2 = l0Var2.g((String) b0Var.c(H.f6423a));
            } else if (this.f7222t) {
                a2 = l0.f6538g.g("missing GRPC status in response");
            } else {
                Integer num = (Integer) b0Var.c(z7);
                a2 = (num != null ? AbstractC0494d0.g(num.intValue()) : l0.f6543m.g("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
            }
            b0Var.a(z7);
            b0Var.a(z8);
            b0Var.a(H.f6423a);
            if (this.f7118o) {
                AbstractC0487b.f7123i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{a2, b0Var});
                return;
            }
            for (AbstractC0442i abstractC0442i : this.f7112h.f7182a) {
                abstractC0442i.e(b0Var);
            }
            g(a2, false, b0Var);
            return;
        }
        byte[][] a8 = w.a(arrayList);
        int length2 = a8.length / 2;
        b0 b0Var2 = new b0();
        b0Var2.f6460b = length2;
        b0Var2.f6459a = a8;
        l0 l0Var3 = this.f7219q;
        if (l0Var3 != null) {
            this.f7219q = l0Var3.a("headers: " + b0Var2);
            return;
        }
        try {
            if (this.f7222t) {
                i7 = l0.f6543m.g("Received headers twice");
                this.f7219q = i7;
                sb = new StringBuilder("headers: ");
            } else {
                Integer num2 = (Integer) b0Var2.c(z7);
                if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                    this.f7222t = true;
                    i7 = AbstractC0503g0.i(b0Var2);
                    this.f7219q = i7;
                    if (i7 != null) {
                        sb = new StringBuilder("headers: ");
                    } else {
                        b0Var2.a(z7);
                        b0Var2.a(H.f6424b);
                        b0Var2.a(H.f6423a);
                        d(b0Var2);
                        i7 = this.f7219q;
                        if (i7 == null) {
                            return;
                        } else {
                            sb = new StringBuilder("headers: ");
                        }
                    }
                } else {
                    i7 = this.f7219q;
                    if (i7 == null) {
                        return;
                    } else {
                        sb = new StringBuilder("headers: ");
                    }
                }
            }
            sb.append(b0Var2);
            this.f7219q = i7.a(sb.toString());
            this.f7220r = b0Var2;
            this.f7221s = AbstractC0503g0.h(b0Var2);
        } catch (Throwable th) {
            l0 l0Var4 = this.f7219q;
            if (l0Var4 != null) {
                this.f7219q = l0Var4.a("headers: " + b0Var2);
                this.f7220r = b0Var2;
                this.f7221s = AbstractC0503g0.h(b0Var2);
            }
            throw th;
        }
    }
}
