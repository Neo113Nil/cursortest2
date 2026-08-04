package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends AbstractC0842w {
    private static final V DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        V v6 = new V();
        DEFAULT_INSTANCE = v6;
        AbstractC0842w.v(V.class, v6);
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
        O o7;
        int i7 = this.hash_;
        if (i7 == 0) {
            o7 = O.UNKNOWN_HASH;
        } else if (i7 == 1) {
            o7 = O.SHA1;
        } else if (i7 == 2) {
            o7 = O.SHA384;
        } else if (i7 == 3) {
            o7 = O.SHA256;
        } else if (i7 != 4) {
            o7 = i7 != 5 ? null : O.SHA224;
        } else {
            o7 = O.SHA512;
        }
        return o7 == null ? O.UNRECOGNIZED : o7;
    }

    public final int C() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (V.class) {
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
