package com.squareup.moshi.internal;

/* loaded from: classes3.dex */
public final class Util {

    @javax.annotation.Nullable
    public static final java.lang.Class<?> DEFAULT_CONSTRUCTOR_MARKER;

    @javax.annotation.Nullable
    private static final java.lang.Class<? extends java.lang.annotation.Annotation> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> getHighSpeedVideoSizes;
    public static final java.util.Set<java.lang.annotation.Annotation> NO_ANNOTATIONS = java.util.Collections.emptySet();
    public static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = new java.lang.reflect.Type[0];

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Class cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName(getKotlinMetadataClassName());
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = cls;
        try {
            cls2 = java.lang.Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        DEFAULT_CONSTRUCTOR_MARKER = cls2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(16);
        linkedHashMap.put(java.lang.Boolean.TYPE, java.lang.Boolean.class);
        linkedHashMap.put(java.lang.Byte.TYPE, java.lang.Byte.class);
        linkedHashMap.put(java.lang.Character.TYPE, java.lang.Character.class);
        linkedHashMap.put(java.lang.Double.TYPE, java.lang.Double.class);
        linkedHashMap.put(java.lang.Float.TYPE, java.lang.Float.class);
        linkedHashMap.put(java.lang.Integer.TYPE, java.lang.Integer.class);
        linkedHashMap.put(java.lang.Long.TYPE, java.lang.Long.class);
        linkedHashMap.put(java.lang.Short.TYPE, java.lang.Short.class);
        linkedHashMap.put(java.lang.Void.TYPE, java.lang.Void.class);
        getHighSpeedVideoSizes = java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    private static java.lang.String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    private Util() {
    }

    public static java.lang.String jsonName(java.lang.String str, java.lang.reflect.AnnotatedElement annotatedElement) {
        return jsonName(str, (com.squareup.moshi.Json) annotatedElement.getAnnotation(com.squareup.moshi.Json.class));
    }

    public static java.lang.String jsonName(java.lang.String str, @javax.annotation.Nullable com.squareup.moshi.Json json) {
        if (json != null) {
            java.lang.String name2 = json.name();
            if (!"\u0000".equals(name2)) {
                return name2;
            }
        }
        return str;
    }

    public static boolean typesMatch(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        return com.squareup.moshi.Types.equals(type, type2);
    }

    public static java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations(java.lang.reflect.AnnotatedElement annotatedElement) {
        return jsonAnnotations(annotatedElement.getAnnotations());
    }

    public static java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations(java.lang.annotation.Annotation[] annotationArr) {
        java.util.LinkedHashSet linkedHashSet = null;
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? java.util.Collections.unmodifiableSet(linkedHashSet) : NO_ANNOTATIONS;
    }

    public static boolean isAnnotationPresent(java.util.Set<? extends java.lang.annotation.Annotation> set, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        if (set.isEmpty()) {
            return false;
        }
        java.util.Iterator<? extends java.lang.annotation.Annotation> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasNullable(java.lang.annotation.Annotation[] annotationArr) {
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPlatformType(java.lang.Class<?> cls) {
        java.lang.String name2 = cls.getName();
        return name2.startsWith("android.") || name2.startsWith("androidx.") || name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("kotlin.") || name2.startsWith("kotlinx.") || name2.startsWith("scala.");
    }

    public static java.lang.RuntimeException rethrowCause(java.lang.reflect.InvocationTargetException invocationTargetException) {
        java.lang.Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) targetException);
        }
        if (targetException instanceof java.lang.Error) {
            throw ((java.lang.Error) targetException);
        }
        throw new java.lang.RuntimeException(targetException);
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            return cls.isArray() ? new com.squareup.moshi.internal.Util.GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            if (!(type instanceof com.squareup.moshi.internal.Util.ParameterizedTypeImpl)) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                return new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
            }
        } else if (type instanceof java.lang.reflect.GenericArrayType) {
            if (!(type instanceof com.squareup.moshi.internal.Util.GenericArrayTypeImpl)) {
                return new com.squareup.moshi.internal.Util.GenericArrayTypeImpl(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
            }
        } else if ((type instanceof java.lang.reflect.WildcardType) && !(type instanceof com.squareup.moshi.internal.Util.WildcardTypeImpl)) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            return new com.squareup.moshi.internal.Util.WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static java.lang.reflect.Type removeSubtypeWildcard(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new java.lang.IllegalArgumentException();
                }
                return upperBounds[0];
            }
        }
        return type;
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return getHighSpeedVideoFpsRanges(type, cls, type2, new java.util.LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.reflect.Type] */
    private static java.lang.reflect.Type getHighSpeedVideoFpsRanges(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Collection<java.lang.reflect.TypeVariable<?>> collection) {
        java.lang.reflect.Type highSpeedVideoFpsRanges;
        java.lang.reflect.TypeVariable<?> typeVariable;
        do {
            if (type2 instanceof java.lang.reflect.TypeVariable) {
                typeVariable = type2;
                if (!collection.contains(typeVariable)) {
                    collection.add(typeVariable);
                    type2 = getHighSpeedVideoFpsRanges(type, cls, typeVariable);
                }
            } else {
                if (type2 instanceof java.lang.Class) {
                    java.lang.Class cls2 = type2;
                    if (cls2.isArray()) {
                        java.lang.Class<?> componentType = cls2.getComponentType();
                        java.lang.reflect.Type highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(type, cls, componentType, collection);
                        return componentType == highSpeedVideoFpsRanges2 ? cls2 : com.squareup.moshi.Types.arrayOf(highSpeedVideoFpsRanges2);
                    }
                }
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type2;
                    java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
                    java.lang.reflect.Type highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(type, cls, genericComponentType, collection);
                    return genericComponentType == highSpeedVideoFpsRanges3 ? genericArrayType : com.squareup.moshi.Types.arrayOf(highSpeedVideoFpsRanges3);
                }
                if (type2 instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type2;
                    java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                    java.lang.reflect.Type highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(type, cls, ownerType, collection);
                    boolean z = highSpeedVideoFpsRanges4 != ownerType;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    for (int i = 0; i < length; i++) {
                        java.lang.reflect.Type highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(type, cls, actualTypeArguments[i], collection);
                        if (highSpeedVideoFpsRanges5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = highSpeedVideoFpsRanges5;
                        }
                    }
                    return z ? new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(highSpeedVideoFpsRanges4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof java.lang.reflect.WildcardType) {
                    type2 = (java.lang.reflect.WildcardType) type2;
                    java.lang.reflect.Type[] lowerBounds = type2.getLowerBounds();
                    java.lang.reflect.Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        java.lang.reflect.Type highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(type, cls, lowerBounds[0], collection);
                        if (highSpeedVideoFpsRanges6 != lowerBounds[0]) {
                            return com.squareup.moshi.Types.supertypeOf(highSpeedVideoFpsRanges6);
                        }
                    } else if (upperBounds.length == 1 && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                        return com.squareup.moshi.Types.subtypeOf(highSpeedVideoFpsRanges);
                    }
                }
            }
            return type2;
        } while (type2 != typeVariable);
        return type2;
    }

    public static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        java.lang.Class<?> superclass;
        java.lang.reflect.Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                java.lang.Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    java.lang.Class<?> cls3 = interfaces[i];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i];
                        superclass = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != java.lang.Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        java.lang.reflect.Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    static int getHighSpeedVideoFpsRangesFor(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static java.lang.String Camera2StreamConfigurationMap(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    private static int getHighSpeedVideoFpsRangesFor(java.lang.Object[] objArr, java.lang.Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    static void getHighSpeedVideoSizes(java.lang.reflect.Type type) {
        if ((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected primitive ");
            sb.append(type);
            sb.append(". Use the boxed type.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type Camera2StreamConfigurationMap;
        private final java.lang.reflect.Type getHighSpeedVideoFpsRanges;
        public final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(@javax.annotation.Nullable java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                java.lang.Class<?> enclosingClass = ((java.lang.Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || com.squareup.moshi.Types.getRawType(type) != enclosingClass) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected owner type for ");
                        sb.append(type2);
                        sb.append(": ");
                        sb.append(type);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                } else if (enclosingClass != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unexpected owner type for ");
                    sb2.append(type2);
                    sb2.append(": null");
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            }
            this.Camera2StreamConfigurationMap = type == null ? null : com.squareup.moshi.internal.Util.canonicalize(type);
            this.getHighSpeedVideoFpsRanges = com.squareup.moshi.internal.Util.canonicalize(type2);
            this.typeArguments = (java.lang.reflect.Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                java.lang.reflect.Type[] typeArr2 = this.typeArguments;
                if (i >= typeArr2.length) {
                    return;
                }
                com.squareup.moshi.internal.Util.getHighSpeedVideoSizes(typeArr2[i]);
                java.lang.reflect.Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = com.squareup.moshi.internal.Util.canonicalize(typeArr3[i]);
                i++;
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.lang.reflect.ParameterizedType
        @javax.annotation.Nullable
        public final java.lang.reflect.Type getOwnerType() {
            return this.Camera2StreamConfigurationMap;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.squareup.moshi.Types.equals(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public final int hashCode() {
            return (java.util.Arrays.hashCode(this.typeArguments) ^ this.getHighSpeedVideoFpsRanges.hashCode()) ^ com.squareup.moshi.internal.Util.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((this.typeArguments.length + 1) * 30);
            sb.append(com.squareup.moshi.internal.Util.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges));
            if (this.typeArguments.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(com.squareup.moshi.internal.Util.Camera2StreamConfigurationMap(this.typeArguments[0]));
            for (int i = 1; i < this.typeArguments.length; i++) {
                sb.append(", ");
                sb.append(com.squareup.moshi.internal.Util.Camera2StreamConfigurationMap(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type getHighSpeedVideoSizes;

        public GenericArrayTypeImpl(java.lang.reflect.Type type) {
            this.getHighSpeedVideoSizes = com.squareup.moshi.internal.Util.canonicalize(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && com.squareup.moshi.Types.equals(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.squareup.moshi.internal.Util.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes));
            sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type Camera2StreamConfigurationMap;
        private final java.lang.reflect.Type getHighSpeedVideoSizes;

        public WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new java.lang.IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                com.squareup.moshi.internal.Util.getHighSpeedVideoSizes(typeArr2[0]);
                if (typeArr[0] != java.lang.Object.class) {
                    throw new java.lang.IllegalArgumentException();
                }
                this.Camera2StreamConfigurationMap = com.squareup.moshi.internal.Util.canonicalize(typeArr2[0]);
                this.getHighSpeedVideoSizes = java.lang.Object.class;
                return;
            }
            com.squareup.moshi.internal.Util.getHighSpeedVideoSizes(typeArr[0]);
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = com.squareup.moshi.internal.Util.canonicalize(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.getHighSpeedVideoSizes};
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.Camera2StreamConfigurationMap;
            return type != null ? new java.lang.reflect.Type[]{type} : com.squareup.moshi.internal.Util.EMPTY_TYPE_ARRAY;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && com.squareup.moshi.Types.equals(this, (java.lang.reflect.WildcardType) obj);
        }

        public final int hashCode() {
            java.lang.reflect.Type type = this.Camera2StreamConfigurationMap;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.getHighSpeedVideoSizes.hashCode() + 31);
        }

        public final java.lang.String toString() {
            if (this.Camera2StreamConfigurationMap != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
                sb.append(com.squareup.moshi.internal.Util.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap));
                return sb.toString();
            }
            if (this.getHighSpeedVideoSizes == java.lang.Object.class) {
                return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
            sb2.append(com.squareup.moshi.internal.Util.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes));
            return sb2.toString();
        }
    }

    public static java.lang.String typeAnnotatedWithAnnotations(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(type);
        sb.append(set.isEmpty() ? " (with no annotations)" : " annotated ".concat(java.lang.String.valueOf(set)));
        return sb.toString();
    }

    @javax.annotation.Nullable
    public static com.squareup.moshi.JsonAdapter<?> generatedAdapter(com.squareup.moshi.Moshi moshi, java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Constructor<?> declaredConstructor;
        java.lang.Object[] objArr;
        com.squareup.moshi.JsonClass jsonClass = (com.squareup.moshi.JsonClass) cls.getAnnotation(com.squareup.moshi.JsonClass.class);
        java.lang.Class cls2 = null;
        if (jsonClass == null || !jsonClass.generateAdapter()) {
            return null;
        }
        try {
            try {
                java.lang.Class<?> cls3 = java.lang.Class.forName(com.squareup.moshi.Types.generatedJsonAdapterName(cls.getName()), true, cls.getClassLoader());
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.Type[] actualTypeArguments = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls3.getDeclaredConstructor(com.squareup.moshi.Moshi.class, java.lang.reflect.Type[].class);
                        objArr = new java.lang.Object[]{moshi, actualTypeArguments};
                    } catch (java.lang.NoSuchMethodException unused) {
                        declaredConstructor = cls3.getDeclaredConstructor(java.lang.reflect.Type[].class);
                        objArr = new java.lang.Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls3.getDeclaredConstructor(com.squareup.moshi.Moshi.class);
                        objArr = new java.lang.Object[]{moshi};
                    } catch (java.lang.NoSuchMethodException unused2) {
                        declaredConstructor = cls3.getDeclaredConstructor(new java.lang.Class[0]);
                        objArr = new java.lang.Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((com.squareup.moshi.JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
            } catch (java.lang.NoSuchMethodException e) {
                if (!(type instanceof java.lang.reflect.ParameterizedType) && cls2.getTypeParameters().length != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                    sb.append(type);
                    sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                    sb.append(cls2.getCanonicalName());
                    sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                    throw new java.lang.RuntimeException(sb.toString(), e);
                }
                throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for ".concat(java.lang.String.valueOf(type)), e);
            }
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for ".concat(java.lang.String.valueOf(type)), e2);
        } catch (java.lang.IllegalAccessException e3) {
            throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for ".concat(java.lang.String.valueOf(type)), e3);
        } catch (java.lang.InstantiationException e4) {
            throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for ".concat(java.lang.String.valueOf(type)), e4);
        } catch (java.lang.reflect.InvocationTargetException e5) {
            throw rethrowCause(e5);
        }
    }

    public static boolean isKotlin(java.lang.Class<?> cls) {
        java.lang.Class<? extends java.lang.annotation.Annotation> cls2 = getHighResolutionOutputSizeshNQ4ISI;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static <T> java.lang.reflect.Constructor<T> lookupDefaultsConstructor(java.lang.Class<T> cls) {
        if (DEFAULT_CONSTRUCTOR_MARKER == null) {
            throw new java.lang.IllegalStateException("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
        }
        for (java.lang.Object obj : cls.getDeclaredConstructors()) {
            java.lang.reflect.Constructor<T> constructor = (java.lang.reflect.Constructor<T>) obj;
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(DEFAULT_CONSTRUCTOR_MARKER)) {
                constructor.setAccessible(true);
                return constructor;
            }
        }
        throw new java.lang.IllegalStateException("No defaults constructor found for ".concat(java.lang.String.valueOf(cls)));
    }

    public static com.squareup.moshi.JsonDataException missingProperty(java.lang.String str, java.lang.String str2, com.squareup.moshi.JsonReader jsonReader) {
        java.lang.String format;
        java.lang.String path = jsonReader.getPath();
        if (str2.equals(str)) {
            format = java.lang.String.format("Required value '%s' missing at %s", str, path);
        } else {
            format = java.lang.String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path);
        }
        return new com.squareup.moshi.JsonDataException(format);
    }

    public static com.squareup.moshi.JsonDataException unexpectedNull(java.lang.String str, java.lang.String str2, com.squareup.moshi.JsonReader jsonReader) {
        java.lang.String format;
        java.lang.String path = jsonReader.getPath();
        if (str2.equals(str)) {
            format = java.lang.String.format("Non-null value '%s' was null at %s", str, path);
        } else {
            format = java.lang.String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path);
        }
        return new com.squareup.moshi.JsonDataException(format);
    }

    public static <T> java.lang.Class<T> boxIfPrimitive(java.lang.Class<T> cls) {
        java.lang.Class<T> cls2 = (java.lang.Class) getHighSpeedVideoSizes.get(cls);
        return cls2 == null ? cls : cls2;
    }

    private static java.lang.reflect.Type getHighSpeedVideoFpsRanges(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        java.lang.Class cls2 = genericDeclaration instanceof java.lang.Class ? (java.lang.Class) genericDeclaration : null;
        if (cls2 != null) {
            java.lang.reflect.Type genericSupertype = getGenericSupertype(type, cls, cls2);
            if (genericSupertype instanceof java.lang.reflect.ParameterizedType) {
                return ((java.lang.reflect.ParameterizedType) genericSupertype).getActualTypeArguments()[getHighSpeedVideoFpsRangesFor(cls2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }
}
