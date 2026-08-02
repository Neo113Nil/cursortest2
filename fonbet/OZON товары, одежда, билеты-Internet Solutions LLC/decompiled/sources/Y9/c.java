package Y9;

import C.o0;
import N3.C3660k;
import Y9.a;
import Y9.b;
import Y9.d;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.j;
import com.squareup.moshi.k;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final M f34861a = M.f71699a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Type[] f34862b = new Type[0];

    /* renamed from: c, reason: collision with root package name */
    private static final Class<? extends Annotation> f34863c;

    /* renamed from: d, reason: collision with root package name */
    public static final Class<?> f34864d;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f34863c = cls;
        f34864d = DefaultConstructorMarker.class;
        Tc.d builder = new Tc.d(16);
        Class cls2 = Boolean.TYPE;
        builder.put(cls2, cls2);
        Class cls3 = Byte.TYPE;
        builder.put(cls3, cls3);
        Class cls4 = Character.TYPE;
        builder.put(cls4, cls4);
        Class cls5 = Double.TYPE;
        builder.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        builder.put(cls6, cls6);
        Class cls7 = Integer.TYPE;
        builder.put(cls7, cls7);
        Class cls8 = Long.TYPE;
        builder.put(cls8, cls8);
        Class cls9 = Short.TYPE;
        builder.put(cls9, cls9);
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        builder.put(TYPE, Void.class);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.u();
    }

    @NotNull
    public static final Type a(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return type;
            }
            Class<?> componentType = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "this@canonicalize.componentType");
            return a.C0642a.a(a(componentType));
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            Type rawType = parameterizedType.getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "rawType");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "actualTypeArguments");
            return b.a.a(ownerType, rawType, (Type[]) Arrays.copyOf(actualTypeArguments, actualTypeArguments.length));
        }
        if (type instanceof GenericArrayType) {
            if (type instanceof a) {
                return type;
            }
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "genericComponentType");
            return a.C0642a.a(genericComponentType);
        }
        if (!(type instanceof WildcardType) || (type instanceof d)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "upperBounds");
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "lowerBounds");
        return d.a.a(upperBounds, lowerBounds);
    }

    public static final void b(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException(("Unexpected primitive " + type + ". Use the boxed type.").toString());
        }
    }

    public static final JsonAdapter<?> c(@NotNull Moshi moshi, @NotNull Type type, @NotNull Class<?> rawType) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        j jVar = (j) rawType.getAnnotation(j.class);
        Class<?> cls = null;
        if (jVar == null || !jVar.generateAdapter()) {
            return null;
        }
        String className = rawType.getName();
        Intrinsics.checkNotNullExpressionValue(className, "rawType.name");
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            try {
                Class<?> cls2 = Class.forName(o0.c(new StringBuilder(), h.X(className, "$", "_", false), "JsonAdapter"), true, rawType.getClassLoader());
                Intrinsics.g(cls2, "null cannot be cast to non-null type java.lang.Class<out com.squareup.moshi.JsonAdapter<*>>");
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] typeArgs = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls2.getDeclaredConstructor(Moshi.class, Type[].class);
                            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "adapterClass.getDeclared… Array<Type>::class.java)");
                            Intrinsics.checkNotNullExpressionValue(typeArgs, "typeArgs");
                            objArr = new Object[]{moshi, typeArgs};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "adapterClass.getDeclared…(Array<Type>::class.java)");
                            Intrinsics.checkNotNullExpressionValue(typeArgs, "typeArgs");
                            objArr = new Object[]{typeArgs};
                        }
                    } else {
                        try {
                            declaredConstructor = cls2.getDeclaredConstructor(Moshi.class);
                            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "adapterClass.getDeclared…ructor(Moshi::class.java)");
                            objArr = new Object[]{moshi};
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "adapterClass.getDeclaredConstructor()");
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((JsonAdapter) declaredConstructor.newInstance(Arrays.copyOf(objArr, objArr.length))).nullSafe();
                } catch (NoSuchMethodException e11) {
                    e = e11;
                    cls = cls2;
                    if (cls != null && !(type instanceof ParameterizedType)) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        Intrinsics.checkNotNullExpressionValue(typeParameters, "possiblyFoundAdapter.typeParameters");
                        if (typeParameters.length != 0) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                        }
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                }
            } catch (NoSuchMethodException e12) {
                e = e12;
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e13);
        } catch (IllegalAccessException e14) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e14);
        } catch (InstantiationException e15) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e15);
        } catch (InvocationTargetException e16) {
            n(e16);
            throw null;
        }
    }

    @NotNull
    public static final Type d(@NotNull Type context, @NotNull Class<?> rawTypeInitial, @NotNull Class<?> toResolve) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rawTypeInitial, "rawTypeInitial");
        Intrinsics.checkNotNullParameter(toResolve, "toResolve");
        if (toResolve.equals(rawTypeInitial)) {
            return context;
        }
        if (toResolve.isInterface()) {
            Class<?>[] interfaces = rawTypeInitial.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (Intrinsics.d(interfaces[i11], toResolve)) {
                    Type type = rawTypeInitial.getGenericInterfaces()[i11];
                    Intrinsics.checkNotNullExpressionValue(type, "rawType.genericInterfaces[i]");
                    return type;
                }
                if (toResolve.isAssignableFrom(interfaces[i11])) {
                    Type type2 = rawTypeInitial.getGenericInterfaces()[i11];
                    Intrinsics.checkNotNullExpressionValue(type2, "rawType.genericInterfaces[i]");
                    Class<?> cls = interfaces[i11];
                    Intrinsics.checkNotNullExpressionValue(cls, "interfaces[i]");
                    return d(type2, cls, toResolve);
                }
            }
        }
        if (!rawTypeInitial.isInterface()) {
            while (!Intrinsics.d(rawTypeInitial, Object.class)) {
                Class<? super Object> rawSupertype = rawTypeInitial.getSuperclass();
                if (Intrinsics.d(rawSupertype, toResolve)) {
                    Type genericSuperclass = rawTypeInitial.getGenericSuperclass();
                    Intrinsics.checkNotNullExpressionValue(genericSuperclass, "rawType.genericSuperclass");
                    return genericSuperclass;
                }
                if (toResolve.isAssignableFrom(rawSupertype)) {
                    Type genericSuperclass2 = rawTypeInitial.getGenericSuperclass();
                    Intrinsics.checkNotNullExpressionValue(genericSuperclass2, "rawType.genericSuperclass");
                    Intrinsics.checkNotNullExpressionValue(rawSupertype, "rawSupertype");
                    return d(genericSuperclass2, rawSupertype, toResolve);
                }
                Intrinsics.checkNotNullExpressionValue(rawSupertype, "rawSupertype");
                rawTypeInitial = rawSupertype;
            }
        }
        return toResolve;
    }

    public static final boolean e(@NotNull Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        for (Annotation annotation : annotationArr) {
            Intrinsics.g(annotation, "null cannot be cast to non-null type java.lang.annotation.Annotation");
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Set f(@NotNull AccessibleObject accessibleObject) {
        Intrinsics.checkNotNullParameter(accessibleObject, "<this>");
        Annotation[] annotations = accessibleObject.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
        return g(annotations);
    }

    @NotNull
    public static final Set<Annotation> g(@NotNull Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            Intrinsics.g(annotation, "null cannot be cast to non-null type java.lang.annotation.Annotation");
            if (annotation.annotationType().isAnnotationPresent(m.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet == null) {
            return f34861a;
        }
        Set<Annotation> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    private static final String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static final boolean h(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Class<? extends Annotation> cls2 = f34863c;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static final boolean i(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return h.e0(name, "android.", false) || h.e0(name, "androidx.", false) || h.e0(name, "java.", false) || h.e0(name, "javax.", false) || h.e0(name, "kotlin.", false) || h.e0(name, "kotlinx.", false) || h.e0(name, "scala.", false);
    }

    @NotNull
    public static final k j(String str, String str2, @NotNull n reader) {
        String sb2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        String d11 = reader.d();
        if (Intrinsics.d(str2, str)) {
            sb2 = Sh.b.c("Required value '", str, "' missing at ", d11);
        } else {
            StringBuilder d12 = C3660k.d("Required value '", str, "' (JSON name '", str2, "') missing at ");
            d12.append(d11);
            sb2 = d12.toString();
        }
        return new k(sb2);
    }

    @NotNull
    public static final Type k(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "lowerBounds");
        if (!(lowerBounds.length == 0)) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Type type2 = upperBounds[0];
        Intrinsics.checkNotNullExpressionValue(type2, "upperBounds[0]");
        return type2;
    }

    @NotNull
    public static final Type l(@NotNull Type type, @NotNull Class contextRawType, @NotNull Type context) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextRawType, "contextRawType");
        return m(type, context, contextRawType, new LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Type m(Type type, Type context, Class contextRawType, LinkedHashSet linkedHashSet) {
        int i11 = 0;
        while (true) {
            if (!(type instanceof TypeVariable)) {
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        Intrinsics.checkNotNullExpressionValue(componentType, "original.componentType");
                        Type componentType2 = m(componentType, context, contextRawType, linkedHashSet);
                        if (componentType == componentType2) {
                            return type;
                        }
                        Intrinsics.checkNotNullParameter(componentType2, "<this>");
                        Intrinsics.checkNotNullParameter(componentType2, "componentType");
                        return a.C0642a.a(componentType2);
                    }
                }
                if (type instanceof GenericArrayType) {
                    Type componentType3 = ((GenericArrayType) type).getGenericComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType3, "componentType");
                    Type componentType4 = m(componentType3, context, contextRawType, linkedHashSet);
                    if (componentType3 == componentType4) {
                        return type;
                    }
                    Intrinsics.checkNotNullParameter(componentType4, "<this>");
                    Intrinsics.checkNotNullParameter(componentType4, "componentType");
                    return a.C0642a.a(componentType4);
                }
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type m11 = ownerType != null ? m(ownerType, context, contextRawType, linkedHashSet) : null;
                    boolean z11 = m11 != ownerType;
                    Type[] args = parameterizedType.getActualTypeArguments();
                    int length = args.length;
                    boolean z12 = z11;
                    while (i11 < length) {
                        Type type2 = args[i11];
                        Intrinsics.checkNotNullExpressionValue(type2, "args[t]");
                        Type m12 = m(type2, context, contextRawType, linkedHashSet);
                        z12 = z12;
                        if (m12 != args[i11]) {
                            if (!z12) {
                                args = (Type[]) args.clone();
                                z12 = true;
                            }
                            args[i11] = m12;
                        }
                        i11++;
                        z12 = z12;
                    }
                    if (!z12) {
                        return type;
                    }
                    Type rawType = parameterizedType.getRawType();
                    Intrinsics.checkNotNullExpressionValue(rawType, "original.rawType");
                    Intrinsics.checkNotNullExpressionValue(args, "args");
                    return b.a.a(m11, rawType, (Type[]) Arrays.copyOf(args, args.length));
                }
                if (!(type instanceof WildcardType)) {
                    return type;
                }
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (lowerBounds.length == 1) {
                    Type type3 = lowerBounds[0];
                    Intrinsics.checkNotNullExpressionValue(type3, "originalLowerBound[0]");
                    Type bound = m(type3, context, contextRawType, linkedHashSet);
                    if (bound == lowerBounds[0]) {
                        return type;
                    }
                    Intrinsics.checkNotNullParameter(bound, "bound");
                    Type[] lowerBounds2 = bound instanceof WildcardType ? ((WildcardType) bound).getLowerBounds() : new Type[]{bound};
                    Type[] typeArr = {Object.class};
                    Intrinsics.checkNotNullExpressionValue(lowerBounds2, "lowerBounds");
                    return d.a.a(typeArr, lowerBounds2);
                }
                if (upperBounds.length != 1) {
                    return type;
                }
                Type type4 = upperBounds[0];
                Intrinsics.checkNotNullExpressionValue(type4, "originalUpperBound[0]");
                Type bound2 = m(type4, context, contextRawType, linkedHashSet);
                if (bound2 == upperBounds[0]) {
                    return type;
                }
                Intrinsics.checkNotNullParameter(bound2, "bound");
                Type[] upperBounds2 = bound2 instanceof WildcardType ? ((WildcardType) bound2).getUpperBounds() : new Type[]{bound2};
                Intrinsics.checkNotNullExpressionValue(upperBounds2, "upperBounds");
                return d.a.a(upperBounds2, f34862b);
            }
            if (linkedHashSet.contains(type)) {
                return type;
            }
            linkedHashSet.add(type);
            TypeVariable typeVariable = (TypeVariable) type;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(contextRawType, "contextRawType");
            Intrinsics.checkNotNullParameter(typeVariable, "unknown");
            Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 != null) {
                Type d11 = d(context, contextRawType, cls2);
                if (d11 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    Intrinsics.checkNotNullExpressionValue(typeParameters, "declaredByRaw.typeParameters");
                    typeVariable = ((ParameterizedType) d11).getActualTypeArguments()[C7705l.M(typeParameters, typeVariable)];
                    Intrinsics.checkNotNullExpressionValue(typeVariable, "declaredBy.actualTypeArguments[index]");
                }
            }
            if (typeVariable == type) {
                return typeVariable;
            }
            type = typeVariable;
        }
    }

    @NotNull
    public static final void n(@NotNull InvocationTargetException invocationTargetException) {
        Intrinsics.checkNotNullParameter(invocationTargetException, "<this>");
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw targetException;
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw targetException;
    }

    @NotNull
    public static final String o(@NotNull Type type, @NotNull Set<? extends Annotation> annotations) {
        String str;
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (annotations.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + annotations;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @NotNull
    public static final String p(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof Class)) {
            return type.toString();
        }
        String name = ((Class) type).getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return name;
    }

    @NotNull
    public static final k q(@NotNull String propertyName, @NotNull String jsonName, @NotNull n reader) {
        String sb2;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(jsonName, "jsonName");
        Intrinsics.checkNotNullParameter(reader, "reader");
        String d11 = reader.d();
        if (Intrinsics.d(jsonName, propertyName)) {
            sb2 = Sh.b.c("Non-null value '", propertyName, "' was null at ", d11);
        } else {
            StringBuilder d12 = C3660k.d("Non-null value '", propertyName, "' (JSON name '", jsonName, "') was null at ");
            d12.append(d11);
            sb2 = d12.toString();
        }
        return new k(sb2);
    }
}
