package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: renamed from: V3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0462d extends AbstractC0842w {
    private static final C0462d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0464f params_;

    static {
        C0462d c0462d = new C0462d();
        DEFAULT_INSTANCE = c0462d;
        AbstractC0842w.v(C0462d.class, c0462d);
    }

    public static C0461c C() {
        return (C0461c) DEFAULT_INSTANCE.j();
    }

    public static C0462d D(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (C0462d) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(C0462d c0462d) {
        c0462d.keySize_ = 32;
    }

    public static void z(C0462d c0462d, C0464f c0464f) {
        c0462d.getClass();
        c0462d.params_ = c0464f;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0464f B() {
        C0464f c0464f = this.params_;
        return c0464f == null ? C0464f.z() : c0464f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C0462d();
            case 4:
                return new C0461c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (C0462d.class) {
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
