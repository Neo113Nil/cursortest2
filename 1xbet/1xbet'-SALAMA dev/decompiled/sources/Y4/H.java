package Y4;

import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends com.google.protobuf.C {
    private static final H DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        H h6 = new H();
        DEFAULT_INSTANCE = h6;
        com.google.protobuf.C.t(H.class, h6);
    }

    public static H v() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        int i7 = this.responseTypeCase_;
        if (i7 == 0) {
            return 6;
        }
        int i8 = 2;
        if (i7 == 2) {
            return 1;
        }
        int i9 = 3;
        if (i7 != 3) {
            i8 = 4;
            if (i7 != 4) {
                i9 = 5;
                if (i7 != 5) {
                    if (i7 != 6) {
                        return 0;
                    }
                }
            }
            return i9;
        }
        return i8;
    }

    public final D0 B() {
        return this.responseTypeCase_ == 2 ? (D0) this.responseType_ : D0.w();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", D0.class, C0596t.class, C0597u.class, C.class, C0600x.class});
            case 3:
                return new H();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (H.class) {
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

    public final C0596t w() {
        return this.responseTypeCase_ == 3 ? (C0596t) this.responseType_ : C0596t.v();
    }

    public final C0597u x() {
        return this.responseTypeCase_ == 4 ? (C0597u) this.responseType_ : C0597u.v();
    }

    public final C0600x y() {
        return this.responseTypeCase_ == 6 ? (C0600x) this.responseType_ : C0600x.v();
    }

    public final C z() {
        return this.responseTypeCase_ == 5 ? (C) this.responseType_ : C.w();
    }
}
