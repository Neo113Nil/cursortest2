package kotlinx.serialization.internal;

/* compiled from: Platform.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b\u001a\u001c\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000\u001a$\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0002\"\b\b\u0000\u0010\u0001*\u00020\t\"\n\b\u0001\u0010\u000e*\u0004\u0018\u0001H\u0001*\u0012\u0012\u0004\u0012\u0002H\u000e0\u000fj\b\u0012\u0004\u0012\u0002H\u000e`\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\nH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\u0016H\u0000\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\n2\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0000¢\u0006\u0002\u0010\u0019\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0000¢\u0006\u0002\u0010\u001a\u001aM\u0010\u001b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010\u001a\u001a\u001e\u0010\u001c\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u001c\u0010\u001e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001aO\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010\u001a\u001aK\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t2\u0006\u0010\"\u001a\u00020\t2\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a$\u0010(\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u0016\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\nH\u0000\u001a\u001c\u0010+\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0,H\u0000\u001a\u0017\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.00H\u0082\b¨\u00061"}, d2 = {"getChecked", "T", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "isInterface", "", "Lkotlin/reflect/KClass;", "compiledSerializerImpl", "Lkotlinx/serialization/KSerializer;", "toNativeArrayImpl", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "platformSpecificSerializerNotRegistered", "", "serializerNotRegistered", "Ljava/lang/Class;", "constructSerializerForGivenTypeArgs", "args", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "findInNamedCompanion", "findNamedCompanionByAnnotation", "isNotAnnotated", "isPolymorphicSerializer", "invokeSerializerOnDefaultCompanion", "jClass", "invokeSerializerOnCompanion", "companion", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "companionOrNull", "companionName", "", "createEnumSerializer", "findObjectSerializer", "isReferenceArray", "rootClass", "initBuiltins", "", "loadSafe", "", "block", "Lkotlin/Function0;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformKt {
    public static final <T> T getChecked(T[] tArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i];
    }

    public static final boolean getChecked(boolean[] zArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i];
    }

    public static final <T> boolean isInterface(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        return kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).isInterface();
    }

    public static final <T> kotlinx.serialization.KSerializer<T> compiledSerializerImpl(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        return constructSerializerForGivenTypeArgs(kClass, (kotlinx.serialization.KSerializer<java.lang.Object>[]) new kotlinx.serialization.KSerializer[0]);
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(java.util.ArrayList<E> arrayList, kotlin.reflect.KClass<T> eClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eClass, "eClass");
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) eClass), arrayList.size());
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((java.lang.Object[]) newInstance);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }

    public static final java.lang.Void platformSpecificSerializerNotRegistered(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        kotlinx.serialization.internal.Platform_commonKt.serializerNotRegistered(kClass);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final java.lang.Void serializerNotRegistered(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "<this>");
        throw new kotlinx.serialization.SerializationException(kotlinx.serialization.internal.Platform_commonKt.notRegisteredMessage((kotlin.reflect.KClass<?>) kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls)));
    }

    public static final <T> kotlinx.serialization.KSerializer<T> constructSerializerForGivenTypeArgs(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<java.lang.Object>... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass), (kotlinx.serialization.KSerializer<java.lang.Object>[]) java.util.Arrays.copyOf(args, args.length));
    }

    public static final <T> kotlinx.serialization.KSerializer<T> constructSerializerForGivenTypeArgs(java.lang.Class<T> cls, kotlinx.serialization.KSerializer<java.lang.Object>... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        kotlinx.serialization.KSerializer<T> invokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(args, args.length));
        if (invokeSerializerOnDefaultCompanion != null) {
            return invokeSerializerOnDefaultCompanion;
        }
        kotlinx.serialization.KSerializer<T> findObjectSerializer = findObjectSerializer(cls);
        if (findObjectSerializer != null) {
            return findObjectSerializer;
        }
        kotlinx.serialization.KSerializer<T> findInNamedCompanion = findInNamedCompanion(cls, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(args, args.length));
        if (findInNamedCompanion != null) {
            return findInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003f, code lost:
    
        if (r2 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> kotlinx.serialization.KSerializer<T> findInNamedCompanion(java.lang.Class<T> cls, kotlinx.serialization.KSerializer<java.lang.Object>... kSerializerArr) {
        java.lang.reflect.Field field;
        kotlinx.serialization.KSerializer<T> invokeSerializerOnCompanion;
        java.lang.Object findNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (findNamedCompanionByAnnotation != null && (invokeSerializerOnCompanion = invokeSerializerOnCompanion(findNamedCompanionByAnnotation, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return invokeSerializerOnCompanion;
        }
        try {
            java.lang.Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            java.lang.Class<?>[] clsArr = declaredClasses;
            int length = clsArr.length;
            int i = 0;
            java.lang.Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    java.lang.Class<?> cls3 = clsArr[i];
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                }
            }
            cls2 = null;
            java.lang.Class<?> cls4 = cls2;
            java.lang.Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof kotlinx.serialization.KSerializer) {
                return (kotlinx.serialization.KSerializer) obj;
            }
            return null;
        } catch (java.lang.NoSuchFieldException unused) {
            return null;
        }
    }

    private static final <T> java.lang.Object findNamedCompanionByAnnotation(java.lang.Class<T> cls) {
        java.lang.Class<?> cls2;
        java.lang.Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        java.lang.Class<?>[] clsArr = declaredClasses;
        int length = clsArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = clsArr[i];
            if (cls2.getAnnotation(kotlinx.serialization.internal.NamedCompanion.class) != null) {
                break;
            }
            i++;
        }
        java.lang.Class<?> cls3 = cls2;
        if (cls3 == null) {
            return null;
        }
        java.lang.String simpleName = cls3.getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return companionOrNull(cls, simpleName);
    }

    private static final <T> boolean isNotAnnotated(java.lang.Class<T> cls) {
        return cls.getAnnotation(kotlinx.serialization.Serializable.class) == null && cls.getAnnotation(kotlinx.serialization.Polymorphic.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(java.lang.Class<T> cls) {
        if (cls.getAnnotation(kotlinx.serialization.Polymorphic.class) != null) {
            return true;
        }
        kotlinx.serialization.Serializable serializable = (kotlinx.serialization.Serializable) cls.getAnnotation(kotlinx.serialization.Serializable.class);
        return serializable != null && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(serializable.with()), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.PolymorphicSerializer.class));
    }

    private static final <T> kotlinx.serialization.KSerializer<T> invokeSerializerOnDefaultCompanion(java.lang.Class<?> cls, kotlinx.serialization.KSerializer<java.lang.Object>... kSerializerArr) {
        java.lang.Object companionOrNull = companionOrNull(cls, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M);
        if (companionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(companionOrNull, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> kotlinx.serialization.KSerializer<T> invokeSerializerOnCompanion(java.lang.Object obj, kotlinx.serialization.KSerializer<java.lang.Object>... kSerializerArr) {
        java.lang.Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new java.lang.Class[0];
            } else {
                int length = kSerializerArr.length;
                java.lang.Class[] clsArr2 = new java.lang.Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = kotlinx.serialization.KSerializer.class;
                }
                clsArr = clsArr2;
            }
            java.lang.Object invoke = obj.getClass().getDeclaredMethod("serializer", (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof kotlinx.serialization.KSerializer) {
                return (kotlinx.serialization.KSerializer) invoke;
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            java.lang.String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new java.lang.reflect.InvocationTargetException(cause, message);
        }
    }

    private static final java.lang.Object companionOrNull(java.lang.Class<?> cls, java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static final <T> kotlinx.serialization.KSerializer<T> createEnumSerializer(java.lang.Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        java.lang.String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new kotlinx.serialization.internal.EnumSerializer(canonicalName, (java.lang.Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x005a, code lost:
    
        if (r5 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> kotlinx.serialization.KSerializer<T> findObjectSerializer(java.lang.Class<T> cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null || kotlin.text.StringsKt.startsWith$default(canonicalName, "java.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(canonicalName, "kotlin.", false, 2, (java.lang.Object) null)) {
            return null;
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        java.lang.reflect.Field[] fieldArr = declaredFields;
        int length = fieldArr.length;
        java.lang.reflect.Field field = null;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i < length) {
                java.lang.reflect.Field field2 = fieldArr[i];
                java.lang.reflect.Field field3 = field2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(field3.getName(), "INSTANCE") && kotlin.jvm.internal.Intrinsics.areEqual(field3.getType(), cls) && java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
                    if (z) {
                        break;
                    }
                    field = field2;
                    z = true;
                }
                i++;
            }
        }
        field = null;
        java.lang.reflect.Field field4 = field;
        if (field4 == null) {
            return null;
        }
        java.lang.Object obj = field4.get(null);
        java.lang.reflect.Method[] methods = cls.getMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        java.lang.reflect.Method[] methodArr = methods;
        int length2 = methodArr.length;
        java.lang.reflect.Method method = null;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 < length2) {
                java.lang.reflect.Method method2 = methodArr[i2];
                java.lang.reflect.Method method3 = method2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(method3.getName(), "serializer")) {
                    java.lang.Class<?>[] parameterTypes = method3.getParameterTypes();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && kotlin.jvm.internal.Intrinsics.areEqual(method3.getReturnType(), kotlinx.serialization.KSerializer.class)) {
                        if (z2) {
                            break;
                        }
                        method = method2;
                        z2 = true;
                    }
                }
                i2++;
            }
        }
        java.lang.reflect.Method method4 = method;
        if (method4 == null) {
            return null;
        }
        java.lang.Object invoke = method4.invoke(obj, new java.lang.Object[0]);
        if (invoke instanceof kotlinx.serialization.KSerializer) {
            return (kotlinx.serialization.KSerializer) invoke;
        }
        return null;
    }

    public static final boolean isReferenceArray(kotlin.reflect.KClass<java.lang.Object> rootClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) rootClass).isArray();
    }

    public static final java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> initBuiltins() {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.CharCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(char[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.CharArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.DoubleCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(double[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.DoubleArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.FloatCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(float[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.FloatArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.LongCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(long[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.LongArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.ULong.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.ULong.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.IntCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.IntArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.UInt.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UInt.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.ShortCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(short[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.ShortArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.UShort.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UShort.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Byte.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.ByteCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.ByteArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.UByte.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UByte.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.BooleanCompanionObject.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(boolean[].class), kotlinx.serialization.builtins.BuiltinSerializersKt.BooleanArraySerializer());
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.Unit.INSTANCE));
        createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Void.class), kotlinx.serialization.builtins.BuiltinSerializersKt.NothingSerializer());
        try {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.time.Duration.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.time.Duration.INSTANCE));
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        try {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.ULongArray.class), kotlinx.serialization.builtins.BuiltinSerializersKt.ULongArraySerializer());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused2) {
        }
        try {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.UIntArray.class), kotlinx.serialization.builtins.BuiltinSerializersKt.UIntArraySerializer());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused3) {
        }
        try {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.UShortArray.class), kotlinx.serialization.builtins.BuiltinSerializersKt.UShortArraySerializer());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused4) {
        }
        try {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.UByteArray.class), kotlinx.serialization.builtins.BuiltinSerializersKt.UByteArraySerializer());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused5) {
        }
        try {
            createMapBuilder.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.uuid.Uuid.class), kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.uuid.Uuid.INSTANCE));
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused6) {
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    private static final void loadSafe(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        try {
            function0.invoke();
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
    }
}
