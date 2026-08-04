package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: renamed from: V3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0460b extends AbstractC0842w {
    private static final C0460b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0829i keyValue_ = AbstractC0829i.f11779b;
    private C0464f params_;
    private int version_;

    static {
        C0460b c0460b = new C0460b();
        DEFAULT_INSTANCE = c0460b;
        AbstractC0842w.v(C0460b.class, c0460b);
    }

    public static void A(C0460b c0460b, C0464f c0464f) {
        c0460b.getClass();
        c0464f.getClass();
        c0460b.params_ = c0464f;
    }

    public static C0459a E() {
        return (C0459a) DEFAULT_INSTANCE.j();
    }

    public static C0460b F(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (C0460b) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(C0460b c0460b) {
        c0460b.version_ = 0;
    }

    public static void z(C0460b c0460b, C0828h c0828h) {
        c0460b.getClass();
        c0460b.keyValue_ = c0828h;
    }

    public final AbstractC0829i B() {
        return this.keyValue_;
    }

    public final C0464f C() {
        C0464f c0464f = this.params_;
        return c0464f == null ? C0464f.z() : c0464f;
    }

    public final int D() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0460b();
            case 4:
                return new C0459a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (C0460b.class) {
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
