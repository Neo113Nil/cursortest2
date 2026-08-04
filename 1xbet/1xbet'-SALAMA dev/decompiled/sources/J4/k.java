package J4;

import Y4.L0;
import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.C0884t;
import com.google.protobuf.InterfaceC0868k0;
import com.google.protobuf.J;
import com.google.protobuf.M;
import com.google.protobuf.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends C {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC0868k0 PARSER = null;
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
        C0874n0 c0874n0 = C0874n0.f12243d;
        this.writes_ = c0874n0;
        this.baseWrites_ = c0874n0;
    }

    public static j F() {
        return (j) DEFAULT_INSTANCE.i();
    }

    public static k G(AbstractC0867k abstractC0867k) throws M {
        k kVar = DEFAULT_INSTANCE;
        C0884t c0884tA = C0884t.a();
        H6.b bVarG = abstractC0867k.G();
        C cS = C.s(kVar, bVarG, c0884tA);
        bVarG.a(0);
        C.f(cS);
        C.f(cS);
        return (k) cS;
    }

    public static k H(byte[] bArr) {
        return (k) C.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(k kVar, int i7) {
        kVar.batchId_ = i7;
    }

    public static void w(k kVar, L0 l7) {
        kVar.getClass();
        J j = kVar.baseWrites_;
        if (!((AbstractC0849b) j).f12176a) {
            kVar.baseWrites_ = C.p(j);
        }
        kVar.baseWrites_.add(l7);
    }

    public static void x(k kVar, L0 l7) {
        kVar.getClass();
        J j = kVar.writes_;
        if (!((AbstractC0849b) j).f12176a) {
            kVar.writes_ = C.p(j);
        }
        kVar.writes_.add(l7);
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
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", L0.class, "localWriteTime_", "baseWrites_", L0.class});
            case 3:
                return new k();
            case 4:
                return new j(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (k.class) {
                        try {
                            b7 = PARSER;
                            if (b7 == null) {
                                b7 = new B(DEFAULT_INSTANCE);
                                PARSER = b7;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return b7;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final L0 z(int i7) {
        return (L0) this.baseWrites_.get(i7);
    }
}
