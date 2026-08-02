package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0464f extends AbstractC0886w {
    private static final C0464f DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C0464f c0464f = new C0464f();
        DEFAULT_INSTANCE = c0464f;
        AbstractC0886w.v(C0464f.class, c0464f);
    }

    public static C0463e B() {
        return (C0463e) DEFAULT_INSTANCE.j();
    }

    public static void y(C0464f c0464f) {
        c0464f.tagSize_ = 16;
    }

    public static C0464f z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C0464f();
            case 4:
                return new C0463e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0464f.class) {
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
