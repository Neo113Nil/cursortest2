package J4;

import Y4.A0;
import Y4.y0;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;
import com.google.protobuf.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends C {
    private static final g DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private z0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private z0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC0867k resumeToken_ = AbstractC0867k.f12212b;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        C.t(g.class, gVar);
    }

    public static void A(g gVar, z0 z0Var) {
        gVar.getClass();
        gVar.snapshotVersion_ = z0Var;
        gVar.bitField0_ |= 1;
    }

    public static void B(g gVar, AbstractC0867k abstractC0867k) {
        gVar.getClass();
        abstractC0867k.getClass();
        gVar.resumeToken_ = abstractC0867k;
    }

    public static void C(g gVar, long j) {
        gVar.lastListenSequenceNumber_ = j;
    }

    public static e L() {
        return (e) DEFAULT_INSTANCE.i();
    }

    public static g M(byte[] bArr) {
        return (g) C.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(g gVar, A0 a2) {
        gVar.getClass();
        gVar.targetType_ = a2;
        gVar.targetTypeCase_ = 5;
    }

    public static void w(g gVar, y0 y0Var) {
        gVar.getClass();
        gVar.targetType_ = y0Var;
        gVar.targetTypeCase_ = 6;
    }

    public static void x(g gVar, z0 z0Var) {
        gVar.getClass();
        gVar.lastLimboFreeSnapshotVersion_ = z0Var;
        gVar.bitField0_ |= 2;
    }

    public static void y(g gVar) {
        gVar.lastLimboFreeSnapshotVersion_ = null;
        gVar.bitField0_ &= -3;
    }

    public static void z(g gVar, int i7) {
        gVar.targetId_ = i7;
    }

    public final y0 D() {
        return this.targetTypeCase_ == 6 ? (y0) this.targetType_ : y0.w();
    }

    public final z0 E() {
        z0 z0Var = this.lastLimboFreeSnapshotVersion_;
        return z0Var == null ? z0.x() : z0Var;
    }

    public final long F() {
        return this.lastListenSequenceNumber_;
    }

    public final A0 G() {
        return this.targetTypeCase_ == 5 ? (A0) this.targetType_ : A0.x();
    }

    public final AbstractC0867k H() {
        return this.resumeToken_;
    }

    public final z0 I() {
        z0 z0Var = this.snapshotVersion_;
        return z0Var == null ? z0.x() : z0Var;
    }

    public final int J() {
        return this.targetId_;
    }

    public final f K() {
        int i7 = this.targetTypeCase_;
        if (i7 == 0) {
            return f.f3863c;
        }
        if (i7 == 5) {
            return f.f3861a;
        }
        if (i7 != 6) {
            return null;
        }
        return f.f3862b;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", A0.class, y0.class, "lastLimboFreeSnapshotVersion_"});
            case 3:
                return new g();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (g.class) {
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
}
