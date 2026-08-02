package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n01 implements jk0 {

    /* JADX INFO: renamed from: k */
    public static final Logger f5228k = Logger.getLogger(n01.class.getName());

    /* JADX INFO: renamed from: l */
    public static final Constructor f5229l;

    /* JADX INFO: renamed from: m */
    public static final Method f5230m;

    /* JADX INFO: renamed from: n */
    public static final RuntimeException f5231n;

    /* JADX INFO: renamed from: o */
    public static final Object[] f5232o;

    /* JADX INFO: renamed from: j */
    public final Object f5233j;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f5228k.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            f5229l = null;
            f5230m = null;
            f5231n = new RuntimeException(th);
        } else {
            f5229l = constructor;
            f5230m = method;
            f5231n = null;
        }
        f5232o = new Object[]{1L};
    }

    public n01() {
        RuntimeException runtimeException = f5231n;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f5233j = f5229l.newInstance(null);
        } catch (IllegalAccessException e) {
            dd0.m1163h(e);
            throw null;
        } catch (InstantiationException e2) {
            dd0.m1163h(e2);
            throw null;
        } catch (InvocationTargetException e3) {
            dd0.m1163h(e3);
            throw null;
        }
    }

    @Override // p000.jk0
    /* JADX INFO: renamed from: j */
    public final void mo614j() {
        try {
            f5230m.invoke(this.f5233j, f5232o);
        } catch (IllegalAccessException e) {
            dd0.m1163h(e);
        } catch (InvocationTargetException e2) {
            dd0.m1163h(e2);
        }
    }
}
