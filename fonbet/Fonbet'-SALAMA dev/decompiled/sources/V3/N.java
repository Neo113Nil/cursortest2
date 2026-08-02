package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0875k;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;
import java.io.ByteArrayInputStream;

/* loaded from: classes2.dex */
public final class N extends AbstractC0886w {
    private static final N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private AbstractC0873i encryptedKeyset_ = AbstractC0873i.f11779b;
    private k0 keysetInfo_;

    static {
        N n2 = new N();
        DEFAULT_INSTANCE = n2;
        AbstractC0886w.v(N.class, n2);
    }

    public static M B() {
        return (M) DEFAULT_INSTANCE.j();
    }

    public static N C(ByteArrayInputStream byteArrayInputStream, C0879o c0879o) {
        AbstractC0886w u4 = AbstractC0886w.u(DEFAULT_INSTANCE, new C0875k(byteArrayInputStream), c0879o);
        AbstractC0886w.g(u4);
        return (N) u4;
    }

    public static void y(N n2, C0872h c0872h) {
        n2.getClass();
        n2.encryptedKeyset_ = c0872h;
    }

    public static void z(N n2, k0 k0Var) {
        n2.getClass();
        n2.keysetInfo_ = k0Var;
    }

    public final AbstractC0873i A() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new N();
            case 4:
                return new M(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (N.class) {
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
