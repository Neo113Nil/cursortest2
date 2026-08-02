package Y4;

import com.google.protobuf.C0892a0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import java.util.Collections;
import java.util.Map;

/* renamed from: Y4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0595s extends com.google.protobuf.C {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C0595s DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.google.protobuf.z0 createTime_;
    private C0892a0 fields_ = C0892a0.f12174b;
    private String name_ = "";
    private com.google.protobuf.z0 updateTime_;

    static {
        C0595s c0595s = new C0595s();
        DEFAULT_INSTANCE = c0595s;
        com.google.protobuf.C.t(C0595s.class, c0595s);
    }

    public static C0593q C() {
        return (C0593q) DEFAULT_INSTANCE.i();
    }

    public static void v(C0595s c0595s, String str) {
        c0595s.getClass();
        str.getClass();
        c0595s.name_ = str;
    }

    public static C0892a0 w(C0595s c0595s) {
        C0892a0 c0892a0 = c0595s.fields_;
        if (!c0892a0.f12175a) {
            c0595s.fields_ = c0892a0.c();
        }
        return c0595s.fields_;
    }

    public static void x(C0595s c0595s, com.google.protobuf.z0 z0Var) {
        c0595s.getClass();
        c0595s.updateTime_ = z0Var;
        c0595s.bitField0_ |= 2;
    }

    public static C0595s y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.name_;
    }

    public final com.google.protobuf.z0 B() {
        com.google.protobuf.z0 z0Var = this.updateTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", r.f7739a, "createTime_", "updateTime_"});
            case 3:
                return new C0595s();
            case 4:
                return new C0593q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0595s.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new com.google.protobuf.B(DEFAULT_INSTANCE);
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

    public final Map z() {
        return Collections.unmodifiableMap(this.fields_);
    }
}
