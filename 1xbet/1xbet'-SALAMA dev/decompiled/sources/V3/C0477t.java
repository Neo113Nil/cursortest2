package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: renamed from: V3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0477t extends AbstractC0842w {
    private static final C0477t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0479v params_;

    static {
        C0477t c0477t = new C0477t();
        DEFAULT_INSTANCE = c0477t;
        AbstractC0842w.v(C0477t.class, c0477t);
    }

    public static C0476s C() {
        return (C0476s) DEFAULT_INSTANCE.j();
    }

    public static C0477t D(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (C0477t) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(C0477t c0477t, C0479v c0479v) {
        c0477t.getClass();
        c0477t.params_ = c0479v;
    }

    public static void z(C0477t c0477t, int i7) {
        c0477t.keySize_ = i7;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0479v B() {
        C0479v c0479v = this.params_;
        return c0479v == null ? C0479v.z() : c0479v;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0477t();
            case 4:
                return new C0476s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (C0477t.class) {
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
