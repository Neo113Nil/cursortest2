package androidx.window.reflection;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0017\u001a\u00020\u00072\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00198AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u0007*\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001dR\u0018\u0010\u001c\u001a\u00020\u0007*\u00020\u001e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f"}, d2 = {"Landroidx/window/reflection/ReflectionUtils;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljava/lang/Class;", "classLoader", "", "checkIsPresent$window_release", "(Lkotlin/jvm/functions/Function0;)Z", "", "errorMessage", "block", "validateReflection$window_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z", "Ljava/lang/reflect/Method;", "Lkotlin/reflect/KClass;", "clazz", "doesReturn$window_release", "(Ljava/lang/reflect/Method;Lkotlin/reflect/KClass;)Z", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "implementation", "requirements", "validateImplementation$window_release", "(Ljava/lang/Class;Ljava/lang/Class;)Z", "Ljava/lang/reflect/Constructor;", "isPublic$window_release", "(Ljava/lang/reflect/Constructor;)Z", "isPublic", "(Ljava/lang/reflect/Method;)Z", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReflectionUtils {
    public static final androidx.window.reflection.ReflectionUtils INSTANCE = new androidx.window.reflection.ReflectionUtils();

    private ReflectionUtils() {
    }

    public final boolean checkIsPresent$window_release(kotlin.jvm.functions.Function0<? extends java.lang.Class<?>> classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        try {
            classLoader.invoke();
            return true;
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean validateReflection$window_release(java.lang.String errorMessage, kotlin.jvm.functions.Function0<java.lang.Boolean> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        try {
            return block.invoke().booleanValue();
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused) {
            return false;
        }
    }

    public final boolean isPublic$window_release(java.lang.reflect.Constructor<?> constructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        return java.lang.reflect.Modifier.isPublic(constructor.getModifiers());
    }

    public final boolean isPublic$window_release(java.lang.reflect.Method method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return java.lang.reflect.Modifier.isPublic(method.getModifiers());
    }

    public final boolean isPublic$window_release(java.lang.reflect.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return java.lang.reflect.Modifier.isPublic(field.getModifiers());
    }

    public final boolean doesReturn$window_release(java.lang.reflect.Method method, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return doesReturn$window_release(method, kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
    }

    public final boolean doesReturn$window_release(java.lang.reflect.Method method, java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return method.getReturnType().equals(cls);
    }

    public final boolean validateImplementation$window_release(final java.lang.Class<?> implementation, java.lang.Class<?> requirements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implementation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requirements, "");
        java.lang.reflect.Method[] methods = requirements.getMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methods, "");
        for (final java.lang.reflect.Method method : methods) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(implementation.getName());
            sb.append('#');
            sb.append(method.getName());
            sb.append(" is not valid");
            if (!validateReflection$window_release(sb.toString(), new kotlin.jvm.functions.Function0() { // from class: androidx.window.reflection.ReflectionUtils$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.window.reflection.ReflectionUtils.$r8$lambda$7ta9V35r4cuFAZuA_r8DRs9GZrg(implementation, method));
                }
            })) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$7ta9V35r4cuFAZuA_r8DRs9GZrg(java.lang.Class cls, java.lang.reflect.Method method) {
        java.lang.String name2 = method.getName();
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        java.lang.reflect.Method method2 = cls.getMethod(name2, (java.lang.Class[]) java.util.Arrays.copyOf(parameterTypes, parameterTypes.length));
        androidx.window.reflection.ReflectionUtils reflectionUtils = INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        if (!reflectionUtils.isPublic$window_release(method2)) {
            return false;
        }
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        return reflectionUtils.doesReturn$window_release(method2, returnType);
    }
}
