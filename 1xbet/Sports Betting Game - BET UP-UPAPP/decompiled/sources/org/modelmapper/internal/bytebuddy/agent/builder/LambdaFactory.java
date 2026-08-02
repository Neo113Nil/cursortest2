package org.modelmapper.internal.bytebuddy.agent.builder;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.instrument.ClassFileTransformer;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class LambdaFactory {
    public static final Map<ClassFileTransformer, LambdaFactory> CLASS_FILE_TRANSFORMERS = new ConcurrentHashMap();
    private static final String FIELD_NAME = "CLASS_FILE_TRANSFORMERS";
    private final Method dispatcher;
    private final Object target;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LambdaFactory lambdaFactory = (LambdaFactory) obj;
        return this.target.equals(lambdaFactory.target) && this.dispatcher.equals(lambdaFactory.dispatcher);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.dispatcher.hashCode();
    }

    public LambdaFactory(Object obj, Method method) {
        this.target = obj;
        this.dispatcher = method;
    }

    public static boolean register(ClassFileTransformer classFileTransformer, Object obj) {
        boolean isEmpty;
        try {
            TypeDescription of = TypeDescription.ForLoadedType.of(LambdaFactory.class);
            Class<?> cls = ClassInjector.UsingReflection.ofSystemClassLoader().inject(Collections.singletonMap(of, ClassFileLocator.ForClassLoader.read(LambdaFactory.class).resolve())).get(of);
            Map map = (Map) cls.getField(FIELD_NAME).get(null);
            synchronized (map) {
                try {
                    try {
                        isEmpty = map.isEmpty();
                        map.put(classFileTransformer, cls.getConstructor(Object.class, Method.class).newInstance(obj, obj.getClass().getMethod("make", Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Boolean.TYPE, List.class, List.class, Collection.class)));
                    } catch (Throwable th) {
                        map.put(classFileTransformer, cls.getConstructor(Object.class, Method.class).newInstance(obj, obj.getClass().getMethod("make", Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Boolean.TYPE, List.class, List.class, Collection.class)));
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return isEmpty;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Could not register class file transformer", e2);
        }
    }

    public static boolean release(ClassFileTransformer classFileTransformer) {
        boolean z;
        try {
            Map map = (Map) ClassLoader.getSystemClassLoader().loadClass(LambdaFactory.class.getName()).getField(FIELD_NAME).get(null);
            synchronized (map) {
                z = map.remove(classFileTransformer) != null && map.isEmpty();
            }
            return z;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Could not release class file transformer", e2);
        }
    }

    private byte[] invoke(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, List<Class<?>> list, List<?> list2, Collection<ClassFileTransformer> collection) {
        try {
            return (byte[]) this.dispatcher.invoke(this.target, obj, str, obj2, obj3, obj4, obj5, Boolean.valueOf(z), list, list2, collection);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Cannot create class for lambda expression", e2);
        }
    }

    public static byte[] make(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, List<Class<?>> list, List<?> list2) {
        Map<ClassFileTransformer, LambdaFactory> map = CLASS_FILE_TRANSFORMERS;
        return map.values().iterator().next().invoke(obj, str, obj2, obj3, obj4, obj5, z, list, list2, map.keySet());
    }
}
