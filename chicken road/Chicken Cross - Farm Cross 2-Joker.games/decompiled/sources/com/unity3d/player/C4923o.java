package com.unity3d.player;

import com.unity3d.player.a.AbstractC4890t;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4923o implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC4929r f11799a;
    public final UnityPlayer b;
    public final long c;
    public final /* synthetic */ long d;

    public C4923o(long j, UnityPlayer unityPlayer) {
        long j2;
        this.d = j;
        j2 = ReflectionHelper.b;
        this.f11799a = new RunnableC4929r(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    public static Object a(Object obj, Method method, Object[] objArr, C4927q c4927q) {
        try {
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC4890t.Log(6, "Java interface default methods are only supported since Android Oreo");
                    ReflectionHelper.nativeProxyLogJNIInvokeException(c4927q.f11803a);
                    c4927q.f11803a = 0L;
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        } finally {
            long j = c4927q.f11803a;
            if (j != 0) {
                ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
            }
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object nativeProxyInvoke;
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            AbstractC4890t.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            nativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(nativeProxyInvoke instanceof C4927q)) {
                return nativeProxyInvoke;
            }
            C4927q c4927q = (C4927q) nativeProxyInvoke;
            if (c4927q.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, c4927q);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(c4927q.f11803a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }

    public void finalize() {
        this.b.invokeOnMainThread(this.f11799a);
        super.finalize();
    }
}
