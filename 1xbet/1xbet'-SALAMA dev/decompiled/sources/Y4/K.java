package Y4;

import com.google.protobuf.C0848a0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends com.google.protobuf.C {
    private static final K DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0868k0 PARSER;
    private C0848a0 fields_ = C0848a0.f12174b;

    static {
        K k7 = new K();
        DEFAULT_INSTANCE = k7;
        com.google.protobuf.C.t(K.class, k7);
    }

    public static I B() {
        return (I) DEFAULT_INSTANCE.i();
    }

    public static C0848a0 v(K k7) {
        C0848a0 c0848a0 = k7.fields_;
        if (!c0848a0.f12175a) {
            k7.fields_ = c0848a0.c();
        }
        return k7.fields_;
    }

    public static K w() {
        return DEFAULT_INSTANCE;
    }

    public final I0 A(String str) {
        str.getClass();
        C0848a0 c0848a0 = this.fields_;
        if (c0848a0.containsKey(str)) {
            return (I0) c0848a0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", J.f7699a});
            case 3:
                return new K();
            case 4:
                return new I(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (K.class) {
                        try {
                            b7 = PARSER;
                            if (b7 == null) {
                                b7 = new com.google.protobuf.B(DEFAULT_INSTANCE);
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

    public final int x() {
        return this.fields_.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final I0 z(String str) {
        str.getClass();
        C0848a0 c0848a0 = this.fields_;
        if (c0848a0.containsKey(str)) {
            return (I0) c0848a0.get(str);
        }
        return null;
    }
}
