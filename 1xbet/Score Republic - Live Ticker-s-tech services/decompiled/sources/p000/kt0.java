package p000;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 {

    /* JADX INFO: renamed from: L */
    public static final lp0 f4512L = oe0.m3684a(":status", new u90(2));

    /* JADX INFO: renamed from: A */
    public boolean f4513A;

    /* JADX INFO: renamed from: B */
    public int f4514B;

    /* JADX INFO: renamed from: C */
    public int f4515C;

    /* JADX INFO: renamed from: D */
    public final C0597px f4516D;

    /* JADX INFO: renamed from: E */
    public final g92 f4517E;

    /* JADX INFO: renamed from: F */
    public final ot0 f4518F;

    /* JADX INFO: renamed from: G */
    public boolean f4519G;

    /* JADX INFO: renamed from: H */
    public final nc1 f4520H;

    /* JADX INFO: renamed from: I */
    public wu0 f4521I;

    /* JADX INFO: renamed from: J */
    public int f4522J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ lt0 f4523K;

    /* JADX INFO: renamed from: a */
    public ko0 f4524a;

    /* JADX INFO: renamed from: b */
    public final Object f4525b;

    /* JADX INFO: renamed from: c */
    public final C0312i6 f4526c;

    /* JADX INFO: renamed from: d */
    public final ko0 f4527d;

    /* JADX INFO: renamed from: e */
    public int f4528e;

    /* JADX INFO: renamed from: f */
    public boolean f4529f;

    /* JADX INFO: renamed from: g */
    public boolean f4530g;

    /* JADX INFO: renamed from: h */
    public final ha1 f4531h;

    /* JADX INFO: renamed from: i */
    public boolean f4532i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0581ph f4533j;

    /* JADX INFO: renamed from: k */
    public C0258gq f4534k;

    /* JADX INFO: renamed from: l */
    public boolean f4535l;

    /* JADX INFO: renamed from: m */
    public RunnableC0452m f4536m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f4537n;

    /* JADX INFO: renamed from: o */
    public boolean f4538o;

    /* JADX INFO: renamed from: p */
    public boolean f4539p;

    /* JADX INFO: renamed from: q */
    public ja1 f4540q;

    /* JADX INFO: renamed from: r */
    public np0 f4541r;

    /* JADX INFO: renamed from: s */
    public Charset f4542s;

    /* JADX INFO: renamed from: t */
    public boolean f4543t;

    /* JADX INFO: renamed from: u */
    public final int f4544u;

    /* JADX INFO: renamed from: v */
    public final Object f4545v;

    /* JADX INFO: renamed from: w */
    public ArrayList f4546w;

    /* JADX INFO: renamed from: x */
    public final C0539oc f4547x;

    /* JADX INFO: renamed from: y */
    public boolean f4548y;

    /* JADX INFO: renamed from: z */
    public boolean f4549z;

    public kt0(lt0 lt0Var, int i, ha1 ha1Var, Object obj, C0597px c0597px, g92 g92Var, ot0 ot0Var, int i2) {
        this.f4523K = lt0Var;
        C0312i6 c0312i6 = lt0Var.f5214j;
        this.f4525b = new Object();
        a90.m127k(c0312i6, "transportTracer");
        this.f4526c = c0312i6;
        ko0 ko0Var = new ko0(this, i, ha1Var, c0312i6);
        this.f4527d = ko0Var;
        this.f4524a = ko0Var;
        this.f4534k = C0258gq.f2843d;
        this.f4535l = false;
        this.f4531h = ha1Var;
        this.f4542s = AbstractC0358jg.f3920b;
        this.f4547x = new C0539oc();
        this.f4548y = false;
        this.f4549z = false;
        this.f4513A = false;
        this.f4519G = true;
        this.f4522J = -1;
        a90.m127k(obj, "lock");
        this.f4545v = obj;
        this.f4516D = c0597px;
        this.f4517E = g92Var;
        this.f4518F = ot0Var;
        this.f4514B = i2;
        this.f4515C = i2;
        this.f4544u = i2;
        nv0.f5555a.getClass();
        this.f4520H = vc0.f8173a;
    }

    /* JADX INFO: renamed from: a */
    public static void m3074a(kt0 kt0Var, np0 np0Var, String str) {
        lt0 lt0Var = kt0Var.f4523K;
        String str2 = lt0Var.f4903t;
        String str3 = lt0Var.f4901r;
        boolean z = lt0Var.f4907x;
        ot0 ot0Var = kt0Var.f4518F;
        boolean z2 = ot0Var.f5871B == null;
        qa0 qa0Var = ra0.f6763a;
        a90.m127k(np0Var, "headers");
        a90.m127k(str2, "authority");
        np0Var.m3577a(ca0.f1189i);
        np0Var.m3577a(ca0.f1190j);
        jp0 jp0Var = ca0.f1191k;
        np0Var.m3577a(jp0Var);
        ArrayList arrayList = new ArrayList(np0Var.f5488b + 7);
        if (z2) {
            arrayList.add(ra0.f6764b);
        } else {
            arrayList.add(ra0.f6763a);
        }
        if (z) {
            arrayList.add(ra0.f6766d);
        } else {
            arrayList.add(ra0.f6765c);
        }
        arrayList.add(new qa0(qa0.f6439h, str2));
        arrayList.add(new qa0(qa0.f6437f, str));
        arrayList.add(new qa0(jp0Var.f4494a, str3));
        arrayList.add(ra0.f6767e);
        arrayList.add(ra0.f6768f);
        Logger logger = qe1.f6481a;
        Charset charset = oe0.f5707a;
        int i = np0Var.f5488b * 2;
        byte[][] bArr = new byte[i][];
        Object[] objArr = np0Var.f5487a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i);
        } else {
            for (int i2 = 0; i2 < np0Var.f5488b; i2++) {
                int i3 = i2 * 2;
                Object[] objArr2 = np0Var.f5487a;
                bArr[i3] = (byte[]) objArr2[i3];
                int i4 = i3 + 1;
                Object obj = objArr2[i4];
                if (!(obj instanceof byte[])) {
                    AbstractC0024an.m289l(obj);
                    throw null;
                }
                bArr[i4] = (byte[]) obj;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6 += 2) {
            byte[] bArr2 = bArr[i6];
            byte[] bArr3 = bArr[i6 + 1];
            if (qe1.m4091a(bArr2, qe1.f6482b)) {
                bArr[i5] = bArr2;
                bArr[i5 + 1] = oe0.f5708b.m3197c(bArr3).getBytes(AbstractC0358jg.f3919a);
            } else {
                int length = bArr3.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        bArr[i5] = bArr2;
                        bArr[i5 + 1] = bArr3;
                    } else {
                        byte b = bArr3[i7];
                        if (b < 32 || b > 126) {
                            String str4 = new String(bArr2, AbstractC0358jg.f3919a);
                            qe1.f6481a.warning("Metadata key=" + str4 + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                        } else {
                            i7++;
                        }
                    }
                }
            }
            i5 += 2;
        }
        if (i5 != i) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i5);
        }
        for (int i8 = 0; i8 < bArr.length; i8 += 2) {
            C0836wd c0836wdM5316f = C0836wd.m5316f(bArr[i8]);
            byte[] bArr4 = c0836wdM5316f.f8511j;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new qa0(c0836wdM5316f, C0836wd.m5316f(bArr[i8 + 1])));
            }
        }
        kt0Var.f4546w = arrayList;
        ja1 ja1Var = ot0Var.f5906v;
        if (ja1Var != null) {
            lt0Var.f4904u.m3086l(ja1Var, EnumC0544oh.f5734m, true, new np0());
            return;
        }
        if (ot0Var.f5898n.size() < ot0Var.f5872C) {
            ot0Var.m3785t(lt0Var);
            return;
        }
        ot0Var.f5873D.add(lt0Var);
        if (!ot0Var.f5910z) {
            ot0Var.f5910z = true;
            wg0 wg0Var = ot0Var.f5875F;
            if (wg0Var != null) {
                wg0Var.m5329b();
            }
        }
        if (lt0Var.f5216l) {
            ot0Var.f5882M.m4577m(lt0Var, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3075b(kt0 kt0Var, C0539oc c0539oc, boolean z, boolean z2) {
        if (kt0Var.f4513A) {
            return;
        }
        if (!kt0Var.f4519G) {
            a90.m132p("streamId should be set", kt0Var.f4522J != -1);
            kt0Var.f4517E.m2005a(z, kt0Var.f4521I, c0539oc, z2);
        } else {
            kt0Var.f4547x.mo1553f(c0539oc, (int) c0539oc.f5698k);
            kt0Var.f4548y |= z;
            kt0Var.f4549z |= z2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Charset m3076g(np0 np0Var) {
        String str = (String) np0Var.m3579c(ca0.f1189i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC0358jg.f3920b;
    }

    /* JADX INFO: renamed from: n */
    public static ja1 m3077n(np0 np0Var) {
        char cCharAt;
        Integer num = (Integer) np0Var.m3579c(f4512L);
        if (num == null) {
            return ja1.f3882l.m2840h("Missing HTTP status code");
        }
        String str = (String) np0Var.m3579c(ca0.f1189i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return ca0.m912g(num.intValue()).m2837b("invalid content-type: " + str);
    }

    /* JADX INFO: renamed from: c */
    public final void m3078c(int i) {
        int i2 = this.f4515C - i;
        this.f4515C = i2;
        float f = i2;
        int i3 = this.f4544u;
        if (f <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.f4514B += i4;
            this.f4515C = i2 + i4;
            this.f4516D.m4004l(this.f4522J, i4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3079d(ja1 ja1Var, boolean z, np0 np0Var) throws EOFException {
        if (this.f4513A) {
            return;
        }
        this.f4513A = true;
        boolean z2 = this.f4519G;
        ot0 ot0Var = this.f4518F;
        if (!z2) {
            ot0Var.m3774h(this.f4522J, ja1Var, EnumC0544oh.f5731j, z, EnumC0227fx.f2521r, np0Var);
            return;
        }
        LinkedList linkedList = ot0Var.f5873D;
        lt0 lt0Var = this.f4523K;
        linkedList.remove(lt0Var);
        ot0Var.m3779m(lt0Var);
        this.f4546w = null;
        C0539oc c0539oc = this.f4547x;
        c0539oc.m3674o(c0539oc.f5698k);
        this.f4519G = false;
        if (np0Var == null) {
            np0Var = new np0();
        }
        m3087m(ja1Var, true, np0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m3080e(ja1 ja1Var, EnumC0544oh enumC0544oh, np0 np0Var) {
        if (this.f4532i) {
            return;
        }
        this.f4532i = true;
        ha1 ha1Var = this.f4531h;
        if (ha1Var.f3141b.compareAndSet(false, true)) {
            for (o80 o80Var : ha1Var.f3140a) {
                o80Var.mo1308A(ja1Var);
            }
        }
        if (this.f4526c != null) {
            ja1Var.m2838f();
        }
        this.f4533j.mo1035g(ja1Var, enumC0544oh, np0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m3081f(Throwable th) {
        m3079d(ja1.m2835e(th), true, new np0());
    }

    /* JADX INFO: renamed from: h */
    public final void m3082h(np0 np0Var) {
        wa0 wa0Var = wa0.f8471k;
        a90.m132p("Received headers on closed stream", !this.f4538o);
        for (o80 o80Var : this.f4531h.f3140a) {
            o80Var.mo1311m();
        }
        String str = (String) np0Var.m3579c(ca0.f1184d);
        if (str != null) {
            C0220fq c0220fq = (C0220fq) this.f4534k.f2844a.get(str);
            InterfaceC0951zh interfaceC0951zh = c0220fq != null ? c0220fq.f2471a : null;
            if (interfaceC0951zh == null) {
                m3081f(ja1.f3882l.m2840h("Can't find decompressor for ".concat(str)).m2836a());
                return;
            } else if (interfaceC0951zh != wa0Var) {
                ko0 ko0Var = this.f4524a;
                ko0Var.getClass();
                a90.m132p("Already set full stream decompressor", true);
                ko0Var.f4473n = interfaceC0951zh;
            }
        }
        this.f4533j.mo1034f(np0Var);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3083i() {
        boolean z;
        synchronized (this.f4525b) {
            try {
                z = this.f4529f && this.f4528e < 32768 && !this.f4530g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final void m3084j(int i, C0539oc c0539oc, boolean z) throws Throwable {
        Throwable th;
        long j = c0539oc.f5698k;
        int i2 = this.f4514B - (((int) j) + i);
        this.f4514B = i2;
        this.f4515C -= i;
        if (i2 < 0) {
            this.f4516D.m4003j(this.f4522J, EnumC0227fx.f2517n);
            this.f4518F.m3774h(this.f4522J, ja1.f3882l.m2840h("Received data size exceeded our receiving window size"), EnumC0544oh.f5731j, false, null, null);
            return;
        }
        st0 st0Var = new st0(c0539oc);
        ja1 ja1Var = this.f4540q;
        boolean z2 = false;
        if (ja1Var != null) {
            Charset charset = this.f4542s;
            c01 c01Var = d01.f1505a;
            a90.m127k(charset, "charset");
            int i3 = (int) c0539oc.f5698k;
            byte[] bArr = new byte[i3];
            st0Var.mo828o(bArr, 0, i3);
            this.f4540q = ja1Var.m2837b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            st0Var.close();
            if (this.f4540q.f3887b.length() > 1000 || z) {
                m3079d(this.f4540q, false, this.f4541r);
                return;
            }
            return;
        }
        if (!this.f4543t) {
            m3079d(ja1.f3882l.m2840h("headers not received before payload"), false, new np0());
            return;
        }
        int i4 = (int) j;
        boolean z3 = true;
        try {
            if (this.f4538o) {
                AbstractC0489n.f5213p.log(Level.INFO, "Received data on closed stream");
                st0Var.close();
            } else {
                try {
                    ko0 ko0Var = this.f4524a;
                    ko0Var.getClass();
                    try {
                        if (ko0Var.isClosed() || ko0Var.f4485z) {
                            st0Var.close();
                        } else {
                            ko0Var.f4480u.m4929t(st0Var);
                            try {
                                ko0Var.m3059a();
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = false;
                                if (z3) {
                                    st0Var.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        m3081f(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        if (!z2) {
                            throw th;
                        }
                        st0Var.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (i4 > 0) {
                    this.f4540q = ja1.f3882l.m2840h("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f4540q = ja1.f3882l.m2840h("Received unexpected EOS on empty DATA frame from server");
                }
                np0 np0Var = new np0();
                this.f4541r = np0Var;
                m3087m(this.f4540q, false, np0Var);
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3085k(ArrayList arrayList, boolean z) throws EOFException {
        ja1 ja1VarM2837b;
        lp0 lp0Var = f4512L;
        if (z) {
            byte[][] bArrM934a = ch1.m934a(arrayList);
            int length = bArrM934a.length / 2;
            np0 np0Var = new np0();
            np0Var.f5488b = length;
            np0Var.f5487a = bArrM934a;
            if (this.f4540q == null && !this.f4543t) {
                ja1 ja1VarM3077n = m3077n(np0Var);
                this.f4540q = ja1VarM3077n;
                if (ja1VarM3077n != null) {
                    this.f4541r = np0Var;
                }
            }
            ja1 ja1Var = this.f4540q;
            if (ja1Var != null) {
                ja1 ja1VarM2837b2 = ja1Var.m2837b("trailers: " + np0Var);
                this.f4540q = ja1VarM2837b2;
                m3079d(ja1VarM2837b2, false, this.f4541r);
                return;
            }
            lp0 lp0Var2 = pe0.f6105b;
            ja1 ja1Var2 = (ja1) np0Var.m3579c(lp0Var2);
            if (ja1Var2 != null) {
                ja1VarM2837b = ja1Var2.m2840h((String) np0Var.m3579c(pe0.f6104a));
            } else if (this.f4543t) {
                ja1VarM2837b = ja1.f3877g.m2840h("missing GRPC status in response");
            } else {
                Integer num = (Integer) np0Var.m3579c(lp0Var);
                ja1VarM2837b = (num != null ? ca0.m912g(num.intValue()) : ja1.f3882l.m2840h("missing HTTP status code")).m2837b("missing GRPC status, inferred error from HTTP status code");
            }
            np0Var.m3577a(lp0Var);
            np0Var.m3577a(lp0Var2);
            np0Var.m3577a(pe0.f6104a);
            if (this.f4538o) {
                AbstractC0489n.f5213p.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{ja1VarM2837b, np0Var});
                return;
            }
            for (o80 o80Var : this.f4531h.f3140a) {
                o80Var.mo1314p(np0Var);
            }
            m3086l(ja1VarM2837b, EnumC0544oh.f5731j, false, np0Var);
            return;
        }
        byte[][] bArrM934a2 = ch1.m934a(arrayList);
        int length2 = bArrM934a2.length / 2;
        np0 np0Var2 = new np0();
        np0Var2.f5488b = length2;
        np0Var2.f5487a = bArrM934a2;
        ja1 ja1Var3 = this.f4540q;
        if (ja1Var3 != null) {
            this.f4540q = ja1Var3.m2837b("headers: " + np0Var2);
            return;
        }
        try {
            if (this.f4543t) {
                ja1 ja1VarM2840h = ja1.f3882l.m2840h("Received headers twice");
                this.f4540q = ja1VarM2840h;
                this.f4540q = ja1VarM2840h.m2837b("headers: " + np0Var2);
                this.f4541r = np0Var2;
                this.f4542s = m3076g(np0Var2);
                return;
            }
            Integer num2 = (Integer) np0Var2.m3579c(lp0Var);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                ja1 ja1Var4 = this.f4540q;
                if (ja1Var4 != null) {
                    this.f4540q = ja1Var4.m2837b("headers: " + np0Var2);
                    this.f4541r = np0Var2;
                    this.f4542s = m3076g(np0Var2);
                    return;
                }
                return;
            }
            this.f4543t = true;
            ja1 ja1VarM3077n2 = m3077n(np0Var2);
            this.f4540q = ja1VarM3077n2;
            if (ja1VarM3077n2 != null) {
                this.f4540q = ja1VarM3077n2.m2837b("headers: " + np0Var2);
                this.f4541r = np0Var2;
                this.f4542s = m3076g(np0Var2);
                return;
            }
            np0Var2.m3577a(lp0Var);
            np0Var2.m3577a(pe0.f6105b);
            np0Var2.m3577a(pe0.f6104a);
            m3082h(np0Var2);
            ja1 ja1Var5 = this.f4540q;
            if (ja1Var5 != null) {
                this.f4540q = ja1Var5.m2837b("headers: " + np0Var2);
                this.f4541r = np0Var2;
                this.f4542s = m3076g(np0Var2);
            }
        } catch (Throwable th) {
            ja1 ja1Var6 = this.f4540q;
            if (ja1Var6 != null) {
                this.f4540q = ja1Var6.m2837b("headers: " + np0Var2);
                this.f4541r = np0Var2;
                this.f4542s = m3076g(np0Var2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3086l(ja1 ja1Var, EnumC0544oh enumC0544oh, boolean z, np0 np0Var) {
        a90.m127k(ja1Var, "status");
        if (!this.f4538o || z) {
            this.f4538o = true;
            this.f4539p = ja1Var.m2838f();
            synchronized (this.f4525b) {
                this.f4530g = true;
            }
            if (this.f4535l) {
                this.f4536m = null;
                m3080e(ja1Var, enumC0544oh, np0Var);
                return;
            }
            this.f4536m = new RunnableC0452m(this, ja1Var, enumC0544oh, np0Var, 0);
            ko0 ko0Var = this.f4524a;
            if (z) {
                ko0Var.close();
            } else {
                if (ko0Var.isClosed()) {
                    return;
                }
                if (ko0Var.f4480u.f7836l == 0) {
                    ko0Var.close();
                } else {
                    ko0Var.f4485z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3087m(ja1 ja1Var, boolean z, np0 np0Var) {
        m3086l(ja1Var, EnumC0544oh.f5731j, z, np0Var);
    }
}
