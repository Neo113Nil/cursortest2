package Y4;

import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0581k extends com.google.protobuf.C {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C0581k DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private int bitField0_;
    private C0579j bits_;
    private int hashCount_;

    static {
        C0581k c0581k = new C0581k();
        DEFAULT_INSTANCE = c0581k;
        com.google.protobuf.C.t(C0581k.class, c0581k);
    }

    public static C0581k w() {
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
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 3:
                return new C0581k();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0581k.class) {
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

    public final C0579j v() {
        C0579j c0579j = this.bits_;
        return c0579j == null ? C0579j.w() : c0579j;
    }

    public final int x() {
        return this.hashCount_;
    }

    public final boolean y() {
        return (this.bitField0_ & 1) != 0;
    }
}
