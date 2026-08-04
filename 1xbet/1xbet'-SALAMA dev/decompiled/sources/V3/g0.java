package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0822b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0824d;
import com.google.crypto.tink.shaded.protobuf.C0831k;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0845z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends AbstractC0842w {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0845z key_ = com.google.crypto.tink.shaded.protobuf.a0.f11751d;
    private int primaryKeyId_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        AbstractC0842w.v(g0.class, g0Var);
    }

    public static d0 E() {
        return (d0) DEFAULT_INSTANCE.j();
    }

    public static g0 F(ByteArrayInputStream byteArrayInputStream, C0835o c0835o) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0842w abstractC0842wU = AbstractC0842w.u(DEFAULT_INSTANCE, new C0831k(byteArrayInputStream), c0835o);
        AbstractC0842w.g(abstractC0842wU);
        return (g0) abstractC0842wU;
    }

    public static g0 G(byte[] bArr, C0835o c0835o) {
        g0 g0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC0842w abstractC0842wS = g0Var.s();
        try {
            com.google.crypto.tink.shaded.protobuf.Z z4 = com.google.crypto.tink.shaded.protobuf.Z.f11748c;
            z4.getClass();
            com.google.crypto.tink.shaded.protobuf.c0 c0VarA = z4.a(abstractC0842wS.getClass());
            C0824d c0824d = new C0824d();
            c0835o.getClass();
            c0VarA.g(abstractC0842wS, bArr, 0, length, c0824d);
            c0VarA.b(abstractC0842wS);
            AbstractC0842w.g(abstractC0842wS);
            return (g0) abstractC0842wS;
        } catch (com.google.crypto.tink.shaded.protobuf.C e7) {
            if (e7.f11704a) {
                throw new com.google.crypto.tink.shaded.protobuf.C(e7.getMessage(), e7);
            }
            throw e7;
        } catch (com.google.crypto.tink.shaded.protobuf.e0 e8) {
            throw new com.google.crypto.tink.shaded.protobuf.C(e8.getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof com.google.crypto.tink.shaded.protobuf.C) {
                throw ((com.google.crypto.tink.shaded.protobuf.C) e9.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.C(e9.getMessage(), e9);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.C.g();
        }
    }

    public static void y(g0 g0Var, int i7) {
        g0Var.primaryKeyId_ = i7;
    }

    public static void z(g0 g0Var, f0 f0Var) {
        g0Var.getClass();
        InterfaceC0845z interfaceC0845z = g0Var.key_;
        if (!((AbstractC0822b) interfaceC0845z).f11754a) {
            int size = interfaceC0845z.size();
            g0Var.key_ = interfaceC0845z.a(size == 0 ? 10 : size * 2);
        }
        g0Var.key_.add(f0Var);
    }

    public final f0 A(int i7) {
        return (f0) this.key_.get(i7);
    }

    public final int B() {
        return this.key_.size();
    }

    public final List C() {
        return this.key_;
    }

    public final int D() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", f0.class});
            case 3:
                return new g0();
            case 4:
                return new d0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (g0.class) {
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
