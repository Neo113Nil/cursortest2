package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0481x extends AbstractC0886w {
    private static final C0481x DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0873i keyValue_ = AbstractC0873i.f11779b;
    private int version_;

    static {
        C0481x c0481x = new C0481x();
        DEFAULT_INSTANCE = c0481x;
        AbstractC0886w.v(C0481x.class, c0481x);
    }

    public static C0480w C() {
        return (C0480w) DEFAULT_INSTANCE.j();
    }

    public static C0481x D(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (C0481x) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(C0481x c0481x) {
        c0481x.version_ = 0;
    }

    public static void z(C0481x c0481x, C0872h c0872h) {
        c0481x.getClass();
        c0481x.keyValue_ = c0872h;
    }

    public final AbstractC0873i A() {
        return this.keyValue_;
    }

    public final int B() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C0481x();
            case 4:
                return new C0480w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0481x.class) {
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
