package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n50 {

    /* JADX INFO: renamed from: b */
    public static final w71 f5298b = new w71(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t50 f5299a;

    public n50(t50 t50Var) {
        this.f5299a = t50Var;
    }

    /* JADX INFO: renamed from: b */
    public static Class m3482b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        w71 w71Var = f5298b;
        w71 w71Var2 = (w71) w71Var.get(classLoader);
        if (w71Var2 == null) {
            w71Var2 = new w71(0);
            w71Var.put(classLoader, w71Var2);
        }
        Class cls = (Class) w71Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        w71Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m3483c(ClassLoader classLoader, String str) {
        try {
            return m3482b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0694sj(AbstractC0024an.m284g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e, 3);
        } catch (ClassNotFoundException e2) {
            throw new C0694sj(AbstractC0024an.m284g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2, 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final c50 m3484a(String str) {
        try {
            return (c50) m3483c(this.f5299a.f7319w.f1952o.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0694sj(AbstractC0024an.m284g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e, 3);
        } catch (InstantiationException e2) {
            throw new C0694sj(AbstractC0024an.m284g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2, 3);
        } catch (NoSuchMethodException e3) {
            throw new C0694sj(AbstractC0024an.m284g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3, 3);
        } catch (InvocationTargetException e4) {
            throw new C0694sj(AbstractC0024an.m284g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4, 3);
        }
    }
}
