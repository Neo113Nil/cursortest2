package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class W implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static W f9612a;

    @Override // androidx.lifecycle.V
    public S b(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            t6.h.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (S) objNewInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
