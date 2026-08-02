package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0866b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0868d;
import com.google.crypto.tink.shaded.protobuf.C0875k;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0889z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class g0 extends AbstractC0886w {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0889z key_ = com.google.crypto.tink.shaded.protobuf.a0.f11751d;
    private int primaryKeyId_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        AbstractC0886w.v(g0.class, g0Var);
    }

    public static d0 E() {
        return (d0) DEFAULT_INSTANCE.j();
    }

    public static g0 F(ByteArrayInputStream byteArrayInputStream, C0879o c0879o) {
        AbstractC0886w u4 = AbstractC0886w.u(DEFAULT_INSTANCE, new C0875k(byteArrayInputStream), c0879o);
        AbstractC0886w.g(u4);
        return (g0) u4;
    }

    public static g0 G(byte[] bArr, C0879o c0879o) {
        g0 g0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC0886w s7 = g0Var.s();
        try {
            com.google.crypto.tink.shaded.protobuf.Z z4 = com.google.crypto.tink.shaded.protobuf.Z.f11748c;
            z4.getClass();
            com.google.crypto.tink.shaded.protobuf.c0 a2 = z4.a(s7.getClass());
            C0868d c0868d = new C0868d();
            c0879o.getClass();
            a2.g(s7, bArr, 0, length, c0868d);
            a2.b(s7);
            AbstractC0886w.g(s7);
            return (g0) s7;
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
        InterfaceC0889z interfaceC0889z = g0Var.key_;
        if (!((AbstractC0866b) interfaceC0889z).f11754a) {
            int size = interfaceC0889z.size();
            g0Var.key_ = interfaceC0889z.a(size == 0 ? 10 : size * 2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (g0.class) {
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
