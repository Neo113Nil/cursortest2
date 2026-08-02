package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0472n extends AbstractC0886w {
    private static final C0472n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0474p params_;

    static {
        C0472n c0472n = new C0472n();
        DEFAULT_INSTANCE = c0472n;
        AbstractC0886w.v(C0472n.class, c0472n);
    }

    public static C0472n A() {
        return DEFAULT_INSTANCE;
    }

    public static C0471m D() {
        return (C0471m) DEFAULT_INSTANCE.j();
    }

    public static void y(C0472n c0472n, C0474p c0474p) {
        c0472n.getClass();
        c0472n.params_ = c0474p;
    }

    public static void z(C0472n c0472n, int i7) {
        c0472n.keySize_ = i7;
    }

    public final int B() {
        return this.keySize_;
    }

    public final C0474p C() {
        C0474p c0474p = this.params_;
        return c0474p == null ? C0474p.z() : c0474p;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0472n();
            case 4:
                return new C0471m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0472n.class) {
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
