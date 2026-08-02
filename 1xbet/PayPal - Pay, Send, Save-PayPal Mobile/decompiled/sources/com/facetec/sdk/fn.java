package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fn {
    private static /* synthetic */ boolean d = true;
    static final java.lang.reflect.Type[] e = new java.lang.reflect.Type[0];

    private fn() {
        throw new java.lang.UnsupportedOperationException();
    }

    private static java.lang.reflect.ParameterizedType a(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        return new com.facetec.sdk.fn.d(type, type2, typeArr);
    }

    private static java.lang.reflect.GenericArrayType h(java.lang.reflect.Type type) {
        return new com.facetec.sdk.fn.b(type);
    }

    private static java.lang.reflect.WildcardType i(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getUpperBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.facetec.sdk.fn.a(typeArr, e);
    }

    private static java.lang.reflect.WildcardType f(java.lang.reflect.Type type) {
        java.lang.reflect.Type[] typeArr;
        if (type instanceof java.lang.reflect.WildcardType) {
            typeArr = ((java.lang.reflect.WildcardType) type).getLowerBounds();
        } else {
            typeArr = new java.lang.reflect.Type[]{type};
        }
        return new com.facetec.sdk.fn.a(new java.lang.reflect.Type[]{java.lang.Object.class}, typeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facetec.sdk.fn$b] */
    public static java.lang.reflect.Type d(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                cls = new com.facetec.sdk.fn.b(d(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.facetec.sdk.fn.d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return new com.facetec.sdk.fn.b(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.facetec.sdk.fn.a(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static java.lang.Class<?> e(java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                com.facetec.sdk.fk.b(rawType instanceof java.lang.Class);
                return (java.lang.Class) rawType;
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return java.lang.reflect.Array.newInstance(e(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof java.lang.reflect.TypeVariable) {
                return java.lang.Object.class;
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
                if (!d && upperBounds.length != 1) {
                    throw new java.lang.AssertionError();
                }
                type = upperBounds[0];
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

    private static boolean d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean a(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
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
                return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    public static java.lang.String c(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    private static java.lang.reflect.Type d(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
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

    private static java.lang.reflect.Type a(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
            if (!d && upperBounds.length != 1) {
                throw new java.lang.AssertionError();
            }
            type = upperBounds[0];
        }
        com.facetec.sdk.fk.b(cls2.isAssignableFrom(cls));
        return c(type, cls, d(type, cls, cls2));
    }

    public static java.lang.reflect.Type a(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        return ((java.lang.Class) type).getComponentType();
    }

    public static java.lang.reflect.Type a(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Type a2 = a(type, cls, (java.lang.Class<?>) java.util.Collection.class);
        if (a2 instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) a2).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static java.lang.reflect.Type[] b(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        java.lang.reflect.Type a2 = a(type, cls, (java.lang.Class<?>) java.util.Map.class);
        if (a2 instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) a2).getActualTypeArguments();
        }
        return new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    public static java.lang.reflect.Type c(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return c(type, cls, type2, new java.util.HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00da, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dc, code lost:
    
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00df, code lost:
    
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
    private static java.lang.reflect.Type c(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> map) {
        java.lang.reflect.Type c;
        java.lang.reflect.Type a2;
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
                type2 = c(type, cls, (java.lang.reflect.TypeVariable<?>) typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else {
                if (type2 instanceof java.lang.Class) {
                    java.lang.Class cls2 = type2;
                    if (cls2.isArray()) {
                        java.lang.Class<?> componentType = cls2.getComponentType();
                        java.lang.reflect.Type c2 = c(type, cls, componentType, map);
                        if (d(componentType, c2)) {
                            type2 = cls2;
                        } else {
                            a2 = h(c2);
                            type2 = a2;
                        }
                    }
                }
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    type2 = (java.lang.reflect.GenericArrayType) type2;
                    java.lang.reflect.Type genericComponentType = type2.getGenericComponentType();
                    java.lang.reflect.Type c3 = c(type, cls, genericComponentType, map);
                    if (!d(genericComponentType, c3)) {
                        a2 = h(c3);
                        type2 = a2;
                    }
                } else {
                    if (type2 instanceof java.lang.reflect.ParameterizedType) {
                        type2 = (java.lang.reflect.ParameterizedType) type2;
                        java.lang.reflect.Type ownerType = type2.getOwnerType();
                        java.lang.reflect.Type c4 = c(type, cls, ownerType, map);
                        boolean z = !d(c4, ownerType);
                        java.lang.reflect.Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i = 0; i < length; i++) {
                            java.lang.reflect.Type c5 = c(type, cls, actualTypeArguments[i], map);
                            if (!d(c5, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = c5;
                            }
                        }
                        if (z) {
                            a2 = a(c4, type2.getRawType(), actualTypeArguments);
                            type2 = a2;
                        }
                    } else if (type2 instanceof java.lang.reflect.WildcardType) {
                        type2 = (java.lang.reflect.WildcardType) type2;
                        java.lang.reflect.Type[] lowerBounds = type2.getLowerBounds();
                        java.lang.reflect.Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            java.lang.reflect.Type c6 = c(type, cls, lowerBounds[0], map);
                            if (c6 != lowerBounds[0]) {
                                type2 = f(c6);
                            }
                        } else if (upperBounds.length == 1 && (c = c(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type2 = i(c);
                        }
                    }
                }
            }
        }
    }

    private static java.lang.reflect.Type c(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Class<?> c = c(typeVariable);
        if (c != null) {
            java.lang.reflect.Type d2 = d(type, cls, c);
            if (d2 instanceof java.lang.reflect.ParameterizedType) {
                return ((java.lang.reflect.ParameterizedType) d2).getActualTypeArguments()[a(c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    private static int a(java.lang.Object[] objArr, java.lang.Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    private static java.lang.Class<?> c(java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof java.lang.Class) {
            return (java.lang.Class) genericDeclaration;
        }
        return null;
    }

    static void b(java.lang.reflect.Type type) {
        com.facetec.sdk.fk.b(((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) ? false : true);
    }

    static final class d implements java.io.Serializable, java.lang.reflect.ParameterizedType {
        private final java.lang.reflect.Type b;
        private final java.lang.reflect.Type c;
        private final java.lang.reflect.Type[] d;

        public d(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            java.util.Objects.requireNonNull(type2);
            if (type2 instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type2;
                boolean z = true;
                boolean z2 = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.facetec.sdk.fk.b(z);
            }
            this.b = type == null ? null : com.facetec.sdk.fn.d(type);
            this.c = com.facetec.sdk.fn.d(type2);
            java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
            this.d = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                java.util.Objects.requireNonNull(this.d[i]);
                com.facetec.sdk.fn.b(this.d[i]);
                java.lang.reflect.Type[] typeArr3 = this.d;
                typeArr3[i] = com.facetec.sdk.fn.d(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getOwnerType() {
            return this.b;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.facetec.sdk.fn.a(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public final int hashCode() {
            int hashCode = java.util.Arrays.hashCode(this.d);
            int hashCode2 = this.c.hashCode();
            java.lang.reflect.Type type = this.b;
            return (hashCode ^ hashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        public final java.lang.String toString() {
            int length = this.d.length;
            if (length == 0) {
                return com.facetec.sdk.fn.c(this.c);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((length + 1) * 30);
            sb.append(com.facetec.sdk.fn.c(this.c));
            sb.append("<");
            sb.append(com.facetec.sdk.fn.c(this.d[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(com.facetec.sdk.fn.c(this.d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    static final class b implements java.io.Serializable, java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type e;

        public b(java.lang.reflect.Type type) {
            java.util.Objects.requireNonNull(type);
            this.e = com.facetec.sdk.fn.d(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            return this.e;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && com.facetec.sdk.fn.a(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.facetec.sdk.fn.c(this.e));
            sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    static final class a implements java.io.Serializable, java.lang.reflect.WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Type f3573a;
        private final java.lang.reflect.Type e;

        public a(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            com.facetec.sdk.fk.b(typeArr2.length <= 1);
            com.facetec.sdk.fk.b(typeArr.length == 1);
            if (typeArr2.length == 1) {
                java.util.Objects.requireNonNull(typeArr2[0]);
                com.facetec.sdk.fn.b(typeArr2[0]);
                com.facetec.sdk.fk.b(typeArr[0] == java.lang.Object.class);
                this.e = com.facetec.sdk.fn.d(typeArr2[0]);
                this.f3573a = java.lang.Object.class;
                return;
            }
            java.util.Objects.requireNonNull(typeArr[0]);
            com.facetec.sdk.fn.b(typeArr[0]);
            this.e = null;
            this.f3573a = com.facetec.sdk.fn.d(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.f3573a};
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.e;
            return type != null ? new java.lang.reflect.Type[]{type} : com.facetec.sdk.fn.e;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && com.facetec.sdk.fn.a(this, (java.lang.reflect.WildcardType) obj);
        }

        public final int hashCode() {
            java.lang.reflect.Type type = this.e;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3573a.hashCode() + 31);
        }

        public final java.lang.String toString() {
            if (this.e != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
                sb.append(com.facetec.sdk.fn.c(this.e));
                return sb.toString();
            }
            if (this.f3573a == java.lang.Object.class) {
                return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
            sb2.append(com.facetec.sdk.fn.c(this.f3573a));
            return sb2.toString();
        }
    }
}
