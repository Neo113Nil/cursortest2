package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class T extends AbstractC0886w {
    private static final T DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private V params_;
    private int version_;

    static {
        T t7 = new T();
        DEFAULT_INSTANCE = t7;
        AbstractC0886w.v(T.class, t7);
    }

    public static T A() {
        return DEFAULT_INSTANCE;
    }

    public static S D() {
        return (S) DEFAULT_INSTANCE.j();
    }

    public static T E(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (T) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(T t7, V v6) {
        t7.getClass();
        t7.params_ = v6;
    }

    public static void z(T t7, int i7) {
        t7.keySize_ = i7;
    }

    public final int B() {
        return this.keySize_;
    }

    public final V C() {
        V v6 = this.params_;
        return v6 == null ? V.A() : v6;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new T();
            case 4:
                return new S(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (T.class) {
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
