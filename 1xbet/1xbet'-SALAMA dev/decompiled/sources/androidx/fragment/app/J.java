package androidx.fragment.app;

import W5.AbstractC0486a1;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p122r.l f9361b = new p122r.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f9362a;

    public J(Q q7) {
        this.f9362a = q7;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        p122r.l lVar = f9361b;
        p122r.l lVar2 = (p122r.l) lVar.getOrDefault(classLoader, null);
        if (lVar2 == null) {
            lVar2 = new p122r.l();
            lVar.put(classLoader, lVar2);
        }
        Class cls = (Class) lVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        lVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new A1.W(AbstractC0486a1.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e8) {
            throw new A1.W(AbstractC0486a1.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    public final AbstractComponentCallbacksC0701v a(String str) {
        try {
            return (AbstractComponentCallbacksC0701v) c(this.f9362a.f9403v.f9552b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new A1.W(AbstractC0486a1.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e8) {
            throw new A1.W(AbstractC0486a1.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (NoSuchMethodException e9) {
            throw new A1.W(AbstractC0486a1.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
        } catch (InvocationTargetException e10) {
            throw new A1.W(AbstractC0486a1.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }
}
