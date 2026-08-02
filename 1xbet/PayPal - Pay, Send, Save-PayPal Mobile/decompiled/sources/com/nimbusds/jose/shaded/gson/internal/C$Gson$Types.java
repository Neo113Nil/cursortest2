package com.nimbusds.jose.shaded.gson.internal;

/* renamed from: com.nimbusds.jose.shaded.gson.internal.$Gson$Types, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$Gson$Types {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = new java.lang.reflect.Type[0];

    private C$Gson$Types() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type type) {
        return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.GenericArrayTypeImpl(type);
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getUpperBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.WildcardTypeImpl(typeArr, EMPTY_TYPE_ARRAY);
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getLowerBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.WildcardTypeImpl(new java.lang.reflect.Type[]{java.lang.Object.class}, typeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.nimbusds.jose.shaded.gson.internal.$Gson$Types$GenericArrayTypeImpl] */
    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                cls = new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.GenericArrayTypeImpl(canonicalize(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.GenericArrayTypeImpl(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(rawType instanceof java.lang.Class);
                return (java.lang.Class) rawType;
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

    private static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static boolean equals(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
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
                return equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    public static java.lang.String typeToString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    private static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
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

    private static java.lang.reflect.Type getSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (type instanceof java.lang.reflect.WildcardType) {
            type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
        }
        com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
        return resolve(type, cls, getGenericSupertype(type, cls, cls2));
    }

    public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        return ((java.lang.Class) type).getComponentType();
    }

    public static java.lang.reflect.Type getCollectionElementType(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Type supertype = getSupertype(type, cls, java.util.Collection.class);
        if (supertype instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) supertype).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static java.lang.reflect.Type[] getMapKeyAndValueTypes(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        java.lang.reflect.Type supertype = getSupertype(type, cls, java.util.Map.class);
        if (supertype instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) supertype).getActualTypeArguments();
        }
        return new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return resolve(type, cls, type2, new java.util.HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00db, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dd, code lost:
    
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> map) {
        java.lang.reflect.Type resolve;
        java.lang.reflect.Type newParameterizedTypeWithOwner;
        java.lang.reflect.TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof java.lang.reflect.TypeVariable) {
                java.lang.reflect.TypeVariable typeVariable2 = type2;
                java.lang.reflect.Type type3 = (java.lang.reflect.Type) map.get(typeVariable2);
                if (type3 != null) {
                    return type3 == java.lang.Void.TYPE ? type2 : type3;
                }
                map.put(typeVariable2, java.lang.Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type2 = resolveTypeVariable(type, cls, typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else {
                if (type2 instanceof java.lang.Class) {
                    java.lang.Class cls2 = type2;
                    if (cls2.isArray()) {
                        java.lang.Class<?> componentType = cls2.getComponentType();
                        java.lang.reflect.Type resolve2 = resolve(type, cls, componentType, map);
                        if (equal(componentType, resolve2)) {
                            type2 = cls2;
                        } else {
                            newParameterizedTypeWithOwner = arrayOf(resolve2);
                            type2 = newParameterizedTypeWithOwner;
                        }
                    }
                }
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    type2 = (java.lang.reflect.GenericArrayType) type2;
                    java.lang.reflect.Type genericComponentType = type2.getGenericComponentType();
                    java.lang.reflect.Type resolve3 = resolve(type, cls, genericComponentType, map);
                    if (!equal(genericComponentType, resolve3)) {
                        newParameterizedTypeWithOwner = arrayOf(resolve3);
                        type2 = newParameterizedTypeWithOwner;
                    }
                } else {
                    if (type2 instanceof java.lang.reflect.ParameterizedType) {
                        type2 = (java.lang.reflect.ParameterizedType) type2;
                        java.lang.reflect.Type ownerType = type2.getOwnerType();
                        java.lang.reflect.Type resolve4 = resolve(type, cls, ownerType, map);
                        boolean z = !equal(resolve4, ownerType);
                        java.lang.reflect.Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i = 0; i < length; i++) {
                            java.lang.reflect.Type resolve5 = resolve(type, cls, actualTypeArguments[i], map);
                            if (!equal(resolve5, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = resolve5;
                            }
                        }
                        if (z) {
                            newParameterizedTypeWithOwner = newParameterizedTypeWithOwner(resolve4, type2.getRawType(), actualTypeArguments);
                            type2 = newParameterizedTypeWithOwner;
                        }
                    } else if (type2 instanceof java.lang.reflect.WildcardType) {
                        type2 = (java.lang.reflect.WildcardType) type2;
                        java.lang.reflect.Type[] lowerBounds = type2.getLowerBounds();
                        java.lang.reflect.Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            java.lang.reflect.Type resolve6 = resolve(type, cls, lowerBounds[0], map);
                            if (resolve6 != lowerBounds[0]) {
                                type2 = supertypeOf(resolve6);
                            }
                        } else if (upperBounds.length == 1 && (resolve = resolve(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type2 = subtypeOf(resolve);
                        }
                    }
                }
            }
        }
    }

    private static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Class<?> declaringClassOf = declaringClassOf(typeVariable);
        if (declaringClassOf != null) {
            java.lang.reflect.Type genericSupertype = getGenericSupertype(type, cls, declaringClassOf);
            if (genericSupertype instanceof java.lang.reflect.ParameterizedType) {
                return ((java.lang.reflect.ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(declaringClassOf.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    private static int indexOf(java.lang.Object[] objArr, java.lang.Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof java.lang.Class) {
            return (java.lang.Class) genericDeclaration;
        }
        return null;
    }

    static void checkNotPrimitive(java.lang.reflect.Type type) {
        com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            java.util.Objects.requireNonNull(type2);
            if (type2 instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type2;
                boolean z = true;
                boolean z2 = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(z);
            }
            this.ownerType = type == null ? null : com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(type);
            this.rawType = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(type2);
            java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                java.util.Objects.requireNonNull(this.typeArguments[i]);
                com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.checkNotPrimitive(this.typeArguments[i]);
                java.lang.reflect.Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getOwnerType() {
            return this.ownerType;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.equals(this, (java.lang.reflect.ParameterizedType) obj);
        }

        private static int hashCodeOrZero(java.lang.Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final int hashCode() {
            return (java.util.Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ hashCodeOrZero(this.ownerType);
        }

        public final java.lang.String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.rawType);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((length + 1) * 30);
            sb.append(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.rawType));
            sb.append("<");
            sb.append(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type type) {
            java.util.Objects.requireNonNull(type);
            this.componentType = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            return this.componentType;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.equals(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.componentType));
            sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.$Gson$Types$WildcardTypeImpl */
    static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
            com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(typeArr.length == 1);
            if (typeArr2.length == 1) {
                java.util.Objects.requireNonNull(typeArr2[0]);
                com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.checkNotPrimitive(typeArr2[0]);
                com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument(typeArr[0] == java.lang.Object.class);
                this.lowerBound = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(typeArr2[0]);
                this.upperBound = java.lang.Object.class;
                return;
            }
            java.util.Objects.requireNonNull(typeArr[0]);
            com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.checkNotPrimitive(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.canonicalize(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.upperBound};
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.lowerBound;
            return type != null ? new java.lang.reflect.Type[]{type} : com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.equals(this, (java.lang.reflect.WildcardType) obj);
        }

        public final int hashCode() {
            java.lang.reflect.Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public final java.lang.String toString() {
            if (this.lowerBound != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
                sb.append(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.lowerBound));
                return sb.toString();
            }
            if (this.upperBound == java.lang.Object.class) {
                return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
            sb2.append(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.typeToString(this.upperBound));
            return sb2.toString();
        }
    }
}
