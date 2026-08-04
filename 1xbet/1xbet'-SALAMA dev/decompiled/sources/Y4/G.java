package Y4;

import com.google.protobuf.C0848a0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends com.google.protobuf.C {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final G DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C0848a0 labels_ = C0848a0.f12174b;
    private String database_ = "";

    static {
        G g3 = new G();
        DEFAULT_INSTANCE = g3;
        com.google.protobuf.C.t(G.class, g3);
    }

    public static E A() {
        return (E) DEFAULT_INSTANCE.i();
    }

    public static C0848a0 v(G g3) {
        C0848a0 c0848a0 = g3.labels_;
        if (!c0848a0.f12175a) {
            g3.labels_ = c0848a0.c();
        }
        return g3.labels_;
    }

    public static void w(G g3, String str) {
        g3.getClass();
        str.getClass();
        g3.database_ = str;
    }

    public static void x(G g3, B0 b7) {
        g3.getClass();
        g3.targetChange_ = b7;
        g3.targetChangeCase_ = 2;
    }

    public static void y(G g3, int i7) {
        g3.targetChangeCase_ = 3;
        g3.targetChange_ = Integer.valueOf(i7);
    }

    public static G z() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", B0.class, "labels_", F.f7698a});
            case 3:
                return new G();
            case 4:
                return new E(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (G.class) {
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
