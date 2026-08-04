package Y4;

import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0848a0;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends com.google.protobuf.C {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final O0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C0848a0 labels_ = C0848a0.f12174b;
    private String database_ = "";
    private String streamId_ = "";
    private com.google.protobuf.J writes_ = C0874n0.f12243d;
    private AbstractC0867k streamToken_ = AbstractC0867k.f12212b;

    static {
        O0 o7 = new O0();
        DEFAULT_INSTANCE = o7;
        com.google.protobuf.C.t(O0.class, o7);
    }

    public static void v(O0 o7, String str) {
        o7.getClass();
        str.getClass();
        o7.database_ = str;
    }

    public static void w(O0 o7, AbstractC0867k abstractC0867k) {
        o7.getClass();
        abstractC0867k.getClass();
        o7.streamToken_ = abstractC0867k;
    }

    public static void x(O0 o7, L0 l7) {
        o7.getClass();
        com.google.protobuf.J j = o7.writes_;
        if (!((AbstractC0849b) j).f12176a) {
            o7.writes_ = com.google.protobuf.C.p(j);
        }
        o7.writes_.add(l7);
    }

    public static O0 y() {
        return DEFAULT_INSTANCE;
    }

    public static M0 z() {
        return (M0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", L0.class, "streamToken_", "labels_", N0.f7706a});
            case 3:
                return new O0();
            case 4:
                return new M0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (O0.class) {
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
