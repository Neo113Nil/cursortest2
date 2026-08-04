package Y4;

import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends com.google.protobuf.C {
    private static final y0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private com.google.protobuf.J documents_ = C0874n0.f12243d;

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.protobuf.C.t(y0.class, y0Var);
    }

    public static void v(y0 y0Var, String str) {
        y0Var.getClass();
        str.getClass();
        com.google.protobuf.J j = y0Var.documents_;
        if (!((AbstractC0849b) j).f12176a) {
            y0Var.documents_ = com.google.protobuf.C.p(j);
        }
        y0Var.documents_.add(str);
    }

    public static y0 w() {
        return DEFAULT_INSTANCE;
    }

    public static x0 z() {
        return (x0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
            case 3:
                return new y0();
            case 4:
                return new x0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (y0.class) {
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

    public final String x() {
        return (String) this.documents_.get(0);
    }

    public final int y() {
        return this.documents_.size();
    }
}
