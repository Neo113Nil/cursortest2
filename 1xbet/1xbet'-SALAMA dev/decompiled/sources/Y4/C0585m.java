package Y4;

import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0585m extends com.google.protobuf.C {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0585m DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private com.google.protobuf.J writes_ = C0874n0.f12243d;
    private AbstractC0867k transaction_ = AbstractC0867k.f12212b;

    static {
        C0585m c0585m = new C0585m();
        DEFAULT_INSTANCE = c0585m;
        com.google.protobuf.C.t(C0585m.class, c0585m);
    }

    public static void v(C0585m c0585m, String str) {
        c0585m.getClass();
        str.getClass();
        c0585m.database_ = str;
    }

    public static void w(C0585m c0585m, L0 l7) {
        c0585m.getClass();
        com.google.protobuf.J j = c0585m.writes_;
        if (!((AbstractC0849b) j).f12176a) {
            c0585m.writes_ = com.google.protobuf.C.p(j);
        }
        c0585m.writes_.add(l7);
    }

    public static C0585m x() {
        return DEFAULT_INSTANCE;
    }

    public static C0583l y() {
        return (C0583l) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", L0.class, "transaction_"});
            case 3:
                return new C0585m();
            case 4:
                return new C0583l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0585m.class) {
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
