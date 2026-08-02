package kotlin.jvm;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u001b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\u0006\u001a\u0004\b\r\u0010\t\"+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t\"+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014\";\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00068Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\t\"'\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0018*\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"", "T", "", "", "isArrayOf", "([Ljava/lang/Object;)Z", "Lkotlin/reflect/KClass;", "Ljava/lang/Class;", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "java", "getJavaPrimitiveType", "javaPrimitiveType", "getJavaObjectType", "javaObjectType", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "kotlin", "(Ljava/lang/Object;)Ljava/lang/Class;", "javaClass", "getRuntimeClassOfKClassInstance", "getRuntimeClassOfKClassInstance$annotations", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "annotationClass"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JvmClassMappingKt {
    public static /* synthetic */ void getDeclaringJavaClass$annotations(java.lang.Enum r0) {
    }

    public static /* synthetic */ void getJavaClass$annotations(kotlin.reflect.KClass kClass) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @kotlin.ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(kotlin.reflect.KClass kClass) {
    }

    public static final <T> java.lang.Class<T> getJavaClass(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kClass).getJClass();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
        return cls;
    }

    public static final <T> java.lang.Class<T> getJavaPrimitiveType(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kClass).getJClass();
        if (cls.isPrimitive()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
            return cls;
        }
        java.lang.String name2 = cls.getName();
        if (name2 == null) {
            return null;
        }
        switch (name2.hashCode()) {
            case -2056817302:
                if (name2.equals("java.lang.Integer")) {
                    return java.lang.Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name2.equals("java.lang.Float")) {
                    return java.lang.Float.TYPE;
                }
                return null;
            case -515992664:
                if (name2.equals("java.lang.Short")) {
                    return java.lang.Short.TYPE;
                }
                return null;
            case 155276373:
                if (name2.equals("java.lang.Character")) {
                    return java.lang.Character.TYPE;
                }
                return null;
            case 344809556:
                if (name2.equals("java.lang.Boolean")) {
                    return java.lang.Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name2.equals("java.lang.Byte")) {
                    return java.lang.Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name2.equals("java.lang.Long")) {
                    return java.lang.Long.TYPE;
                }
                return null;
            case 399092968:
                if (name2.equals("java.lang.Void")) {
                    return java.lang.Void.TYPE;
                }
                return null;
            case 761287205:
                if (name2.equals("java.lang.Double")) {
                    return java.lang.Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final <T> java.lang.Class<T> getJavaObjectType(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((kotlin.jvm.internal.ClassBasedDeclarationContainer) kClass).getJClass();
        if (!cls.isPrimitive()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
            return cls;
        }
        java.lang.String name2 = cls.getName();
        if (name2 != null) {
            switch (name2.hashCode()) {
                case -1325958191:
                    if (name2.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE)) {
                        cls = (java.lang.Class<T>) java.lang.Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name2.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT)) {
                        cls = (java.lang.Class<T>) java.lang.Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name2.equals("byte")) {
                        cls = (java.lang.Class<T>) java.lang.Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name2.equals("char")) {
                        cls = (java.lang.Class<T>) java.lang.Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name2.equals(com.adjust.sdk.Constants.LONG)) {
                        cls = (java.lang.Class<T>) java.lang.Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name2.equals("void")) {
                        cls = (java.lang.Class<T>) java.lang.Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN)) {
                        cls = (java.lang.Class<T>) java.lang.Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT)) {
                        cls = (java.lang.Class<T>) java.lang.Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name2.equals("short")) {
                        cls = (java.lang.Class<T>) java.lang.Short.class;
                        break;
                    }
                    break;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
        return cls;
    }

    public static final <T> kotlin.reflect.KClass<T> getKotlinClass(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cls);
    }

    public static final <T> java.lang.Class<T> getJavaClass(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) t.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
        return cls;
    }

    public static final <T> java.lang.Class<kotlin.reflect.KClass<T>> getRuntimeClassOfKClassInstance(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.Class<kotlin.reflect.KClass<T>> cls = (java.lang.Class<kotlin.reflect.KClass<T>>) kClass.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
        return cls;
    }

    public static final /* synthetic */ boolean isArrayOf(java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return java.lang.Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    public static final <T extends java.lang.annotation.Annotation> kotlin.reflect.KClass<? extends T> getAnnotationClass(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        java.lang.Class<? extends java.lang.annotation.Annotation> annotationType = t.annotationType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationType, "");
        kotlin.reflect.KClass<? extends T> kotlinClass = getKotlinClass(annotationType);
        kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinClass, "");
        return kotlinClass;
    }
}
