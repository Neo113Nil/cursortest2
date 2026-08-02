package a5;

import Y4.C0563b;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0897d;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import com.google.protobuf.J;
import t.e;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0622a extends C {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final C0622a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0912k0 PARSER;
    private int code_;
    private String message_ = "";
    private J details_ = C0918n0.f12243d;

    static {
        C0622a c0622a = new C0622a();
        DEFAULT_INSTANCE = c0622a;
        C.t(C0622a.class, c0622a);
    }

    public static C0622a w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C0897d.class});
            case 3:
                return new C0622a();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0622a.class) {
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

    public final int v() {
        return this.code_;
    }

    public final String x() {
        return this.message_;
    }
}
