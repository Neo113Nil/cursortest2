package K3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class b extends AbstractC2349a {

    /* renamed from: n, reason: collision with root package name */
    public final Method f2888n = Class.class.getMethod("isRecord", null);

    /* renamed from: o, reason: collision with root package name */
    public final Method f2889o = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: p, reason: collision with root package name */
    public final Method f2890p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f2891q;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f2890p = cls.getMethod("getName", null);
        this.f2891q = cls.getMethod("getType", null);
    }

    @Override // r3.AbstractC2349a
    public final String[] B(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f2889o.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f2890p.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // r3.AbstractC2349a
    public final boolean H(Class cls) {
        try {
            return ((Boolean) this.f2888n.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // r3.AbstractC2349a
    public final Method w(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // r3.AbstractC2349a
    public final Constructor x(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f2889o.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f2891q.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }
}
