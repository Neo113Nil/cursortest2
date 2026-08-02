package org.modelmapper.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.implementation.InvocationHandlerAdapter;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.objenesis.Objenesis;
import org.modelmapper.internal.objenesis.ObjenesisStd;
import org.modelmapper.internal.util.Primitives;

/* loaded from: classes4.dex */
class ProxyFactory {
    private static final Object LOOKUP;
    private static final Method PRIVATE_LOOKUP_IN;
    private static final Objenesis OBJENESIS = new ObjenesisStd();
    private static final ElementMatcher<? super MethodDescription> METHOD_FILTER = ElementMatchers.not(ElementMatchers.named("hashCode").or(ElementMatchers.named("equals")));

    ProxyFactory() {
    }

    static {
        Object obj;
        Method method = null;
        try {
            Class<?> cls = Class.forName("java.lang.invoke.MethodHandles");
            obj = cls.getMethod("lookup", new Class[0]).invoke(null, new Object[0]);
            method = cls.getMethod("privateLookupIn", Class.class, Class.forName("java.lang.invoke.MethodHandles$Lookup"));
        } catch (Exception unused) {
            obj = null;
        }
        PRIVATE_LOOKUP_IN = method;
        LOOKUP = obj;
    }

    static <T> T proxyFor(Class<T> cls, InvocationHandler invocationHandler, Errors errors) throws ErrorsException {
        return (T) proxyFor(cls, invocationHandler, errors, Boolean.FALSE.booleanValue());
    }

    static <T> T proxyFor(Class<T> cls, InvocationHandler invocationHandler, Errors errors, boolean z) throws ErrorsException {
        if (Primitives.isPrimitive(cls)) {
            return (T) Primitives.defaultValueForWrapper(cls);
        }
        if (cls.equals(String.class)) {
            return null;
        }
        if (Modifier.isFinal(cls.getModifiers())) {
            throw errors.invocationAgainstFinalClass(cls).toException();
        }
        try {
            DynamicType.Unloaded<T> make = new ByteBuddy().subclass((Class) cls).method(METHOD_FILTER).intercept(InvocationHandlerAdapter.of(invocationHandler)).make();
            ClassLoadingStrategy<ClassLoader> chooseClassLoadingStrategy = chooseClassLoadingStrategy(cls);
            if (chooseClassLoadingStrategy != null) {
                return (T) OBJENESIS.newInstance(make.load(z ? BridgeClassLoaderFactory.getClassLoader(cls) : cls.getClassLoader(), chooseClassLoadingStrategy).getLoaded());
            }
            return (T) OBJENESIS.newInstance(make.load(z ? BridgeClassLoaderFactory.getClassLoader(cls) : cls.getClassLoader()).getLoaded());
        } catch (Throwable th) {
            throw errors.errorInstantiatingProxy(cls, th).toException();
        }
    }

    private static <T> ClassLoadingStrategy<ClassLoader> chooseClassLoadingStrategy(Class<T> cls) {
        Method method;
        Object obj;
        try {
            if (ClassInjector.UsingLookup.isAvailable() && (method = PRIVATE_LOOKUP_IN) != null && (obj = LOOKUP) != null) {
                return ClassLoadingStrategy.UsingLookup.of(method.invoke(null, cls, obj));
            }
            if (ClassInjector.UsingReflection.isAvailable()) {
                return ClassLoadingStrategy.Default.INJECTION;
            }
            throw new IllegalStateException("No code generation strategy available");
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Failed to invoke 'privateLookupIn' method from java.lang.invoke.MethodHandles$Lookup.", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Failed to invoke 'privateLookupIn' method from java.lang.invoke.MethodHandles$Lookup.", e2);
        }
    }
}
