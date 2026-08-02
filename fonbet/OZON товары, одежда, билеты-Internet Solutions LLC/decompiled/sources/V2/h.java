package V2;

import androidx.datastore.preferences.protobuf.AbstractC5355a;
import androidx.datastore.preferences.protobuf.AbstractC5376w;
import androidx.datastore.preferences.protobuf.C5378y;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.Z;

/* loaded from: classes.dex */
public final class h extends AbstractC5376w<h, a> implements S {
    private static final h DEFAULT_INSTANCE;
    private static volatile Z<h> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C5378y.c<String> strings_ = AbstractC5376w.j();

    /* loaded from: classes8.dex */
    public static final class a extends AbstractC5376w.a<h, a> implements S {
        /* synthetic */ a(int i11) {
            this();
        }

        public final void f(Iterable iterable) {
            e();
            h.u((h) this.f42625b, iterable);
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC5376w.s(h.class, hVar);
    }

    private h() {
    }

    static void u(h hVar, Iterable iterable) {
        C5378y.c<String> cVar = hVar.strings_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            hVar.strings_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        AbstractC5355a.c(iterable, hVar.strings_);
    }

    public static h v() {
        return DEFAULT_INSTANCE;
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5376w
    protected final Object i(AbstractC5376w.f fVar) {
        Z z11;
        switch (f.f27951a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(0);
            case 3:
                return AbstractC5376w.p(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<h> z12 = PARSER;
                if (z12 != null) {
                    return z12;
                }
                synchronized (h.class) {
                    try {
                        z11 = PARSER;
                        if (z11 == null) {
                            z11 = new AbstractC5376w.b(DEFAULT_INSTANCE);
                            PARSER = z11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return z11;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C5378y.c w() {
        return this.strings_;
    }
}
