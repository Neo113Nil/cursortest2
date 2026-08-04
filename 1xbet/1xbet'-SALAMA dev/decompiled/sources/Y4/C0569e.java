package Y4;

import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;
import java.util.List;

/* JADX INFO: renamed from: Y4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0569e extends com.google.protobuf.C implements InterfaceC0571f {
    private static final C0569e DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.J values_ = C0874n0.f12243d;

    static {
        C0569e c0569e = new C0569e();
        DEFAULT_INSTANCE = c0569e;
        com.google.protobuf.C.t(C0569e.class, c0569e);
    }

    public static C0567d B() {
        return (C0567d) DEFAULT_INSTANCE.i();
    }

    public static void v(C0569e c0569e, I0 i7) {
        c0569e.getClass();
        i7.getClass();
        com.google.protobuf.J j = c0569e.values_;
        if (!((AbstractC0849b) j).f12176a) {
            c0569e.values_ = com.google.protobuf.C.p(j);
        }
        c0569e.values_.add(i7);
    }

    public static void w(C0569e c0569e, List list) {
        com.google.protobuf.J j = c0569e.values_;
        if (!((AbstractC0849b) j).f12176a) {
            c0569e.values_ = com.google.protobuf.C.p(j);
        }
        AbstractC0847a.b(list, c0569e.values_);
    }

    public static void x(C0569e c0569e, int i7) {
        com.google.protobuf.J j = c0569e.values_;
        if (!((AbstractC0849b) j).f12176a) {
            c0569e.values_ = com.google.protobuf.C.p(j);
        }
        c0569e.values_.remove(i7);
    }

    public static C0569e y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.values_.size();
    }

    @Override // Y4.InterfaceC0571f
    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", I0.class});
            case 3:
                return new C0569e();
            case 4:
                return new C0567d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0569e.class) {
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

    public final I0 z(int i7) {
        return (I0) this.values_.get(i7);
    }
}
