package kotlin.reflect.jvm;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\",\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/reflect/KCallable;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isAccessible", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KCallablesJvm {
    public static final boolean isAccessible(kotlin.reflect.KCallable<?> kCallable) {
        java.lang.reflect.Constructor javaConstructor;
        kotlin.reflect.jvm.internal.calls.Caller<?> defaultCaller;
        java.lang.reflect.Method javaMethod;
        java.lang.reflect.Method javaMethod2;
        java.lang.reflect.Method javaGetter;
        java.lang.reflect.Method javaGetter2;
        java.lang.reflect.Method javaSetter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        if (kCallable instanceof kotlin.reflect.KMutableProperty) {
            kotlin.reflect.KProperty kProperty = (kotlin.reflect.KProperty) kCallable;
            java.lang.reflect.Field javaField = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(kProperty);
            return (javaField == null || javaField.isAccessible()) && ((javaGetter2 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(kProperty)) == null || javaGetter2.isAccessible()) && ((javaSetter = kotlin.reflect.jvm.ReflectJvmMapping.getJavaSetter((kotlin.reflect.KMutableProperty) kCallable)) == null || javaSetter.isAccessible());
        }
        if (kCallable instanceof kotlin.reflect.KProperty) {
            kotlin.reflect.KProperty kProperty2 = (kotlin.reflect.KProperty) kCallable;
            java.lang.reflect.Field javaField2 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(kProperty2);
            return (javaField2 == null || javaField2.isAccessible()) && ((javaGetter = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(kProperty2)) == null || javaGetter.isAccessible());
        }
        if (kCallable instanceof kotlin.reflect.KProperty.Getter) {
            java.lang.reflect.Field javaField3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(((kotlin.reflect.KProperty.Getter) kCallable).getProperty());
            return (javaField3 == null || javaField3.isAccessible()) && ((javaMethod2 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod((kotlin.reflect.KFunction) kCallable)) == null || javaMethod2.isAccessible());
        }
        if (kCallable instanceof kotlin.reflect.KMutableProperty.Setter) {
            java.lang.reflect.Field javaField4 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(((kotlin.reflect.KMutableProperty.Setter) kCallable).getProperty());
            return (javaField4 == null || javaField4.isAccessible()) && ((javaMethod = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod((kotlin.reflect.KFunction) kCallable)) == null || javaMethod.isAccessible());
        }
        if (kCallable instanceof kotlin.reflect.KFunction) {
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) kCallable;
            java.lang.reflect.Method javaMethod3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(kFunction);
            if (javaMethod3 == null || javaMethod3.isAccessible()) {
                kotlin.reflect.jvm.internal.ReflectKCallable<?> asReflectCallable = kotlin.reflect.jvm.internal.UtilKt.asReflectCallable(kCallable);
                java.lang.Object mo23887getMember = (asReflectCallable == null || (defaultCaller = asReflectCallable.getDefaultCaller()) == null) ? null : defaultCaller.mo23887getMember();
                java.lang.reflect.AccessibleObject accessibleObject = mo23887getMember instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) mo23887getMember : null;
                if ((accessibleObject == null || accessibleObject.isAccessible()) && ((javaConstructor = kotlin.reflect.jvm.ReflectJvmMapping.getJavaConstructor(kFunction)) == null || javaConstructor.isAccessible())) {
                    return true;
                }
            }
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown callable: ");
        sb.append(kCallable);
        sb.append(" (");
        sb.append(kCallable.getClass());
        sb.append(')');
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    public static final void setAccessible(kotlin.reflect.KCallable<?> kCallable, boolean z) {
        kotlin.reflect.jvm.internal.calls.Caller<?> defaultCaller;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        if (kCallable instanceof kotlin.reflect.KMutableProperty) {
            kotlin.reflect.KProperty kProperty = (kotlin.reflect.KProperty) kCallable;
            java.lang.reflect.Field javaField = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(kProperty);
            if (javaField != null) {
                javaField.setAccessible(z);
            }
            java.lang.reflect.Method javaGetter = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(kProperty);
            if (javaGetter != null) {
                javaGetter.setAccessible(z);
            }
            java.lang.reflect.Method javaSetter = kotlin.reflect.jvm.ReflectJvmMapping.getJavaSetter((kotlin.reflect.KMutableProperty) kCallable);
            if (javaSetter != null) {
                javaSetter.setAccessible(z);
                return;
            }
            return;
        }
        if (kCallable instanceof kotlin.reflect.KProperty) {
            kotlin.reflect.KProperty kProperty2 = (kotlin.reflect.KProperty) kCallable;
            java.lang.reflect.Field javaField2 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(kProperty2);
            if (javaField2 != null) {
                javaField2.setAccessible(z);
            }
            java.lang.reflect.Method javaGetter2 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(kProperty2);
            if (javaGetter2 != null) {
                javaGetter2.setAccessible(z);
                return;
            }
            return;
        }
        if (kCallable instanceof kotlin.reflect.KProperty.Getter) {
            java.lang.reflect.Field javaField3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(((kotlin.reflect.KProperty.Getter) kCallable).getProperty());
            if (javaField3 != null) {
                javaField3.setAccessible(z);
            }
            java.lang.reflect.Method javaMethod = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod((kotlin.reflect.KFunction) kCallable);
            if (javaMethod != null) {
                javaMethod.setAccessible(z);
                return;
            }
            return;
        }
        if (kCallable instanceof kotlin.reflect.KMutableProperty.Setter) {
            java.lang.reflect.Field javaField4 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(((kotlin.reflect.KMutableProperty.Setter) kCallable).getProperty());
            if (javaField4 != null) {
                javaField4.setAccessible(z);
            }
            java.lang.reflect.Method javaMethod2 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod((kotlin.reflect.KFunction) kCallable);
            if (javaMethod2 != null) {
                javaMethod2.setAccessible(z);
                return;
            }
            return;
        }
        if (kCallable instanceof kotlin.reflect.KFunction) {
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) kCallable;
            java.lang.reflect.Method javaMethod3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(kFunction);
            if (javaMethod3 != null) {
                javaMethod3.setAccessible(z);
            }
            kotlin.reflect.jvm.internal.ReflectKCallable<?> asReflectCallable = kotlin.reflect.jvm.internal.UtilKt.asReflectCallable(kCallable);
            java.lang.Object mo23887getMember = (asReflectCallable == null || (defaultCaller = asReflectCallable.getDefaultCaller()) == null) ? null : defaultCaller.mo23887getMember();
            java.lang.reflect.AccessibleObject accessibleObject = mo23887getMember instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) mo23887getMember : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            java.lang.reflect.Constructor javaConstructor = kotlin.reflect.jvm.ReflectJvmMapping.getJavaConstructor(kFunction);
            if (javaConstructor != null) {
                javaConstructor.setAccessible(z);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown callable: ");
        sb.append(kCallable);
        sb.append(" (");
        sb.append(kCallable.getClass());
        sb.append(')');
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }
}
