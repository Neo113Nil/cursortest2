package com.nimbusds.jose.shaded.gson.reflect;

/* loaded from: classes4.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final java.lang.Class<? super T> rawType;
    private final java.lang.reflect.Type type;

    protected TypeToken() {
        java.lang.reflect.Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.type = typeTokenTypeArgument;
        this.rawType = (java.lang.Class<? super T>) com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    private TypeToken(java.lang.reflect.Type type) {
        java.lang.reflect.Type canonicalize = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize((java.lang.reflect.Type) java.util.Objects.requireNonNull(type));
        this.type = canonicalize;
        this.rawType = (java.lang.Class<? super T>) com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(canonicalize);
        this.hashCode = canonicalize.hashCode();
    }

    private java.lang.reflect.Type getTypeTokenTypeArgument() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == com.nimbusds.jose.shaded.gson.reflect.TypeToken.class) {
                return com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == com.nimbusds.jose.shaded.gson.reflect.TypeToken.class) {
            throw new java.lang.IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new java.lang.IllegalStateException("Must only create direct subclasses of TypeToken");
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
            return this.rawType.isAssignableFrom(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(type));
        }
        if (type2 instanceof java.lang.reflect.ParameterizedType) {
            return isAssignableFrom(type, (java.lang.reflect.ParameterizedType) type2, new java.util.HashMap());
        }
        if (type2 instanceof java.lang.reflect.GenericArrayType) {
            return this.rawType.isAssignableFrom(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(type)) && isAssignableFrom(type, (java.lang.reflect.GenericArrayType) this.type);
        }
        throw buildUnexpectedTypeError(type2, java.lang.Class.class, java.lang.reflect.ParameterizedType.class, java.lang.reflect.GenericArrayType.class);
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken) {
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
            java.lang.Class<?> rawType = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(type);
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

    private static java.lang.AssertionError buildUnexpectedTypeError(java.lang.reflect.Type type, java.lang.Class<?>... clsArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected type. Expected one of: ");
        for (java.lang.Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        return new java.lang.AssertionError(sb.toString());
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
        return (obj instanceof com.nimbusds.jose.shaded.gson.reflect.TypeToken) && com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.equals(this.type, ((com.nimbusds.jose.shaded.gson.reflect.TypeToken) obj).type);
    }

    public final java.lang.String toString() {
        return com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.type);
    }

    public static com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> get(java.lang.reflect.Type type) {
        return new com.nimbusds.jose.shaded.gson.reflect.TypeToken<>(type);
    }

    public static <T> com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> get(java.lang.Class<T> cls) {
        return new com.nimbusds.jose.shaded.gson.reflect.TypeToken<>(cls);
    }

    public static com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> getParameterized(java.lang.reflect.Type type, java.lang.reflect.Type... typeArr) {
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
        for (int i = 0; i < length; i++) {
            java.lang.reflect.Type type2 = typeArr[i];
            java.lang.Class<?> rawType = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(type2);
            java.lang.reflect.TypeVariable<java.lang.Class<T>> typeVariable = typeParameters[i];
            for (java.lang.reflect.Type type3 : typeVariable.getBounds()) {
                if (!com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(type3).isAssignableFrom(rawType)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Type argument ");
                    sb2.append(type2);
                    sb2.append(" does not satisfy bounds for type variable ");
                    sb2.append(typeVariable);
                    sb2.append(" declared by ");
                    sb2.append(type);
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            }
        }
        return new com.nimbusds.jose.shaded.gson.reflect.TypeToken<>(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(null, type, typeArr));
    }

    public static com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> getArray(java.lang.reflect.Type type) {
        return new com.nimbusds.jose.shaded.gson.reflect.TypeToken<>(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.arrayOf(type));
    }
}
