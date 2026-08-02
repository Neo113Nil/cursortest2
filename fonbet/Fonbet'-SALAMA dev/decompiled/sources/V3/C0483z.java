package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0483z extends AbstractC0886w {
    private static final C0483z DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        C0483z c0483z = new C0483z();
        DEFAULT_INSTANCE = c0483z;
        AbstractC0886w.v(C0483z.class, c0483z);
    }

    public static C0482y A() {
        return (C0482y) DEFAULT_INSTANCE.j();
    }

    public static C0483z B(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (C0483z) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(C0483z c0483z, int i7) {
        c0483z.keySize_ = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new C0483z();
            case 4:
                return new C0482y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0483z.class) {
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
