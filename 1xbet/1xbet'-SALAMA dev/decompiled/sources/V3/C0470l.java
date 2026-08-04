package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: renamed from: V3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0470l extends AbstractC0842w {
    private static final C0470l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0829i keyValue_ = AbstractC0829i.f11779b;
    private C0474p params_;
    private int version_;

    static {
        C0470l c0470l = new C0470l();
        DEFAULT_INSTANCE = c0470l;
        AbstractC0842w.v(C0470l.class, c0470l);
    }

    public static void A(C0470l c0470l, C0828h c0828h) {
        c0470l.getClass();
        c0470l.keyValue_ = c0828h;
    }

    public static C0470l B() {
        return DEFAULT_INSTANCE;
    }

    public static C0469k F() {
        return (C0469k) DEFAULT_INSTANCE.j();
    }

    public static void y(C0470l c0470l) {
        c0470l.version_ = 0;
    }

    public static void z(C0470l c0470l, C0474p c0474p) {
        c0470l.getClass();
        c0474p.getClass();
        c0470l.params_ = c0474p;
    }

    public final AbstractC0829i C() {
        return this.keyValue_;
    }

    public final C0474p D() {
        C0474p c0474p = this.params_;
        return c0474p == null ? C0474p.z() : c0474p;
    }

    public final int E() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C0470l();
            case 4:
                return new C0469k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (C0470l.class) {
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
