package Y4;

import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 extends com.google.protobuf.C {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final L0 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private M currentDocument_;
    private Object operation_;
    private C0599w updateMask_;
    private int operationCase_ = 0;
    private com.google.protobuf.J updateTransforms_ = C0874n0.f12243d;

    static {
        L0 l7 = new L0();
        DEFAULT_INSTANCE = l7;
        com.google.protobuf.C.t(L0.class, l7);
    }

    public static void A(L0 l7, String str) {
        l7.getClass();
        str.getClass();
        l7.operationCase_ = 5;
        l7.operation_ = str;
    }

    public static J0 N() {
        return (J0) DEFAULT_INSTANCE.i();
    }

    public static J0 O(L0 l7) {
        com.google.protobuf.A aI = DEFAULT_INSTANCE.i();
        if (!aI.f12095a.equals(l7)) {
            aI.d();
            com.google.protobuf.A.e(aI.f12096b, l7);
        }
        return (J0) aI;
    }

    public static L0 P(byte[] bArr) {
        return (L0) com.google.protobuf.C.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(L0 l7, C0599w c0599w) {
        l7.getClass();
        l7.updateMask_ = c0599w;
        l7.bitField0_ |= 1;
    }

    public static void w(L0 l7, A a2) {
        l7.getClass();
        a2.getClass();
        com.google.protobuf.J j = l7.updateTransforms_;
        if (!((AbstractC0849b) j).f12176a) {
            l7.updateTransforms_ = com.google.protobuf.C.p(j);
        }
        l7.updateTransforms_.add(a2);
    }

    public static void x(L0 l7, C0595s c0595s) {
        l7.getClass();
        l7.operation_ = c0595s;
        l7.operationCase_ = 1;
    }

    public static void y(L0 l7, M m7) {
        l7.getClass();
        l7.currentDocument_ = m7;
        l7.bitField0_ |= 2;
    }

    public static void z(L0 l7, String str) {
        l7.getClass();
        str.getClass();
        l7.operationCase_ = 2;
        l7.operation_ = str;
    }

    public final M B() {
        M m7 = this.currentDocument_;
        return m7 == null ? M.y() : m7;
    }

    public final String C() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public final K0 D() {
        int i7 = this.operationCase_;
        if (i7 == 0) {
            return K0.f7704e;
        }
        if (i7 == 1) {
            return K0.f7700a;
        }
        if (i7 == 2) {
            return K0.f7701b;
        }
        if (i7 == 5) {
            return K0.f7702c;
        }
        if (i7 != 6) {
            return null;
        }
        return K0.f7703d;
    }

    public final B E() {
        return this.operationCase_ == 6 ? (B) this.operation_ : B.v();
    }

    public final C0595s F() {
        return this.operationCase_ == 1 ? (C0595s) this.operation_ : C0595s.y();
    }

    public final C0599w G() {
        C0599w c0599w = this.updateMask_;
        return c0599w == null ? C0599w.w() : c0599w;
    }

    public final com.google.protobuf.J H() {
        return this.updateTransforms_;
    }

    public final String I() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public final boolean J() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean K() {
        return this.operationCase_ == 6;
    }

    public final boolean L() {
        return this.operationCase_ == 1;
    }

    public final boolean M() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C0595s.class, "updateMask_", "currentDocument_", B.class, "updateTransforms_", A.class});
            case 3:
                return new L0();
            case 4:
                return new J0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (L0.class) {
                        try {
                            b7 = PARSER;
                            if (b7 == null) {
                                b7 = new com.google.protobuf.B(DEFAULT_INSTANCE);
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
