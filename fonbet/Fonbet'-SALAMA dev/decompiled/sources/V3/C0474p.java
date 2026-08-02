package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0474p extends AbstractC0886w {
    private static final C0474p DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int ivSize_;

    static {
        C0474p c0474p = new C0474p();
        DEFAULT_INSTANCE = c0474p;
        AbstractC0886w.v(C0474p.class, c0474p);
    }

    public static C0473o B() {
        return (C0473o) DEFAULT_INSTANCE.j();
    }

    public static void y(C0474p c0474p) {
        c0474p.ivSize_ = 16;
    }

    public static C0474p z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new C0474p();
            case 4:
                return new C0473o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0474p.class) {
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
