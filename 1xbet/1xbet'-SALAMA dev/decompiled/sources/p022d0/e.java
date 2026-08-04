package p022d0;

import androidx.datastore.preferences.protobuf.AbstractC0673s;
import androidx.datastore.preferences.protobuf.AbstractC0675u;
import androidx.datastore.preferences.protobuf.C0664i;
import androidx.datastore.preferences.protobuf.C0665j;
import androidx.datastore.preferences.protobuf.C0668m;
import androidx.datastore.preferences.protobuf.C0674t;
import androidx.datastore.preferences.protobuf.C0679y;
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

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0675u {
    private static final e DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.f9112b;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0675u.l(e.class, eVar);
    }

    public static G n(e eVar) {
        G g3 = eVar.preferences_;
        if (!g3.f9113a) {
            eVar.preferences_ = g3.b();
        }
        return eVar.preferences_;
    }

    public static c p() {
        return (c) ((AbstractC0673s) DEFAULT_INSTANCE.e(5));
    }

    public static e q(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0664i c0664i = new C0664i(fileInputStream);
        C0668m c0668mA = C0668m.a();
        AbstractC0675u abstractC0675uK = eVar.k();
        try {
            Q q7 = Q.f9136c;
            q7.getClass();
            U uA = q7.a(abstractC0675uK.getClass());
            C0665j c0665j = (C0665j) c0664i.f4335b;
            if (c0665j == null) {
                c0665j = new C0665j(c0664i);
            }
            uA.i(abstractC0675uK, c0665j, c0668mA);
            uA.b(abstractC0675uK);
            if (AbstractC0675u.h(abstractC0675uK, true)) {
                return (e) abstractC0675uK;
            }
            throw new C0679y(new a0().getMessage());
        } catch (a0 e7) {
            throw new C0679y(e7.getMessage());
        } catch (C0679y e8) {
            if (e8.f9257a) {
                throw new C0679y(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof C0679y) {
                throw ((C0679y) e9.getCause());
            }
            throw new C0679y(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C0679y) {
                throw ((C0679y) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0675u
    public final Object e(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f12337a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P c0674t = PARSER;
                if (c0674t == null) {
                    synchronized (e.class) {
                        try {
                            c0674t = PARSER;
                            if (c0674t == null) {
                                c0674t = new C0674t();
                                PARSER = c0674t;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0674t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
