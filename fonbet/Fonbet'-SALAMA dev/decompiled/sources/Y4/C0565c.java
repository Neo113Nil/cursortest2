package Y4;

import com.google.protobuf.C0892a0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import java.util.Collections;
import java.util.Map;

/* renamed from: Y4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0565c extends com.google.protobuf.C {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C0565c DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER;
    private C0892a0 aggregateFields_ = C0892a0.f12174b;

    static {
        C0565c c0565c = new C0565c();
        DEFAULT_INSTANCE = c0565c;
        com.google.protobuf.C.t(C0565c.class, c0565c);
    }

    public static C0565c w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", AbstractC0561a.f7707a});
            case 3:
                return new C0565c();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0565c.class) {
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

    public final Map v() {
        return Collections.unmodifiableMap(this.aggregateFields_);
    }
}
