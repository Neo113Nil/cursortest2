package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends AbstractC0842w {
    private static final b0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC0829i value_ = AbstractC0829i.f11779b;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        AbstractC0842w.v(b0.class, b0Var);
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

    public static void z(b0 b0Var, C0828h c0828h) {
        b0Var.getClass();
        b0Var.value_ = c0828h;
    }

    public final r0 C() {
        r0 r0VarA = r0.a(this.outputPrefixType_);
        return r0VarA == null ? r0.UNRECOGNIZED : r0VarA;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0829i E() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (b0.class) {
                        try {
                            c0841v = PARSER;
                            if (c0841v == null) {
                                c0841v = new C0841v();
                                PARSER = c0841v;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0841v;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
