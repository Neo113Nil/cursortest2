package J4;

import Y4.C0595s;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends C {
    private static final b DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        C.t(b.class, bVar);
    }

    public static a E() {
        return (a) DEFAULT_INSTANCE.i();
    }

    public static b F(byte[] bArr) {
        return (b) C.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(b bVar, boolean z4) {
        bVar.hasCommittedMutations_ = z4;
    }

    public static void w(b bVar, d dVar) {
        bVar.getClass();
        bVar.documentType_ = dVar;
        bVar.documentTypeCase_ = 1;
    }

    public static void x(b bVar, C0595s c0595s) {
        bVar.getClass();
        bVar.documentType_ = c0595s;
        bVar.documentTypeCase_ = 2;
    }

    public static void y(b bVar, i iVar) {
        bVar.getClass();
        bVar.documentType_ = iVar;
        bVar.documentTypeCase_ = 3;
    }

    public final int A() {
        int i7 = this.documentTypeCase_;
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 3;
        }
        return 2;
    }

    public final boolean B() {
        return this.hasCommittedMutations_;
    }

    public final d C() {
        return this.documentTypeCase_ == 1 ? (d) this.documentType_ : d.x();
    }

    public final i D() {
        return this.documentTypeCase_ == 3 ? (i) this.documentType_ : i.x();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", d.class, C0595s.class, i.class, "hasCommittedMutations_"});
            case 3:
                return new b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (b.class) {
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

    public final C0595s z() {
        return this.documentTypeCase_ == 2 ? (C0595s) this.documentType_ : C0595s.y();
    }
}
