package com.squareup.moshi;

@javax.annotation.CheckReturnValue
/* loaded from: classes3.dex */
public final class Types {
    private Types() {
    }

    public static java.lang.String generatedJsonAdapterName(java.lang.Class<?> cls) {
        if (cls.getAnnotation(com.squareup.moshi.JsonClass.class) == null) {
            throw new java.lang.IllegalArgumentException("Class does not have a JsonClass annotation: ".concat(java.lang.String.valueOf(cls)));
        }
        return generatedJsonAdapterName(cls.getName());
    }

    public static java.lang.String generatedJsonAdapterName(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str.replace(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "_"));
        sb.append("JsonAdapter");
        return sb.toString();
    }

    @javax.annotation.Nullable
    public static java.util.Set<? extends java.lang.annotation.Annotation> nextAnnotations(java.util.Set<? extends java.lang.annotation.Annotation> set, java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        if (!cls.isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls);
            sb.append(" is not a JsonQualifier.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (set.isEmpty()) {
            return null;
        }
        for (java.lang.annotation.Annotation annotation : set) {
            if (cls.equals(annotation.annotationType())) {
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return java.util.Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    public static java.lang.reflect.ParameterizedType newParameterizedType(java.lang.reflect.Type type, java.lang.reflect.Type... typeArr) {
        if (typeArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Missing type arguments for ".concat(java.lang.String.valueOf(type)));
        }
        return new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(null, type, typeArr);
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        if (typeArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Missing type arguments for ".concat(java.lang.String.valueOf(type2)));
        }
        return new com.squareup.moshi.internal.Util.ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type type) {
        return new com.squareup.moshi.internal.Util.GenericArrayTypeImpl(type);
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getUpperBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.squareup.moshi.internal.Util.WildcardTypeImpl(typeArr, com.squareup.moshi.internal.Util.EMPTY_TYPE_ARRAY);
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getLowerBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.squareup.moshi.internal.Util.WildcardTypeImpl(new java.lang.reflect.Type[]{java.lang.Object.class}, typeArr);
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                return (java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType();
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return java.lang.reflect.Array.newInstance(getRawType(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof java.lang.reflect.TypeVariable) {
                return java.lang.Object.class;
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
            } else {
                java.lang.String name2 = type == null ? "null" : type.getClass().getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (java.lang.Class) type;
    }

    public static java.lang.reflect.Type collectionElementType(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (!java.util.Collection.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException();
        }
        java.lang.reflect.Type resolve = com.squareup.moshi.internal.Util.resolve(type, cls, com.squareup.moshi.internal.Util.getGenericSupertype(type, cls, java.util.Collection.class));
        if (resolve instanceof java.lang.reflect.WildcardType) {
            resolve = ((java.lang.reflect.WildcardType) resolve).getUpperBounds()[0];
        }
        if (resolve instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) resolve).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static boolean equals(@javax.annotation.Nullable java.lang.reflect.Type type, @javax.annotation.Nullable java.lang.reflect.Type type2) {
        java.lang.reflect.Type[] actualTypeArguments;
        java.lang.reflect.Type[] actualTypeArguments2;
        while (type != type2) {
            if (type instanceof java.lang.Class) {
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    type = ((java.lang.Class) type).getComponentType();
                    type2 = ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType();
                } else {
                    return type.equals(type2);
                }
            } else {
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                        return false;
                    }
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                    java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
                    if (parameterizedType instanceof com.squareup.moshi.internal.Util.ParameterizedTypeImpl) {
                        actualTypeArguments = ((com.squareup.moshi.internal.Util.ParameterizedTypeImpl) parameterizedType).typeArguments;
                    } else {
                        actualTypeArguments = parameterizedType.getActualTypeArguments();
                    }
                    if (parameterizedType2 instanceof com.squareup.moshi.internal.Util.ParameterizedTypeImpl) {
                        actualTypeArguments2 = ((com.squareup.moshi.internal.Util.ParameterizedTypeImpl) parameterizedType2).typeArguments;
                    } else {
                        actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                    }
                    return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(actualTypeArguments, actualTypeArguments2);
                }
                if (type instanceof java.lang.reflect.GenericArrayType) {
                    if (type2 instanceof java.lang.Class) {
                        java.lang.Class<?> componentType = ((java.lang.Class) type2).getComponentType();
                        type2 = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                        type = componentType;
                    } else {
                        if (!(type2 instanceof java.lang.reflect.GenericArrayType)) {
                            return false;
                        }
                        type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                        type2 = ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType();
                    }
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
        }
        return true;
    }

    @java.lang.Deprecated
    public static java.util.Set<? extends java.lang.annotation.Annotation> getFieldJsonQualifierAnnotations(java.lang.Class<?> cls, java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            java.lang.annotation.Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(declaredAnnotations.length);
            for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return java.util.Collections.unmodifiableSet(linkedHashSet);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not access field ");
            sb.append(str);
            sb.append(" on class ");
            sb.append(cls.getCanonicalName());
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }

    static <T extends java.lang.annotation.Annotation> T getHighSpeedVideoFpsRangesFor(final java.lang.Class<T> cls) {
        if (!cls.isAnnotation()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls);
            sb.append(" must be an annotation.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!cls.isAnnotationPresent(com.squareup.moshi.JsonQualifier.class)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(cls);
            sb2.append(" must have @JsonQualifier.");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (cls.getDeclaredMethods().length != 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(cls);
            sb3.append(" must not declare methods.");
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        return (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: com.squareup.moshi.Types.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
                char c;
                java.lang.String name2 = method.getName();
                name2.hashCode();
                switch (name2.hashCode()) {
                    case -1776922004:
                        if (name2.equals("toString")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1295482945:
                        if (name2.equals("equals")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 147696667:
                        if (name2.equals("hashCode")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1444986633:
                        if (name2.equals("annotationType")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("@");
                    sb4.append(cls.getName());
                    sb4.append("()");
                    return sb4.toString();
                }
                if (c == 1) {
                    return java.lang.Boolean.valueOf(cls.isInstance(objArr[0]));
                }
                if (c == 2) {
                    return 0;
                }
                if (c == 3) {
                    return cls;
                }
                return method.invoke(obj, objArr);
            }
        });
    }

    static java.lang.reflect.Type[] Camera2StreamConfigurationMap(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        if (!java.util.Map.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException();
        }
        java.lang.reflect.Type resolve = com.squareup.moshi.internal.Util.resolve(type, cls, com.squareup.moshi.internal.Util.getGenericSupertype(type, cls, java.util.Map.class));
        if (resolve instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) resolve).getActualTypeArguments();
        }
        return new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    static java.lang.reflect.Type getHighSpeedVideoSizes(java.lang.reflect.Type type) {
        java.lang.Class<?> rawType = getRawType(type);
        return com.squareup.moshi.internal.Util.resolve(type, rawType, rawType.getGenericSuperclass());
    }

    static java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof java.lang.Class) {
            return ((java.lang.Class) type).getComponentType();
        }
        return null;
    }
}
