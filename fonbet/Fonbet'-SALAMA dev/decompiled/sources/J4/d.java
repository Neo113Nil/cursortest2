package J4;

import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class d extends C {
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private z0 readTime_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        C.t(d.class, dVar);
    }

    public static c A() {
        return (c) DEFAULT_INSTANCE.i();
    }

    public static void v(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.name_ = str;
    }

    public static void w(d dVar, z0 z0Var) {
        dVar.getClass();
        dVar.readTime_ = z0Var;
        dVar.bitField0_ |= 1;
    }

    public static d x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 3:
                return new d();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (d.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new B(DEFAULT_INSTANCE);
                                PARSER = interfaceC0912k0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0912k0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String y() {
        return this.name_;
    }

    public final z0 z() {
        z0 z0Var = this.readTime_;
        return z0Var == null ? z0.x() : z0Var;
    }
}
