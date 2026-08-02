package Y4;

import com.google.protobuf.C0892a0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class K extends com.google.protobuf.C {
    private static final K DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER;
    private C0892a0 fields_ = C0892a0.f12174b;

    static {
        K k7 = new K();
        DEFAULT_INSTANCE = k7;
        com.google.protobuf.C.t(K.class, k7);
    }

    public static I B() {
        return (I) DEFAULT_INSTANCE.i();
    }

    public static C0892a0 v(K k7) {
        C0892a0 c0892a0 = k7.fields_;
        if (!c0892a0.f12175a) {
            k7.fields_ = c0892a0.c();
        }
        return k7.fields_;
    }

    public static K w() {
        return DEFAULT_INSTANCE;
    }

    public final I0 A(String str) {
        str.getClass();
        C0892a0 c0892a0 = this.fields_;
        if (c0892a0.containsKey(str)) {
            return (I0) c0892a0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", J.f7699a});
            case 3:
                return new K();
            case 4:
                return new I(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (K.class) {
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

    public final int x() {
        return this.fields_.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final I0 z(String str) {
        str.getClass();
        C0892a0 c0892a0 = this.fields_;
        if (c0892a0.containsKey(str)) {
            return (I0) c0892a0.get(str);
        }
        return null;
    }
}
