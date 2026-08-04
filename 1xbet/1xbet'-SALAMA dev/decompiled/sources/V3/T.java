package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC0842w {
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
        AbstractC0842w.v(T.class, t7);
    }

    public static T A() {
        return DEFAULT_INSTANCE;
    }

    public static S D() {
        return (S) DEFAULT_INSTANCE.j();
    }

    public static T E(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (T) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (T.class) {
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
