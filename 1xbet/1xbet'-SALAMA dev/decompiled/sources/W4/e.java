package W4;

import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends C {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final e DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        C.t(e.class, eVar);
    }

    public static c B() {
        return (c) DEFAULT_INSTANCE.i();
    }

    public static void v(e eVar, String str) {
        eVar.getClass();
        str.getClass();
        eVar.fieldPath_ = str;
    }

    public static void w(e eVar, d dVar) {
        eVar.getClass();
        eVar.valueMode_ = Integer.valueOf(dVar.a());
        eVar.valueModeCase_ = 2;
    }

    public static void x(e eVar) {
        b bVar = b.CONTAINS;
        eVar.getClass();
        eVar.valueMode_ = Integer.valueOf(bVar.a());
        eVar.valueModeCase_ = 3;
    }

    public final int A() {
        int i7 = this.valueModeCase_;
        if (i7 == 0) {
            return 3;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (e.class) {
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

    public final String y() {
        return this.fieldPath_;
    }

    public final d z() {
        int i7 = this.valueModeCase_;
        d dVar = d.ORDER_UNSPECIFIED;
        if (i7 != 2) {
            return dVar;
        }
        int iIntValue = ((Integer) this.valueMode_).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                dVar = iIntValue != 2 ? null : d.DESCENDING;
            } else {
                dVar = d.ASCENDING;
            }
        }
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }
}
