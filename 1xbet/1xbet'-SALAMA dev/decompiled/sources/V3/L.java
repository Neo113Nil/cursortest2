package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC0842w {
    private static final L DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;

    static {
        L l7 = new L();
        DEFAULT_INSTANCE = l7;
        AbstractC0842w.v(L.class, l7);
    }

    public static L y() {
        return DEFAULT_INSTANCE;
    }

    public static L z(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (L) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new L();
            case 4:
                return new K(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (L.class) {
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
