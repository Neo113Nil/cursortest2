package J4;

import Y4.L0;
import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.C0928t;
import com.google.protobuf.InterfaceC0912k0;
import com.google.protobuf.J;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class k extends C {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private J baseWrites_;
    private int batchId_;
    private int bitField0_;
    private z0 localWriteTime_;
    private J writes_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        C.t(k.class, kVar);
    }

    public k() {
        C0918n0 c0918n0 = C0918n0.f12243d;
        this.writes_ = c0918n0;
        this.baseWrites_ = c0918n0;
    }

    public static j F() {
        return (j) DEFAULT_INSTANCE.i();
    }

    public static k G(AbstractC0911k abstractC0911k) {
        k kVar = DEFAULT_INSTANCE;
        C0928t a2 = C0928t.a();
        H6.b G2 = abstractC0911k.G();
        C s7 = C.s(kVar, G2, a2);
        G2.a(0);
        C.f(s7);
        C.f(s7);
        return (k) s7;
    }

    public static k H(byte[] bArr) {
        return (k) C.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(k kVar, int i7) {
        kVar.batchId_ = i7;
    }

    public static void w(k kVar, L0 l02) {
        kVar.getClass();
        J j = kVar.baseWrites_;
        if (!((AbstractC0893b) j).f12176a) {
            kVar.baseWrites_ = C.p(j);
        }
        kVar.baseWrites_.add(l02);
    }

    public static void x(k kVar, L0 l02) {
        kVar.getClass();
        J j = kVar.writes_;
        if (!((AbstractC0893b) j).f12176a) {
            kVar.writes_ = C.p(j);
        }
        kVar.writes_.add(l02);
    }

    public static void y(k kVar, z0 z0Var) {
        kVar.getClass();
        kVar.localWriteTime_ = z0Var;
        kVar.bitField0_ |= 1;
    }

    public final int A() {
        return this.baseWrites_.size();
    }

    public final int B() {
        return this.batchId_;
    }

    public final z0 C() {
        z0 z0Var = this.localWriteTime_;
        return z0Var == null ? z0.x() : z0Var;
    }

    public final L0 D(int i7) {
        return (L0) this.writes_.get(i7);
    }

    public final int E() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", L0.class, "localWriteTime_", "baseWrites_", L0.class});
            case 3:
                return new k();
            case 4:
                return new j(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (k.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new B(DEFAULT_INSTANCE);
                                PARSER = interfaceC0912k0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0912k0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final L0 z(int i7) {
        return (L0) this.baseWrites_.get(i7);
    }
}
