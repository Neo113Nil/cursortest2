package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC0842w {
    private static final B DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0829i keyValue_ = AbstractC0829i.f11779b;
    private int version_;

    static {
        B b7 = new B();
        DEFAULT_INSTANCE = b7;
        AbstractC0842w.v(B.class, b7);
    }

    public static A C() {
        return (A) DEFAULT_INSTANCE.j();
    }

    public static B D(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (B) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(B b7) {
        b7.version_ = 0;
    }

    public static void z(B b7, C0828h c0828h) {
        b7.getClass();
        b7.keyValue_ = c0828h;
    }

    public final AbstractC0829i A() {
        return this.keyValue_;
    }

    public final int B() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new B();
            case 4:
                return new A(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (B.class) {
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
