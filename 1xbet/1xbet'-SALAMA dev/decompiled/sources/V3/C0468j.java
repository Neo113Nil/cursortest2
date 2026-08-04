package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: renamed from: V3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0468j extends AbstractC0842w {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0468j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private C0472n aesCtrKeyFormat_;
    private T hmacKeyFormat_;

    static {
        C0468j c0468j = new C0468j();
        DEFAULT_INSTANCE = c0468j;
        AbstractC0842w.v(C0468j.class, c0468j);
    }

    public static C0467i C() {
        return (C0467i) DEFAULT_INSTANCE.j();
    }

    public static C0468j D(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (C0468j) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(C0468j c0468j, C0472n c0472n) {
        c0468j.getClass();
        c0468j.aesCtrKeyFormat_ = c0472n;
    }

    public static void z(C0468j c0468j, T t7) {
        c0468j.getClass();
        c0468j.hmacKeyFormat_ = t7;
    }

    public final C0472n A() {
        C0472n c0472n = this.aesCtrKeyFormat_;
        return c0472n == null ? C0472n.A() : c0472n;
    }

    public final T B() {
        T t7 = this.hmacKeyFormat_;
        return t7 == null ? T.A() : t7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C0468j();
            case 4:
                return new C0467i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (C0468j.class) {
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
