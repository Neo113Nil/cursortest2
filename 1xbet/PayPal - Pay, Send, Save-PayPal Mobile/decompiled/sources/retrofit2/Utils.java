package retrofit2;

/* loaded from: classes5.dex */
final class Utils {
    static final java.lang.reflect.Type[] getHighResolutionOutputSizeshNQ4ISI = new java.lang.reflect.Type[0];
    private static boolean getHighSpeedVideoFpsRanges = true;

    private Utils() {
    }

    static java.lang.RuntimeException getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Method method, java.lang.String str, java.lang.Object... objArr) {
        return getHighResolutionOutputSizeshNQ4ISI(method, null, str, objArr);
    }

    static java.lang.RuntimeException getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Method method, @javax.annotation.Nullable java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(format);
        sb.append("\n    for method ");
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new java.lang.IllegalArgumentException(sb.toString(), th);
    }

    static java.lang.RuntimeException getHighSpeedVideoFpsRanges(java.lang.reflect.Method method, java.lang.Throwable th, int i, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String Camera2StreamConfigurationMap = retrofit2.Platform.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(method, i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(Camera2StreamConfigurationMap);
        sb.append(")");
        return getHighResolutionOutputSizeshNQ4ISI(method, th, sb.toString(), objArr);
    }

    static java.lang.RuntimeException getHighSpeedVideoSizes(java.lang.reflect.Method method, int i, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String Camera2StreamConfigurationMap = retrofit2.Platform.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(method, i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(Camera2StreamConfigurationMap);
        sb.append(")");
        return getHighResolutionOutputSizeshNQ4ISI(method, null, sb.toString(), objArr);
    }

    static java.lang.Class<?> Camera2StreamConfigurationMap(java.lang.reflect.Type type) {
        while (true) {
            java.util.Objects.requireNonNull(type, "type == null");
            if (type instanceof java.lang.Class) {
                return (java.lang.Class) type;
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                if (!(rawType instanceof java.lang.Class)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return (java.lang.Class) rawType;
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return java.lang.reflect.Array.newInstance(Camera2StreamConfigurationMap(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof java.lang.reflect.TypeVariable) {
                return java.lang.Object.class;
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(type.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    static boolean Camera2StreamConfigurationMap(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        while (type != type2) {
            if (type instanceof java.lang.Class) {
                return type.equals(type2);
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                    return false;
                }
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
                java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                java.lang.reflect.Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                if (!(type2 instanceof java.lang.reflect.GenericArrayType)) {
                    return false;
                }
                type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                type2 = ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof java.lang.reflect.WildcardType) {
                    if (!(type2 instanceof java.lang.reflect.WildcardType)) {
                        return false;
                    }
                    java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                    java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type2;
                    return java.util.Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && java.util.Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof java.lang.reflect.TypeVariable) || !(type2 instanceof java.lang.reflect.TypeVariable)) {
                    return false;
                }
                java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
                java.lang.reflect.TypeVariable typeVariable2 = (java.lang.reflect.TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    private static java.lang.reflect.Type getHighSpeedVideoFpsRangesFor(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
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

    private static int getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr, java.lang.Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    static java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException();
        }
        return getHighResolutionOutputSizeshNQ4ISI(type, cls, getHighSpeedVideoFpsRangesFor(type, cls, cls2));
    }

    private static java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        java.lang.reflect.Type type3 = type2;
        while (type3 instanceof java.lang.reflect.TypeVariable) {
            java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type3;
            java.lang.reflect.Type highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(type, cls, typeVariable);
            if (highSpeedVideoFpsRanges == typeVariable) {
                return highSpeedVideoFpsRanges;
            }
            type3 = highSpeedVideoFpsRanges;
        }
        if (type3 instanceof java.lang.Class) {
            java.lang.Class cls2 = (java.lang.Class) type3;
            if (cls2.isArray()) {
                java.lang.Class<?> componentType = cls2.getComponentType();
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(type, cls, (java.lang.reflect.Type) componentType);
                return componentType == highResolutionOutputSizeshNQ4ISI ? cls2 : new retrofit2.Utils.GenericArrayTypeImpl(highResolutionOutputSizeshNQ4ISI);
            }
        }
        if (type3 instanceof java.lang.reflect.GenericArrayType) {
            java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type3;
            java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
            java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(type, cls, genericComponentType);
            return genericComponentType == highResolutionOutputSizeshNQ4ISI2 ? genericArrayType : new retrofit2.Utils.GenericArrayTypeImpl(highResolutionOutputSizeshNQ4ISI2);
        }
        if (type3 instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type3;
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(type, cls, ownerType);
            boolean z = highResolutionOutputSizeshNQ4ISI3 != ownerType;
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(type, cls, actualTypeArguments[i]);
                if (highResolutionOutputSizeshNQ4ISI4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = highResolutionOutputSizeshNQ4ISI4;
                }
            }
            return z ? new retrofit2.Utils.ParameterizedTypeImpl(highResolutionOutputSizeshNQ4ISI3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type3 instanceof java.lang.reflect.WildcardType;
        java.lang.reflect.Type type4 = type3;
        if (z2) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type3;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (highResolutionOutputSizeshNQ4ISI5 != lowerBounds[0]) {
                    return new retrofit2.Utils.WildcardTypeImpl(new java.lang.reflect.Type[]{java.lang.Object.class}, new java.lang.reflect.Type[]{highResolutionOutputSizeshNQ4ISI5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    java.lang.reflect.Type highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (highResolutionOutputSizeshNQ4ISI6 != upperBounds[0]) {
                        return new retrofit2.Utils.WildcardTypeImpl(new java.lang.reflect.Type[]{highResolutionOutputSizeshNQ4ISI6}, getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
            }
        }
        return type4;
    }

    static void getHighSpeedVideoFpsRanges(java.lang.reflect.Type type) {
        if ((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    static boolean Camera2StreamConfigurationMap(java.lang.annotation.Annotation[] annotationArr, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static okhttp3.ResponseBody getHighSpeedVideoFpsRangesFor(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        okio.Buffer buffer = new okio.Buffer();
        responseBody.getGetHighResolutionOutputSizeshNQ4ISI().readAll(buffer);
        return okhttp3.ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    static java.lang.reflect.Type Camera2StreamConfigurationMap(int i, java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.reflect.Type type = actualTypeArguments[i];
        return type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getUpperBounds()[0] : type;
    }

    static java.lang.reflect.Type getHighSpeedVideoSizes(java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.reflect.Type type = parameterizedType.getActualTypeArguments()[0];
        return type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getLowerBounds()[0] : type;
    }

    static boolean getHighSpeedVideoFpsRangesFor(@javax.annotation.Nullable java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                for (java.lang.reflect.Type type2 : ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()) {
                    if (getHighSpeedVideoFpsRangesFor(type2)) {
                        return true;
                    }
                }
                return false;
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
            } else {
                if ((type instanceof java.lang.reflect.TypeVariable) || (type instanceof java.lang.reflect.WildcardType)) {
                    return true;
                }
                java.lang.String name2 = type == null ? "null" : type.getClass().getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return false;
    }

    static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
        private final java.lang.reflect.Type Camera2StreamConfigurationMap;
        private final java.lang.reflect.Type[] getHighSpeedVideoFpsRanges;

        @javax.annotation.Nullable
        private final java.lang.reflect.Type getHighSpeedVideoFpsRangesFor;

        ParameterizedTypeImpl(@javax.annotation.Nullable java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                if ((type == null) != (((java.lang.Class) type2).getEnclosingClass() == null)) {
                    throw new java.lang.IllegalArgumentException();
                }
            }
            for (java.lang.reflect.Type type3 : typeArr) {
                java.util.Objects.requireNonNull(type3, "typeArgument == null");
                retrofit2.Utils.getHighSpeedVideoFpsRanges(type3);
            }
            this.getHighSpeedVideoFpsRangesFor = type;
            this.Camera2StreamConfigurationMap = type2;
            this.getHighSpeedVideoFpsRanges = (java.lang.reflect.Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.getHighSpeedVideoFpsRanges.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // java.lang.reflect.ParameterizedType
        @javax.annotation.Nullable
        public final java.lang.reflect.Type getOwnerType() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && retrofit2.Utils.Camera2StreamConfigurationMap(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public final int hashCode() {
            int hashCode = java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
            int hashCode2 = this.Camera2StreamConfigurationMap.hashCode();
            java.lang.reflect.Type type = this.getHighSpeedVideoFpsRangesFor;
            return (hashCode ^ hashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.reflect.Type[] typeArr = this.getHighSpeedVideoFpsRanges;
            if (typeArr.length == 0) {
                return retrofit2.Utils.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((typeArr.length + 1) * 30);
            sb.append(retrofit2.Utils.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap));
            sb.append("<");
            sb.append(retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges[0]));
            for (int i = 1; i < this.getHighSpeedVideoFpsRanges.length; i++) {
                sb.append(", ");
                sb.append(retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI;

        GenericArrayTypeImpl(java.lang.reflect.Type type) {
            this.getHighResolutionOutputSizeshNQ4ISI = type;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && retrofit2.Utils.Camera2StreamConfigurationMap(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(retrofit2.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI));
            sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {

        @javax.annotation.Nullable
        private final java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.reflect.Type getHighSpeedVideoFpsRangesFor;

        WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new java.lang.IllegalArgumentException();
            }
            int length = typeArr.length;
            if (typeArr2.length == 1) {
                retrofit2.Utils.getHighSpeedVideoFpsRanges(typeArr2[0]);
                if (typeArr[0] != java.lang.Object.class) {
                    throw new java.lang.IllegalArgumentException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = typeArr2[0];
                this.getHighSpeedVideoFpsRangesFor = java.lang.Object.class;
                return;
            }
            retrofit2.Utils.getHighSpeedVideoFpsRanges(typeArr[0]);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = typeArr[0];
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.getHighSpeedVideoFpsRangesFor};
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.getHighResolutionOutputSizeshNQ4ISI;
            return type != null ? new java.lang.reflect.Type[]{type} : retrofit2.Utils.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && retrofit2.Utils.Camera2StreamConfigurationMap(this, (java.lang.reflect.WildcardType) obj);
        }

        public final int hashCode() {
            java.lang.reflect.Type type = this.getHighResolutionOutputSizeshNQ4ISI;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.getHighSpeedVideoFpsRangesFor.hashCode() + 31);
        }

        public final java.lang.String toString() {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
                sb.append(retrofit2.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI));
                return sb.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == java.lang.Object.class) {
                return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
            sb2.append(retrofit2.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor));
            return sb2.toString();
        }
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
        if (th instanceof java.lang.VirtualMachineError) {
            throw ((java.lang.VirtualMachineError) th);
        }
        if (th instanceof java.lang.ThreadDeath) {
            throw ((java.lang.ThreadDeath) th);
        }
        if (th instanceof java.lang.LinkageError) {
            throw ((java.lang.LinkageError) th);
        }
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Type type) {
        return getHighSpeedVideoFpsRanges && type == kotlin.Unit.class;
    }

    private static java.lang.reflect.Type getHighSpeedVideoFpsRanges(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        java.lang.Class cls2 = genericDeclaration instanceof java.lang.Class ? (java.lang.Class) genericDeclaration : null;
        if (cls2 != null) {
            java.lang.reflect.Type highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(type, cls, cls2);
            if (highSpeedVideoFpsRangesFor instanceof java.lang.reflect.ParameterizedType) {
                return ((java.lang.reflect.ParameterizedType) highSpeedVideoFpsRangesFor).getActualTypeArguments()[getHighResolutionOutputSizeshNQ4ISI(cls2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }
}
