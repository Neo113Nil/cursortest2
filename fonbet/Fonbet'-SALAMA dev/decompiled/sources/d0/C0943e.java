package d0;

import androidx.datastore.preferences.protobuf.AbstractC0694s;
import androidx.datastore.preferences.protobuf.AbstractC0696u;
import androidx.datastore.preferences.protobuf.C0685i;
import androidx.datastore.preferences.protobuf.C0686j;
import androidx.datastore.preferences.protobuf.C0689m;
import androidx.datastore.preferences.protobuf.C0695t;
import androidx.datastore.preferences.protobuf.C0700y;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.a0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943e extends AbstractC0696u {
    private static final C0943e DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.f9112b;

    static {
        C0943e c0943e = new C0943e();
        DEFAULT_INSTANCE = c0943e;
        AbstractC0696u.l(C0943e.class, c0943e);
    }

    public static G n(C0943e c0943e) {
        G g3 = c0943e.preferences_;
        if (!g3.f9113a) {
            c0943e.preferences_ = g3.b();
        }
        return c0943e.preferences_;
    }

    public static C0941c p() {
        return (C0941c) ((AbstractC0694s) DEFAULT_INSTANCE.e(5));
    }

    public static C0943e q(FileInputStream fileInputStream) {
        C0943e c0943e = DEFAULT_INSTANCE;
        C0685i c0685i = new C0685i(fileInputStream);
        C0689m a2 = C0689m.a();
        AbstractC0696u k7 = c0943e.k();
        try {
            Q q7 = Q.f9136c;
            q7.getClass();
            U a4 = q7.a(k7.getClass());
            C0686j c0686j = (C0686j) c0685i.f4335b;
            if (c0686j == null) {
                c0686j = new C0686j(c0685i);
            }
            a4.i(k7, c0686j, a2);
            a4.b(k7);
            if (AbstractC0696u.h(k7, true)) {
                return (C0943e) k7;
            }
            throw new C0700y(new a0().getMessage());
        } catch (a0 e7) {
            throw new C0700y(e7.getMessage());
        } catch (C0700y e8) {
            if (e8.f9257a) {
                throw new C0700y(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof C0700y) {
                throw ((C0700y) e9.getCause());
            }
            throw new C0700y(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C0700y) {
                throw ((C0700y) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0696u
    public final Object e(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0942d.f12331a});
            case 3:
                return new C0943e();
            case 4:
                return new C0941c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p5 = PARSER;
                if (p5 == null) {
                    synchronized (C0943e.class) {
                        try {
                            p5 = PARSER;
                            if (p5 == null) {
                                p5 = new C0695t();
                                PARSER = p5;
                            }
                        } finally {
                        }
                    }
                }
                return p5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
