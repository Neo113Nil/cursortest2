package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class V extends AbstractC0886w {
    private static final V DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        V v6 = new V();
        DEFAULT_INSTANCE = v6;
        AbstractC0886w.v(V.class, v6);
    }

    public static V A() {
        return DEFAULT_INSTANCE;
    }

    public static U D() {
        return (U) DEFAULT_INSTANCE.j();
    }

    public static void y(V v6, O o7) {
        v6.getClass();
        v6.hash_ = o7.a();
    }

    public static void z(V v6, int i7) {
        v6.tagSize_ = i7;
    }

    public final O B() {
        int i7 = this.hash_;
        O o7 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? null : O.SHA224 : O.SHA512 : O.SHA256 : O.SHA384 : O.SHA1 : O.UNKNOWN_HASH;
        return o7 == null ? O.UNRECOGNIZED : o7;
    }

    public final int C() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new V();
            case 4:
                return new U(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (V.class) {
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
