package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: renamed from: V3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0466h extends AbstractC0842w {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0466h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0470l aesCtrKey_;
    private Q hmacKey_;
    private int version_;

    static {
        C0466h c0466h = new C0466h();
        DEFAULT_INSTANCE = c0466h;
        AbstractC0842w.v(C0466h.class, c0466h);
    }

    public static void A(C0466h c0466h, Q q7) {
        c0466h.getClass();
        q7.getClass();
        c0466h.hmacKey_ = q7;
    }

    public static C0465g E() {
        return (C0465g) DEFAULT_INSTANCE.j();
    }

    public static C0466h F(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (C0466h) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(C0466h c0466h) {
        c0466h.version_ = 0;
    }

    public static void z(C0466h c0466h, C0470l c0470l) {
        c0466h.getClass();
        c0470l.getClass();
        c0466h.aesCtrKey_ = c0470l;
    }

    public final C0470l B() {
        C0470l c0470l = this.aesCtrKey_;
        return c0470l == null ? C0470l.B() : c0470l;
    }

    public final Q C() {
        Q q7 = this.hmacKey_;
        return q7 == null ? Q.B() : q7;
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C0466h();
            case 4:
                return new C0465g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (C0466h.class) {
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
