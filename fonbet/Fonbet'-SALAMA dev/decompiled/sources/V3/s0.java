package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0885v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0889z;

/* loaded from: classes2.dex */
public final class s0 extends AbstractC0886w {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final s0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private String configName_ = "";
    private InterfaceC0889z entry_ = com.google.crypto.tink.shaded.protobuf.a0.f11751d;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        AbstractC0886w.v(s0.class, s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", c0.class});
            case 3:
                return new s0();
            case 4:
                return new K(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (s0.class) {
                        try {
                            x4 = PARSER;
                            if (x4 == null) {
                                x4 = new C0885v();
                                PARSER = x4;
                            }
                        } finally {
                        }
                    }
                }
                return x4;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
