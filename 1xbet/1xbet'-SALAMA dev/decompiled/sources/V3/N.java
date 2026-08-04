package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0831k;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends AbstractC0842w {
    private static final N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private AbstractC0829i encryptedKeyset_ = AbstractC0829i.f11779b;
    private k0 keysetInfo_;

    static {
        N n2 = new N();
        DEFAULT_INSTANCE = n2;
        AbstractC0842w.v(N.class, n2);
    }

    public static M B() {
        return (M) DEFAULT_INSTANCE.j();
    }

    public static N C(ByteArrayInputStream byteArrayInputStream, C0835o c0835o) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0842w abstractC0842wU = AbstractC0842w.u(DEFAULT_INSTANCE, new C0831k(byteArrayInputStream), c0835o);
        AbstractC0842w.g(abstractC0842wU);
        return (N) abstractC0842wU;
    }

    public static void y(N n2, C0828h c0828h) {
        n2.getClass();
        n2.encryptedKeyset_ = c0828h;
    }

    public static void z(N n2, k0 k0Var) {
        n2.getClass();
        n2.keysetInfo_ = k0Var;
    }

    public final AbstractC0829i A() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (N.class) {
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
