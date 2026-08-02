package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0460b extends AbstractC0886w {
    private static final C0460b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0873i keyValue_ = AbstractC0873i.f11779b;
    private C0464f params_;
    private int version_;

    static {
        C0460b c0460b = new C0460b();
        DEFAULT_INSTANCE = c0460b;
        AbstractC0886w.v(C0460b.class, c0460b);
    }

    public static void A(C0460b c0460b, C0464f c0464f) {
        c0460b.getClass();
        c0464f.getClass();
        c0460b.params_ = c0464f;
    }

    public static C0459a E() {
        return (C0459a) DEFAULT_INSTANCE.j();
    }

    public static C0460b F(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (C0460b) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(C0460b c0460b) {
        c0460b.version_ = 0;
    }

    public static void z(C0460b c0460b, C0872h c0872h) {
        c0460b.getClass();
        c0460b.keyValue_ = c0872h;
    }

    public final AbstractC0873i B() {
        return this.keyValue_;
    }

    public final C0464f C() {
        C0464f c0464f = this.params_;
        return c0464f == null ? C0464f.z() : c0464f;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0460b();
            case 4:
                return new C0459a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0460b.class) {
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
