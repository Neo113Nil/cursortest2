package com.google.gson.reflect;

/* loaded from: classes4.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final java.lang.Class<? super T> rawType;
    private final java.lang.reflect.Type type;

    public TypeToken() {
        java.lang.reflect.Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.type = typeTokenTypeArgument;
        this.rawType = (java.lang.Class<? super T>) com.google.gson.internal.GsonTypes.getRawType(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    private TypeToken(java.lang.reflect.Type type) {
        java.lang.reflect.Type canonicalize = com.google.gson.internal.GsonTypes.canonicalize((java.lang.reflect.Type) java.util.Objects.requireNonNull(type));
        this.type = canonicalize;
        this.rawType = (java.lang.Class<? super T>) com.google.gson.internal.GsonTypes.getRawType(canonicalize);
        this.hashCode = canonicalize.hashCode();
    }

    private static boolean isCapturingTypeVariablesForbidden() {
        return !java.util.Objects.equals(java.lang.System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    private java.lang.reflect.Type getTypeTokenTypeArgument() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == com.google.gson.reflect.TypeToken.class) {
                java.lang.reflect.Type canonicalize = com.google.gson.internal.GsonTypes.canonicalize(parameterizedType.getActualTypeArguments()[0]);
                if (isCapturingTypeVariablesForbidden()) {
                    verifyNoTypeVariable(canonicalize);
                }
                return canonicalize;
            }
        } else if (genericSuperclass == com.google.gson.reflect.TypeToken.class) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ");
            sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl("type-token-raw"));
            throw new java.lang.IllegalStateException(sb.toString());
        }
        throw new java.lang.IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private static void verifyNoTypeVariable(java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.reflect.TypeVariable)) {
            if (type instanceof java.lang.reflect.GenericArrayType) {
                type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
            } else {
                int i = 0;
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                    java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                    if (ownerType != null) {
                        verifyNoTypeVariable(ownerType);
                    }
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        verifyNoTypeVariable(actualTypeArguments[i]);
                        i++;
                    }
                    return;
                }
                if (!(type instanceof java.lang.reflect.WildcardType)) {
                    if (type == null) {
                        throw new java.lang.IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                    }
                    return;
                }
                java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                for (java.lang.reflect.Type type2 : wildcardType.getLowerBounds()) {
                    verifyNoTypeVariable(type2);
                }
                java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    verifyNoTypeVariable(upperBounds[i]);
                    i++;
                }
                return;
            }
        }
        java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
        sb.append(typeVariable.getName());
        sb.append(" declared by ");
        sb.append(typeVariable.getGenericDeclaration());
        sb.append("\nSee ");
        sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl("typetoken-type-variable"));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.lang.Class<? super T> getRawType() {
        return this.rawType;
    }

    public final java.lang.reflect.Type getType() {
        return this.type;
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(java.lang.Class<?> cls) {
        return isAssignableFrom((java.lang.reflect.Type) cls);
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(java.lang.reflect.Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        java.lang.reflect.Type type2 = this.type;
        if (type2 instanceof java.lang.Class) {
            return this.rawType.isAssignableFrom(com.google.gson.internal.GsonTypes.getRawType(type));
        }
        if (type2 instanceof java.lang.reflect.ParameterizedType) {
            return isAssignableFrom(type, (java.lang.reflect.ParameterizedType) type2, new java.util.HashMap());
        }
        if (type2 instanceof java.lang.reflect.GenericArrayType) {
            return this.rawType.isAssignableFrom(com.google.gson.internal.GsonTypes.getRawType(type)) && isAssignableFrom(type, (java.lang.reflect.GenericArrayType) this.type);
        }
        throw buildUnsupportedTypeException(type2, java.lang.Class.class, java.lang.reflect.ParameterizedType.class, java.lang.reflect.GenericArrayType.class);
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(com.google.gson.reflect.TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(java.lang.reflect.Type type, java.lang.reflect.GenericArrayType genericArrayType) {
        java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof java.lang.reflect.ParameterizedType)) {
            return true;
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof java.lang.Class) {
            type = (java.lang.Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return isAssignableFrom(type, (java.lang.reflect.ParameterizedType) genericComponentType, new java.util.HashMap());
    }

    private static boolean isAssignableFrom(java.lang.reflect.Type type, java.lang.reflect.ParameterizedType parameterizedType, java.util.Map<java.lang.String, java.lang.reflect.Type> map) {
        while (true) {
            if (type == null) {
                return false;
            }
            if (parameterizedType.equals(type)) {
                return true;
            }
            java.lang.Class<?> rawType = com.google.gson.internal.GsonTypes.getRawType(type);
            java.lang.reflect.ParameterizedType parameterizedType2 = type instanceof java.lang.reflect.ParameterizedType ? (java.lang.reflect.ParameterizedType) type : null;
            if (parameterizedType2 != null) {
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = rawType.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    java.lang.reflect.Type type2 = actualTypeArguments[i];
                    java.lang.reflect.TypeVariable<java.lang.Class<?>> typeVariable = typeParameters[i];
                    while (type2 instanceof java.lang.reflect.TypeVariable) {
                        type2 = map.get(((java.lang.reflect.TypeVariable) type2).getName());
                    }
                    map.put(typeVariable.getName(), type2);
                }
                if (typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            for (java.lang.reflect.Type type3 : rawType.getGenericInterfaces()) {
                if (isAssignableFrom(type3, parameterizedType, new java.util.HashMap(map))) {
                    return true;
                }
            }
            type = rawType.getGenericSuperclass();
            map = new java.util.HashMap(map);
        }
    }

    private static boolean typeEquals(java.lang.reflect.ParameterizedType parameterizedType, java.lang.reflect.ParameterizedType parameterizedType2, java.util.Map<java.lang.String, java.lang.reflect.Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        java.lang.reflect.Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.IllegalArgumentException buildUnsupportedTypeException(java.lang.reflect.Type type, java.lang.Class<?>... clsArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type, expected one of: ");
        for (java.lang.Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        return new java.lang.IllegalArgumentException(sb.toString());
    }

    private static boolean matches(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.util.Map<java.lang.String, java.lang.reflect.Type> map) {
        if (type2.equals(type)) {
            return true;
        }
        return (type instanceof java.lang.reflect.TypeVariable) && type2.equals(map.get(((java.lang.reflect.TypeVariable) type).getName()));
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.gson.reflect.TypeToken) && com.google.gson.internal.GsonTypes.equals(this.type, ((com.google.gson.reflect.TypeToken) obj).type);
    }

    public final java.lang.String toString() {
        return com.google.gson.internal.GsonTypes.typeToString(this.type);
    }

    public static com.google.gson.reflect.TypeToken<?> get(java.lang.reflect.Type type) {
        return new com.google.gson.reflect.TypeToken<>(type);
    }

    public static <T> com.google.gson.reflect.TypeToken<T> get(java.lang.Class<T> cls) {
        return new com.google.gson.reflect.TypeToken<>(cls);
    }

    public static com.google.gson.reflect.TypeToken<?> getParameterized(java.lang.reflect.Type type, java.lang.reflect.Type... typeArr) {
        java.util.Objects.requireNonNull(type);
        java.util.Objects.requireNonNull(typeArr);
        if (!(type instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("rawType must be of type Class, but was ".concat(java.lang.String.valueOf(type)));
        }
        java.lang.Class cls = (java.lang.Class) type;
        java.lang.reflect.TypeVariable<java.lang.Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls.getName());
            sb.append(" requires ");
            sb.append(length);
            sb.append(" type arguments, but got ");
            sb.append(length2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (typeArr.length == 0) {
            return get(cls);
        }
        if (com.google.gson.internal.GsonTypes.requiresOwnerType(type)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Raw type ");
            sb2.append(cls.getName());
            sb2.append(" is not supported because it requires specifying an owner type");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        for (int i = 0; i < length; i++) {
            java.lang.reflect.Type type2 = (java.lang.reflect.Type) java.util.Objects.requireNonNull(typeArr[i], "Type argument must not be null");
            java.lang.Class<?> rawType = com.google.gson.internal.GsonTypes.getRawType(type2);
            java.lang.reflect.TypeVariable<java.lang.Class<T>> typeVariable = typeParameters[i];
            for (java.lang.reflect.Type type3 : typeVariable.getBounds()) {
                if (!com.google.gson.internal.GsonTypes.getRawType(type3).isAssignableFrom(rawType)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Type argument ");
                    sb3.append(type2);
                    sb3.append(" does not satisfy bounds for type variable ");
                    sb3.append(typeVariable);
                    sb3.append(" declared by ");
                    sb3.append(type);
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
            }
        }
        return new com.google.gson.reflect.TypeToken<>(com.google.gson.internal.GsonTypes.newParameterizedTypeWithOwner(null, cls, typeArr));
    }

    public static com.google.gson.reflect.TypeToken<?> getArray(java.lang.reflect.Type type) {
        return new com.google.gson.reflect.TypeToken<>(com.google.gson.internal.GsonTypes.arrayOf(type));
    }
}
