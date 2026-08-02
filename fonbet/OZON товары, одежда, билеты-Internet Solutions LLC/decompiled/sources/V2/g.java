package V2;

import androidx.datastore.preferences.protobuf.AbstractC5376w;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends AbstractC5376w<g, a> implements S {
    private static final g DEFAULT_INSTANCE;
    private static volatile Z<g> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private K<String, i> preferences_ = K.e();

    public static final class a extends AbstractC5376w.a<g, a> implements S {
        /* synthetic */ a(int i11) {
            this();
        }

        public final void f(i iVar, String str) {
            str.getClass();
            e();
            g.u((g) this.f42625b).put(str, iVar);
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final J<String, i> f27952a = J.d(r0.STRING, r0.MESSAGE, i.E());
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC5376w.s(g.class, gVar);
    }

    private g() {
    }

    static K u(g gVar) {
        if (!gVar.preferences_.i()) {
            gVar.preferences_ = gVar.preferences_.m();
        }
        return gVar.preferences_;
    }

    public static a w() {
        return DEFAULT_INSTANCE.h();
    }

    public static g x(InputStream inputStream) throws IOException {
        return (g) AbstractC5376w.r(DEFAULT_INSTANCE, inputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5376w
    protected final Object i(AbstractC5376w.f fVar) {
        Z z11;
        switch (f.f27951a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(0);
            case 3:
                return AbstractC5376w.p(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f27952a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<g> z12 = PARSER;
                if (z12 != null) {
                    return z12;
                }
                synchronized (g.class) {
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

    public final Map<String, i> v() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
