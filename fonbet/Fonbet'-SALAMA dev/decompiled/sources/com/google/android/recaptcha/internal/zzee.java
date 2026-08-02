package com.google.android.recaptcha.internal;

import f6.C1116i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import t6.h;

/* loaded from: classes.dex */
public abstract class zzee implements InvocationHandler {
    private final Object zza;

    public zzee(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (h.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (h.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (h.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z4 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z4 = true;
                }
            }
            return Boolean.valueOf(z4);
        }
        boolean zza = zza(obj, method, objArr);
        C1116i c1116i = C1116i.f13008a;
        if (!zza) {
            return c1116i;
        }
        if ((this.zza == null && h.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && h.a(zzie.zza(obj2.getClass()), zzie.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? c1116i : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
