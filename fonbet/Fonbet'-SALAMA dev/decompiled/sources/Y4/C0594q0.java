package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0594q0 extends com.google.protobuf.C {
    private static final C0594q0 DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER;
    private int bitField0_;
    private int direction_;
    private C0584l0 field_;

    static {
        C0594q0 c0594q0 = new C0594q0();
        DEFAULT_INSTANCE = c0594q0;
        com.google.protobuf.C.t(C0594q0.class, c0594q0);
    }

    public static void v(C0594q0 c0594q0, C0584l0 c0584l0) {
        c0594q0.getClass();
        c0594q0.field_ = c0584l0;
        c0594q0.bitField0_ |= 1;
    }

    public static void w(C0594q0 c0594q0, EnumC0574g0 enumC0574g0) {
        c0594q0.getClass();
        c0594q0.direction_ = enumC0574g0.a();
    }

    public static C0592p0 z() {
        return (C0592p0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
            case 3:
                return new C0594q0();
            case 4:
                return new C0592p0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0594q0.class) {
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

    public final EnumC0574g0 x() {
        int i7 = this.direction_;
        EnumC0574g0 enumC0574g0 = i7 != 0 ? i7 != 1 ? i7 != 2 ? null : EnumC0574g0.DESCENDING : EnumC0574g0.ASCENDING : EnumC0574g0.DIRECTION_UNSPECIFIED;
        return enumC0574g0 == null ? EnumC0574g0.UNRECOGNIZED : enumC0574g0;
    }

    public final C0584l0 y() {
        C0584l0 c0584l0 = this.field_;
        return c0584l0 == null ? C0584l0.w() : c0584l0;
    }
}
