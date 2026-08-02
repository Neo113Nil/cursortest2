package p000;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 implements InterfaceC0538ob {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8618j = 0;

    /* JADX INFO: renamed from: k */
    public boolean f8619k;

    /* JADX INFO: renamed from: l */
    public final Object f8620l;

    /* JADX INFO: renamed from: m */
    public final Object f8621m;

    /* JADX INFO: renamed from: n */
    public Object f8622n;

    /* JADX INFO: renamed from: o */
    public Object f8623o;

    /* JADX INFO: renamed from: p */
    public final Object f8624p;

    public wp0(String str, yx0 yx0Var, yx0 yx0Var2) {
        new AtomicReferenceArray(2);
        this.f8620l = vp0.f8244j;
        this.f8621m = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f8622n = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        this.f8623o = yx0Var;
        this.f8624p = yx0Var2;
        this.f8619k = true;
    }

    /* JADX INFO: renamed from: a */
    public static String m5409a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        a90.m127k(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        a90.m127k(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0342j0 m5410b(InputStream inputStream) {
        AbstractC0860x0 c0099ci;
        byte[] bArr;
        yx0 yx0Var = (yx0) this.f8624p;
        if (!(inputStream instanceof xx0)) {
            yx0Var.getClass();
        } else if (((xx0) inputStream).f9102k == yx0Var.f9525a) {
            try {
                C0525nz c0525nz = ((xx0) inputStream).f9101j;
                if (c0525nz != null) {
                    return c0525nz;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof zg0) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return yx0Var.f9526b;
                    }
                    c0099ci = null;
                } else {
                    ThreadLocal threadLocal = yx0.f9524d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    c0099ci = AbstractC0860x0.m5489d(bArr, 0, iAvailable, false);
                }
            } else {
                c0099ci = null;
            }
            if (c0099ci == null) {
                c0099ci = new C0099ci(inputStream);
            }
            int i3 = yx0Var.f9527c;
            if (i3 >= 0) {
                if (i3 < 0) {
                    C0270h1.m2190f(j11.m2773h("Recursion limit cannot be negative: ", i3));
                    return null;
                }
                c0099ci.f8728k = i3;
            }
            try {
                s70 s70VarM4040a = ((q70) yx0Var.f9525a).m4040a(c0099ci, zx0.f9981a);
                if (!s70.m4492h(s70VarM4040a, true)) {
                    throw new hf0(new if1().getMessage());
                }
                c0099ci.mo216a(0);
                return s70VarM4040a;
            } catch (hf0 e) {
                throw ja1.f3882l.m2840h("Invalid protobuf byte sequence").m2839g(e).m2836a();
            }
        } catch (IOException e2) {
            dd0.m1163h(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5411c(C0253gl c0253gl) {
        el1 el1Var = (el1) ((l90) this.f8624p).f4731j.get((C0679s4) this.f8621m);
        if (el1Var != null) {
            el1Var.m1453n(c0253gl);
        }
    }

    @Override // p000.InterfaceC0538ob
    /* JADX INFO: renamed from: i */
    public void mo613i(C0253gl c0253gl) {
        ((l90) this.f8624p).f4734m.post(new f31(4, this, c0253gl));
    }

    public String toString() {
        switch (this.f8618j) {
            case 0:
                C0809vn c0809vnM5362k = wm1.m5362k(this);
                c0809vnM5362k.m5172c((String) this.f8621m, "fullMethodName");
                c0809vnM5362k.m5172c((vp0) this.f8620l, "type");
                c0809vnM5362k.m5174e("idempotent", false);
                c0809vnM5362k.m5174e("safe", false);
                c0809vnM5362k.m5174e("sampledToLocalTracing", this.f8619k);
                c0809vnM5362k.m5172c((yx0) this.f8623o, "requestMarshaller");
                c0809vnM5362k.m5172c((yx0) this.f8624p, "responseMarshaller");
                c0809vnM5362k.m5172c(null, "schemaDescriptor");
                c0809vnM5362k.f8223k = true;
                return c0809vnM5362k.toString();
            default:
                return super.toString();
        }
    }

    public wp0(l90 l90Var, e90 e90Var, C0679s4 c0679s4) {
        Objects.requireNonNull(l90Var);
        this.f8624p = l90Var;
        this.f8622n = null;
        this.f8623o = null;
        this.f8619k = false;
        this.f8620l = e90Var;
        this.f8621m = c0679s4;
    }
}
