package b5;

import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import t.e;

/* loaded from: classes2.dex */
public final class b extends C {
    private static final b DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0912k0 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        C.t(b.class, bVar);
    }

    public static C0788a A() {
        return (C0788a) DEFAULT_INSTANCE.i();
    }

    public static void v(b bVar, double d7) {
        bVar.latitude_ = d7;
    }

    public static void w(b bVar, double d7) {
        bVar.longitude_ = d7;
    }

    public static b x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new b();
            case 4:
                return new C0788a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (b.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new B(DEFAULT_INSTANCE);
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

    public final double y() {
        return this.latitude_;
    }

    public final double z() {
        return this.longitude_;
    }
}
