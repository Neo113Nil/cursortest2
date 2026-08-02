package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class Y extends AbstractC0886w {
    private static final Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC0873i value_ = AbstractC0873i.f11779b;

    static {
        Y y4 = new Y();
        DEFAULT_INSTANCE = y4;
        AbstractC0886w.v(Y.class, y4);
    }

    public static void A(Y y4, X x4) {
        y4.getClass();
        if (x4 != X.UNRECOGNIZED) {
            y4.keyMaterialType_ = x4.f6659a;
        } else {
            x4.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static Y B() {
        return DEFAULT_INSTANCE;
    }

    public static W F() {
        return (W) DEFAULT_INSTANCE.j();
    }

    public static void y(Y y4, String str) {
        y4.getClass();
        str.getClass();
        y4.typeUrl_ = str;
    }

    public static void z(Y y4, C0872h c0872h) {
        y4.getClass();
        y4.value_ = c0872h;
    }

    public final X C() {
        int i7 = this.keyMaterialType_;
        X x4 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : X.REMOTE : X.ASYMMETRIC_PUBLIC : X.ASYMMETRIC_PRIVATE : X.SYMMETRIC : X.UNKNOWN_KEYMATERIAL;
        return x4 == null ? X.UNRECOGNIZED : x4;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0873i E() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new Y();
            case 4:
                return new W(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (Y.class) {
                        try {
                            x4 = PARSER;
                            if (x4 == null) {
                                x4 = new C0885v();
                                PARSER = x4;
                            }
                        } finally {
                        }
                    }
                }
                return x4;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
