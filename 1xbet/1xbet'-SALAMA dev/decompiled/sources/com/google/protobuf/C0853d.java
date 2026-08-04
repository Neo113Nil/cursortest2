package com.google.protobuf;

import Y4.C0563b;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0853d extends C {
    private static final C0853d DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private AbstractC0867k value_ = AbstractC0867k.f12212b;

    static {
        C0853d c0853d = new C0853d();
        DEFAULT_INSTANCE = c0853d;
        C.t(C0853d.class, c0853d);
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new C0853d();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0853d.class) {
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
}
