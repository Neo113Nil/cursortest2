package Y4;

import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends com.google.protobuf.C {
    private static final B DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private String document_ = "";
    private com.google.protobuf.J fieldTransforms_ = C0874n0.f12243d;

    static {
        B b7 = new B();
        DEFAULT_INSTANCE = b7;
        com.google.protobuf.C.t(B.class, b7);
    }

    public static B v() {
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
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", A.class});
            case 3:
                return new B();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (B.class) {
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

    public final com.google.protobuf.J w() {
        return this.fieldTransforms_;
    }
}
