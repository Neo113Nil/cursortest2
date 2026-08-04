package p007a5;

import Y4.C0563b;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0853d;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;
import com.google.protobuf.J;
import p136t.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends C {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private int code_;
    private String message_ = "";
    private J details_ = C0874n0.f12243d;

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        C.t(a.class, aVar);
    }

    public static a w() {
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
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C0853d.class});
            case 3:
                return new a();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (a.class) {
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

    public final int v() {
        return this.code_;
    }

    public final String x() {
        return this.message_;
    }
}
