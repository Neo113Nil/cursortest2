package com.onesignal.common.services;

import com.onesignal.debug.internal.logging.Logging;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ServiceRegistrationReflection<T> extends ServiceRegistration<T> {
    private final Class<?> clazz;
    private T obj;

    public ServiceRegistrationReflection(Class<?> clazz) {
        i.e(clazz, "clazz");
        this.clazz = clazz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private final boolean doesHaveAllParameters(Constructor<?> constructor, IServiceProvider iServiceProvider) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        i.d(genericParameterTypes, "getGenericParameterTypes(...)");
        for (Type type : genericParameterTypes) {
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                i.d(actualTypeArguments, "getActualTypeArguments(...)");
                Class<T> cls = actualTypeArguments.length == 0 ? 0 : actualTypeArguments[0];
                if (!(cls instanceof WildcardType)) {
                    if (cls instanceof Class) {
                        if (!iServiceProvider.hasService(cls)) {
                            Logging.error$default("Constructor " + constructor + " could not find service: " + cls, null, 2, null);
                        }
                    }
                    return false;
                }
                Type[] upperBounds = ((WildcardType) cls).getUpperBounds();
                i.d(upperBounds, "getUpperBounds(...)");
                if (upperBounds.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                Type type2 = upperBounds[0];
                if ((type2 instanceof Class) && !iServiceProvider.hasService((Class) type2)) {
                    Logging.error$default("Constructor " + constructor + " could not find service: " + type2, null, 2, null);
                    return false;
                }
            } else {
                if (!(type instanceof Class)) {
                    Logging.error$default("Constructor " + constructor + " could not identify param type: " + type, null, 2, null);
                    return false;
                }
                if (!iServiceProvider.hasService((Class) type)) {
                    Logging.error$default("Constructor " + constructor + " could not find service: " + type, null, 2, null);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.services.ServiceRegistration
    public Object resolve(IServiceProvider provider) {
        i.e(provider, "provider");
        T t5 = this.obj;
        if (t5 != null) {
            return t5;
        }
        Constructor<?>[] constructors = this.clazz.getConstructors();
        i.d(constructors, "getConstructors(...)");
        int length = constructors.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i2];
            i.b(constructor);
            if (doesHaveAllParameters(constructor, provider)) {
                ArrayList arrayList = new ArrayList();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                i.d(genericParameterTypes, "getGenericParameterTypes(...)");
                for (Type type : genericParameterTypes) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        i.d(actualTypeArguments, "getActualTypeArguments(...)");
                        Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
                        if (type2 instanceof WildcardType) {
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            i.d(upperBounds, "getUpperBounds(...)");
                            if (upperBounds.length == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            Type type3 = upperBounds[0];
                            if (type3 instanceof Class) {
                                arrayList.add(provider.getAllServices((Class) type3));
                            } else {
                                arrayList.add(null);
                            }
                        } else if (type2 instanceof Class) {
                            arrayList.add(provider.getAllServices((Class) type2));
                        } else {
                            arrayList.add(null);
                        }
                    } else if (type instanceof Class) {
                        arrayList.add(provider.getService((Class) type));
                    } else {
                        arrayList.add(null);
                    }
                }
                Object[] array = arrayList.toArray(new Object[0]);
                this.obj = (T) constructor.newInstance(Arrays.copyOf(array, array.length));
            } else {
                i2++;
            }
        }
        return this.obj;
    }
}
