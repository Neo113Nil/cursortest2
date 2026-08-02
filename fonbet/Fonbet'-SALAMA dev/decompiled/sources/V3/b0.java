package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class b0 extends AbstractC0886w {
    private static final b0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC0873i value_ = AbstractC0873i.f11779b;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        AbstractC0886w.v(b0.class, b0Var);
    }

    public static void A(b0 b0Var, r0 r0Var) {
        b0Var.getClass();
        b0Var.outputPrefixType_ = r0Var.b();
    }

    public static b0 B() {
        return DEFAULT_INSTANCE;
    }

    public static a0 F() {
        return (a0) DEFAULT_INSTANCE.j();
    }

    public static void y(b0 b0Var, String str) {
        b0Var.getClass();
        str.getClass();
        b0Var.typeUrl_ = str;
    }

    public static void z(b0 b0Var, C0872h c0872h) {
        b0Var.getClass();
        b0Var.value_ = c0872h;
    }

    public final r0 C() {
        r0 a2 = r0.a(this.outputPrefixType_);
        return a2 == null ? r0.UNRECOGNIZED : a2;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0873i E() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new b0();
            case 4:
                return new a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (b0.class) {
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
