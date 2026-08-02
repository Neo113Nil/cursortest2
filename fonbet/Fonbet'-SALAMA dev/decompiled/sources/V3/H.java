package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class H extends AbstractC0886w {
    private static final H DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        H h6 = new H();
        DEFAULT_INSTANCE = h6;
        AbstractC0886w.v(H.class, h6);
    }

    public static G A() {
        return (G) DEFAULT_INSTANCE.j();
    }

    public static H B(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (H) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(H h6) {
        h6.keySize_ = 64;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new H();
            case 4:
                return new G(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (H.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
