package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p044f6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
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
        boolean zZza = zza(obj, method, objArr);
        i iVar = i.f13014a;
        if (!zZza) {
            return iVar;
        }
        if ((this.zza == null && h.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && h.a(zzie.zza(obj2.getClass()), zzie.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? iVar : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
