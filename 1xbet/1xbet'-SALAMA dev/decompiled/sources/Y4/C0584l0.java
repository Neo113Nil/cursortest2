package Y4;

import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0584l0 extends com.google.protobuf.C {
    private static final C0584l0 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private String fieldPath_ = "";

    static {
        C0584l0 c0584l0 = new C0584l0();
        DEFAULT_INSTANCE = c0584l0;
        com.google.protobuf.C.t(C0584l0.class, c0584l0);
    }

    public static void v(C0584l0 c0584l0, String str) {
        c0584l0.getClass();
        str.getClass();
        c0584l0.fieldPath_ = str;
    }

    public static C0584l0 w() {
        return DEFAULT_INSTANCE;
    }

    public static C0582k0 y() {
        return (C0582k0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
            case 3:
                return new C0584l0();
            case 4:
                return new C0582k0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0584l0.class) {
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
        return this.fieldPath_;
    }
}
