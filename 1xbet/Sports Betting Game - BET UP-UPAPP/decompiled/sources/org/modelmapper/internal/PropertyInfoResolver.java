package org.modelmapper.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.modelmapper.config.Configuration;
import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
interface PropertyInfoResolver<M extends Member, PI extends PropertyInfo> {
    public static final PropertyInfoResolver<Field, Mutator> FIELDS = new DefaultPropertyResolver<Field, Mutator>() { // from class: org.modelmapper.internal.PropertyInfoResolver.1
        @Override // org.modelmapper.internal.PropertyInfoResolver
        public /* bridge */ /* synthetic */ Member[] membersFor(Class cls) {
            return membersFor((Class<?>) cls);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver
        public /* bridge */ /* synthetic */ PropertyInfo propertyInfoFor(Class cls, Member member, Configuration configuration, String str) {
            return propertyInfoFor((Class<?>) cls, (Field) member, configuration, str);
        }

        public Mutator propertyInfoFor(Class<?> cls, Field field, Configuration configuration, String str) {
            return PropertyInfoRegistry.fieldPropertyFor(cls, field, configuration, str);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver
        public Field[] membersFor(Class<?> cls) {
            return cls.getDeclaredFields();
        }
    };
    public static final PropertyInfoResolver<Method, Accessor> ACCESSORS = new DefaultPropertyResolver<Method, Accessor>() { // from class: org.modelmapper.internal.PropertyInfoResolver.2
        @Override // org.modelmapper.internal.PropertyInfoResolver
        public /* bridge */ /* synthetic */ Member[] membersFor(Class cls) {
            return membersFor((Class<?>) cls);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver
        public /* bridge */ /* synthetic */ PropertyInfo propertyInfoFor(Class cls, Member member, Configuration configuration, String str) {
            return propertyInfoFor((Class<?>) cls, (Method) member, configuration, str);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver.DefaultPropertyResolver, org.modelmapper.internal.PropertyInfoResolver
        public boolean isValid(Method method) {
            return super.isValid((AnonymousClass2) method) && !method.isBridge() && method.getParameterTypes().length == 0 && !method.getReturnType().equals(Void.TYPE);
        }

        public Accessor propertyInfoFor(Class<?> cls, Method method, Configuration configuration, String str) {
            return PropertyInfoRegistry.accessorFor(cls, method, configuration, str);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver
        public Method[] membersFor(Class<?> cls) {
            return cls.getDeclaredMethods();
        }
    };
    public static final PropertyInfoResolver<Method, Mutator> MUTATORS = new DefaultPropertyResolver<Method, Mutator>() { // from class: org.modelmapper.internal.PropertyInfoResolver.3
        @Override // org.modelmapper.internal.PropertyInfoResolver
        public /* bridge */ /* synthetic */ Member[] membersFor(Class cls) {
            return membersFor((Class<?>) cls);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver
        public /* bridge */ /* synthetic */ PropertyInfo propertyInfoFor(Class cls, Member member, Configuration configuration, String str) {
            return propertyInfoFor((Class<?>) cls, (Method) member, configuration, str);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver.DefaultPropertyResolver, org.modelmapper.internal.PropertyInfoResolver
        public boolean isValid(Method method) {
            return super.isValid((AnonymousClass3) method) && !method.isBridge() && method.getParameterTypes().length == 1 && (method.getReturnType().equals(Void.TYPE) || method.getReturnType().equals(method.getDeclaringClass()));
        }

        public Mutator propertyInfoFor(Class<?> cls, Method method, Configuration configuration, String str) {
            return PropertyInfoRegistry.mutatorFor(cls, method, configuration, str);
        }

        @Override // org.modelmapper.internal.PropertyInfoResolver
        public Method[] membersFor(Class<?> cls) {
            return cls.getDeclaredMethods();
        }
    };

    boolean isValid(M m);

    M[] membersFor(Class<?> cls);

    PI propertyInfoFor(Class<?> cls, M m, Configuration configuration, String str);

    public static abstract class DefaultPropertyResolver<M extends Member, PI extends PropertyInfo> implements PropertyInfoResolver<M, PI> {
        @Override // org.modelmapper.internal.PropertyInfoResolver
        public boolean isValid(M m) {
            return (Modifier.isStatic(m.getModifiers()) || m.isSynthetic()) ? false : true;
        }
    }
}
