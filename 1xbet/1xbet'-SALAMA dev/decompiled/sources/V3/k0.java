package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0822b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0841v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0845z;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends AbstractC0842w {
    private static final k0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0845z keyInfo_ = com.google.crypto.tink.shaded.protobuf.a0.f11751d;
    private int primaryKeyId_;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        AbstractC0842w.v(k0.class, k0Var);
    }

    public static h0 B() {
        return (h0) DEFAULT_INSTANCE.j();
    }

    public static void y(k0 k0Var, int i7) {
        k0Var.primaryKeyId_ = i7;
    }

    public static void z(k0 k0Var, j0 j0Var) {
        k0Var.getClass();
        InterfaceC0845z interfaceC0845z = k0Var.keyInfo_;
        if (!((AbstractC0822b) interfaceC0845z).f11754a) {
            int size = interfaceC0845z.size();
            k0Var.keyInfo_ = interfaceC0845z.a(size == 0 ? 10 : size * 2);
        }
        k0Var.keyInfo_.add(j0Var);
    }

    public final j0 A() {
        return (j0) this.keyInfo_.get(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", j0.class});
            case 3:
                return new k0();
            case 4:
                return new h0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (k0.class) {
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
