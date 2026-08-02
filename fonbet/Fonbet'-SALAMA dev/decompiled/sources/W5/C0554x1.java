package W5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: W5.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0554x1 implements A0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f7391b = Logger.getLogger(C0554x1.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f7392c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f7393d;

    /* renamed from: e, reason: collision with root package name */
    public static final RuntimeException f7394e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f7395f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7396a;

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
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i7];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f7391b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th == null) {
                }
                f7392c = null;
                f7393d = null;
                f7394e = new RuntimeException(th);
                f7395f = new Object[]{1L};
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th == null || constructor == null) {
            f7392c = null;
            f7393d = null;
            f7394e = new RuntimeException(th);
        } else {
            f7392c = constructor;
            f7393d = method;
            f7394e = null;
        }
        f7395f = new Object[]{1L};
    }

    public C0554x1() {
        RuntimeException runtimeException = f7394e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f7396a = f7392c.newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // W5.A0
    public final void c() {
        try {
            f7393d.invoke(this.f7396a, f7395f);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
