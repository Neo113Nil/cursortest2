package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0940 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2644 = StringFog.decrypt("M5Nj/PaZp7wOmFDk+pag\n", "YfYFkJP609U=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2643 = new ConcurrentHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m5780(Object obj, String str, List list) {
        Method m5778;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 != null) {
                arrayList.add(obj2.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        C0952 c0952 = new C0952(obj, str, arrayList);
        ConcurrentHashMap concurrentHashMap = f2643;
        Method method = (Method) concurrentHashMap.get(c0952);
        if (method != null) {
            if (m5782(method.getParameterTypes(), list)) {
                return method;
            }
            AbstractC1086.m5875(f2644, StringFog.decrypt("4TSogmm9K7/QMrODfL0vu8cuv4k78CmuzCm+zQ==\n", "pEba7RudTNo=\n") + c0952, null, null);
        }
        if (obj instanceof Class) {
            m5778 = m5778((Class) obj, str, list, true);
            if (m5778 == null) {
                m5778 = m5778(Class.class.getClass(), str, list, false);
            }
        } else {
            m5778 = m5778(obj.getClass(), str, list, false);
        }
        if (m5778 != null) {
            concurrentHashMap.put(c0952, m5778);
        }
        return m5778;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m5778(Class cls, String str, List list, boolean z) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m5782(method.getParameterTypes(), list)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5782(Class[] clsArr, List list) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= clsArr.length) {
                return true;
            }
            Object obj = list.get(i);
            if (obj == null && !Object.class.isAssignableFrom(clsArr[i])) {
                break;
            }
            if (obj != null) {
                Class cls = clsArr[i];
                Class<?> cls2 = obj.getClass();
                if (!cls.isAssignableFrom(Byte.TYPE) || !cls2.isAssignableFrom(Byte.class)) {
                    Class<?> cls3 = Short.TYPE;
                    if ((!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Byte.class))) {
                        Class<?> cls4 = Integer.TYPE;
                        if ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Byte.class)))) {
                            Class<?> cls5 = Long.TYPE;
                            if ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Byte.class))))) {
                                Class<?> cls6 = Float.TYPE;
                                if ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Byte.class)))))) {
                                    Class<?> cls7 = Double.TYPE;
                                    if ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Double.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Byte.class)) && (!cls.isAssignableFrom(Boolean.TYPE) || !cls2.isAssignableFrom(Boolean.class)))))))) {
                                        z = cls.isAssignableFrom(cls2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.reflect.Method] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m5779(Object obj, String str, ArrayList arrayList) {
        try {
            Class<?>[] clsArr = new Class[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                clsArr[i] = (Class) arrayList.get(i);
            }
            if (obj instanceof Class) {
                try {
                    obj = ((Class) obj).getMethod(str, clsArr);
                    return obj;
                } catch (NoSuchMethodException unused) {
                    return Class.class.getMethod(str, clsArr);
                }
            }
            return obj.getClass().getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            AbstractC1086.m5875(f2644, AbstractC1196.m5920("0PV4lA==\n", "nppYs4jf2fU=\n", new StringBuilder(), str).append(StringFog.decrypt("XWk9d2A1+j1aLz9nejm1PxU7cA==\n", "eklQEhRdlVk=\n")).append(obj).toString(), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5781(Class cls, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ((str.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                return true;
            }
        }
        if (AbstractC0940.class.getName().startsWith(StringFog.decrypt("7IxDBUANG+j8jFtZShpa5+uSW0pFFgD/\n", "j+MuKyl/dIY=\n"))) {
            return false;
        }
        if (AbstractC0940.class.getPackage() == null && cls.getPackage() == null) {
            return true;
        }
        return AbstractC0940.class.getPackage() != null && AbstractC0940.class.getPackage().equals(cls.getPackage());
    }
}
