package J4;

import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;
import com.google.protobuf.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends C {
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0868k0 PARSER = null;
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
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 3:
                return new d();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (d.class) {
                        try {
                            b7 = PARSER;
                            if (b7 == null) {
                                b7 = new B(DEFAULT_INSTANCE);
                                PARSER = b7;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return b7;
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
