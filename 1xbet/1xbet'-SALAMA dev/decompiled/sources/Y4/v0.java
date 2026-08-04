package Y4;

import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends com.google.protobuf.C {
    private static final v0 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C0591p endAt_;
    private com.google.protobuf.J from_;
    private com.google.protobuf.E limit_;
    private int offset_;
    private com.google.protobuf.J orderBy_;
    private r0 select_;
    private C0591p startAt_;
    private C0590o0 where_;

    static {
        v0 v0Var = new v0();
        DEFAULT_INSTANCE = v0Var;
        com.google.protobuf.C.t(v0.class, v0Var);
    }

    public v0() {
        C0874n0 c0874n0 = C0874n0.f12243d;
        this.from_ = c0874n0;
        this.orderBy_ = c0874n0;
    }

    public static void A(v0 v0Var, com.google.protobuf.E e7) {
        v0Var.getClass();
        v0Var.limit_ = e7;
        v0Var.bitField0_ |= 16;
    }

    public static v0 B() {
        return DEFAULT_INSTANCE;
    }

    public static C0562a0 O() {
        return (C0562a0) DEFAULT_INSTANCE.i();
    }

    public static void v(v0 v0Var, C0566c0 c0566c0) {
        v0Var.getClass();
        com.google.protobuf.J j = v0Var.from_;
        if (!((AbstractC0849b) j).f12176a) {
            v0Var.from_ = com.google.protobuf.C.p(j);
        }
        v0Var.from_.add(c0566c0);
    }

    public static void w(v0 v0Var, C0590o0 c0590o0) {
        v0Var.getClass();
        c0590o0.getClass();
        v0Var.where_ = c0590o0;
        v0Var.bitField0_ |= 2;
    }

    public static void x(v0 v0Var, C0594q0 c0594q0) {
        v0Var.getClass();
        com.google.protobuf.J j = v0Var.orderBy_;
        if (!((AbstractC0849b) j).f12176a) {
            v0Var.orderBy_ = com.google.protobuf.C.p(j);
        }
        v0Var.orderBy_.add(c0594q0);
    }

    public static void y(v0 v0Var, C0591p c0591p) {
        v0Var.getClass();
        v0Var.startAt_ = c0591p;
        v0Var.bitField0_ |= 4;
    }

    public static void z(v0 v0Var, C0591p c0591p) {
        v0Var.getClass();
        v0Var.endAt_ = c0591p;
        v0Var.bitField0_ |= 8;
    }

    public final C0591p C() {
        C0591p c0591p = this.endAt_;
        return c0591p == null ? C0591p.y() : c0591p;
    }

    public final C0566c0 D() {
        return (C0566c0) this.from_.get(0);
    }

    public final int E() {
        return this.from_.size();
    }

    public final com.google.protobuf.E F() {
        com.google.protobuf.E e7 = this.limit_;
        return e7 == null ? com.google.protobuf.E.w() : e7;
    }

    public final C0594q0 G(int i7) {
        return (C0594q0) this.orderBy_.get(i7);
    }

    public final int H() {
        return this.orderBy_.size();
    }

    public final C0591p I() {
        C0591p c0591p = this.startAt_;
        return c0591p == null ? C0591p.y() : c0591p;
    }

    public final C0590o0 J() {
        C0590o0 c0590o0 = this.where_;
        return c0590o0 == null ? C0590o0.z() : c0590o0;
    }

    public final boolean K() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean N() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", C0566c0.class, "where_", "orderBy_", C0594q0.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new v0();
            case 4:
                return new C0562a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (v0.class) {
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
