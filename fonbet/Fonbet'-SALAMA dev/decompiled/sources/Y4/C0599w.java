package Y4;

import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0599w extends com.google.protobuf.C {
    private static final C0599w DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER;
    private com.google.protobuf.J fieldPaths_ = C0918n0.f12243d;

    static {
        C0599w c0599w = new C0599w();
        DEFAULT_INSTANCE = c0599w;
        com.google.protobuf.C.t(C0599w.class, c0599w);
    }

    public static void v(C0599w c0599w, String str) {
        c0599w.getClass();
        str.getClass();
        com.google.protobuf.J j = c0599w.fieldPaths_;
        if (!((AbstractC0893b) j).f12176a) {
            c0599w.fieldPaths_ = com.google.protobuf.C.p(j);
        }
        c0599w.fieldPaths_.add(str);
    }

    public static C0599w w() {
        return DEFAULT_INSTANCE;
    }

    public static C0598v z() {
        return (C0598v) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new C0599w();
            case 4:
                return new C0598v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0599w.class) {
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

    public final String x(int i7) {
        return (String) this.fieldPaths_.get(i7);
    }

    public final int y() {
        return this.fieldPaths_.size();
    }
}
