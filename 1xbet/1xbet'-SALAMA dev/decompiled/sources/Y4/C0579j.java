package Y4;

import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0579j extends com.google.protobuf.C {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0579j DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private AbstractC0867k bitmap_ = AbstractC0867k.f12212b;
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
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new C0579j();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0579j.class) {
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

    public final AbstractC0867k v() {
        return this.bitmap_;
    }

    public final int x() {
        return this.padding_;
    }
}
