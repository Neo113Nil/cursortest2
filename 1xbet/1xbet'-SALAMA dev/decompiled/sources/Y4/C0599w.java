package Y4;

import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0599w extends com.google.protobuf.C {
    private static final C0599w DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0868k0 PARSER;
    private com.google.protobuf.J fieldPaths_ = C0874n0.f12243d;

    static {
        C0599w c0599w = new C0599w();
        DEFAULT_INSTANCE = c0599w;
        com.google.protobuf.C.t(C0599w.class, c0599w);
    }

    public static void v(C0599w c0599w, String str) {
        c0599w.getClass();
        str.getClass();
        com.google.protobuf.J j = c0599w.fieldPaths_;
        if (!((AbstractC0849b) j).f12176a) {
            c0599w.fieldPaths_ = com.google.protobuf.C.p(j);
        }
        c0599w.fieldPaths_.add(str);
    }

    public static C0599w w() {
        return DEFAULT_INSTANCE;
    }

    public static C0598v z() {
        return (C0598v) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new C0599w();
            case 4:
                return new C0598v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0599w.class) {
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

    public final String x(int i7) {
        return (String) this.fieldPaths_.get(i7);
    }

    public final int y() {
        return this.fieldPaths_.size();
    }
}
