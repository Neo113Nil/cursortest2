package Y4;

import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0892a0;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class O0 extends com.google.protobuf.C {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final O0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C0892a0 labels_ = C0892a0.f12174b;
    private String database_ = "";
    private String streamId_ = "";
    private com.google.protobuf.J writes_ = C0918n0.f12243d;
    private AbstractC0911k streamToken_ = AbstractC0911k.f12212b;

    static {
        O0 o02 = new O0();
        DEFAULT_INSTANCE = o02;
        com.google.protobuf.C.t(O0.class, o02);
    }

    public static void v(O0 o02, String str) {
        o02.getClass();
        str.getClass();
        o02.database_ = str;
    }

    public static void w(O0 o02, AbstractC0911k abstractC0911k) {
        o02.getClass();
        abstractC0911k.getClass();
        o02.streamToken_ = abstractC0911k;
    }

    public static void x(O0 o02, L0 l02) {
        o02.getClass();
        com.google.protobuf.J j = o02.writes_;
        if (!((AbstractC0893b) j).f12176a) {
            o02.writes_ = com.google.protobuf.C.p(j);
        }
        o02.writes_.add(l02);
    }

    public static O0 y() {
        return DEFAULT_INSTANCE;
    }

    public static M0 z() {
        return (M0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", L0.class, "streamToken_", "labels_", N0.f7706a});
            case 3:
                return new O0();
            case 4:
                return new M0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (O0.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new com.google.protobuf.B(DEFAULT_INSTANCE);
                                PARSER = interfaceC0912k0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0912k0;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
