package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends C {
    private static final z0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        z0 z0Var = new z0();
        DEFAULT_INSTANCE = z0Var;
        C.t(z0.class, z0Var);
    }

    public static y0 A() {
        return (y0) DEFAULT_INSTANCE.i();
    }

    public static void v(z0 z0Var, long j) {
        z0Var.seconds_ = j;
    }

    public static void w(z0 z0Var, int i7) {
        z0Var.nanos_ = i7;
    }

    public static z0 x() {
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
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new z0();
            case 4:
                return new y0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (z0.class) {
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

    public final int y() {
        return this.nanos_;
    }

    public final long z() {
        return this.seconds_;
    }
}
