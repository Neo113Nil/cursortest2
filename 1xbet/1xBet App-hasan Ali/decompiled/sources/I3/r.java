package I3;

import a3.AbstractC0467k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class r extends AbstractC0185o {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f2676e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f2677b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2678c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2679d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f2676e = hashMap;
    }

    public r(Class cls, C0187q c0187q) {
        super(c0187q);
        this.f2679d = new HashMap();
        AbstractC2349a abstractC2349a = K3.c.f2892a;
        Constructor x5 = abstractC2349a.x(cls);
        this.f2677b = x5;
        K3.c.f(x5);
        String[] B5 = abstractC2349a.B(cls);
        for (int i = 0; i < B5.length; i++) {
            this.f2679d.put(B5[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f2677b.getParameterTypes();
        this.f2678c = new Object[parameterTypes.length];
        for (int i5 = 0; i5 < parameterTypes.length; i5++) {
            this.f2678c[i5] = f2676e.get(parameterTypes[i5]);
        }
    }

    @Override // I3.AbstractC0185o
    public final Object c() {
        return (Object[]) this.f2678c.clone();
    }

    @Override // I3.AbstractC0185o
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f2677b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e3) {
            AbstractC2349a abstractC2349a = K3.c.f2892a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalArgumentException e5) {
            e = e5;
            throw new RuntimeException("Failed to invoke constructor '" + K3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e6) {
            e = e6;
            throw new RuntimeException("Failed to invoke constructor '" + K3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + K3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e7.getCause());
        }
    }

    @Override // I3.AbstractC0185o
    public final void e(Object obj, N3.a aVar, C0184n c0184n) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f2679d;
        String str = c0184n.f2666c;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + K3.c.b(this.f2677b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object a5 = c0184n.f.a(aVar);
        if (a5 != null || !c0184n.f2669g) {
            objArr[intValue] = a5;
        } else {
            StringBuilder w5 = AbstractC0467k.w("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            w5.append(aVar.m(false));
            throw new D2.e(w5.toString());
        }
    }
}
