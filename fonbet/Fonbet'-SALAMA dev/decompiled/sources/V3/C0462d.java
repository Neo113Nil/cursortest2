package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0462d extends AbstractC0886w {
    private static final C0462d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0464f params_;

    static {
        C0462d c0462d = new C0462d();
        DEFAULT_INSTANCE = c0462d;
        AbstractC0886w.v(C0462d.class, c0462d);
    }

    public static C0461c C() {
        return (C0461c) DEFAULT_INSTANCE.j();
    }

    public static C0462d D(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (C0462d) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(C0462d c0462d) {
        c0462d.keySize_ = 32;
    }

    public static void z(C0462d c0462d, C0464f c0464f) {
        c0462d.getClass();
        c0462d.params_ = c0464f;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0464f B() {
        C0464f c0464f = this.params_;
        return c0464f == null ? C0464f.z() : c0464f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C0462d();
            case 4:
                return new C0461c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0462d.class) {
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
