package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ל, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0577 {
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071 A[SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m5534(Class cls, C0584 c0584) {
        List<Method> asList;
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = c0584.f1412;
        boolean z2 = c0584.f1239;
        if (z2) {
            int i2 = c0584.f1238;
            Method[] methodArr = new Method[0];
            if (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                Method[] methods = cls.getMethods();
                String str = AbstractC0940.f2644;
                int length = declaredMethods.length;
                int length2 = methods.length;
                Method[] methodArr2 = new Method[length + length2];
                System.arraycopy(declaredMethods, 0, methodArr2, 0, length);
                System.arraycopy(methods, 0, methodArr2, length, length2);
                if (z2) {
                    Class superclass = cls.getSuperclass();
                    int i3 = 0;
                    methodArr = methodArr2;
                    while (superclass != null && i3 != i2) {
                        Method[] declaredMethods2 = superclass.getDeclaredMethods();
                        int length3 = methodArr.length;
                        int length4 = declaredMethods2.length;
                        int i4 = length3 + length4;
                        Method[] methodArr3 = new Method[i4];
                        System.arraycopy(methodArr, 0, methodArr3, 0, length3);
                        System.arraycopy(declaredMethods2, 0, methodArr3, length3, length4);
                        Method[] methods2 = superclass.getMethods();
                        int length5 = methods2.length;
                        Method[] methodArr4 = new Method[i4 + length5];
                        System.arraycopy(methodArr3, 0, methodArr4, 0, i4);
                        System.arraycopy(methods2, 0, methodArr4, i4, length5);
                        superclass = superclass.getSuperclass();
                        i3++;
                        methodArr = methodArr4;
                    }
                } else {
                    asList = Arrays.asList(methodArr2);
                }
            }
            asList = Arrays.asList(methodArr);
        } else {
            asList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : asList) {
            int modifiers = method.getModifiers();
            int i5 = c0584.f1237;
            if ((modifiers & i5) == i5 && (method.getModifiers() & c0584.f1236) == 0 && !c0584.f1409.contains(method.getReturnType())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int i6 = c0584.f1407;
                if (i6 == -1 || i6 == parameterTypes.length) {
                    List list = c0584.f1408;
                    if (list != null) {
                        if (list.size() == parameterTypes.length) {
                            for (int i7 = 0; i7 < list.size(); i7++) {
                                if (!((Class) list.get(i7)).equals(parameterTypes[i7])) {
                                    break;
                                }
                            }
                        }
                    }
                    Class cls2 = c0584.f1411;
                    z = true;
                    if (cls2 != null ? c0584.f1410 ? method.getReturnType().equals(c0584.f1411) : cls2.isAssignableFrom(method.getReturnType()) : true) {
                        if (i != 0) {
                            i--;
                        }
                        if (!z) {
                            arrayList.add(method);
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return arrayList;
    }
}
