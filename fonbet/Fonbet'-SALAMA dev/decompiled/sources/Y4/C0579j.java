package Y4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0579j extends com.google.protobuf.C {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0579j DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile InterfaceC0912k0 PARSER;
    private AbstractC0911k bitmap_ = AbstractC0911k.f12212b;
    private int padding_;

    static {
        C0579j c0579j = new C0579j();
        DEFAULT_INSTANCE = c0579j;
        com.google.protobuf.C.t(C0579j.class, c0579j);
    }

    public static C0579j w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new C0579j();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0579j.class) {
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

    public final AbstractC0911k v() {
        return this.bitmap_;
    }

    public final int x() {
        return this.padding_;
    }
}
