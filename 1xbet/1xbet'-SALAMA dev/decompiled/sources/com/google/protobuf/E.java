package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends C {
    private static final E DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        E e7 = new E();
        DEFAULT_INSTANCE = e7;
        C.t(E.class, e7);
    }

    public static void v(E e7, int i7) {
        e7.value_ = i7;
    }

    public static E w() {
        return DEFAULT_INSTANCE;
    }

    public static D y() {
        return (D) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new E();
            case 4:
                return new D(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (E.class) {
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

    public final int x() {
        return this.value_;
    }
}
