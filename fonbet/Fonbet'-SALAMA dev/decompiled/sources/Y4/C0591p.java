package Y4;

import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import java.util.List;

/* renamed from: Y4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0591p extends com.google.protobuf.C {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C0591p DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private com.google.protobuf.J values_ = C0918n0.f12243d;

    static {
        C0591p c0591p = new C0591p();
        DEFAULT_INSTANCE = c0591p;
        com.google.protobuf.C.t(C0591p.class, c0591p);
    }

    public static void v(C0591p c0591p, Iterable iterable) {
        com.google.protobuf.J j = c0591p.values_;
        if (!((AbstractC0893b) j).f12176a) {
            c0591p.values_ = com.google.protobuf.C.p(j);
        }
        AbstractC0891a.b((List) iterable, c0591p.values_);
    }

    public static void w(C0591p c0591p, boolean z4) {
        c0591p.before_ = z4;
    }

    public static C0591p y() {
        return DEFAULT_INSTANCE;
    }

    public static C0589o z() {
        return (C0589o) DEFAULT_INSTANCE.i();
    }

    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", I0.class, "before_"});
            case 3:
                return new C0591p();
            case 4:
                return new C0589o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0591p.class) {
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

    public final boolean x() {
        return this.before_;
    }
}
